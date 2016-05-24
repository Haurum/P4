package code;

import gen.GrammarBaseVisitor;
import gen.GrammarParser;
import org.antlr.v4.runtime.RuleContext;

/**
 * Created by Frederik on 05-04-2016.
 */
public class SymbolTypeVisitor extends GrammarBaseVisitor<String> {

    SymbolTable ST;
    FuncSymbolTable FST, RoboFST;

    public SymbolTypeVisitor(SymbolTable st, FuncSymbolTable fst, FuncSymbolTable robofst){
        ST = st;
        FST = fst;
        RoboFST = robofst;
    }

    @Override
    public String visitDcls(GrammarParser.DclsContext ctx) {
        if (ctx.tankname().size() < 1){
            Error e = new Error("A Tankname needs to be declared");
            throw e;
        }else if (ctx.tankname().size() > 1){
            Error e = new Error("Error at line: " +
                    ctx.tankname(1).start.getLine() + ": Too many tank names.");
            throw e;
        }
        if (ctx.repeatblock().size() < 1){
            Error e = new Error("A Repeat block needs to be declared");
            throw e;
        }else if (ctx.repeatblock().size() > 1){
            Error e = new Error("Error at line: " +
                    ctx.repeatblock(1).start.getLine() + ": Too many repeat blocks.");
            throw e;
        }
        if (ctx.setupblock().size() < 1){
            Error e = new Error("A Setup block needs to be declared");
            throw e;
        }else if (ctx.setupblock().size() > 1){
            Error e = new Error("Error at line: " +
                    ctx.setupblock(1).start.getLine() + ": Too many setup blocks.");
            throw e;
        }
        super.visitDcls(ctx);
        return "null";
    }

    public String visitIfstmt(GrammarParser.IfstmtContext ctx) {
        if (!visit(ctx.expr()).equals("Bool")){
            Error e = new Error("Error at line: " +
                    ctx.expr().start.getLine() + ": Expression did not evaluate to Bool.");
            throw e;
        }
        super.visitIfstmt(ctx);
        return "null";
    }

    public String visitElseif(GrammarParser.ElseifContext ctx) {
        if (!visit(ctx.expr()).equals("Bool")){
            Error e = new Error("Error at line: " +
                    ctx.expr().start.getLine() + ": Expression did not evaluate to Bool.");
            throw e;
        }
        visit(ctx.block());
        return "null";
    }

    @Override
    public String visitWhilestmt(GrammarParser.WhilestmtContext ctx) {
        if (!visit(ctx.expr()).equals("Bool")){
            Error e = new Error("Error at line: " +
                    ctx.expr().start.getLine() + ": Expression did not evaluate to Bool.");
            throw e;
        }
        visit(ctx.block());
        return "null";
    }

    @Override
    public String visitEventdcl(GrammarParser.EventdclContext ctx) {
        FuncSymbol fsym = RoboFST.GetFuncSymbol(ctx.ID().getText(), "void");
        if (fsym == null){
            Error e = new Error("Error at line: " +
                    ctx.start.getLine() + ": Event not found.");
            throw e;
        }
        super.visitEventdcl(ctx);
        return "null";
    }

    @Override
    public String visitEcall(GrammarParser.EcallContext ctx) {
        RuleContext parent = ctx.parent;
        while(parent != null){
            if(parent instanceof GrammarParser.EventdclContext){
                FuncSymbol fsym = RoboFST.GetFuncSymbol(((GrammarParser.EventdclContext) parent).ID().getText(), ctx.ID().getText());
                if (fsym == null){
                    Error e = new Error("Error at line: " +
                            ctx.start.getLine() + ": Event calls need to match event handler");
                    throw e;
                }
                if(ctx.getChildCount() == 5) {
                    String[] args = visit(ctx.args()).split(", ");
                    if(args.length != fsym.Params.size()){
                        Error e = new Error("Error at line: " +
                                ctx.args().expr(0).start.getLine() +
                                ": Number of parameters does not match number of arguments");
                        throw e;
                    }
                    for (int i = 0; i < args.length; i++) {
                        String paramType = fsym.Params.get(i).y;
                        String arg = args[i];
                        if (!paramType.equals(arg)) {
                            Error e = new Error("Error at line: " +
                                    ctx.args().expr(i).start.getLine() +
                                    ": Parameter number " + (i+1) + " not matched. Expected " + paramType);
                            throw e;
                        }
                    }
                }
                return fsym.ReturnType;
            }
            parent = parent.parent;
        }
        Error e = new Error("Event calls must be inside an event/when function");
        throw e;
    }

