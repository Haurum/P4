package code;

import com.sun.xml.internal.ws.util.StringUtils;
import gen.GrammarBaseVisitor;
import gen.GrammarParser;
import org.antlr.v4.runtime.RuleContext;

/**
 * Created by frede on 09-05-2016.
 */
public class CodeGen extends GrammarBaseVisitor<String> {

    FuncSymbolTable RoboFST;

    public CodeGen(FuncSymbolTable rfst){
        RoboFST = rfst;
    }

    @Override
    public String visitProg(GrammarParser.ProgContext ctx) {
        StringBuilder buf = new StringBuilder();
        buf.append("import robocode.*;\n");
        buf.append("import static robocode.util.Utils.*;\n");
        buf.append("public class ");
        buf.append(StringUtils.capitalize(visit(ctx.dcls().tankname(0))));
        buf.append(" extends Robot {\n ");
        buf.append(visit(ctx.dcls()));
        buf.append("}");
        System.out.print(buf.toString());
        return buf.toString();
    }

    @Override
    public String visitTankname(GrammarParser.TanknameContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitSetupblock(GrammarParser.SetupblockContext ctx) {
        String result = "public void run()" + visit(ctx.block());
        result = result.substring(0, result.length()-2);
        return result + visit(((GrammarParser.DclsContext) ctx.parent).repeatblock(0)) + "}";

    }

    @Override
    public String visitRepeatblock(GrammarParser.RepeatblockContext ctx) {
        return "while (true)" + visit(ctx.block());
    }

    @Override
    public String visitDcls(GrammarParser.DclsContext ctx) {
        StringBuilder buf = new StringBuilder();
        for(int i = 0; i < ctx.getChildCount(); i++){
            if(!(ctx.getChild(i) instanceof GrammarParser.TanknameContext || ctx.getChild(i) instanceof GrammarParser.RepeatblockContext)){
                buf.append(visit(ctx.getChild(i)));
            }
        }
        return buf.toString();
    }

    @Override
    public String visitActdcl(GrammarParser.ActdclContext ctx) {
        if(ctx.getChildCount() == 6){
            return "public void _" + ctx.ID().getText() + "(" + visit(ctx.params()) + ")" + visit(ctx.block());
        }else{
            return "public void _" + ctx.ID().getText() + "()" + visit(ctx.block());
        }
    }


    @Override
    public String visitFuncdcl(GrammarParser.FuncdclContext ctx) {
        String type;
        if (ctx.TYPE().getText().equals("Num")){
            type = "double ";
        }else if(ctx.TYPE().getText().equals("Bool")){
            type = "boolean ";
        }else{
            type = "String ";
        }
        if (ctx.getChildCount() == 8) {
            return "public " + type + " _" + ctx.ID().getText() + "(" + visit(ctx.params()) + ")" + visit(ctx.functionBlock());
        }else{
            return "public " + type + " _" + ctx.ID().getText() + "()" + visit(ctx.functionBlock());
        }
    }

    @Override
    public String visitFunctionBlock(GrammarParser.FunctionBlockContext ctx) {
        return "{ " + visit(ctx.stmts()) + visit(ctx.returnstmt()) + ";}";
    }

    @Override
    public String visitParams(GrammarParser.ParamsContext ctx) {
        StringBuilder buf = new StringBuilder();
        for(GrammarParser.ParamContext param : ctx.param()){
            buf.append(visit(param));
            buf.append(",");
        }
        buf.deleteCharAt(buf.length()-1);
        return buf.toString();
    }

    @Override
    public String visitParam(GrammarParser.ParamContext ctx) {
        String result;
        if (ctx.TYPE().getText().equals("Num")){
            result = "double ";
        }else if(ctx.TYPE().getText().equals("Bool")){
            result = "boolean ";
        }else{
            result = "String ";
        }
        return result + "_" + ctx.ID().getText();
    }

    @Override
    public String visitEventdcl(GrammarParser.EventdclContext ctx) {
        String id = com.sun.xml.internal.ws.util.StringUtils.capitalize(ctx.ID().getText());
        return "public void on" + id + "( " + id + "Event e )" + visit(ctx.block());
    }

    @Override
    public String visitBlock(GrammarParser.BlockContext ctx) {
        return "{\n " + visit(ctx.stmts()) + " \n}\n";
    }

    @Override
    public String visitStmts(GrammarParser.StmtsContext ctx) {
        StringBuilder buf = new StringBuilder();
        for(int i = 0; i < ctx.getChildCount(); i++){
            buf.append(visit(ctx.getChild(i)));
        }
        return buf.toString();
    }

    @Override
    public String visitAssign(GrammarParser.AssignContext ctx) {
        return "_" + ctx.ID().getText() + " = " + visit(ctx.expr()) + ctx.SEMI().getText() + "\n";
    }

    @Override
    public String visitVardcl(GrammarParser.VardclContext ctx) {
        String result;
        if (ctx.TYPE().getText().equals("Num")){
            result = "double ";
        }else if(ctx.TYPE().getText().equals("Bool")){
            result = "boolean ";
        }else{
            result = "String ";
        }
        if (ctx.getChild(1) instanceof GrammarParser.AssignContext){
            result += visit(ctx.assign());
        }else {
            result += "_" + ctx.ID().getText() + ctx.SEMI().getText() + "\n";
        }
        return result;
    }

    @Override
    public String visitIfstmt(GrammarParser.IfstmtContext ctx) {
        StringBuilder buf = new StringBuilder();
        buf.append("if(");
        buf.append(visit(ctx.expr()));
        buf.append(")");
        buf.append(visit(ctx.block(0)));
        for(int i = 0; i< ctx.elseif().size(); i++){
            buf.append(visit(ctx.elseif(i)));
        }
        if (ctx.block().size() > 1){
            buf.append("else");
            buf.append(visit(ctx.block(1)));
        }
        return buf.toString();
    }

    @Override
    public String visitElseif(GrammarParser.ElseifContext ctx) {
        return "else if(" + visit(ctx.expr()) + ")" + visit(ctx.block());
    }

    @Override
    public String visitWhilestmt(GrammarParser.WhilestmtContext ctx) {
        if (ctx.getChild(1).equals(ctx.block())){
            return "do" + visit(ctx.block()) + "while(" + visit(ctx.expr()) + ");";
        }else {
            return "while(" + visit(ctx.expr()) + ")" + visit(ctx.block());
        }
    }

    @Override
    public String visitReturnstmt(GrammarParser.ReturnstmtContext ctx) {
        return "return " + visit(ctx.expr());
    }

    @Override
    public String visitPrint(GrammarParser.PrintContext ctx) {
        return "out.println(" + visit(ctx.expr()) + ")" + ctx.SEMI().getText() + "\n";
    }

    @Override
    public String visitStmtcall(GrammarParser.StmtcallContext ctx) {
        return visit(ctx.call()) + ctx.SEMI().getText() + "\n";
    }

    @Override
    public String visitCall(GrammarParser.CallContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public String visitAcall(GrammarParser.AcallContext ctx) {
        if (ctx.getChildCount() == 5){
            return "_" + ctx.ID().getText() + "(" + visit(ctx.args()) + ")";
        }else{
            return "_" + ctx.ID().getText() + "()";
        }
    }

    @Override
    public String visitFcall(GrammarParser.FcallContext ctx) {
        if (ctx.getChildCount() == 4){
            return "_" + ctx.ID().getText() + "(" + visit(ctx.args()) + ")";
        }else{
            return "_" + ctx.ID().getText() + "()";
        }
    }

    @Override
    public String visitTankcall(GrammarParser.TankcallContext ctx) {
        FuncSymbol fs = RoboFST.GetFuncSymbol("Tank", ctx.ID().getText());
        if(ctx.getChildCount() == 5) {
            return fs.RoboCodeName + "(" + visit(ctx.args()) + ")";
        }else {
            return fs.RoboCodeName + "()";
        }
    }

    @Override
    public String visitGuncall(GrammarParser.GuncallContext ctx) {
        FuncSymbol fs = RoboFST.GetFuncSymbol("Gun", ctx.ID().getText());
        if(ctx.getChildCount() == 5) {
            return fs.RoboCodeName + "(" + visit(ctx.args()) + ")";
        }else {
            return fs.RoboCodeName + "()";
        }
    }

    @Override
    public String visitRadarcall(GrammarParser.RadarcallContext ctx) {
        FuncSymbol fs = RoboFST.GetFuncSymbol("Radar", ctx.ID().getText());
        if(ctx.getChildCount() == 5) {
            return fs.RoboCodeName + "(" + visit(ctx.args()) + ")";
        }else {
            return fs.RoboCodeName + "()";
        }
    }

    @Override
    public String visitBattlefieldcall(GrammarParser.BattlefieldcallContext ctx) {
        FuncSymbol fs = RoboFST.GetFuncSymbol("Battlefield", ctx.ID().getText());
        if(ctx.getChildCount() == 5) {
            return fs.RoboCodeName + "(" + visit(ctx.args()) + ")";
        }else {
            return fs.RoboCodeName + "()";
        }
    }

    @Override
    public String visitUtilscall(GrammarParser.UtilscallContext ctx) {
        FuncSymbol fs = RoboFST.GetFuncSymbol("Utils", ctx.ID().getText());
        if(ctx.getChildCount() == 5) {
            return fs.RoboCodeName + "(" + visit(ctx.args()) + ")";
        }else {
            return fs.RoboCodeName + "()";
        }
    }

    @Override
    public String visitEcall(GrammarParser.EcallContext ctx) {
        FuncSymbol fsym;
        RuleContext parent = ctx.parent;
        while(parent != null){
            if(parent instanceof GrammarParser.EventdclContext){
                fsym = RoboFST.GetFuncSymbol(((GrammarParser.EventdclContext) parent).ID().getText(), ctx.ID().getText());
                if(ctx.getChildCount() == 5) {
                    return "e." + fsym.RoboCodeName + "(" + visit(ctx.args()) + ")";
                }else {
                    return "e." + fsym.RoboCodeName + "()";
                }
            }
            parent = parent.parent;
        }
        Error e = new Error("codeGen Error");
        throw e;
    }

    @Override
    public String visitArgs(GrammarParser.ArgsContext ctx) {
        StringBuilder buf = new StringBuilder();

        for(GrammarParser.ExprContext expr : ctx.expr()){
            buf.append(visit(expr));
            buf.append(",");
        }
        buf.deleteCharAt(buf.length()-1);
        return buf.toString();
    }

    @Override
    public String visitMinusexpr(GrammarParser.MinusexprContext ctx) {
        return "-" + visit(ctx.expr());
    }

    @Override
    public String visitNotexpr(GrammarParser.NotexprContext ctx) {
        return "!" + visit(ctx.expr());
    }

    @Override
    public String visitMulexpr(GrammarParser.MulexprContext ctx) {
        return visit(ctx.expr(0)) + " " + ctx.op.getText() + " " + visit(ctx.expr(1));
    }

    @Override
    public String visitAddexpr(GrammarParser.AddexprContext ctx) {
        return visit(ctx.expr(0)) + " " + ctx.op.getText() + " " + visit(ctx.expr(1));
    }

    @Override
    public String visitRelexpr(GrammarParser.RelexprContext ctx) {
        return visit(ctx.expr(0)) + " " + ctx.op.getText() + " " + visit(ctx.expr(1));
    }

    @Override
    public String visitEqexpr(GrammarParser.EqexprContext ctx) {
        if(ctx.op.getText().equals("IS=")){
            return visit(ctx.expr(0)) + " == " + visit(ctx.expr(1));
        }else{
            return visit(ctx.expr(0)) + " != " + visit(ctx.expr(1));
        }
    }

    @Override
    public String visitAndexpr(GrammarParser.AndexprContext ctx) {
        return visit(ctx.expr(0)) + " && " + visit(ctx.expr(1));
    }

    @Override
    public String visitOrexpr(GrammarParser.OrexprContext ctx) {
        return visit(ctx.expr(0)) + " || " + visit(ctx.expr(1));
    }

    @Override
    public String visitAtomic(GrammarParser.AtomicContext ctx) {
        if (ctx.getChildCount() > 1){
            return "(" + visit(ctx.expr()) + ")";
        }else{
            return super.visitAtomic(ctx);
        }
    }

    @Override
    public String visitId(GrammarParser.IdContext ctx) {
        return "_" + ctx.ID().getText();
    }

    @Override
    public String visitNum(GrammarParser.NumContext ctx) {
        return ctx.NUM().getText();
    }

    @Override
    public String visitString(GrammarParser.StringContext ctx) {
        String s = ctx.STRING().getText();
        return s;
    }

    @Override
    public String visitBool(GrammarParser.BoolContext ctx) {
        String b = ctx.BOOL().getText();
        if (b.equals("False")){
            return "false";
        }else {
            return "true";
        }
    }
}
