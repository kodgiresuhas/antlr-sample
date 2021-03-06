// Generated from Metal.g4 by ANTLR 4.5.3
package com.myproj.antlr.metal.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MetalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MONTH=1, PRICE=2, STRDL=3, VS=4, CALLPUT=5, X=6, FUTOPT=7, DEC_COL_DEC=8, 
		RATIO=9, SLASH=10, INT=11, OFFER=12, D=13, DAYS=14, WHITESPACE=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"MONTH", "DOT", "DOLLAR", "PRICE", "DIGIT", "NUM", "STRDL", "VS", "CALLPUT", 
		"X", "FUTOPT", "DECIMAL", "COL", "DEC_COL_DEC", "RATIO", "SLASH", "INT", 
		"OFFER", "D", "DAYS", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'strdl'", "'vs'", null, "'x'", null, null, "'ratio'", 
		"'/'", "'int'", "'offer'", "'d'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MONTH", "PRICE", "STRDL", "VS", "CALLPUT", "X", "FUTOPT", "DEC_COL_DEC", 
		"RATIO", "SLASH", "INT", "OFFER", "D", "DAYS", "WHITESPACE"
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


	public MetalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Metal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\u00b0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2R\n\2\3\3\3\3\3"+
		"\4\3\4\3\5\5\5Y\n\5\3\5\3\5\3\6\3\6\3\7\6\7`\n\7\r\7\16\7a\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nt\n\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f~\n\f\3\r\6\r\u0081\n\r\r\r\16\r\u0082\3\r"+
		"\3\r\6\r\u0087\n\r\r\r\16\r\u0088\5\r\u008b\n\r\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\6\26\u00ab"+
		"\n\26\r\26\16\26\u00ac\3\26\3\26\2\2\27\3\3\5\2\7\2\t\4\13\2\r\2\17\5"+
		"\21\6\23\7\25\b\27\t\31\2\33\2\35\n\37\13!\f#\r%\16\'\17)\20+\21\3\2\4"+
		"\3\2\62;\5\2\13\f\16\17\"\"\u00bc\2\3\3\2\2\2\2\t\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\3Q\3\2\2\2\5S\3\2\2\2\7U\3\2\2\2\tX\3\2\2\2\13\\\3\2\2\2\r_\3\2"+
		"\2\2\17c\3\2\2\2\21i\3\2\2\2\23s\3\2\2\2\25u\3\2\2\2\27}\3\2\2\2\31\u0080"+
		"\3\2\2\2\33\u008c\3\2\2\2\35\u008e\3\2\2\2\37\u0092\3\2\2\2!\u0098\3\2"+
		"\2\2#\u009a\3\2\2\2%\u009e\3\2\2\2\'\u00a4\3\2\2\2)\u00a6\3\2\2\2+\u00aa"+
		"\3\2\2\2-.\7L\2\2./\7c\2\2/R\7p\2\2\60\61\7H\2\2\61\62\7g\2\2\62R\7d\2"+
		"\2\63\64\7O\2\2\64\65\7c\2\2\65R\7t\2\2\66\67\7C\2\2\678\7r\2\28R\7t\2"+
		"\29:\7O\2\2:;\7c\2\2;R\7{\2\2<=\7L\2\2=>\7w\2\2>R\7p\2\2?@\7L\2\2@A\7"+
		"w\2\2AR\7n\2\2BC\7C\2\2CD\7w\2\2DR\7i\2\2EF\7U\2\2FG\7g\2\2GR\7r\2\2H"+
		"I\7Q\2\2IJ\7e\2\2JR\7v\2\2KL\7P\2\2LM\7q\2\2MR\7x\2\2NO\7F\2\2OP\7g\2"+
		"\2PR\7e\2\2Q-\3\2\2\2Q\60\3\2\2\2Q\63\3\2\2\2Q\66\3\2\2\2Q9\3\2\2\2Q<"+
		"\3\2\2\2Q?\3\2\2\2QB\3\2\2\2QE\3\2\2\2QH\3\2\2\2QK\3\2\2\2QN\3\2\2\2R"+
		"\4\3\2\2\2ST\7\60\2\2T\6\3\2\2\2UV\7&\2\2V\b\3\2\2\2WY\5\7\4\2XW\3\2\2"+
		"\2XY\3\2\2\2YZ\3\2\2\2Z[\5\31\r\2[\n\3\2\2\2\\]\t\2\2\2]\f\3\2\2\2^`\5"+
		"\13\6\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\16\3\2\2\2cd\7u\2\2d"+
		"e\7v\2\2ef\7t\2\2fg\7f\2\2gh\7n\2\2h\20\3\2\2\2ij\7x\2\2jk\7u\2\2k\22"+
		"\3\2\2\2lm\7e\2\2mn\7c\2\2no\7n\2\2ot\7n\2\2pq\7r\2\2qr\7w\2\2rt\7v\2"+
		"\2sl\3\2\2\2sp\3\2\2\2t\24\3\2\2\2uv\7z\2\2v\26\3\2\2\2wx\7h\2\2xy\7w"+
		"\2\2y~\7v\2\2z{\7q\2\2{|\7r\2\2|~\7v\2\2}w\3\2\2\2}z\3\2\2\2~\30\3\2\2"+
		"\2\177\u0081\5\13\6\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u008a\3\2\2\2\u0084\u0086\5\5\3\2\u0085"+
		"\u0087\5\13\6\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0084\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\32\3\2\2\2\u008c\u008d\7<\2\2\u008d\34\3\2\2\2\u008e"+
		"\u008f\5\31\r\2\u008f\u0090\5\33\16\2\u0090\u0091\5\31\r\2\u0091\36\3"+
		"\2\2\2\u0092\u0093\7t\2\2\u0093\u0094\7c\2\2\u0094\u0095\7v\2\2\u0095"+
		"\u0096\7k\2\2\u0096\u0097\7q\2\2\u0097 \3\2\2\2\u0098\u0099\7\61\2\2\u0099"+
		"\"\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c\u009d\7v\2\2\u009d"+
		"$\3\2\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7h\2\2\u00a0\u00a1\7h\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2\u00a3\7t\2\2\u00a3&\3\2\2\2\u00a4\u00a5\7f\2\2\u00a5"+
		"(\3\2\2\2\u00a6\u00a7\5\r\7\2\u00a7\u00a8\5\'\24\2\u00a8*\3\2\2\2\u00a9"+
		"\u00ab\t\3\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\b\26\2\2\u00af"+
		",\3\2\2\2\f\2QXas}\u0082\u0088\u008a\u00ac\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}