    @Override
    public String visitTankcall(GrammarParser.TankcallContext ctx) {
        FuncSymbol fsym = RoboFST.GetFuncSymbol("Tank", ctx.ID().getText());
        if (fsym == null){
            Error e = new Error("Error at line: " +
                    ctx.start.getLine() + ": Function not found");
            throw e;
        }
        if (!fsym.Type.equals("Tank")){
            Error e = new Error("Error at line: " +
                    ctx.start.getLine() + ": Incorrect function type.");
            throw e;
        }
        if(ctx.getChildCount() == 5) {
            String[] args = visit(ctx.args()).split(", ");
            if(args.length != fsym.Params.size()){
                Error e = new Error("Error at line: " +
                        ctx.args().expr(0).start.getLine() +
                        ": Number of parameters does not match number of arguments");
                throw e;
            }
            for (int i = 0; i < args.length; i++) {
                String paramType = fsym.Params.get(i).y;
                String arg = args[i];
                if (!paramType.equals(arg)) {
                    Error e = new Error("Error at line: " +
                            ctx.args().expr(i).start.getLine() +
                            ": Parameter number " + (i+1) + " not matched. Expected " + paramType);
                    throw e;
                }
            }
        }
        return fsym.ReturnType;
    }

    @Override
    public String visitGuncall(GrammarParser.GuncallContext ctx) {
        FuncSymbol fsym = RoboFST.GetFuncSymbol("Gun", ctx.ID().getText());
        if (fsym == null){
            Error e = new Error("Error at line: " +
                    ctx.start.getLine() + ": Function not found");
            throw e;
        }
        if (!fsym.Type.equals("Gun")){
            Error e = new Error("Error at line: " +
                    ctx.start.getLine() + ": Incorrect function type.");
            throw e;
        }
        if(ctx.getChildCount() == 5) {
            String[] args = visit(ctx.args()).split(", ");
            if(args.length != fsym.Params.size()){
                Error e = new Error("Error at line: " +
                        ctx.args().expr(0).start.getLine() +
                        ": Number of parameters does not match number of arguments");
                throw e;
            }
            for (int i = 0; i < args.length; i++) {
                String paramType = fsym.Params.get(i).y;
                String arg = args[i];
                if (!paramType.equals(arg)) {
                    Error e = new Error("Error at line: " +
                            ctx.args().expr(i).start.getLine() +
                            ": Parameter number " + (i+1) + " not matched. Expected " + paramType);
                    throw e;
                }
            }
        }
        return fsym.ReturnType;
    }

    @Override
    public String visitRadarcall(GrammarParser.RadarcallContext ctx) {
        FuncSymbol fsym = RoboFST.GetFuncSymbol("Radar", ctx.ID().getText());
        if (fsym == null){
            Error e = new Error("Error at line: " +
                    ctx.start.getLine() + ": Function not found");
            throw e;
        }
        if (!fsym.Type.equals("Radar")){
            Error e = new Error("Error at line: " +
                    ctx.start.getLine() + ": Incorrect function type.");
            throw e;
        }
        if(ctx.getChildCount() == 5) {
            String[] args = visit(ctx.args()).split(", ");
            if(args.length != fsym.Params.size()){
                Error e = new Error("Error at line: " +
                        ctx.args().expr(0).start.getLine() +
                        ": Number of parameters does not match number of arguments");
                throw e;
            }
            for (int i = 0; i < args.length; i++) {
                String paramType = fsym.Params.get(i).y;
                String arg = args[i];
                if (!paramType.equals(arg)) {
                    Error e = new Error("Error at line: " +
                            ctx.args().expr(i).start.getLine() +
                            ": Parameter number " + (i+1) + " not matched. Expected " + paramType);
                    throw e;
                }
            }
        }
        return fsym.ReturnType;
    }

