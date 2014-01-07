// Generated from /Users/ricardobranco/Documents/git/el1314/EG/FichaAvaliacao/FichaAvaliacao_1/gic_fa1_a.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gic_fa1_aParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, REGISTO=8, EXISTENCIAS=9, 
		LIVRO=10, CDROM=11, OUTRO=12, BGUM=13, BAUM=14, ESTANTE=15, PERMANENTE=16, 
		EMPRESTADO=17, ID=18, STRING=19, NUM=20, Sep=21;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "')'", "','", "'['", "'-'", "':'", "'('", "'REGISTO'", 
		"'EXISTENCIAS'", "'LIVRO'", "'CDROM'", "'OUTRO'", "'BGUM'", "'BAUM'", 
		"'ESTANTE'", "'PERMANENTE'", "'EMPRESTADO'", "ID", "STRING", "NUM", "Sep"
	};
	public static final int
		RULE_biblioteca = 0, RULE_registos = 1, RULE_registo = 2, RULE_descricao = 3, 
		RULE_referencia = 4, RULE_tipo = 5, RULE_titulo = 6, RULE_autor = 7, RULE_editora = 8, 
		RULE_ano = 9, RULE_catalogo = 10, RULE_existencias = 11, RULE_estado = 12, 
		RULE_codigobarras = 13, RULE_disponib = 14, RULE_datadev = 15, RULE_mes = 16, 
		RULE_dia = 17;
	public static final String[] ruleNames = {
		"biblioteca", "registos", "registo", "descricao", "referencia", "tipo", 
		"titulo", "autor", "editora", "ano", "catalogo", "existencias", "estado", 
		"codigobarras", "disponib", "datadev", "mes", "dia"
	};

	@Override
	public String getGrammarFileName() { return "gic_fa1_a.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public gic_fa1_aParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class BibliotecaContext extends ParserRuleContext {
		public RegistosContext registos() {
			return getRuleContext(RegistosContext.class,0);
		}
		public BibliotecaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_biblioteca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).enterBiblioteca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).exitBiblioteca(this);
		}
	}

	public final BibliotecaContext biblioteca() throws RecognitionException {
		BibliotecaContext _localctx = new BibliotecaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_biblioteca);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); registos(0);
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

	public static class RegistosContext extends ParserRuleContext {
		public int _p;
		public RegistoContext registo() {
			return getRuleContext(RegistoContext.class,0);
		}
		public RegistosContext registos() {
			return getRuleContext(RegistosContext.class,0);
		}
		public RegistosContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RegistosContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_registos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).enterRegistos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).exitRegistos(this);
		}
	}

	public final RegistosContext registos(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RegistosContext _localctx = new RegistosContext(_ctx, _parentState, _p);
		RegistosContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, RULE_registos);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(39); registo();
			}
			_ctx.stop = _input.LT(-1);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RegistosContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_registos);
					setState(41);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(42); match(3);
					setState(43); registo();
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RegistoContext extends ParserRuleContext {
		public DescricaoContext descricao() {
			return getRuleContext(DescricaoContext.class,0);
		}
		public TerminalNode REGISTO() { return getToken(gic_fa1_aParser.REGISTO, 0); }
		public TerminalNode EXISTENCIAS() { return getToken(gic_fa1_aParser.EXISTENCIAS, 0); }
		public ExistenciasContext existencias() {
			return getRuleContext(ExistenciasContext.class,0);
		}
		public RegistoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).enterRegisto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).exitRegisto(this);
		}
	}

	public final RegistoContext registo() throws RecognitionException {
		RegistoContext _localctx = new RegistoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_registo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); match(4);
			setState(50); match(REGISTO);
			setState(51); descricao();
			setState(52); match(EXISTENCIAS);
			setState(53); existencias(0);
			setState(54); match(1);
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

	public static class DescricaoContext extends ParserRuleContext {
		public AnoContext ano() {
			return getRuleContext(AnoContext.class,0);
		}
		public EditoraContext editora() {
			return getRuleContext(EditoraContext.class,0);
		}
		public AutorContext autor() {
			return getRuleContext(AutorContext.class,0);
		}
		public ReferenciaContext referencia() {
			return getRuleContext(ReferenciaContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TituloContext titulo() {
			return getRuleContext(TituloContext.class,0);
		}
		public CatalogoContext catalogo() {
			return getRuleContext(CatalogoContext.class,0);
		}
		public DescricaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descricao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).enterDescricao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).exitDescricao(this);
		}
	}

	public final DescricaoContext descricao() throws RecognitionException {
		DescricaoContext _localctx = new DescricaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_descricao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); referencia();
			setState(57); match(6);
			setState(58); catalogo();
			setState(59); match(5);
			setState(60); tipo();
			setState(61); match(5);
			setState(62); titulo();
			setState(63); match(7);
			setState(64); autor();
			setState(65); match(2);
			setState(66); editora();
			setState(67); match(5);
			setState(68); ano();
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

	public static class ReferenciaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gic_fa1_aParser.ID, 0); }
		public ReferenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).enterReferencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).exitReferencia(this);
		}
	}

	public final ReferenciaContext referencia() throws RecognitionException {
		ReferenciaContext _localctx = new ReferenciaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_referencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(ID);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode OUTRO() { return getToken(gic_fa1_aParser.OUTRO, 0); }
		public TerminalNode CDROM() { return getToken(gic_fa1_aParser.CDROM, 0); }
		public TerminalNode LIVRO() { return getToken(gic_fa1_aParser.LIVRO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIVRO) | (1L << CDROM) | (1L << OUTRO))) != 0)) ) {
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

	public static class TituloContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(gic_fa1_aParser.STRING, 0); }
		public TituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).enterTitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).exitTitulo(this);
		}
	}

	public final TituloContext titulo() throws RecognitionException {
		TituloContext _localctx = new TituloContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_titulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(STRING);
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

	public static class AutorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(gic_fa1_aParser.STRING, 0); }
		public AutorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).enterAutor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).exitAutor(this);
		}
	}

	public final AutorContext autor() throws RecognitionException {
		AutorContext _localctx = new AutorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_autor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(STRING);
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

	public static class EditoraContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(gic_fa1_aParser.STRING, 0); }
		public EditoraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_editora; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).enterEditora(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).exitEditora(this);
		}
	}

	public final EditoraContext editora() throws RecognitionException {
		EditoraContext _localctx = new EditoraContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_editora);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(STRING);
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

	public static class AnoContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(gic_fa1_aParser.NUM, 0); }
		public AnoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).enterAno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).exitAno(this);
		}
	}

	public final AnoContext ano() throws RecognitionException {
		AnoContext _localctx = new AnoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ano);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(NUM);
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

	public static class CatalogoContext extends ParserRuleContext {
		public TerminalNode OUTRO() { return getToken(gic_fa1_aParser.OUTRO, 0); }
		public TerminalNode BGUM() { return getToken(gic_fa1_aParser.BGUM, 0); }
		public TerminalNode BAUM() { return getToken(gic_fa1_aParser.BAUM, 0); }
		public CatalogoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catalogo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).enterCatalogo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).exitCatalogo(this);
		}
	}

	public final CatalogoContext catalogo() throws RecognitionException {
		CatalogoContext _localctx = new CatalogoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_catalogo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTRO) | (1L << BGUM) | (1L << BAUM))) != 0)) ) {
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

	public static class ExistenciasContext extends ParserRuleContext {
		public int _p;
		public EstadoContext estado() {
			return getRuleContext(EstadoContext.class,0);
		}
		public ExistenciasContext existencias() {
			return getRuleContext(ExistenciasContext.class,0);
		}
		public ExistenciasContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExistenciasContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_existencias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).enterExistencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).exitExistencias(this);
		}
	}

	public final ExistenciasContext existencias(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExistenciasContext _localctx = new ExistenciasContext(_ctx, _parentState, _p);
		ExistenciasContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, RULE_existencias);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(85); estado();
			}
			_ctx.stop = _input.LT(-1);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExistenciasContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_existencias);
					setState(87);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(88); match(3);
					setState(89); estado();
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EstadoContext extends ParserRuleContext {
		public CodigobarrasContext codigobarras() {
			return getRuleContext(CodigobarrasContext.class,0);
		}
		public DisponibContext disponib() {
			return getRuleContext(DisponibContext.class,0);
		}
		public EstadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).enterEstado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).exitEstado(this);
		}
	}

	public final EstadoContext estado() throws RecognitionException {
		EstadoContext _localctx = new EstadoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_estado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); codigobarras();
			setState(96); disponib();
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

	public static class CodigobarrasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gic_fa1_aParser.ID, 0); }
		public CodigobarrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigobarras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).enterCodigobarras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).exitCodigobarras(this);
		}
	}

	public final CodigobarrasContext codigobarras() throws RecognitionException {
		CodigobarrasContext _localctx = new CodigobarrasContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_codigobarras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(ID);
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

	public static class DisponibContext extends ParserRuleContext {
		public DatadevContext datadev() {
			return getRuleContext(DatadevContext.class,0);
		}
		public TerminalNode EMPRESTADO() { return getToken(gic_fa1_aParser.EMPRESTADO, 0); }
		public TerminalNode ESTANTE() { return getToken(gic_fa1_aParser.ESTANTE, 0); }
		public TerminalNode PERMANENTE() { return getToken(gic_fa1_aParser.PERMANENTE, 0); }
		public DisponibContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disponib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).enterDisponib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).exitDisponib(this);
		}
	}

	public final DisponibContext disponib() throws RecognitionException {
		DisponibContext _localctx = new DisponibContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_disponib);
		try {
			setState(104);
			switch (_input.LA(1)) {
			case ESTANTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(100); match(ESTANTE);
				}
				break;
			case PERMANENTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(101); match(PERMANENTE);
				}
				break;
			case EMPRESTADO:
				enterOuterAlt(_localctx, 3);
				{
				setState(102); match(EMPRESTADO);
				setState(103); datadev();
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

	public static class DatadevContext extends ParserRuleContext {
		public MesContext mes() {
			return getRuleContext(MesContext.class,0);
		}
		public AnoContext ano() {
			return getRuleContext(AnoContext.class,0);
		}
		public DiaContext dia() {
			return getRuleContext(DiaContext.class,0);
		}
		public DatadevContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datadev; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).enterDatadev(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).exitDatadev(this);
		}
	}

	public final DatadevContext datadev() throws RecognitionException {
		DatadevContext _localctx = new DatadevContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_datadev);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); ano();
			setState(107); match(5);
			setState(108); mes();
			setState(109); match(5);
			setState(110); dia();
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

	public static class MesContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(gic_fa1_aParser.NUM, 0); }
		public MesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).enterMes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).exitMes(this);
		}
	}

	public final MesContext mes() throws RecognitionException {
		MesContext _localctx = new MesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(NUM);
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

	public static class DiaContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(gic_fa1_aParser.NUM, 0); }
		public DiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).enterDia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_aListener ) ((gic_fa1_aListener)listener).exitDia(this);
		}
	}

	public final DiaContext dia() throws RecognitionException {
		DiaContext _localctx = new DiaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(NUM);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return registos_sempred((RegistosContext)_localctx, predIndex);

		case 11: return existencias_sempred((ExistenciasContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean existencias_sempred(ExistenciasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean registos_sempred(RegistosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\27w\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23"+
		"\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\7\r]\n\r\f\r\16\r`\13\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\5\20k\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\4\3"+
		"\2\f\16\3\2\16\20h\2&\3\2\2\2\4(\3\2\2\2\6\63\3\2\2\2\b:\3\2\2\2\nH\3"+
		"\2\2\2\fJ\3\2\2\2\16L\3\2\2\2\20N\3\2\2\2\22P\3\2\2\2\24R\3\2\2\2\26T"+
		"\3\2\2\2\30V\3\2\2\2\32a\3\2\2\2\34d\3\2\2\2\36j\3\2\2\2 l\3\2\2\2\"r"+
		"\3\2\2\2$t\3\2\2\2&\'\5\4\3\2\'\3\3\2\2\2()\b\3\1\2)*\5\6\4\2*\60\3\2"+
		"\2\2+,\6\3\2\3,-\7\5\2\2-/\5\6\4\2.+\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60"+
		"\61\3\2\2\2\61\5\3\2\2\2\62\60\3\2\2\2\63\64\7\6\2\2\64\65\7\n\2\2\65"+
		"\66\5\b\5\2\66\67\7\13\2\2\678\5\30\r\289\7\3\2\29\7\3\2\2\2:;\5\n\6\2"+
		";<\7\b\2\2<=\5\26\f\2=>\7\7\2\2>?\5\f\7\2?@\7\7\2\2@A\5\16\b\2AB\7\t\2"+
		"\2BC\5\20\t\2CD\7\4\2\2DE\5\22\n\2EF\7\7\2\2FG\5\24\13\2G\t\3\2\2\2HI"+
		"\7\24\2\2I\13\3\2\2\2JK\t\2\2\2K\r\3\2\2\2LM\7\25\2\2M\17\3\2\2\2NO\7"+
		"\25\2\2O\21\3\2\2\2PQ\7\25\2\2Q\23\3\2\2\2RS\7\26\2\2S\25\3\2\2\2TU\t"+
		"\3\2\2U\27\3\2\2\2VW\b\r\1\2WX\5\32\16\2X^\3\2\2\2YZ\6\r\3\3Z[\7\5\2\2"+
		"[]\5\32\16\2\\Y\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\31\3\2\2\2`^\3"+
		"\2\2\2ab\5\34\17\2bc\5\36\20\2c\33\3\2\2\2de\7\24\2\2e\35\3\2\2\2fk\7"+
		"\21\2\2gk\7\22\2\2hi\7\23\2\2ik\5 \21\2jf\3\2\2\2jg\3\2\2\2jh\3\2\2\2"+
		"k\37\3\2\2\2lm\5\24\13\2mn\7\7\2\2no\5\"\22\2op\7\7\2\2pq\5$\23\2q!\3"+
		"\2\2\2rs\7\26\2\2s#\3\2\2\2tu\7\26\2\2u%\3\2\2\2\5\60^j";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}