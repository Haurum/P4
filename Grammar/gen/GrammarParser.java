package gen;// Generated from C:/Users/Frederik/Documents/GitHub/P4/Grammar\Grammar.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, ID=29, OR=30, AND=31, EQ=32, REL=33, 
		ADD=34, MUL=35, NUM=36, BOOL=37, STRING=38, TYPE=39, COMMENT=40, SPACE=41;
	public static final int
		RULE_prog = 0, RULE_setupblock = 1, RULE_repeatblock = 2, RULE_dcls = 3, 
		RULE_actdcl = 4, RULE_funcdcl = 5, RULE_functionBlock = 6, RULE_params = 7, 
		RULE_param = 8, RULE_eventdcl = 9, RULE_block = 10, RULE_stmts = 11, RULE_assign = 12, 
		RULE_vardcl = 13, RULE_ifstmt = 14, RULE_elseif = 15, RULE_whilestmt = 16, 
		RULE_returnstmt = 17, RULE_print = 18, RULE_call = 19, RULE_acall = 20, 
		RULE_fcall = 21, RULE_rcall = 22, RULE_ecall = 23, RULE_args = 24, RULE_expr = 25, 
		RULE_orexpr = 26, RULE_andexpr = 27, RULE_eqexpr = 28, RULE_relexpr = 29, 
		RULE_addexpr = 30, RULE_mulexpr = 31, RULE_unexpr = 32, RULE_atomic = 33, 
		RULE_literal = 34;
	public static final String[] ruleNames = {
		"prog", "setupblock", "repeatblock", "dcls", "actdcl", "funcdcl", "functionBlock", 
		"params", "param", "eventdcl", "block", "stmts", "assign", "vardcl", "ifstmt", 
		"elseif", "whilestmt", "returnstmt", "print", "call", "acall", "fcall", 
		"rcall", "ecall", "args", "expr", "orexpr", "andexpr", "eqexpr", "relexpr", 
		"addexpr", "mulexpr", "unexpr", "atomic", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Setup'", "'Repeat'", "';'", "'Tankname'", "'Action'", "'('", "')'", 
		"'Function'", "'returns'", "'{'", "'}'", "','", "'When'", "'='", "'if'", 
		"'else'", "'repeat'", "'while'", "'return'", "'print('", "'run'", "'Tank.'", 
		"'Gun.'", "'Radar.'", "'Battlefield.'", "'Math.'", "'Event.'", "'NOT'", 
		null, "'OR'", "'AND'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "ID", "OR", "AND", "EQ", "REL", "ADD", "MUL", 
		"NUM", "BOOL", "STRING", "TYPE", "COMMENT", "SPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public DclsContext dcls() {
			return getRuleContext(DclsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			dcls();
			setState(71);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetupblockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SetupblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setupblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSetupblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSetupblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSetupblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetupblockContext setupblock() throws RecognitionException {
		SetupblockContext _localctx = new SetupblockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setupblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__0);
			setState(74);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatblockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RepeatblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRepeatblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRepeatblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRepeatblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatblockContext repeatblock() throws RecognitionException {
		RepeatblockContext _localctx = new RepeatblockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_repeatblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__1);
			setState(77);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DclsContext extends ParserRuleContext {
		public List<ActdclContext> actdcl() {
			return getRuleContexts(ActdclContext.class);
		}
		public ActdclContext actdcl(int i) {
			return getRuleContext(ActdclContext.class,i);
		}
		public List<FuncdclContext> funcdcl() {
			return getRuleContexts(FuncdclContext.class);
		}
		public FuncdclContext funcdcl(int i) {
			return getRuleContext(FuncdclContext.class,i);
		}
		public List<VardclContext> vardcl() {
			return getRuleContexts(VardclContext.class);
		}
		public VardclContext vardcl(int i) {
			return getRuleContext(VardclContext.class,i);
		}
		public List<SetupblockContext> setupblock() {
			return getRuleContexts(SetupblockContext.class);
		}
		public SetupblockContext setupblock(int i) {
			return getRuleContext(SetupblockContext.class,i);
		}
		public List<RepeatblockContext> repeatblock() {
			return getRuleContexts(RepeatblockContext.class);
		}
		public RepeatblockContext repeatblock(int i) {
			return getRuleContext(RepeatblockContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public List<EventdclContext> eventdcl() {
			return getRuleContexts(EventdclContext.class);
		}
		public EventdclContext eventdcl(int i) {
			return getRuleContext(EventdclContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public DclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDcls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDcls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDcls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclsContext dcls() throws RecognitionException {
		DclsContext _localctx = new DclsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dcls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__12) | (1L << T__19) | (1L << TYPE))) != 0)) {
				{
				setState(93);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(79);
					actdcl();
					}
					break;
				case T__7:
					{
					setState(80);
					funcdcl();
					}
					break;
				case TYPE:
					{
					setState(81);
					vardcl();
					setState(82);
					match(T__2);
					}
					break;
				case T__0:
					{
					setState(84);
					setupblock();
					}
					break;
				case T__1:
					{
					setState(85);
					repeatblock();
					}
					break;
				case T__3:
					{
					setState(86);
					match(T__3);
					setState(87);
					match(ID);
					setState(88);
					match(T__2);
					}
					break;
				case T__12:
					{
					setState(89);
					eventdcl();
					}
					break;
				case T__19:
					{
					setState(90);
					print();
					setState(91);
					match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActdclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ActdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actdcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterActdcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitActdcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitActdcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActdclContext actdcl() throws RecognitionException {
		ActdclContext _localctx = new ActdclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_actdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__4);
			setState(99);
			match(ID);
			setState(100);
			match(T__5);
			setState(102);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(101);
				params();
				}
			}

			setState(104);
			match(T__6);
			setState(105);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncdclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(GrammarParser.TYPE, 0); }
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FuncdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFuncdcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFuncdcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFuncdcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdclContext funcdcl() throws RecognitionException {
		FuncdclContext _localctx = new FuncdclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__7);
			setState(108);
			match(ID);
			setState(109);
			match(T__5);
			setState(111);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(110);
				params();
				}
			}

			setState(113);
			match(T__6);
			setState(114);
			match(T__8);
			setState(115);
			match(TYPE);
			setState(116);
			functionBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBlockContext extends ParserRuleContext {
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public ReturnstmtContext returnstmt() {
			return getRuleContext(ReturnstmtContext.class,0);
		}
		public FunctionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunctionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunctionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFunctionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBlockContext functionBlock() throws RecognitionException {
		FunctionBlockContext _localctx = new FunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__9);
			setState(119);
			stmts();
			setState(120);
			returnstmt();
			setState(121);
			match(T__2);
			setState(122);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			param();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(125);
				match(T__11);
				setState(126);
				param();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(GrammarParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(TYPE);
			setState(133);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventdclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EventdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventdcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEventdcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEventdcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEventdcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventdclContext eventdcl() throws RecognitionException {
		EventdclContext _localctx = new EventdclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_eventdcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__12);
			setState(136);
			match(ID);
			setState(137);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__9);
			setState(140);
			stmts();
			setState(141);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtsContext extends ParserRuleContext {
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<VardclContext> vardcl() {
			return getRuleContexts(VardclContext.class);
		}
		public VardclContext vardcl(int i) {
			return getRuleContext(VardclContext.class,i);
		}
		public List<IfstmtContext> ifstmt() {
			return getRuleContexts(IfstmtContext.class);
		}
		public IfstmtContext ifstmt(int i) {
			return getRuleContext(IfstmtContext.class,i);
		}
		public List<WhilestmtContext> whilestmt() {
			return getRuleContexts(WhilestmtContext.class);
		}
		public WhilestmtContext whilestmt(int i) {
			return getRuleContext(WhilestmtContext.class,i);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << ID) | (1L << TYPE))) != 0)) {
				{
				setState(157);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(143);
					assign();
					setState(144);
					match(T__2);
					}
					break;
				case 2:
					{
					setState(146);
					vardcl();
					setState(147);
					match(T__2);
					}
					break;
				case 3:
					{
					setState(149);
					ifstmt();
					}
					break;
				case 4:
					{
					setState(150);
					whilestmt();
					}
					break;
				case 5:
					{
					setState(151);
					call();
					setState(152);
					match(T__2);
					}
					break;
				case 6:
					{
					setState(154);
					print();
					setState(155);
					match(T__2);
					}
					break;
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ID);
			setState(163);
			match(T__13);
			setState(164);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VardclContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(GrammarParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public VardclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVardcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVardcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVardcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardclContext vardcl() throws RecognitionException {
		VardclContext _localctx = new VardclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_vardcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(TYPE);
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(167);
				match(ID);
				}
				break;
			case 2:
				{
				setState(168);
				assign();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<ElseifContext> elseif() {
			return getRuleContexts(ElseifContext.class);
		}
		public ElseifContext elseif(int i) {
			return getRuleContext(ElseifContext.class,i);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIfstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifstmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__14);
			setState(172);
			match(T__5);
			setState(173);
			expr();
			setState(174);
			match(T__6);
			setState(175);
			block();
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(176);
					elseif();
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(184);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(182);
				match(T__15);
				setState(183);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseifContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterElseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitElseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitElseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__15);
			setState(187);
			match(T__14);
			setState(188);
			match(T__5);
			setState(189);
			expr();
			setState(190);
			match(T__6);
			setState(191);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhilestmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWhilestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitWhilestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__16);
			setState(206);
			switch (_input.LA(1)) {
			case T__17:
				{
				setState(194);
				match(T__17);
				setState(195);
				match(T__5);
				setState(196);
				expr();
				setState(197);
				match(T__6);
				setState(198);
				block();
				}
				break;
			case T__9:
				{
				setState(200);
				block();
				setState(201);
				match(T__17);
				setState(202);
				match(T__5);
				setState(203);
				expr();
				setState(204);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnstmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterReturnstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitReturnstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitReturnstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnstmtContext returnstmt() throws RecognitionException {
		ReturnstmtContext _localctx = new ReturnstmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__18);
			setState(210);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << ID) | (1L << NUM) | (1L << BOOL) | (1L << STRING))) != 0)) {
				{
				setState(209);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__19);
			setState(213);
			expr();
			setState(214);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public AcallContext acall() {
			return getRuleContext(AcallContext.class,0);
		}
		public FcallContext fcall() {
			return getRuleContext(FcallContext.class,0);
		}
		public RcallContext rcall() {
			return getRuleContext(RcallContext.class,0);
		}
		public EcallContext ecall() {
			return getRuleContext(EcallContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_call);
		try {
			setState(220);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				acall();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				fcall();
				}
				break;
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				rcall();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				ecall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AcallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public AcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AcallContext acall() throws RecognitionException {
		AcallContext _localctx = new AcallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_acall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__20);
			setState(223);
			match(ID);
			setState(224);
			match(T__5);
			setState(226);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << ID) | (1L << NUM) | (1L << BOOL) | (1L << STRING))) != 0)) {
				{
				setState(225);
				args();
				}
			}

			setState(228);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FcallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FcallContext fcall() throws RecognitionException {
		FcallContext _localctx = new FcallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fcall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(ID);
			setState(231);
			match(T__5);
			setState(233);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << ID) | (1L << NUM) | (1L << BOOL) | (1L << STRING))) != 0)) {
				{
				setState(232);
				args();
				}
			}

			setState(235);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RcallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public RcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RcallContext rcall() throws RecognitionException {
		RcallContext _localctx = new RcallContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_rcall);
		int _la;
		try {
			setState(272);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(T__21);
				setState(238);
				match(ID);
				setState(239);
				match(T__5);
				setState(241);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << ID) | (1L << NUM) | (1L << BOOL) | (1L << STRING))) != 0)) {
					{
					setState(240);
					args();
					}
				}

				setState(243);
				match(T__6);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(T__22);
				setState(245);
				match(ID);
				setState(246);
				match(T__5);
				setState(248);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << ID) | (1L << NUM) | (1L << BOOL) | (1L << STRING))) != 0)) {
					{
					setState(247);
					args();
					}
				}

				setState(250);
				match(T__6);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(T__23);
				setState(252);
				match(ID);
				setState(253);
				match(T__5);
				setState(255);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << ID) | (1L << NUM) | (1L << BOOL) | (1L << STRING))) != 0)) {
					{
					setState(254);
					args();
					}
				}

				setState(257);
				match(T__6);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				match(T__24);
				setState(259);
				match(ID);
				setState(260);
				match(T__5);
				setState(262);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << ID) | (1L << NUM) | (1L << BOOL) | (1L << STRING))) != 0)) {
					{
					setState(261);
					args();
					}
				}

				setState(264);
				match(T__6);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
				match(T__25);
				setState(266);
				match(ID);
				setState(267);
				match(T__5);
				setState(269);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << ID) | (1L << NUM) | (1L << BOOL) | (1L << STRING))) != 0)) {
					{
					setState(268);
					args();
					}
				}

				setState(271);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EcallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public EcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ecall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EcallContext ecall() throws RecognitionException {
		EcallContext _localctx = new EcallContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ecall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(T__26);
			setState(275);
			match(ID);
			setState(276);
			match(T__5);
			setState(278);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << ID) | (1L << NUM) | (1L << BOOL) | (1L << STRING))) != 0)) {
				{
				setState(277);
				args();
				}
			}

			setState(280);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			expr();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(283);
				match(T__11);
				setState(284);
				expr();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public OrexprContext orexpr() {
			return getRuleContext(OrexprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			orexpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrexprContext extends ParserRuleContext {
		public AndexprContext andexpr() {
			return getRuleContext(AndexprContext.class,0);
		}
		public TerminalNode OR() { return getToken(GrammarParser.OR, 0); }
		public OrexprContext orexpr() {
			return getRuleContext(OrexprContext.class,0);
		}
		public OrexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOrexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOrexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOrexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrexprContext orexpr() throws RecognitionException {
		OrexprContext _localctx = new OrexprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_orexpr);
		try {
			setState(297);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				andexpr();
				setState(293);
				match(OR);
				setState(294);
				orexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				andexpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndexprContext extends ParserRuleContext {
		public EqexprContext eqexpr() {
			return getRuleContext(EqexprContext.class,0);
		}
		public TerminalNode AND() { return getToken(GrammarParser.AND, 0); }
		public AndexprContext andexpr() {
			return getRuleContext(AndexprContext.class,0);
		}
		public AndexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAndexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAndexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAndexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndexprContext andexpr() throws RecognitionException {
		AndexprContext _localctx = new AndexprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_andexpr);
		try {
			setState(304);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				eqexpr();
				setState(300);
				match(AND);
				setState(301);
				andexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				eqexpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqexprContext extends ParserRuleContext {
		public RelexprContext relexpr() {
			return getRuleContext(RelexprContext.class,0);
		}
		public TerminalNode EQ() { return getToken(GrammarParser.EQ, 0); }
		public EqexprContext eqexpr() {
			return getRuleContext(EqexprContext.class,0);
		}
		public EqexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEqexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEqexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEqexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqexprContext eqexpr() throws RecognitionException {
		EqexprContext _localctx = new EqexprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_eqexpr);
		try {
			setState(311);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				relexpr();
				setState(307);
				match(EQ);
				setState(308);
				eqexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				relexpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelexprContext extends ParserRuleContext {
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
		public TerminalNode REL() { return getToken(GrammarParser.REL, 0); }
		public RelexprContext relexpr() {
			return getRuleContext(RelexprContext.class,0);
		}
		public RelexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRelexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRelexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRelexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelexprContext relexpr() throws RecognitionException {
		RelexprContext _localctx = new RelexprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_relexpr);
		try {
			setState(318);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				addexpr();
				setState(314);
				match(REL);
				setState(315);
				relexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				addexpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddexprContext extends ParserRuleContext {
		public MulexprContext mulexpr() {
			return getRuleContext(MulexprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(GrammarParser.ADD, 0); }
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
		public AddexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAddexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAddexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAddexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddexprContext addexpr() throws RecognitionException {
		AddexprContext _localctx = new AddexprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_addexpr);
		try {
			setState(325);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				mulexpr();
				setState(321);
				match(ADD);
				setState(322);
				addexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				mulexpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulexprContext extends ParserRuleContext {
		public UnexprContext unexpr() {
			return getRuleContext(UnexprContext.class,0);
		}
		public TerminalNode MUL() { return getToken(GrammarParser.MUL, 0); }
		public MulexprContext mulexpr() {
			return getRuleContext(MulexprContext.class,0);
		}
		public MulexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMulexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMulexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMulexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulexprContext mulexpr() throws RecognitionException {
		MulexprContext _localctx = new MulexprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_mulexpr);
		try {
			setState(332);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				unexpr();
				setState(328);
				match(MUL);
				setState(329);
				mulexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				unexpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnexprContext extends ParserRuleContext {
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public UnexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterUnexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitUnexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitUnexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnexprContext unexpr() throws RecognitionException {
		UnexprContext _localctx = new UnexprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_unexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(334);
				match(T__27);
				}
			}

			setState(337);
			atomic();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomicContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AtomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAtomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAtomic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAtomic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicContext atomic() throws RecognitionException {
		AtomicContext _localctx = new AtomicContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_atomic);
		try {
			setState(345);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(T__5);
				setState(340);
				expr();
				setState(341);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringContext extends LiteralContext {
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public StringContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends LiteralContext {
		public TerminalNode BOOL() { return getToken(GrammarParser.BOOL, 0); }
		public BoolContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumContext extends LiteralContext {
		public TerminalNode NUM() { return getToken(GrammarParser.NUM, 0); }
		public NumContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends LiteralContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public IdContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_literal);
		try {
			setState(351);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				match(ID);
				}
				break;
			case NUM:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(NUM);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(STRING);
				}
				break;
			case BOOL:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(350);
				match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u0164\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5`\n\5\f\5\16\5c\13\5"+
		"\3\6\3\6\3\6\3\6\5\6i\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7r\n\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u0082\n\t\f\t\16"+
		"\t\u0085\13\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00a0\n\r\f\r\16"+
		"\r\u00a3\13\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u00ac\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u00b4\n\20\f\20\16\20\u00b7\13\20\3\20"+
		"\3\20\5\20\u00bb\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d1\n\22\3\23"+
		"\3\23\5\23\u00d5\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u00df"+
		"\n\25\3\26\3\26\3\26\3\26\5\26\u00e5\n\26\3\26\3\26\3\27\3\27\3\27\5\27"+
		"\u00ec\n\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u00f4\n\30\3\30\3\30\3"+
		"\30\3\30\3\30\5\30\u00fb\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u0102\n\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u0109\n\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0110\n\30\3\30\5\30\u0113\n\30\3\31\3\31\3\31\3\31\5\31\u0119\n\31\3"+
		"\31\3\31\3\32\3\32\3\32\7\32\u0120\n\32\f\32\16\32\u0123\13\32\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\5\34\u012c\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u0133\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u013a\n\36\3\37\3\37\3"+
		"\37\3\37\3\37\5\37\u0141\n\37\3 \3 \3 \3 \3 \5 \u0148\n \3!\3!\3!\3!\3"+
		"!\5!\u014f\n!\3\"\5\"\u0152\n\"\3\"\3\"\3#\3#\3#\3#\3#\3#\5#\u015c\n#"+
		"\3$\3$\3$\3$\5$\u0162\n$\3$\2\2%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDF\2\2\u0172\2H\3\2\2\2\4K\3\2\2\2\6N\3\2\2"+
		"\2\ba\3\2\2\2\nd\3\2\2\2\fm\3\2\2\2\16x\3\2\2\2\20~\3\2\2\2\22\u0086\3"+
		"\2\2\2\24\u0089\3\2\2\2\26\u008d\3\2\2\2\30\u00a1\3\2\2\2\32\u00a4\3\2"+
		"\2\2\34\u00a8\3\2\2\2\36\u00ad\3\2\2\2 \u00bc\3\2\2\2\"\u00c3\3\2\2\2"+
		"$\u00d2\3\2\2\2&\u00d6\3\2\2\2(\u00de\3\2\2\2*\u00e0\3\2\2\2,\u00e8\3"+
		"\2\2\2.\u0112\3\2\2\2\60\u0114\3\2\2\2\62\u011c\3\2\2\2\64\u0124\3\2\2"+
		"\2\66\u012b\3\2\2\28\u0132\3\2\2\2:\u0139\3\2\2\2<\u0140\3\2\2\2>\u0147"+
		"\3\2\2\2@\u014e\3\2\2\2B\u0151\3\2\2\2D\u015b\3\2\2\2F\u0161\3\2\2\2H"+
		"I\5\b\5\2IJ\7\2\2\3J\3\3\2\2\2KL\7\3\2\2LM\5\26\f\2M\5\3\2\2\2NO\7\4\2"+
		"\2OP\5\26\f\2P\7\3\2\2\2Q`\5\n\6\2R`\5\f\7\2ST\5\34\17\2TU\7\5\2\2U`\3"+
		"\2\2\2V`\5\4\3\2W`\5\6\4\2XY\7\6\2\2YZ\7\37\2\2Z`\7\5\2\2[`\5\24\13\2"+
		"\\]\5&\24\2]^\7\5\2\2^`\3\2\2\2_Q\3\2\2\2_R\3\2\2\2_S\3\2\2\2_V\3\2\2"+
		"\2_W\3\2\2\2_X\3\2\2\2_[\3\2\2\2_\\\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2"+
		"\2\2b\t\3\2\2\2ca\3\2\2\2de\7\7\2\2ef\7\37\2\2fh\7\b\2\2gi\5\20\t\2hg"+
		"\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\t\2\2kl\5\26\f\2l\13\3\2\2\2mn\7\n\2"+
		"\2no\7\37\2\2oq\7\b\2\2pr\5\20\t\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\t"+
		"\2\2tu\7\13\2\2uv\7)\2\2vw\5\16\b\2w\r\3\2\2\2xy\7\f\2\2yz\5\30\r\2z{"+
		"\5$\23\2{|\7\5\2\2|}\7\r\2\2}\17\3\2\2\2~\u0083\5\22\n\2\177\u0080\7\16"+
		"\2\2\u0080\u0082\5\22\n\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\21\3\2\2\2\u0085\u0083\3\2\2"+
		"\2\u0086\u0087\7)\2\2\u0087\u0088\7\37\2\2\u0088\23\3\2\2\2\u0089\u008a"+
		"\7\17\2\2\u008a\u008b\7\37\2\2\u008b\u008c\5\26\f\2\u008c\25\3\2\2\2\u008d"+
		"\u008e\7\f\2\2\u008e\u008f\5\30\r\2\u008f\u0090\7\r\2\2\u0090\27\3\2\2"+
		"\2\u0091\u0092\5\32\16\2\u0092\u0093\7\5\2\2\u0093\u00a0\3\2\2\2\u0094"+
		"\u0095\5\34\17\2\u0095\u0096\7\5\2\2\u0096\u00a0\3\2\2\2\u0097\u00a0\5"+
		"\36\20\2\u0098\u00a0\5\"\22\2\u0099\u009a\5(\25\2\u009a\u009b\7\5\2\2"+
		"\u009b\u00a0\3\2\2\2\u009c\u009d\5&\24\2\u009d\u009e\7\5\2\2\u009e\u00a0"+
		"\3\2\2\2\u009f\u0091\3\2\2\2\u009f\u0094\3\2\2\2\u009f\u0097\3\2\2\2\u009f"+
		"\u0098\3\2\2\2\u009f\u0099\3\2\2\2\u009f\u009c\3\2\2\2\u00a0\u00a3\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\31\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a4\u00a5\7\37\2\2\u00a5\u00a6\7\20\2\2\u00a6\u00a7\5\64\33"+
		"\2\u00a7\33\3\2\2\2\u00a8\u00ab\7)\2\2\u00a9\u00ac\7\37\2\2\u00aa\u00ac"+
		"\5\32\16\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\35\3\2\2\2\u00ad"+
		"\u00ae\7\21\2\2\u00ae\u00af\7\b\2\2\u00af\u00b0\5\64\33\2\u00b0\u00b1"+
		"\7\t\2\2\u00b1\u00b5\5\26\f\2\u00b2\u00b4\5 \21\2\u00b3\u00b2\3\2\2\2"+
		"\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00ba"+
		"\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\22\2\2\u00b9\u00bb\5\26\f\2"+
		"\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\37\3\2\2\2\u00bc\u00bd"+
		"\7\22\2\2\u00bd\u00be\7\21\2\2\u00be\u00bf\7\b\2\2\u00bf\u00c0\5\64\33"+
		"\2\u00c0\u00c1\7\t\2\2\u00c1\u00c2\5\26\f\2\u00c2!\3\2\2\2\u00c3\u00d0"+
		"\7\23\2\2\u00c4\u00c5\7\24\2\2\u00c5\u00c6\7\b\2\2\u00c6\u00c7\5\64\33"+
		"\2\u00c7\u00c8\7\t\2\2\u00c8\u00c9\5\26\f\2\u00c9\u00d1\3\2\2\2\u00ca"+
		"\u00cb\5\26\f\2\u00cb\u00cc\7\24\2\2\u00cc\u00cd\7\b\2\2\u00cd\u00ce\5"+
		"\64\33\2\u00ce\u00cf\7\t\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00c4\3\2\2\2\u00d0"+
		"\u00ca\3\2\2\2\u00d1#\3\2\2\2\u00d2\u00d4\7\25\2\2\u00d3\u00d5\5\64\33"+
		"\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5%\3\2\2\2\u00d6\u00d7"+
		"\7\26\2\2\u00d7\u00d8\5\64\33\2\u00d8\u00d9\7\t\2\2\u00d9\'\3\2\2\2\u00da"+
		"\u00df\5*\26\2\u00db\u00df\5,\27\2\u00dc\u00df\5.\30\2\u00dd\u00df\5\60"+
		"\31\2\u00de\u00da\3\2\2\2\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00dd\3\2\2\2\u00df)\3\2\2\2\u00e0\u00e1\7\27\2\2\u00e1\u00e2\7\37\2"+
		"\2\u00e2\u00e4\7\b\2\2\u00e3\u00e5\5\62\32\2\u00e4\u00e3\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\t\2\2\u00e7+\3\2\2\2"+
		"\u00e8\u00e9\7\37\2\2\u00e9\u00eb\7\b\2\2\u00ea\u00ec\5\62\32\2\u00eb"+
		"\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\7\t"+
		"\2\2\u00ee-\3\2\2\2\u00ef\u00f0\7\30\2\2\u00f0\u00f1\7\37\2\2\u00f1\u00f3"+
		"\7\b\2\2\u00f2\u00f4\5\62\32\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2"+
		"\u00f4\u00f5\3\2\2\2\u00f5\u0113\7\t\2\2\u00f6\u00f7\7\31\2\2\u00f7\u00f8"+
		"\7\37\2\2\u00f8\u00fa\7\b\2\2\u00f9\u00fb\5\62\32\2\u00fa\u00f9\3\2\2"+
		"\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0113\7\t\2\2\u00fd\u00fe"+
		"\7\32\2\2\u00fe\u00ff\7\37\2\2\u00ff\u0101\7\b\2\2\u0100\u0102\5\62\32"+
		"\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0113"+
		"\7\t\2\2\u0104\u0105\7\33\2\2\u0105\u0106\7\37\2\2\u0106\u0108\7\b\2\2"+
		"\u0107\u0109\5\62\32\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u0113\7\t\2\2\u010b\u010c\7\34\2\2\u010c\u010d\7\37\2\2"+
		"\u010d\u010f\7\b\2\2\u010e\u0110\5\62\32\2\u010f\u010e\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\7\t\2\2\u0112\u00ef\3\2\2\2\u0112"+
		"\u00f6\3\2\2\2\u0112\u00fd\3\2\2\2\u0112\u0104\3\2\2\2\u0112\u010b\3\2"+
		"\2\2\u0113/\3\2\2\2\u0114\u0115\7\35\2\2\u0115\u0116\7\37\2\2\u0116\u0118"+
		"\7\b\2\2\u0117\u0119\5\62\32\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2"+
		"\u0119\u011a\3\2\2\2\u011a\u011b\7\t\2\2\u011b\61\3\2\2\2\u011c\u0121"+
		"\5\64\33\2\u011d\u011e\7\16\2\2\u011e\u0120\5\64\33\2\u011f\u011d\3\2"+
		"\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\63\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\5\66\34\2\u0125\65\3\2\2\2"+
		"\u0126\u0127\58\35\2\u0127\u0128\7 \2\2\u0128\u0129\5\66\34\2\u0129\u012c"+
		"\3\2\2\2\u012a\u012c\58\35\2\u012b\u0126\3\2\2\2\u012b\u012a\3\2\2\2\u012c"+
		"\67\3\2\2\2\u012d\u012e\5:\36\2\u012e\u012f\7!\2\2\u012f\u0130\58\35\2"+
		"\u0130\u0133\3\2\2\2\u0131\u0133\5:\36\2\u0132\u012d\3\2\2\2\u0132\u0131"+
		"\3\2\2\2\u01339\3\2\2\2\u0134\u0135\5<\37\2\u0135\u0136\7\"\2\2\u0136"+
		"\u0137\5:\36\2\u0137\u013a\3\2\2\2\u0138\u013a\5<\37\2\u0139\u0134\3\2"+
		"\2\2\u0139\u0138\3\2\2\2\u013a;\3\2\2\2\u013b\u013c\5> \2\u013c\u013d"+
		"\7#\2\2\u013d\u013e\5<\37\2\u013e\u0141\3\2\2\2\u013f\u0141\5> \2\u0140"+
		"\u013b\3\2\2\2\u0140\u013f\3\2\2\2\u0141=\3\2\2\2\u0142\u0143\5@!\2\u0143"+
		"\u0144\7$\2\2\u0144\u0145\5> \2\u0145\u0148\3\2\2\2\u0146\u0148\5@!\2"+
		"\u0147\u0142\3\2\2\2\u0147\u0146\3\2\2\2\u0148?\3\2\2\2\u0149\u014a\5"+
		"B\"\2\u014a\u014b\7%\2\2\u014b\u014c\5@!\2\u014c\u014f\3\2\2\2\u014d\u014f"+
		"\5B\"\2\u014e\u0149\3\2\2\2\u014e\u014d\3\2\2\2\u014fA\3\2\2\2\u0150\u0152"+
		"\7\36\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2"+
		"\u0153\u0154\5D#\2\u0154C\3\2\2\2\u0155\u0156\7\b\2\2\u0156\u0157\5\64"+
		"\33\2\u0157\u0158\7\t\2\2\u0158\u015c\3\2\2\2\u0159\u015c\5(\25\2\u015a"+
		"\u015c\5F$\2\u015b\u0155\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2\2"+
		"\2\u015cE\3\2\2\2\u015d\u0162\7\37\2\2\u015e\u0162\7&\2\2\u015f\u0162"+
		"\7(\2\2\u0160\u0162\7\'\2\2\u0161\u015d\3\2\2\2\u0161\u015e\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162G\3\2\2\2\"_ahq\u0083\u009f\u00a1"+
		"\u00ab\u00b5\u00ba\u00d0\u00d4\u00de\u00e4\u00eb\u00f3\u00fa\u0101\u0108"+
		"\u010f\u0112\u0118\u0121\u012b\u0132\u0139\u0140\u0147\u014e\u0151\u015b"+
		"\u0161";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}