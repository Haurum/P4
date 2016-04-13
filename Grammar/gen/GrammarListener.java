package gen;// Generated from C:/Users/frede/Documents/GitHub/P4/Grammar\Grammar.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#tankname}.
	 * @param ctx the parse tree
	 */
	void enterTankname(GrammarParser.TanknameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#tankname}.
	 * @param ctx the parse tree
	 */
	void exitTankname(GrammarParser.TanknameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#setupblock}.
	 * @param ctx the parse tree
	 */
	void enterSetupblock(GrammarParser.SetupblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#setupblock}.
	 * @param ctx the parse tree
	 */
	void exitSetupblock(GrammarParser.SetupblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#repeatblock}.
	 * @param ctx the parse tree
	 */
	void enterRepeatblock(GrammarParser.RepeatblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#repeatblock}.
	 * @param ctx the parse tree
	 */
	void exitRepeatblock(GrammarParser.RepeatblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#dcls}.
	 * @param ctx the parse tree
	 */
	void enterDcls(GrammarParser.DclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#dcls}.
	 * @param ctx the parse tree
	 */
	void exitDcls(GrammarParser.DclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#actdcl}.
	 * @param ctx the parse tree
	 */
	void enterActdcl(GrammarParser.ActdclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#actdcl}.
	 * @param ctx the parse tree
	 */
	void exitActdcl(GrammarParser.ActdclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#funcdcl}.
	 * @param ctx the parse tree
	 */
	void enterFuncdcl(GrammarParser.FuncdclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#funcdcl}.
	 * @param ctx the parse tree
	 */
	void exitFuncdcl(GrammarParser.FuncdclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionBlock}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBlock(GrammarParser.FunctionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionBlock}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBlock(GrammarParser.FunctionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(GrammarParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(GrammarParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(GrammarParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(GrammarParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#eventdcl}.
	 * @param ctx the parse tree
	 */
	void enterEventdcl(GrammarParser.EventdclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#eventdcl}.
	 * @param ctx the parse tree
	 */
	void exitEventdcl(GrammarParser.EventdclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(GrammarParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(GrammarParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(GrammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(GrammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#vardcl}.
	 * @param ctx the parse tree
	 */
	void enterVardcl(GrammarParser.VardclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#vardcl}.
	 * @param ctx the parse tree
	 */
	void exitVardcl(GrammarParser.VardclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(GrammarParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(GrammarParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterElseif(GrammarParser.ElseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitElseif(GrammarParser.ElseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(GrammarParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(GrammarParser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(GrammarParser.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(GrammarParser.ReturnstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(GrammarParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(GrammarParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#acall}.
	 * @param ctx the parse tree
	 */
	void enterAcall(GrammarParser.AcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#acall}.
	 * @param ctx the parse tree
	 */
	void exitAcall(GrammarParser.AcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#fcall}.
	 * @param ctx the parse tree
	 */
	void enterFcall(GrammarParser.FcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#fcall}.
	 * @param ctx the parse tree
	 */
	void exitFcall(GrammarParser.FcallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tankcall}
	 * labeled alternative in {@link GrammarParser#rcall}.
	 * @param ctx the parse tree
	 */
	void enterTankcall(GrammarParser.TankcallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tankcall}
	 * labeled alternative in {@link GrammarParser#rcall}.
	 * @param ctx the parse tree
	 */
	void exitTankcall(GrammarParser.TankcallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code guncall}
	 * labeled alternative in {@link GrammarParser#rcall}.
	 * @param ctx the parse tree
	 */
	void enterGuncall(GrammarParser.GuncallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code guncall}
	 * labeled alternative in {@link GrammarParser#rcall}.
	 * @param ctx the parse tree
	 */
	void exitGuncall(GrammarParser.GuncallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code radarcall}
	 * labeled alternative in {@link GrammarParser#rcall}.
	 * @param ctx the parse tree
	 */
	void enterRadarcall(GrammarParser.RadarcallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code radarcall}
	 * labeled alternative in {@link GrammarParser#rcall}.
	 * @param ctx the parse tree
	 */
	void exitRadarcall(GrammarParser.RadarcallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code battlefieldcall}
	 * labeled alternative in {@link GrammarParser#rcall}.
	 * @param ctx the parse tree
	 */
	void enterBattlefieldcall(GrammarParser.BattlefieldcallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code battlefieldcall}
	 * labeled alternative in {@link GrammarParser#rcall}.
	 * @param ctx the parse tree
	 */
	void exitBattlefieldcall(GrammarParser.BattlefieldcallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathcall}
	 * labeled alternative in {@link GrammarParser#rcall}.
	 * @param ctx the parse tree
	 */
	void enterMathcall(GrammarParser.MathcallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathcall}
	 * labeled alternative in {@link GrammarParser#rcall}.
	 * @param ctx the parse tree
	 */
	void exitMathcall(GrammarParser.MathcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ecall}.
	 * @param ctx the parse tree
	 */
	void enterEcall(GrammarParser.EcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ecall}.
	 * @param ctx the parse tree
	 */
	void exitEcall(GrammarParser.EcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(GrammarParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(GrammarParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqexpr(GrammarParser.EqexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqexpr(GrammarParser.EqexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotexpr(GrammarParser.NotexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotexpr(GrammarParser.NotexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinusexpr(GrammarParser.MinusexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinusexpr(GrammarParser.MinusexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulexpr(GrammarParser.MulexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulexpr(GrammarParser.MulexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddexpr(GrammarParser.AddexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddexpr(GrammarParser.AddexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrexpr(GrammarParser.OrexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrexpr(GrammarParser.OrexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndexpr(GrammarParser.AndexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndexpr(GrammarParser.AndexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomicexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomicexpr(GrammarParser.AtomicexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomicexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomicexpr(GrammarParser.AtomicexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelexpr(GrammarParser.RelexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelexpr(GrammarParser.RelexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterAtomic(GrammarParser.AtomicContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitAtomic(GrammarParser.AtomicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterId(GrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitId(GrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNum(GrammarParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNum(GrammarParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterString(GrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitString(GrammarParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBool(GrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBool(GrammarParser.BoolContext ctx);
}