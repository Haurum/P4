/*package code;

import gen.GrammarBaseVisitor;
import gen.GrammarParser;

public class SymbolVisitor extends GrammarBaseVisitor<Tuple<String, String>> {

    SymbolTable ST;
    FuncSymbolTable FST;

    public SymbolVisitor(SymbolTable st, FuncSymbolTable fst){
        ST = st;
        FST = fst;
    }

    @Override
    public Tuple<String, String> visitExpr(GrammarParser.ExprContext ctx) {
        Tuple<String, String> result = super.visitExpr(ctx);
        System.out.println( result);
        return result;
    }

    @Override
    public Tuple<String, String> visitOrexpr(GrammarParser.OrexprContext ctx) {
        if (ctx.getChildCount() > 1){
            Tuple<String, String> current;
            Boolean result;
            for (int i = 0; i < ctx.andexpr().size(); i++){
                current = visit(ctx.andexpr(i));
                if (current.x.equals("Bool")){
                    result = Boolean.valueOf(current.y);
                    if (result){

                        return new Tuple<>("Bool", String.valueOf(result));
                    }
                }else{
                    Error e = new Error("Type error");
                    throw e;
                }
            }
            return new Tuple<>("Bool", "false");
        }else return super.visitOrexpr(ctx);
    }

    @Override
    public Tuple<String, String> visitAndexpr(GrammarParser.AndexprContext ctx) {
        if (ctx.getChildCount() > 1){
            Tuple<String, String> current;
            Boolean result;
            for (int i = 0; i < ctx.eqexpr().size(); i++){
                current = visit(ctx.eqexpr(i));
                if (current.x.equals("Bool")){
                    result = Boolean.valueOf(current.y);
                    if (!result){
                        return new Tuple<>("Bool", String.valueOf(result));
                    }
                }else{
                    Error e = new Error("Type error");
                    throw e;
                }
            }
            return new Tuple<>("Bool", "true");
        }else return super.visitAndexpr(ctx);
    }

    @Override
    public Tuple<String, String> visitEqexpr(GrammarParser.EqexprContext ctx) {
        if (ctx.getChildCount() > 1){
            Tuple<String, String> left = visit(ctx.relexpr(0));
            Tuple<String, String> right = visit(ctx.relexpr(1));
            if (left.x.equals(right.x)){
                switch (ctx.EQ().getText()){
                    case "IS=":
                        return new Tuple<>("Bool", String.valueOf(left.y.equals(right.y)));
                    case "NOT=":
                        return new Tuple<>("Bool", String.valueOf(!left.y.equals(right.y)));
                    default:
                        Error e = new Error("Unexpected char in EqExpression");
                        throw e;
                }
            }else{
                Error e = new Error("Type error");
                throw e;
            }
        }else return super.visitEqexpr(ctx);
    }

    @Override
    public Tuple<String, String> visitRelexpr(GrammarParser.RelexprContext ctx) {
        if (ctx.getChildCount() > 1){
            Tuple<String, String> left = visit(ctx.addexpr(0));
            Tuple<String, String> right = visit(ctx.addexpr(1));
            if (left.x.equals("Num") && right.x.equals("Num")){
                switch (ctx.REL().getText()){
                    case "<":
                        return new Tuple<>("Bool", String.valueOf(Double.valueOf(left.y) < Double.valueOf(right.y)));
                    case ">":
                        return new Tuple<>("Bool", String.valueOf(Double.valueOf(left.y) > Double.valueOf(right.y)));
                    case "<=":
                        return new Tuple<>("Bool", String.valueOf(Double.valueOf(left.y) <= Double.valueOf(right.y)));
                    case ">=":
                        return new Tuple<>("Bool", String.valueOf(Double.valueOf(left.y) >= Double.valueOf(right.y)));
                    default:
                        Error e = new Error("Unexpected char in RelExpression");
                        throw e;
                }
            }else{
                Error e = new Error("Type error");
                throw e;
            }
        }else return super.visitRelexpr(ctx);
    }

    @Override
    public Tuple<String, String> visitAddexpr(GrammarParser.AddexprContext ctx) {
        if (ctx.getChildCount() > 1){
            Tuple<String, String> result;
            result = visit(ctx.mulexpr(0));
            for (int i = 1; i < ctx.mulexpr().size(); i++){
                Tuple<String, String> current = visit(ctx.mulexpr(i));
                if (current.x.equals("Num") && result.x.equals("Num")){
                    switch (ctx.ADD(i-1).getText()){
                        case "+":
                            result.y = String.valueOf( Double.valueOf(current.y) + Double.valueOf(result.y)); break;
                        case "-":
                            result.y = String.valueOf( Double.valueOf(current.y) - Double.valueOf(result.y)); break;
                        default:
                            Error e = new Error("Unexpected char in AddExpression");
                            throw e;
                    }
                }else if (current.x.equals("String") || result.x.equals("String")){
                    switch (ctx.ADD(i-1).getText()){
                        case "+":
                            result.y += current.y; break;
                        default:
                            Error e = new Error("Unexpected char in AddExpression");
                            throw e;
                    }
                }else{
                    Error e = new Error("Type error");
                    throw e;
                }
            }
            return result;

        }else return super.visitAddexpr(ctx);

    }

    @Override
    public Tuple<String, String> visitMulexpr(GrammarParser.MulexprContext ctx) {
        if (ctx.getChildCount() > 1){
            Tuple<String, String> current = visit(ctx.unexpr(0));
            Double result;
            if (current.x.equals("Num")){
                result = Double.valueOf(current.y);
            }else{
                Error e = new Error("Type error");
                throw e;
            }
            for (int i = 1; i < ctx.unexpr().size(); i++){
                current = visit(ctx.unexpr(i));
                if (current.x.equals("Num")){
                    switch (ctx.MUL(i-1).getText()){
                        case "*":
                            result *= Double.valueOf(current.y); break;
                        case "/":
                            result /= Double.valueOf(current.y); break;
                        case "%":
                            result %= Double.valueOf(current.y); break;
                        default:
                            Error e = new Error("Unexpected char in MulExpression");
                            throw e;
                    }
                }else{
                    Error e = new Error("Type error");
                    throw e;
                }
            }
            return new Tuple<>("Num", String.valueOf(result));
        }else return super.visitMulexpr(ctx);
    }

    @Override
    public Tuple<String, String> visitUnexpr(GrammarParser.UnexprContext ctx) {
        if (ctx.getChildCount() > 1){
            Tuple<String, String> atomic = visit(ctx.atomic());
            if (atomic.x.equals("Bool")){
                Boolean result = !Boolean.valueOf(atomic.y);
                return new Tuple<>("Bool", String.valueOf(result));
            }else{
                Error e = new Error("Type error");
                throw e;
            }
        }else return super.visitUnexpr(ctx);
    }

    @Override
    public Tuple<String, String> visitAtomic(GrammarParser.AtomicContext ctx) {
        if (ctx.getChildCount() > 1){
            return visit(ctx.expr());
        }else return super.visitAtomic(ctx);
    }

    @Override
    public Tuple<String, String> visitId(GrammarParser.IdContext ctx) {
        Symbol sym = ST.GetSymbol(ctx.ID().getText());
        if (sym.Value != null) {
            return new Tuple<>(sym.Type, sym.Value);
        }else{
            Error e = new Error("Variable '" + sym.Name + "' not instantiated");
            throw e;
        }
    }

    @Override
    public Tuple<String, String> visitNum(GrammarParser.NumContext ctx) {
        return new Tuple<>("Num", ctx.NUM().getText());
    }

    @Override
    public Tuple<String, String> visitString(GrammarParser.StringContext ctx) {
        return new Tuple<>("String", ctx.STRING().getText());
    }

    @Override
    public Tuple<String, String> visitBool(GrammarParser.BoolContext ctx) {
        return new Tuple<>("Bool", ctx.BOOL().getText());
    }
}
*/