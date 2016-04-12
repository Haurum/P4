/*
package code;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import gen.GrammarBaseListener;
import gen.GrammarParser;

import java.util.Stack;

public class SymbolListener extends GrammarBaseListener {

    SymbolTable ST;
    FuncSymbolTable FST;
    Stack<Tuple<String, String>> stack;

    public SymbolListener(SymbolTable st, FuncSymbolTable fst){
        ST = st;
        FST = fst;
        stack = new Stack<Tuple<String, String>>();
    }

    @Override
    public void enterBlock(GrammarParser.BlockContext ctx) {
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
        }else{}
    }

    @Override
    public void exitBlock(GrammarParser.BlockContext ctx) {
        ST.CloseScope();
    }

    @Override
    public void enterSetupblock(GrammarParser.SetupblockContext ctx) {
        ST.OpenScope();
    }

    @Override
    public void exitSetupblock(GrammarParser.SetupblockContext ctx) {
        ST.CloseScope();
    }

    @Override
    public void enterRepeatblock(GrammarParser.RepeatblockContext ctx) {
        ST.OpenScope();
    }

    @Override
    public void exitRepeatblock(GrammarParser.RepeatblockContext ctx) {
        super.exitRepeatblock(ctx);
    }

    @Override
    public void enterVardcl(GrammarParser.VardclContext ctx) {
        if (ctx.getChild(1) instanceof GrammarParser.AssignContext){
            ST.EnterSymbol(((GrammarParser.AssignContext) ctx.getChild(1)).ID().getText(), ctx.TYPE().getText());
        }else {
            ST.EnterSymbol(ctx.ID().getText(), ctx.TYPE().getText());
        }
    }

    @Override
    public void exitAssign(GrammarParser.AssignContext ctx) {
        Symbol sym = ST.GetSymbol(ctx.ID().getText());
        Tuple<String, String> expr = stack.pop();
        if (sym.Type.equals(expr.x)){
            sym.Value = expr.y;
        }else{
            Error e = new Error("Type error");
            throw e;
        }
    }

    @Override
    public void exitOrexpr(GrammarParser.OrexprContext ctx) {
        int n = ctx.getChildCount();
        if (n > 1){
            Stack<Tuple<String, String>> mulStack = new Stack<Tuple<String, String>>();
            for (int x = 0; x<(n+1)/2; x++){
                Tuple<String, String> tup = stack.pop();
                if (tup.x.equals("Bool")){
                    mulStack.push(tup);
                }else{
                    Error e = new Error("Type Error. Expected 'Bool' but was '" + tup.x + "'");
                }
            }
            System.out.println(mulStack.toString());
            for (int x = 0; x<(n-1)/2; x++){
                if (ctx.getChild(x*2+1).getText().equals("OR")){
                    mulStack.push(new Tuple<>("Bool", String.valueOf(Boolean.valueOf(mulStack.pop().y) || Boolean.valueOf(mulStack.pop().y))));
                }else{
                    Error e = new Error("did not recognize char: " + ctx.getChild(x*2+1).getText());
                    throw e;
                }
                System.out.println(mulStack.toString());
            }
            stack.push(mulStack.pop());
        }
    }

    @Override
    public void exitAndexpr(GrammarParser.AndexprContext ctx) {
        int n = ctx.getChildCount();
        if (n > 1){
            Stack<Tuple<String, String>> mulStack = new Stack<Tuple<String, String>>();
            for (int x = 0; x<(n+1)/2; x++){
                Tuple<String, String> tup = stack.pop();
                if (tup.x.equals("Bool")){
                    mulStack.push(tup);
                }else{
                    Error e = new Error("Type Error. Expected 'Bool' but was '" + tup.x + "'");
                }
            }
            System.out.println(mulStack.toString());
            for (int x = 0; x<(n-1)/2; x++){
                if (ctx.getChild(x*2+1).getText().equals("AND")){
                    mulStack.push(new Tuple<>("Bool", String.valueOf(Boolean.valueOf(mulStack.pop().y) && Boolean.valueOf(mulStack.pop().y))));
                }else{
                    Error e = new Error("did not recognize char: " + ctx.getChild(x*2+1).getText());
                    throw e;
                }
                System.out.println(mulStack.toString());
            }
            stack.push(mulStack.pop());
        }
    }

    @Override
    public void exitEqexpr(GrammarParser.EqexprContext ctx) {
        int n = ctx.getChildCount();
        if (n > 1){
            Stack<Tuple<String, String>> mulStack = new Stack<Tuple<String, String>>();
            for (int x = 0; x<(n+1)/2; x++){
                Tuple<String, String> tup = stack.pop();
                if (tup.x.equals("Num")){
                    mulStack.push(tup);
                }else{
                    Error e = new Error("Type Error. Expected 'Num' but was '" + tup.x + "'");
                    throw e;
                }
            }
            System.out.println(mulStack.toString());
            for (int x = 0; x<(n-1)/2; x++){
                if (ctx.getChild(x*2+1).getText().equals(">")){
                    mulStack.push(new Tuple<>("Bool", String.valueOf(Double.valueOf(mulStack.pop().y) > Double.valueOf(mulStack.pop().y))));
                }else if (ctx.getChild(x*2+1).getText().equals("<")){
                    mulStack.push(new Tuple<>("Bool", String.valueOf(Double.valueOf(mulStack.pop().y) < Double.valueOf(mulStack.pop().y))));
                }else if (ctx.getChild(x*2+1).getText().equals(">=")){
                    mulStack.push(new Tuple<>("Bool", String.valueOf(Double.valueOf(mulStack.pop().y) >= Double.valueOf(mulStack.pop().y))));
                }else if (ctx.getChild(x*2+1).getText().equals("<=")){
                    mulStack.push(new Tuple<>("Bool", String.valueOf(Double.valueOf(mulStack.pop().y) <= Double.valueOf(mulStack.pop().y))));
                }else{
                    Error e = new Error("did not recognize char: " + ctx.getChild(x*2+1).getText());
                    throw e;
                }
                System.out.println(mulStack.toString());
            }
            stack.push(mulStack.pop());
        }
    }

    @Override
    public void exitRelexpr(GrammarParser.RelexprContext ctx) {
        int n = ctx.getChildCount();
        if (n > 1){
            Stack<Tuple<String, String>> mulStack = new Stack<Tuple<String, String>>();
            for (int x = 0; x<(n+1)/2; x++){
                mulStack.push(stack.pop());
            }
            System.out.println(mulStack.toString());
            for (int x = 0; x<(n-1)/2; x++){
                if (ctx.getChild(x*2+1).getText().equals("IS=")){
                    Tuple<String, String> left = mulStack.pop();
                    Tuple<String, String> right = mulStack.pop();
                    if (left.x.equals("String") && right.x.equals("String")){
                        mulStack.push(new Tuple<>("Bool", String.valueOf(left.y.equals(right.y))));
                    }else if (left.x.equals("Bool") && right.x.equals("Bool")){
                        mulStack.push(new Tuple<>("Bool", String.valueOf(Boolean.valueOf(left.y) == Boolean.valueOf(right.y))));
                    }else if (left.x.equals("Num") && right.x.equals("Num")){
                        mulStack.push(new Tuple<>("Bool", String.valueOf(Double.valueOf(left.y) == Double.valueOf(right.y))));
                    }else{
                        Error e = new Error("Type error");
                        throw e;
                    }
                }else if (ctx.getChild(x*2+1).getText().equals("NOT=")){
                    Tuple<String, String> left = mulStack.pop();
                    Tuple<String, String> right = mulStack.pop();
                    if (left.x.equals("String") && right.x.equals("String")){
                        mulStack.push(new Tuple<>("Bool", String.valueOf(!left.y.equals(right.y))));
                    }else if (left.x.equals("Bool") && right.x.equals("Bool")){
                        mulStack.push(new Tuple<>("Bool", String.valueOf(Boolean.valueOf(left.y) != Boolean.valueOf(right.y))));
                    }else if (left.x.equals("Num") && right.x.equals("Num")){
                        mulStack.push(new Tuple<>("Bool", String.valueOf(Double.valueOf(left.y) != Double.valueOf(right.y))));
                    }else{
                        Error e = new Error("Type error");
                        throw e;
                    }
                }else{
                    Error e = new Error("did not recognize char: " + ctx.getChild(x*2+1).getText());
                    throw e;
                }
                System.out.println(mulStack.toString());
            }
            stack.push(mulStack.pop());
        }
    }

    @Override
    public void exitAddexpr(GrammarParser.AddexprContext ctx) {
        int n = ctx.getChildCount();
        if (n > 1){
            Stack<Tuple<String, String>> mulStack = new Stack<Tuple<String, String>>();
            for (int x = 0; x<(n+1)/2; x++){
                mulStack.push(stack.pop());
            }
            System.out.println(mulStack.toString());
            for (int x = 0; x<(n-1)/2; x++){
                if (ctx.getChild(x*2+1).getText().equals("+")){
                    Tuple<String, String> left = mulStack.pop();
                    Tuple<String, String> right = mulStack.pop();
                    if (left.x.equals("String") || right.x.equals("String")){
                        mulStack.push(new Tuple<>("String", left.y + right.y));
                    }else if (left.x.equals("Num") && right.x.equals("Num")){
                        mulStack.push(new Tuple<>("Num",String.valueOf(Double.valueOf(left.y) + Double.valueOf(right.y))));
                    }else{
                        Error e = new Error("Type error");
                        throw e;
                    }

                }else if (ctx.getChild(x*2+1).getText().equals("-")){
                    Tuple<String, String> left = mulStack.pop();
                    Tuple<String, String> right = mulStack.pop();
                    if (left.x.equals("Num") && right.x.equals("Num")) {
                        mulStack.push(new Tuple<>("Num", String.valueOf(Double.valueOf(left.y) - Double.valueOf(right.y))));
                    }else{
                        Error e = new Error("Type error, One operand of the '-' operation was not of type 'Num'");
                        throw e;
                    }
                }else{
                    Error e = new Error("did not recognize char: " + ctx.getChild(x*2+1).getText());
                    throw e;
                }
                System.out.println(mulStack.toString());
            }
            stack.push(mulStack.pop());
        }
    }

    @Override
    public void exitMulexpr(GrammarParser.MulexprContext ctx) {
        int n = ctx.getChildCount();
        if (n > 1){
            Stack<Tuple<String, String>> mulStack = new Stack<Tuple<String, String>>();
            for (int x = 0; x<(n+1)/2; x++){
                Tuple<String, String> tup = stack.pop();
                if (tup.x.equals("Num")){
                    mulStack.push(tup);
                }else{
                    Error e = new Error("Type Error. Expected 'Num' but was '" + tup.x + "'");
                }
            }
            System.out.println(mulStack.toString());
            for (int x = 0; x<(n-1)/2; x++){
                if (ctx.getChild(x*2+1).getText().equals("/")){
                    mulStack.push(new Tuple<>("Num", String.valueOf(Double.valueOf(mulStack.pop().y) / Double.valueOf(mulStack.pop().y))));
                }else if (ctx.getChild(x*2+1).getText().equals("*")){
                    mulStack.push(new Tuple<>("Num", String.valueOf(Double.valueOf(mulStack.pop().y) * Double.valueOf(mulStack.pop().y))));
                }else if (ctx.getChild(x*2+1).getText().equals("%")){
                    mulStack.push(new Tuple<>("Num", String.valueOf(Double.valueOf(mulStack.pop().y) % Double.valueOf(mulStack.pop().y))));
                }else{
                    Error e = new Error("did not recognize char: " + ctx.getChild(x*2+1).getText());
                    throw e;
                }
                System.out.println(mulStack.toString());
            }
            stack.push(mulStack.pop());
        }
    }

    @Override
    public void exitUnexpr(GrammarParser.UnexprContext ctx) {
        if (ctx.getChildCount() > 1){
            Tuple<String, String> atomic = stack.pop();
            if (atomic.x.equals("Bool")){
                Boolean result = !Boolean.valueOf(atomic.y);
                stack.push(new Tuple<>("Bool", String.valueOf(result)));
            }
        }
    }

    @Override
    public void exitId(GrammarParser.IdContext ctx) {
        Symbol sym = ST.GetSymbol(ctx.ID().getText());
        if (sym.Value != null) {
            stack.push(new Tuple<>(sym.Type, sym.Value));
        }else{
            Error e = new Error("Variable '" + sym.Name + "' not instantiated");
            throw e;
        }
    }

    @Override
    public void exitNum(GrammarParser.NumContext ctx) {
        stack.push(new Tuple<>("Num", ctx.NUM().getText()));
    }

    @Override
    public void exitString(GrammarParser.StringContext ctx) {
        stack.push(new Tuple<>("String", ctx.STRING().getText().split("\"")[1]));
    }

    @Override
    public void exitBool(GrammarParser.BoolContext ctx) {
        stack.push(new Tuple<>("Bool", ctx.BOOL().getText()));
    }
}
*/