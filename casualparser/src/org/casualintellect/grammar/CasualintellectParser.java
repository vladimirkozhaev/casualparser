// Generated from Casualintellect.g4 by ANTLR 4.1
package org.casualintellect.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CasualintellectParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, ID=21, WS=22;
	public static final String[] tokenNames = {
		"<INVALID>", "'after'", "'state'", "'XOR'", "'process'", "'transitions'", 
		"'before'", "':'", "';'", "'{'", "'AND'", "'NOT'", "'}'", "'='", "'state_name'", 
		"'OR'", "'bool_expr'", "'in_process'", "'transition'", "'('", "')'", "ID", 
		"WS"
	};
	public static final int
		RULE_bool_bin_operation = 0, RULE_states = 1, RULE_state = 2, RULE_list_of_id = 3, 
		RULE_states_before = 4, RULE_states_after = 5, RULE_states_in_process = 6, 
		RULE_transitions = 7, RULE_transition = 8, RULE_left_brace = 9, RULE_right_brace = 10, 
		RULE_bool_expr = 11, RULE_bool_un_operation = 12;
	public static final String[] ruleNames = {
		"bool_bin_operation", "states", "state", "list_of_id", "states_before", 
		"states_after", "states_in_process", "transitions", "transition", "left_brace", 
		"right_brace", "bool_expr", "bool_un_operation"
	};

	@Override
	public String getGrammarFileName() { return "Casualintellect.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CasualintellectParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Bool_bin_operationContext extends ParserRuleContext {
		public Bool_bin_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_bin_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).enterBool_bin_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).exitBool_bin_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CasualintellectVisitor ) return ((CasualintellectVisitor<? extends T>)visitor).visitBool_bin_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_bin_operationContext bool_bin_operation() throws RecognitionException {
		Bool_bin_operationContext _localctx = new Bool_bin_operationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_bool_bin_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 10) | (1L << 15))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class StatesContext extends ParserRuleContext {
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_states; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).enterStates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).exitStates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CasualintellectVisitor ) return ((CasualintellectVisitor<? extends T>)visitor).visitStates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatesContext states() throws RecognitionException {
		StatesContext _localctx = new StatesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_states);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28); state();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==2 );
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

	public static class StateContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CasualintellectParser.ID, 0); }
		public TransitionsContext transitions() {
			return getRuleContext(TransitionsContext.class,0);
		}
		public States_in_processContext states_in_process() {
			return getRuleContext(States_in_processContext.class,0);
		}
		public States_beforeContext states_before() {
			return getRuleContext(States_beforeContext.class,0);
		}
		public States_afterContext states_after() {
			return getRuleContext(States_afterContext.class,0);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CasualintellectVisitor ) return ((CasualintellectVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); match(2);
			setState(34); match(13);
			setState(35); match(ID);
			setState(36); match(9);
			setState(37); states_before();
			setState(38); states_after();
			setState(39); states_in_process();
			setState(40); transitions();
			setState(41); match(12);
			setState(42); match(8);
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

	public static class List_of_idContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CasualintellectParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CasualintellectParser.ID, i);
		}
		public List_of_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_of_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).enterList_of_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).exitList_of_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CasualintellectVisitor ) return ((CasualintellectVisitor<? extends T>)visitor).visitList_of_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_of_idContext list_of_id() throws RecognitionException {
		List_of_idContext _localctx = new List_of_idContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_list_of_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44); match(ID);
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class States_beforeContext extends ParserRuleContext {
		public List_of_idContext list_of_id() {
			return getRuleContext(List_of_idContext.class,0);
		}
		public States_beforeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_states_before; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).enterStates_before(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).exitStates_before(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CasualintellectVisitor ) return ((CasualintellectVisitor<? extends T>)visitor).visitStates_before(this);
			else return visitor.visitChildren(this);
		}
	}

	public final States_beforeContext states_before() throws RecognitionException {
		States_beforeContext _localctx = new States_beforeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_states_before);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); match(6);
			setState(50); match(9);
			setState(51); list_of_id();
			setState(52); match(12);
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

	public static class States_afterContext extends ParserRuleContext {
		public List_of_idContext list_of_id() {
			return getRuleContext(List_of_idContext.class,0);
		}
		public States_afterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_states_after; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).enterStates_after(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).exitStates_after(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CasualintellectVisitor ) return ((CasualintellectVisitor<? extends T>)visitor).visitStates_after(this);
			else return visitor.visitChildren(this);
		}
	}

	public final States_afterContext states_after() throws RecognitionException {
		States_afterContext _localctx = new States_afterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_states_after);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); match(1);
			setState(55); match(9);
			setState(56); list_of_id();
			setState(57); match(12);
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

	public static class States_in_processContext extends ParserRuleContext {
		public List_of_idContext list_of_id() {
			return getRuleContext(List_of_idContext.class,0);
		}
		public States_in_processContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_states_in_process; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).enterStates_in_process(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).exitStates_in_process(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CasualintellectVisitor ) return ((CasualintellectVisitor<? extends T>)visitor).visitStates_in_process(this);
			else return visitor.visitChildren(this);
		}
	}

	public final States_in_processContext states_in_process() throws RecognitionException {
		States_in_processContext _localctx = new States_in_processContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_states_in_process);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); match(17);
			setState(60); match(9);
			setState(61); list_of_id();
			setState(62); match(12);
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

	public static class TransitionsContext extends ParserRuleContext {
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public TransitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).enterTransitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).exitTransitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CasualintellectVisitor ) return ((CasualintellectVisitor<? extends T>)visitor).visitTransitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionsContext transitions() throws RecognitionException {
		TransitionsContext _localctx = new TransitionsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_transitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); match(5);
			setState(65); match(9);
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66); transition();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==18 );
			setState(71); match(12);
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

	public static class TransitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CasualintellectParser.ID, 0); }
		public List_of_idContext list_of_id() {
			return getRuleContext(List_of_idContext.class,0);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).exitTransition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CasualintellectVisitor ) return ((CasualintellectVisitor<? extends T>)visitor).visitTransition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_transition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(18);
			setState(74); match(9);
			setState(75); match(14);
			setState(76); match(7);
			setState(77); match(ID);
			setState(78); match(8);
			setState(79); match(16);
			setState(80); match(7);
			setState(81); bool_expr();
			setState(82); match(8);
			setState(83); match(4);
			setState(84); match(7);
			setState(85); match(9);
			setState(86); list_of_id();
			setState(87); match(12);
			setState(88); match(12);
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

	public static class Left_braceContext extends ParserRuleContext {
		public Left_braceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_brace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).enterLeft_brace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).exitLeft_brace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CasualintellectVisitor ) return ((CasualintellectVisitor<? extends T>)visitor).visitLeft_brace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_braceContext left_brace() throws RecognitionException {
		Left_braceContext _localctx = new Left_braceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_left_brace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(19);
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

	public static class Right_braceContext extends ParserRuleContext {
		public Right_braceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_brace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).enterRight_brace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).exitRight_brace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CasualintellectVisitor ) return ((CasualintellectVisitor<? extends T>)visitor).visitRight_brace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_braceContext right_brace() throws RecognitionException {
		Right_braceContext _localctx = new Right_braceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_right_brace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(20);
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

	public static class Bool_exprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CasualintellectParser.ID, 0); }
		public List<Bool_bin_operationContext> bool_bin_operation() {
			return getRuleContexts(Bool_bin_operationContext.class);
		}
		public Bool_bin_operationContext bool_bin_operation(int i) {
			return getRuleContext(Bool_bin_operationContext.class,i);
		}
		public Bool_un_operationContext bool_un_operation() {
			return getRuleContext(Bool_un_operationContext.class,0);
		}
		public Left_braceContext left_brace() {
			return getRuleContext(Left_braceContext.class,0);
		}
		public Right_braceContext right_brace() {
			return getRuleContext(Right_braceContext.class,0);
		}
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CasualintellectVisitor ) return ((CasualintellectVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bool_expr);
		try {
			int _alt;
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94); match(ID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95); left_brace();
				setState(96); bool_expr();
				setState(97); right_brace();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99); match(ID);
				setState(103); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(100); bool_bin_operation();
						setState(101); bool_expr();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(105); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107); bool_un_operation();
				setState(108); bool_expr();
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

	public static class Bool_un_operationContext extends ParserRuleContext {
		public Bool_un_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_un_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).enterBool_un_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CasualintellectListener ) ((CasualintellectListener)listener).exitBool_un_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CasualintellectVisitor ) return ((CasualintellectVisitor<? extends T>)visitor).visitBool_un_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_un_operationContext bool_un_operation() throws RecognitionException {
		Bool_un_operationContext _localctx = new Bool_un_operationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bool_un_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(11);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\30u\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\6\3 \n\3\r\3\16\3!\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\6\5\60\n\5\r\5\16\5\61\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\6\tF\n\t"+
		"\r\t\16\tG\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\6\rj\n\r\r\r\16\rk\3\r\3\r\3\r\5\rq\n\r\3\16\3\16\3\16\2\17\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\2\3\5\2\5\5\f\f\21\21n\2\34\3\2\2\2\4\37\3\2\2"+
		"\2\6#\3\2\2\2\b/\3\2\2\2\n\63\3\2\2\2\f8\3\2\2\2\16=\3\2\2\2\20B\3\2\2"+
		"\2\22K\3\2\2\2\24\\\3\2\2\2\26^\3\2\2\2\30p\3\2\2\2\32r\3\2\2\2\34\35"+
		"\t\2\2\2\35\3\3\2\2\2\36 \5\6\4\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2"+
		"!\"\3\2\2\2\"\5\3\2\2\2#$\7\4\2\2$%\7\17\2\2%&\7\27\2\2&\'\7\13\2\2\'"+
		"(\5\n\6\2()\5\f\7\2)*\5\16\b\2*+\5\20\t\2+,\7\16\2\2,-\7\n\2\2-\7\3\2"+
		"\2\2.\60\7\27\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62"+
		"\t\3\2\2\2\63\64\7\b\2\2\64\65\7\13\2\2\65\66\5\b\5\2\66\67\7\16\2\2\67"+
		"\13\3\2\2\289\7\3\2\29:\7\13\2\2:;\5\b\5\2;<\7\16\2\2<\r\3\2\2\2=>\7\23"+
		"\2\2>?\7\13\2\2?@\5\b\5\2@A\7\16\2\2A\17\3\2\2\2BC\7\7\2\2CE\7\13\2\2"+
		"DF\5\22\n\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\16\2"+
		"\2J\21\3\2\2\2KL\7\24\2\2LM\7\13\2\2MN\7\20\2\2NO\7\t\2\2OP\7\27\2\2P"+
		"Q\7\n\2\2QR\7\22\2\2RS\7\t\2\2ST\5\30\r\2TU\7\n\2\2UV\7\6\2\2VW\7\t\2"+
		"\2WX\7\13\2\2XY\5\b\5\2YZ\7\16\2\2Z[\7\16\2\2[\23\3\2\2\2\\]\7\25\2\2"+
		"]\25\3\2\2\2^_\7\26\2\2_\27\3\2\2\2`q\7\27\2\2ab\5\24\13\2bc\5\30\r\2"+
		"cd\5\26\f\2dq\3\2\2\2ei\7\27\2\2fg\5\2\2\2gh\5\30\r\2hj\3\2\2\2if\3\2"+
		"\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lq\3\2\2\2mn\5\32\16\2no\5\30\r\2oq"+
		"\3\2\2\2p`\3\2\2\2pa\3\2\2\2pe\3\2\2\2pm\3\2\2\2q\31\3\2\2\2rs\7\r\2\2"+
		"s\33\3\2\2\2\7!\61Gkp";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}