    @Override
    public String visitBattlefieldcall(GrammarParser.BattlefieldcallContext ctx) {
        FuncSymbol fsym = RoboFST.GetFuncSymbol("Battlefield", ctx.ID().getText());
        if (fsym == null){
            Error e = new Error("Error at line: " +
                    ctx.start.getLine() + ": Function not found");
            throw e;
        }
        if (!fsym.Type.equals("Battlefield")){
            Error e = new Error("Error at line: " +
                    ctx.start.getLine() + ": Incorrect function type.");
            throw e;
        }
        if(ctx.getChildCount() == 5) {
            String[] args = visit(ctx.args()).split(", ");
            if(args.length != fsym.Params.size()){
                Error e = new Error("Error at line: " +
                        ctx.args().expr(0).start.getLine() +
                        ": Number of parameters does not match number of arguments");
                throw e;
            }
            for (int i = 0; i < args.length; i++) {
                String paramType = fsym.Params.get(i).y;
                String arg = args[i];
                if (!paramType.equals(arg)) {
                    Error e = new Error("Error at line: " +
                            ctx.args().expr(i).start.getLine() +
                            ": Parameter number " + (i+1) + " not matched. Expected " + paramType);
                    throw e;
                }
            }
        }
        return fsym.ReturnType;
    }

    @Override
    public String visitUtilscall(GrammarParser.UtilscallContext ctx) {
        FuncSymbol fsym = RoboFST.GetFuncSymbol("Utils", ctx.ID().getText());
        if (fsym == null){
            Error e = new Error("Error at line: " +
                    ctx.start.getLine() + ": Function not found");
            throw e;
        }
        if (!fsym.Type.equals("Utils")){
            Error e = new Error("Error at line: " +
                    ctx.start.getLine() + ": Incorrect function type.");
            throw e;
        }
        if(ctx.getChildCount() == 5) {
            String[] args = visit(ctx.args()).split(", ");
            if(args.length != fsym.Params.size()){
                Error e = new Error("Error at line: " +
                        ctx.args().expr(0).start.getLine() +
                        ": Number of parameters does not match number of arguments");
                throw e;
            }
            for (int i = 0; i < args.length; i++) {
                String paramType = fsym.Params.get(i).y;
                String arg = args[i];
                if (!paramType.equals(arg)) {
                    Error e = new Error("Error at line: " +
                            ctx.args().expr(i).start.getLine() +
                            ": Parameter number " + (i+1) + " not matched. Expected " + paramType);
                    throw e;
                }
            }
        }
        return fsym.ReturnType;
    }

    @Override
    public String visitFuncdcl(GrammarParser.FuncdclContext ctx) {
        String returnStmt = visit(ctx.functionBlock());
        if (returnStmt.equals(ctx.TYPE().getText())){
            return returnStmt;
        }else{
            Error e = new Error("Error at line: " + ctx.start.getLine() + ": return type and return expression type do not match");
            throw e;
        }
    }

    @Override
    public String visitFunctionBlock(GrammarParser.FunctionBlockContext ctx) {
        FuncSymbol fs = FST.GetFuncSymbol("Function", ((GrammarParser.FuncdclContext) ctx.parent).ID().getText());

        fs.Params.forEach(tuple -> {
            ST.EnterSymbol(tuple.x, tuple.y);
        });
        visit(ctx.stmts());
        return visit(ctx.returnstmt());
    }

    @Override
    public String visitReturnstmt(GrammarParser.ReturnstmtContext ctx) {
        if (ctx.getChildCount() > 1){
            return visit(ctx.expr());
        }else {
            return "null";
        }
    }

