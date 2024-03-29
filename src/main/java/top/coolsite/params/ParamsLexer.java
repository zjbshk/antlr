package top.coolsite.params;// Generated from H:/ideaWorkspace/StudyAntlr/src/main/resources\Params.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParamsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, QUESTION_MARK=3, Boolean=4, Number=5, ID=6, WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "QUESTION_MARK", "Boolean", "Number", "ID", "Digit", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&'", "'='", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "QUESTION_MARK", "Boolean", "Number", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public ParamsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Params.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t=\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5#\n\5\3\6\3\6\5\6\'\n"+
		"\6\3\6\3\6\5\6+\n\6\3\7\6\7.\n\7\r\7\16\7/\3\b\6\b\63\n\b\r\b\16\b\64"+
		"\3\t\6\t8\n\t\r\t\16\t9\3\t\3\t\2\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21"+
		"\t\3\2\5\7\2//\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2A\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\21\3\2\2"+
		"\2\3\23\3\2\2\2\5\25\3\2\2\2\7\27\3\2\2\2\t\"\3\2\2\2\13*\3\2\2\2\r-\3"+
		"\2\2\2\17\62\3\2\2\2\21\67\3\2\2\2\23\24\7(\2\2\24\4\3\2\2\2\25\26\7?"+
		"\2\2\26\6\3\2\2\2\27\30\7A\2\2\30\b\3\2\2\2\31\32\7v\2\2\32\33\7t\2\2"+
		"\33\34\7w\2\2\34#\7g\2\2\35\36\7h\2\2\36\37\7c\2\2\37 \7n\2\2 !\7u\2\2"+
		"!#\7g\2\2\"\31\3\2\2\2\"\35\3\2\2\2#\n\3\2\2\2$+\5\17\b\2%\'\5\17\b\2"+
		"&%\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\7\60\2\2)+\5\17\b\2*$\3\2\2\2*&\3\2"+
		"\2\2+\f\3\2\2\2,.\t\2\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60"+
		"\16\3\2\2\2\61\63\t\3\2\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64"+
		"\65\3\2\2\2\65\20\3\2\2\2\668\t\4\2\2\67\66\3\2\2\289\3\2\2\29\67\3\2"+
		"\2\29:\3\2\2\2:;\3\2\2\2;<\b\t\2\2<\22\3\2\2\2\t\2\"&*/\649\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}