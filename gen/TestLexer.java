// Generated from H:/ideaWorkspace/StudyAntlr/src/main/resources\Test.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, Boolen=4, Number=5, String=6, WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "Boolen", "Number", "Digit", "String", "ESC", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'\r'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "Boolen", "Number", "String", "WS"
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


	public TestLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Test.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\tJ\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5%\n\5\3\6\3\6"+
		"\5\6)\n\6\3\6\3\6\5\6-\n\6\3\7\6\7\60\n\7\r\7\16\7\61\3\b\3\b\3\b\3\b"+
		"\3\b\7\b9\n\b\f\b\16\b<\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\6\nE\n\n\r\n"+
		"\16\nF\3\n\3\n\3:\2\13\3\3\5\4\7\5\t\6\13\7\r\2\17\b\21\2\23\t\3\2\5\3"+
		"\2\62;\7\2^^ddppttvv\5\2\13\f\17\17\"\"\2N\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\17\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2"+
		"\2\5\27\3\2\2\2\7\31\3\2\2\2\t$\3\2\2\2\13,\3\2\2\2\r/\3\2\2\2\17\63\3"+
		"\2\2\2\21@\3\2\2\2\23D\3\2\2\2\25\26\7.\2\2\26\4\3\2\2\2\27\30\7\17\2"+
		"\2\30\6\3\2\2\2\31\32\7\f\2\2\32\b\3\2\2\2\33\34\7v\2\2\34\35\7t\2\2\35"+
		"\36\7w\2\2\36%\7g\2\2\37 \7h\2\2 !\7c\2\2!\"\7n\2\2\"#\7u\2\2#%\7g\2\2"+
		"$\33\3\2\2\2$\37\3\2\2\2%\n\3\2\2\2&-\5\r\7\2\')\5\r\7\2(\'\3\2\2\2()"+
		"\3\2\2\2)*\3\2\2\2*+\7\60\2\2+-\5\r\7\2,&\3\2\2\2,(\3\2\2\2-\f\3\2\2\2"+
		".\60\t\2\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\16\3"+
		"\2\2\2\63\64\7^\2\2\64\65\7$\2\2\65:\3\2\2\2\669\5\21\t\2\679\13\2\2\2"+
		"8\66\3\2\2\28\67\3\2\2\29<\3\2\2\2:;\3\2\2\2:8\3\2\2\2;=\3\2\2\2<:\3\2"+
		"\2\2=>\7^\2\2>?\7$\2\2?\20\3\2\2\2@A\7^\2\2AB\t\3\2\2B\22\3\2\2\2CE\t"+
		"\4\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\b\n\2\2I\24"+
		"\3\2\2\2\n\2$(,\618:F\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}