    @Override
    public String visitFcall(GrammarParser.FcallContext ctx) {
        FuncSymbol fsym = FST.GetFuncSymbol("Function", ctx.ID().getText());
        if (fsym == null){
            Error e = new Error("Error at line: " +
                    ctx.start.getLine() + ": Function not found");
            throw e;
        }
        if (!fsym.Type.equals("Function")){
            Error e = new Error("Error at line: " +
                    ctx.start.getLine() + ": Incorrect function type.");
            throw e;
        }
        if(ctx.getChildCount() == 4) {
            String[] args = visit(ctx.args()).split(", ");
            if(args.length != fsym.Params.size()){
                Error e = new Error("Error at line: " +
                        ctx.args().expr(0).start.getLine() +
                        ": Number of parameters does not match number of arguments");
                throw e;
            }
            for (int i = 0; i < args.length; i++) {
                String paramType = fsym.Params.get(i).y;
                String arg = args[i];
                if (!paramType.equals(arg)) {
                    Error e = new Error("Error at line: " +
                            ctx.args().expr(i).start.getLine() +
                            ": Parameter number " + (i+1) + " not matched. Expected " + paramType);
                    throw e;
                }
            }
        }
        return fsym.ReturnType;
    }

    @Override
    public String visitAcall(GrammarParser.AcallContext ctx) {
        FuncSymbol asym = FST.GetFuncSymbol("Action", ctx.ID().getText());
        if (asym == null){
            Error e = new Error("Error at line: " +
                    ctx.start.getLine() + ": Action not found");
            throw e;
        }
        if (!asym.Type.equals("Action")){
            Error e = new Error("Error at line: " +
                    ctx.start.getLine() + ": Incorrect function type.");

            throw e;
        }
        if(ctx.getChildCount() == 5) {
            String[] args = visit(ctx.args()).split(", ");
            if(args.length != asym.Params.size()){
                Error e = new Error("Error at line: " +
                        ctx.args().expr(0).start.getLine() +
                        ": Number of parameters does not match number of arguments");
                throw e;
            }
            for (int i = 0; i < args.length; i++) {
                if (!asym.Params.get(i).y.equals(args[i])) {
                    Error e = new Error("Error at line: " +
                            ctx.args().expr(i).start.getLine() +
                            ": Parameter number " + (i+1) + " not matched.");
                    throw e;
                }
            }
        }
        return "null";
    }

    @Override
    public String visitArgs(GrammarParser.ArgsContext ctx) {
        String result = visit(ctx.expr(0));
        for (int i = 1; i < ctx.expr().size(); i++){
            result = result + ", " + visit(ctx.expr(i));
        }
        return result;
    }

    @Override
    public String visitBlock(GrammarParser.BlockContext ctx) {
        ST.OpenScope();
        if (ctx.parent instanceof GrammarParser.ActdclContext){
            FuncSymbol fs = FST.GetFuncSymbol("Action", ((GrammarParser.ActdclContext) ctx.parent).ID().getText());
            fs.Params.forEach(tuple -> {
                ST.EnterSymbol(tuple.x, tuple.y);
            });
        }
        visit(ctx.stmts());
        ST.CloseScope();
        return "null";
    }

    @Override
    public String visitVardcl(GrammarParser.VardclContext ctx) {
        if (ctx.getChild(1) instanceof GrammarParser.AssignContext){
            ST.EnterSymbol(((GrammarParser.AssignContext) ctx.getChild(1)).ID().getText(), ctx.TYPE().getText());
            visit(ctx.assign());
        }else {
            ST.EnterSymbol(ctx.ID().getText(), ctx.TYPE().getText());
        }
        return ctx.TYPE().getText();
    }

