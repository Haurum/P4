package code;

import gen.GrammarBaseListener;
import gen.GrammarParser;

import java.util.ArrayList;

/**
 * Created by Frederik on 28-03-2016.
 */
public class FuncListener extends GrammarBaseListener {

    FuncSymbolTable FST;
    FuncSymbol CurrentFunc;

    public FuncListener(FuncSymbolTable fst){
        this.FST = fst;
    }

    @Override
    public void enterActdcl(GrammarParser.ActdclContext ctx) {
        CurrentFunc = new FuncSymbol();
        CurrentFunc.Name = ctx.ID().getText();
        CurrentFunc.Type = "Action";
    }

    @Override
    public void exitActdcl(GrammarParser.ActdclContext ctx) {
        FST.EnterFuncSymbol(CurrentFunc);
    }

    @Override
    public void enterFuncdcl(GrammarParser.FuncdclContext ctx) {
        CurrentFunc = new FuncSymbol();
        CurrentFunc.Name = ctx.ID().getText();
        CurrentFunc.Type = "Function";
        CurrentFunc.ReturnType = ctx.TYPE().getText();
    }

    @Override
    public void exitFuncdcl(GrammarParser.FuncdclContext ctx) {
        FST.EnterFuncSymbol(CurrentFunc);
    }

    @Override
    public void enterParam(GrammarParser.ParamContext ctx) {
        CurrentFunc.Params.add(new Tuple(ctx.ID().getText(), ctx.TYPE().getText()));
    }
}
