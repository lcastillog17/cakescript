// Generated from com/compiladores/cakescript/interprete/CakeScript.g4 by ANTLR 4.5.1
package com.compiladores.cakescript.interprete;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CakeScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, MIX=15, BATIR=16, HORNEAR=17, 
		CONGELAR=18, DECORAR=19, LETRA=20, DIGITO=21, WS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "MIX", "BATIR", "HORNEAR", 
		"CONGELAR", "DECORAR", "LETRA", "DIGITO", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Ingredientes:'", "'='", "'.'", "'tsp'", "'tbsp'", "'taza'", "'oz'", 
		"'lb'", "'g'", "'kg'", "'Pasos:'", "'('", "')'", "','", "'Mix'", "'Batir'", 
		"'Hornear'", "'Congelar'", "'Decorar'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "MIX", "BATIR", "HORNEAR", "CONGELAR", "DECORAR", "LETRA", 
		"DIGITO", "WS"
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


	public CakeScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CakeScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u0095\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\6"+
		"\27\u0090\n\27\r\27\16\27\u0091\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\u0095\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5=\3\2\2"+
		"\2\7?\3\2\2\2\tA\3\2\2\2\13E\3\2\2\2\rJ\3\2\2\2\17O\3\2\2\2\21R\3\2\2"+
		"\2\23U\3\2\2\2\25W\3\2\2\2\27Z\3\2\2\2\31a\3\2\2\2\33c\3\2\2\2\35e\3\2"+
		"\2\2\37g\3\2\2\2!k\3\2\2\2#q\3\2\2\2%y\3\2\2\2\'\u0082\3\2\2\2)\u008a"+
		"\3\2\2\2+\u008c\3\2\2\2-\u008f\3\2\2\2/\60\7K\2\2\60\61\7p\2\2\61\62\7"+
		"i\2\2\62\63\7t\2\2\63\64\7g\2\2\64\65\7f\2\2\65\66\7k\2\2\66\67\7g\2\2"+
		"\678\7p\2\289\7v\2\29:\7g\2\2:;\7u\2\2;<\7<\2\2<\4\3\2\2\2=>\7?\2\2>\6"+
		"\3\2\2\2?@\7\60\2\2@\b\3\2\2\2AB\7v\2\2BC\7u\2\2CD\7r\2\2D\n\3\2\2\2E"+
		"F\7v\2\2FG\7d\2\2GH\7u\2\2HI\7r\2\2I\f\3\2\2\2JK\7v\2\2KL\7c\2\2LM\7|"+
		"\2\2MN\7c\2\2N\16\3\2\2\2OP\7q\2\2PQ\7|\2\2Q\20\3\2\2\2RS\7n\2\2ST\7d"+
		"\2\2T\22\3\2\2\2UV\7i\2\2V\24\3\2\2\2WX\7m\2\2XY\7i\2\2Y\26\3\2\2\2Z["+
		"\7R\2\2[\\\7c\2\2\\]\7u\2\2]^\7q\2\2^_\7u\2\2_`\7<\2\2`\30\3\2\2\2ab\7"+
		"*\2\2b\32\3\2\2\2cd\7+\2\2d\34\3\2\2\2ef\7.\2\2f\36\3\2\2\2gh\7O\2\2h"+
		"i\7k\2\2ij\7z\2\2j \3\2\2\2kl\7D\2\2lm\7c\2\2mn\7v\2\2no\7k\2\2op\7t\2"+
		"\2p\"\3\2\2\2qr\7J\2\2rs\7q\2\2st\7t\2\2tu\7p\2\2uv\7g\2\2vw\7c\2\2wx"+
		"\7t\2\2x$\3\2\2\2yz\7E\2\2z{\7q\2\2{|\7p\2\2|}\7i\2\2}~\7g\2\2~\177\7"+
		"n\2\2\177\u0080\7c\2\2\u0080\u0081\7t\2\2\u0081&\3\2\2\2\u0082\u0083\7"+
		"F\2\2\u0083\u0084\7g\2\2\u0084\u0085\7e\2\2\u0085\u0086\7q\2\2\u0086\u0087"+
		"\7t\2\2\u0087\u0088\7c\2\2\u0088\u0089\7t\2\2\u0089(\3\2\2\2\u008a\u008b"+
		"\t\2\2\2\u008b*\3\2\2\2\u008c\u008d\t\3\2\2\u008d,\3\2\2\2\u008e\u0090"+
		"\t\4\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\27\2\2\u0094.\3\2\2\2"+
		"\4\2\u0091\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}