    @Override
    public String visitAssign(GrammarParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        Symbol sym = ST.GetSymbol(id);
        if (sym == null){
            Error e = new Error("Error at line: " +
                    ctx.expr().start.getLine() + ": Variable not declared");
            throw e;
        }
        if (!sym.Type.equals(visit(ctx.expr()))){
            Error e = new Error("Error at line: " +
                    ctx.expr().start.getLine() + ": Expression and variable are not type compatible");
            throw e;
        }
        return sym.Type;
    }

    @Override
    public String visitOrexpr(GrammarParser.OrexprContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        if (left.equals("Bool") && right.equals("Bool")){
            return "Bool";
        }else{
            Error e = new Error("Error at line: " +
                    ctx.start.getLine() + ": Expression did not evaluate to Bool.");
            throw e;
        }
    }

    @Override
    public String visitAndexpr(GrammarParser.AndexprContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        if (left.equals("Bool") && right.equals("Bool")){
            return "Bool";
        }else{
            Error e = new Error("Error at line: " +
                    ctx.start.getLine() + ": Expression did not evaluate to Bool.");
            throw e;
        }
    }

    @Override
    public String visitEqexpr(GrammarParser.EqexprContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        if (left.equals(right)){
            return "Bool";
        }else{
            Error e = new Error("Error at line: " +
                    ctx.start.getLine() + ": Expression did not evaluate to Bool.");
            throw e;
        }
    }

    @Override
    public String visitRelexpr(GrammarParser.RelexprContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        if (left.equals("Num") && right.equals("Num")){
            return "Bool";
        }else{
            Error e = new Error("Error at line: " +
                    ctx.start.getLine() + ": Expression did not evaluate to Bool.");
            throw e;
        }
    }

    @Override
    public String visitAddexpr(GrammarParser.AddexprContext ctx) {
            String left = visit(ctx.expr(0));
            String right = visit(ctx.expr(1));
            if (left.equals("Num") && right.equals("Num")) {
                return "Num";
            }else if((left.equals("String") || right.equals("String")) && ctx.op.getText().equals("+") ) {
                return "String";
            }else{
                Error e = new Error("Error at line: " +
                        ctx.start.getLine() + ": Expression types did not match.");
                throw e;
            }
    }

    @Override
    public String visitMulexpr(GrammarParser.MulexprContext ctx) {
        if (!visit(ctx.expr(0)).equals("Num") || !visit(ctx.expr(1)).equals("Num")){
            Error e = new Error("Error at line: " +
                    ctx.start.getLine() + ": Expression did not evaluate to Num.");
            throw e;
        }
        return "Num";
    }

    @Override
    public String visitMinusexpr(GrammarParser.MinusexprContext ctx) {
        if (!visit(ctx.expr()).equals("Num")){
            Error e = new Error("Error at line: " +
                    ctx.expr().start.getLine() + ": Expression did not evaluate to Num.");
            throw e;
        }
        return "Num";
    }

    @Override
    public String visitNotexpr(GrammarParser.NotexprContext ctx) {
        if (!visit(ctx.expr()).equals("Bool")){
            Error e = new Error("Error at line: " +
                    ctx.expr().start.getLine() + ": Expression did not evaluate to Bool.");
            throw e;
        }
        return "Bool";
    }

    @Override
    public String visitAtomic(GrammarParser.AtomicContext ctx) {
        if (ctx.getChildCount() > 1){
            return visit(ctx.expr());
        }else return super.visitAtomic(ctx);
    }

    @Override
    public String visitId(GrammarParser.IdContext ctx) {
        String test = ctx.getText();
        Symbol sym = ST.GetSymbol(ctx.getText());
        if (sym == null){
            Error e = new Error("Error at line: " +
                    ctx.start.getLine() + ": Variable not found");
            throw e;
        }
        return sym.Type;
    }

    @Override
    public String visitNum(GrammarParser.NumContext ctx) {
        return "Num";
    }

    @Override
    public String visitString(GrammarParser.StringContext ctx) {
        return "String";
    }

    @Override
    public String visitBool(GrammarParser.BoolContext ctx) {
        return "Bool";
    }
}
