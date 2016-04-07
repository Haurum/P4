package code;

import gen.GrammarBaseVisitor;
import gen.GrammarParser;

/**
 * Created by Frederik on 05-04-2016.
 */
public class SymbolTypeVisitor extends GrammarBaseVisitor<String> {

    SymbolTable ST;
    FuncSymbolTable FST;

    public SymbolTypeVisitor(SymbolTable st, FuncSymbolTable fst){
        ST = st;
        FST = fst;
    }

    @Override
    public String visitFuncdcl(GrammarParser.FuncdclContext ctx) {
        return super.visitFuncdcl(ctx);
    }

    @Override
    public String visitFunctionBlock(GrammarParser.FunctionBlockContext ctx) {
        return visit(ctx.returnstmt());
    }

    @Override
    public String visitFcall(GrammarParser.FcallContext ctx) {
        FuncSymbol fsym = FST.GetFuncSymbol(ctx.ID().getText());
        String[] args = visit(ctx.args()).split(",");
        for (int i = 0; i < args.length; i++){
            if (!fsym.Params.get(i).x.equals(args[i])){
                Error e = new Error("Type error");
                throw e;
            }
        }
        return fsym.ReturnType;
    }

    @Override
    public String visitAcall(GrammarParser.AcallContext ctx) {
        FuncSymbol fsym = FST.GetFuncSymbol(ctx.ID().getText());
        String[] args = visit(ctx.args()).split(",");
        for (int i = 0; i < args.length; i++){
            if (!fsym.Params.get(i).x.equals(args[i])){
                Error e = new Error("Type error");
                throw e;
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
            FuncSymbol fs = FST.GetFuncSymbol(((GrammarParser.ActdclContext) ctx.parent).ID().getText());
            fs.Params.forEach(tuple -> {
                ST.EnterSymbol(tuple.x, tuple.y);
            });
        }else if (ctx.parent instanceof GrammarParser.FuncdclContext){
            FuncSymbol fs = FST.GetFuncSymbol(((GrammarParser.FuncdclContext) ctx.parent).ID().getText());

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
        if (!sym.Type.equals(visit(ctx.expr()))){
            Error e = new Error("Type error");
            throw e;
        }
        return sym.Type;
    }

    @Override
    public String visitExpr(GrammarParser.ExprContext ctx) {
        String result = super.visitExpr(ctx);
        System.out.println( result);
        return result;
    }

    @Override
    public String visitOrexpr(GrammarParser.OrexprContext ctx) {
        if (ctx.getChildCount() > 1){
            String left = visit(ctx.andexpr());
            String right = visit(ctx.orexpr());
            if (left.equals("Bool") && right.equals("Bool")){
                return "Bool";
            }else{
                Error e = new Error("Type error");
                throw e;
            }
        }else return super.visitOrexpr(ctx);
    }

    @Override
    public String visitAndexpr(GrammarParser.AndexprContext ctx) {
        if (ctx.getChildCount() > 1){
            String left = visit(ctx.eqexpr());
            String right = visit(ctx.andexpr());
            if (left.equals("Bool") && right.equals("Bool")){
                return "Bool";
            }else{
                Error e = new Error("Type error");
                throw e;
            }
        }else return super.visitAndexpr(ctx);
    }

    @Override
    public String visitEqexpr(GrammarParser.EqexprContext ctx) {
        if (ctx.getChildCount() > 1){
            String left = visit(ctx.relexpr());
            String right = visit(ctx.eqexpr());
            if (left.equals(right)){
                return "Bool";
            }else{
                Error e = new Error("Type error");
                throw e;
            }
        }else return super.visitEqexpr(ctx);
    }

    @Override
    public String visitRelexpr(GrammarParser.RelexprContext ctx) {
        if (ctx.getChildCount() > 1){
            String left = visit(ctx.addexpr());
            String right = visit(ctx.relexpr());
            if (left.equals("Num") && right.equals("Num")){
                return "Bool";
            }else{
                Error e = new Error("Type error");
                throw e;
            }
        }else return super.visitRelexpr(ctx);
    }

    @Override
    public String visitAddexpr(GrammarParser.AddexprContext ctx) {
        if (ctx.getChildCount() > 1){
            String left = visit(ctx.mulexpr());
            String right = visit(ctx.addexpr());
            if (left.equals("Num") && right.equals("Num")) {
                return "Num";
            }else if((left.equals("String") || right.equals("String")) && ctx.ADD().getText().equals("+") ) {
                return "String";
            }else{
                Error e = new Error("Type error");
                throw e;
            }
        }else return super.visitAddexpr(ctx);

    }

    @Override
    public String visitMulexpr(GrammarParser.MulexprContext ctx) {
        if (ctx.getChildCount() > 1){
            if (!visit(ctx.unexpr()).equals("Num") || !visit(ctx.mulexpr()).equals("Num")){
                Error e = new Error("Type error");
                throw e;
            }
            return "Num";
        }else return super.visitMulexpr(ctx);
    }

    @Override
    public String visitUnexpr(GrammarParser.UnexprContext ctx) {
        if (ctx.getChildCount() > 1){
            if (visit(ctx.atomic()).equals("Bool")){
                return "Bool";
            }else{
                Error e = new Error("Type error");
                throw e;
            }
        }else return super.visitUnexpr(ctx);
    }

    @Override
    public String visitAtomic(GrammarParser.AtomicContext ctx) {
        if (ctx.getChildCount() > 1){
            return visit(ctx.expr());
        }else return super.visitAtomic(ctx);
    }

    @Override
    public String visitId(GrammarParser.IdContext ctx) {
        Symbol sym = ST.GetSymbol(ctx.ID().getText());
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
