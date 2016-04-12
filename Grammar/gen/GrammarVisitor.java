package gen;// Generated from C:/Users/frede/Documents/GitHub/P4/Grammar\Grammar.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(GrammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#tankname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTankname(GrammarParser.TanknameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#setupblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetupblock(GrammarParser.SetupblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#repeatblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatblock(GrammarParser.RepeatblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#dcls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcls(GrammarParser.DclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#actdcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActdcl(GrammarParser.ActdclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#funcdcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdcl(GrammarParser.FuncdclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBlock(GrammarParser.FunctionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(GrammarParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(GrammarParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#eventdcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventdcl(GrammarParser.EventdclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(GrammarParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(GrammarParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#vardcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardcl(GrammarParser.VardclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(GrammarParser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif(GrammarParser.ElseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#whilestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestmt(GrammarParser.WhilestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#returnstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstmt(GrammarParser.ReturnstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(GrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(GrammarParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#acall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcall(GrammarParser.AcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#fcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFcall(GrammarParser.FcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#rcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRcall(GrammarParser.RcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ecall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEcall(GrammarParser.EcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(GrammarParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqexpr(GrammarParser.EqexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotexpr(GrammarParser.NotexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusexpr(GrammarParser.MinusexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulexpr(GrammarParser.MulexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddexpr(GrammarParser.AddexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomexpr(GrammarParser.AtomexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrexpr(GrammarParser.OrexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndexpr(GrammarParser.AndexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relexpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelexpr(GrammarParser.RelexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomic(GrammarParser.AtomicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(GrammarParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(GrammarParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(GrammarParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(GrammarParser.BoolContext ctx);
}