// Generated from Casualintellect.g4 by ANTLR 4.1
package org.casualintellect.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CasualintellectLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, ID=21, WS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'after'", "'state'", "'XOR'", "'process'", "'transitions'", "'before'", 
		"':'", "';'", "'{'", "'AND'", "'NOT'", "'}'", "'='", "'state_name'", "'OR'", 
		"'bool_expr'", "'in_process'", "'transition'", "'('", "')'", "ID", "WS"
	};
	public static final String[] ruleNames = {
		"T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", 
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "ID", "WS"
	};


	public CasualintellectLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Casualintellect.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 21: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\30\u00ac\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\7\26\u00a1\n\26\f\26\16\26\u00a4\13\26\3\27\6\27\u00a7\n\27\r\27"+
		"\16\27\u00a8\3\27\3\27\2\30\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t"+
		"\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1"+
		"#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\2\3\2\5\4\2C\\c|\5\2\62;C\\c|\5\2"+
		"\13\f\17\17\"\"\u00ad\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\3/\3\2\2\2\5\65\3\2\2\2\7;\3\2\2\2\t?\3\2\2\2\13G\3\2\2"+
		"\2\rS\3\2\2\2\17Z\3\2\2\2\21\\\3\2\2\2\23^\3\2\2\2\25`\3\2\2\2\27d\3\2"+
		"\2\2\31h\3\2\2\2\33j\3\2\2\2\35l\3\2\2\2\37w\3\2\2\2!z\3\2\2\2#\u0084"+
		"\3\2\2\2%\u008f\3\2\2\2\'\u009a\3\2\2\2)\u009c\3\2\2\2+\u009e\3\2\2\2"+
		"-\u00a6\3\2\2\2/\60\7c\2\2\60\61\7h\2\2\61\62\7v\2\2\62\63\7g\2\2\63\64"+
		"\7t\2\2\64\4\3\2\2\2\65\66\7u\2\2\66\67\7v\2\2\678\7c\2\289\7v\2\29:\7"+
		"g\2\2:\6\3\2\2\2;<\7Z\2\2<=\7Q\2\2=>\7T\2\2>\b\3\2\2\2?@\7r\2\2@A\7t\2"+
		"\2AB\7q\2\2BC\7e\2\2CD\7g\2\2DE\7u\2\2EF\7u\2\2F\n\3\2\2\2GH\7v\2\2HI"+
		"\7t\2\2IJ\7c\2\2JK\7p\2\2KL\7u\2\2LM\7k\2\2MN\7v\2\2NO\7k\2\2OP\7q\2\2"+
		"PQ\7p\2\2QR\7u\2\2R\f\3\2\2\2ST\7d\2\2TU\7g\2\2UV\7h\2\2VW\7q\2\2WX\7"+
		"t\2\2XY\7g\2\2Y\16\3\2\2\2Z[\7<\2\2[\20\3\2\2\2\\]\7=\2\2]\22\3\2\2\2"+
		"^_\7}\2\2_\24\3\2\2\2`a\7C\2\2ab\7P\2\2bc\7F\2\2c\26\3\2\2\2de\7P\2\2"+
		"ef\7Q\2\2fg\7V\2\2g\30\3\2\2\2hi\7\177\2\2i\32\3\2\2\2jk\7?\2\2k\34\3"+
		"\2\2\2lm\7u\2\2mn\7v\2\2no\7c\2\2op\7v\2\2pq\7g\2\2qr\7a\2\2rs\7p\2\2"+
		"st\7c\2\2tu\7o\2\2uv\7g\2\2v\36\3\2\2\2wx\7Q\2\2xy\7T\2\2y \3\2\2\2z{"+
		"\7d\2\2{|\7q\2\2|}\7q\2\2}~\7n\2\2~\177\7a\2\2\177\u0080\7g\2\2\u0080"+
		"\u0081\7z\2\2\u0081\u0082\7r\2\2\u0082\u0083\7t\2\2\u0083\"\3\2\2\2\u0084"+
		"\u0085\7k\2\2\u0085\u0086\7p\2\2\u0086\u0087\7a\2\2\u0087\u0088\7r\2\2"+
		"\u0088\u0089\7t\2\2\u0089\u008a\7q\2\2\u008a\u008b\7e\2\2\u008b\u008c"+
		"\7g\2\2\u008c\u008d\7u\2\2\u008d\u008e\7u\2\2\u008e$\3\2\2\2\u008f\u0090"+
		"\7v\2\2\u0090\u0091\7t\2\2\u0091\u0092\7c\2\2\u0092\u0093\7p\2\2\u0093"+
		"\u0094\7u\2\2\u0094\u0095\7k\2\2\u0095\u0096\7v\2\2\u0096\u0097\7k\2\2"+
		"\u0097\u0098\7q\2\2\u0098\u0099\7p\2\2\u0099&\3\2\2\2\u009a\u009b\7*\2"+
		"\2\u009b(\3\2\2\2\u009c\u009d\7+\2\2\u009d*\3\2\2\2\u009e\u00a2\t\2\2"+
		"\2\u009f\u00a1\t\3\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3,\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a7\t\4\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\b\27\2\2\u00ab"+
		".\3\2\2\2\5\2\u00a2\u00a8";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}