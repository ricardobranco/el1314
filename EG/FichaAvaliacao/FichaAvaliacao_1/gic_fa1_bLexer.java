// Generated from /Users/ricardobranco/Documents/git/el1314/EG/FichaAvaliacao/FichaAvaliacao_1/gic_fa1_b.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gic_fa1_bLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, REGISTO=8, EXISTENCIAS=9, 
		LIVRO=10, CDROM=11, OUTRO=12, BGUM=13, BAUM=14, ESTANTE=15, PERMANENTE=16, 
		EMPRESTADO=17, ID=18, STRING=19, NUM=20, Sep=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "')'", "','", "'['", "'-'", "':'", "'('", "'REGISTO'", "'EXISTENCIAS'", 
		"'LIVRO'", "'CDROM'", "'OUTRO'", "'BGUM'", "'BAUM'", "'ESTANTE'", "'PERMANENTE'", 
		"'EMPRESTADO'", "ID", "STRING", "NUM", "Sep"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "REGISTO", "EXISTENCIAS", 
		"LIVRO", "CDROM", "OUTRO", "BGUM", "BAUM", "ESTANTE", "PERMANENTE", "EMPRESTADO", 
		"ID", "STRING", "NUM", "Sep"
	};


	public gic_fa1_bLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gic_fa1_b.g4"; }

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
		case 20: Sep_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void Sep_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\27\u00ab\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\7\23\u008c\n\23\f\23"+
		"\16\23\u008f\13\23\3\24\3\24\3\24\3\24\7\24\u0095\n\24\f\24\16\24\u0098"+
		"\13\24\3\24\3\24\3\25\6\25\u009d\n\25\r\25\16\25\u009e\3\26\5\26\u00a2"+
		"\n\26\3\26\3\26\6\26\u00a6\n\26\r\26\16\26\u00a7\3\26\3\26\3\u0096\27"+
		"\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27"+
		"\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27"+
		"\2\3\2\6\3\2c|\5\2\62;aac|\3\2\62;\4\2\13\13\"\"\u00b1\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t"+
		"\63\3\2\2\2\13\65\3\2\2\2\r\67\3\2\2\2\179\3\2\2\2\21;\3\2\2\2\23C\3\2"+
		"\2\2\25O\3\2\2\2\27U\3\2\2\2\31[\3\2\2\2\33a\3\2\2\2\35f\3\2\2\2\37k\3"+
		"\2\2\2!s\3\2\2\2#~\3\2\2\2%\u0089\3\2\2\2\'\u0090\3\2\2\2)\u009c\3\2\2"+
		"\2+\u00a5\3\2\2\2-.\7_\2\2.\4\3\2\2\2/\60\7+\2\2\60\6\3\2\2\2\61\62\7"+
		".\2\2\62\b\3\2\2\2\63\64\7]\2\2\64\n\3\2\2\2\65\66\7/\2\2\66\f\3\2\2\2"+
		"\678\7<\2\28\16\3\2\2\29:\7*\2\2:\20\3\2\2\2;<\7T\2\2<=\7G\2\2=>\7I\2"+
		"\2>?\7K\2\2?@\7U\2\2@A\7V\2\2AB\7Q\2\2B\22\3\2\2\2CD\7G\2\2DE\7Z\2\2E"+
		"F\7K\2\2FG\7U\2\2GH\7V\2\2HI\7G\2\2IJ\7P\2\2JK\7E\2\2KL\7K\2\2LM\7C\2"+
		"\2MN\7U\2\2N\24\3\2\2\2OP\7N\2\2PQ\7K\2\2QR\7X\2\2RS\7T\2\2ST\7Q\2\2T"+
		"\26\3\2\2\2UV\7E\2\2VW\7F\2\2WX\7T\2\2XY\7Q\2\2YZ\7O\2\2Z\30\3\2\2\2["+
		"\\\7Q\2\2\\]\7W\2\2]^\7V\2\2^_\7T\2\2_`\7Q\2\2`\32\3\2\2\2ab\7D\2\2bc"+
		"\7I\2\2cd\7W\2\2de\7O\2\2e\34\3\2\2\2fg\7D\2\2gh\7C\2\2hi\7W\2\2ij\7O"+
		"\2\2j\36\3\2\2\2kl\7G\2\2lm\7U\2\2mn\7V\2\2no\7C\2\2op\7P\2\2pq\7V\2\2"+
		"qr\7G\2\2r \3\2\2\2st\7R\2\2tu\7G\2\2uv\7T\2\2vw\7O\2\2wx\7C\2\2xy\7P"+
		"\2\2yz\7G\2\2z{\7P\2\2{|\7V\2\2|}\7G\2\2}\"\3\2\2\2~\177\7G\2\2\177\u0080"+
		"\7O\2\2\u0080\u0081\7R\2\2\u0081\u0082\7T\2\2\u0082\u0083\7G\2\2\u0083"+
		"\u0084\7U\2\2\u0084\u0085\7V\2\2\u0085\u0086\7C\2\2\u0086\u0087\7F\2\2"+
		"\u0087\u0088\7Q\2\2\u0088$\3\2\2\2\u0089\u008d\t\2\2\2\u008a\u008c\t\3"+
		"\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e&\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0096\7$\2\2\u0091"+
		"\u0092\7^\2\2\u0092\u0095\7$\2\2\u0093\u0095\13\2\2\2\u0094\u0091\3\2"+
		"\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0097\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7$"+
		"\2\2\u009a(\3\2\2\2\u009b\u009d\t\4\2\2\u009c\u009b\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f*\3\2\2\2\u00a0"+
		"\u00a2\7\17\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3"+
		"\2\2\2\u00a3\u00a6\7\f\2\2\u00a4\u00a6\t\5\2\2\u00a5\u00a1\3\2\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\26\2\2\u00aa,\3\2\2\2\n\2\u008d"+
		"\u0094\u0096\u009e\u00a1\u00a5\u00a7";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}