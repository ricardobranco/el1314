// Generated from /Users/ricardobranco/Documents/git/el1314/EG/FichaAvaliacao/FichaAvaliacao_1/gic_fa1_b.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gic_fa1_bParser extends Parser {
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
		RULE_referencia = 4, RULE_tipo = 5, RULE_titulo = 6, RULE_autores = 7, 
		RULE_autor = 8, RULE_editora = 9, RULE_ano = 10, RULE_catalogo = 11, RULE_existencias = 12, 
		RULE_estado = 13, RULE_codigobarras = 14, RULE_disponib = 15, RULE_datadev = 16, 
		RULE_mes = 17, RULE_dia = 18;
	public static final String[] ruleNames = {
		"biblioteca", "registos", "registo", "descricao", "referencia", "tipo", 
		"titulo", "autores", "autor", "editora", "ano", "catalogo", "existencias", 
		"estado", "codigobarras", "disponib", "datadev", "mes", "dia"
	};

	@Override
	public String getGrammarFileName() { return "gic_fa1_b.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public gic_fa1_bParser(TokenStream input) {
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
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).enterBiblioteca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).exitBiblioteca(this);
		}
	}

	public final BibliotecaContext biblioteca() throws RecognitionException {
		BibliotecaContext _localctx = new BibliotecaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_biblioteca);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); registos(0);
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
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).enterRegistos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).exitRegistos(this);
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
			setState(41); registo();
			}
			_ctx.stop = _input.LT(-1);
			setState(48);
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
					setState(43);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(44); match(3);
					setState(45); registo();
					}
					} 
				}
				setState(50);
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
		public TerminalNode REGISTO() { return getToken(gic_fa1_bParser.REGISTO, 0); }
		public TerminalNode EXISTENCIAS() { return getToken(gic_fa1_bParser.EXISTENCIAS, 0); }
		public ExistenciasContext existencias() {
			return getRuleContext(ExistenciasContext.class,0);
		}
		public RegistoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).enterRegisto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).exitRegisto(this);
		}
	}

	public final RegistoContext registo() throws RecognitionException {
		RegistoContext _localctx = new RegistoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_registo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); match(4);
			setState(52); match(REGISTO);
			setState(53); descricao();
			setState(54); match(EXISTENCIAS);
			setState(55); existencias(0);
			setState(56); match(1);
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
		public AutoresContext autores() {
			return getRuleContext(AutoresContext.class,0);
		}
		public AnoContext ano() {
			return getRuleContext(AnoContext.class,0);
		}
		public EditoraContext editora() {
			return getRuleContext(EditoraContext.class,0);
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
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).enterDescricao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).exitDescricao(this);
		}
	}

	public final DescricaoContext descricao() throws RecognitionException {
		DescricaoContext _localctx = new DescricaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_descricao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); referencia();
			setState(59); match(6);
			setState(60); catalogo();
			setState(61); match(5);
			setState(62); tipo();
			setState(63); match(5);
			setState(64); titulo();
			setState(65); match(7);
			setState(66); autores(0);
			setState(67); match(2);
			setState(68); editora();
			setState(69); match(5);
			setState(70); ano();
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
		public TerminalNode ID() { return getToken(gic_fa1_bParser.ID, 0); }
		public ReferenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).enterReferencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).exitReferencia(this);
		}
	}

	public final ReferenciaContext referencia() throws RecognitionException {
		ReferenciaContext _localctx = new ReferenciaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_referencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(ID);
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
		public TerminalNode OUTRO() { return getToken(gic_fa1_bParser.OUTRO, 0); }
		public TerminalNode CDROM() { return getToken(gic_fa1_bParser.CDROM, 0); }
		public TerminalNode LIVRO() { return getToken(gic_fa1_bParser.LIVRO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
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
		public TerminalNode STRING() { return getToken(gic_fa1_bParser.STRING, 0); }
		public TituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).enterTitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).exitTitulo(this);
		}
	}

	public final TituloContext titulo() throws RecognitionException {
		TituloContext _localctx = new TituloContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_titulo);
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

	public static class AutoresContext extends ParserRuleContext {
		public int _p;
		public AutoresContext autores() {
			return getRuleContext(AutoresContext.class,0);
		}
		public AutorContext autor() {
			return getRuleContext(AutorContext.class,0);
		}
		public AutoresContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AutoresContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_autores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).enterAutores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).exitAutores(this);
		}
	}

	public final AutoresContext autores(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AutoresContext _localctx = new AutoresContext(_ctx, _parentState, _p);
		AutoresContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, RULE_autores);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(79); autor();
			}
			_ctx.stop = _input.LT(-1);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AutoresContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_autores);
					setState(81);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(82); match(3);
					setState(83); autor();
					}
					} 
				}
				setState(88);
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

	public static class AutorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(gic_fa1_bParser.STRING, 0); }
		public AutorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).enterAutor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).exitAutor(this);
		}
	}

	public final AutorContext autor() throws RecognitionException {
		AutorContext _localctx = new AutorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_autor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(STRING);
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
		public TerminalNode STRING() { return getToken(gic_fa1_bParser.STRING, 0); }
		public EditoraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_editora; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).enterEditora(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).exitEditora(this);
		}
	}

	public final EditoraContext editora() throws RecognitionException {
		EditoraContext _localctx = new EditoraContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_editora);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(STRING);
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
		public TerminalNode NUM() { return getToken(gic_fa1_bParser.NUM, 0); }
		public AnoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).enterAno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).exitAno(this);
		}
	}

	public final AnoContext ano() throws RecognitionException {
		AnoContext _localctx = new AnoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ano);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(NUM);
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
		public TerminalNode OUTRO() { return getToken(gic_fa1_bParser.OUTRO, 0); }
		public TerminalNode BGUM() { return getToken(gic_fa1_bParser.BGUM, 0); }
		public TerminalNode BAUM() { return getToken(gic_fa1_bParser.BAUM, 0); }
		public CatalogoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catalogo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).enterCatalogo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).exitCatalogo(this);
		}
	}

	public final CatalogoContext catalogo() throws RecognitionException {
		CatalogoContext _localctx = new CatalogoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_catalogo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
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
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).enterExistencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).exitExistencias(this);
		}
	}

	public final ExistenciasContext existencias(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExistenciasContext _localctx = new ExistenciasContext(_ctx, _parentState, _p);
		ExistenciasContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, RULE_existencias);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(98); estado();
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExistenciasContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_existencias);
					setState(100);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(101); match(3);
					setState(102); estado();
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).enterEstado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).exitEstado(this);
		}
	}

	public final EstadoContext estado() throws RecognitionException {
		EstadoContext _localctx = new EstadoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_estado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); codigobarras();
			setState(109); disponib();
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
		public TerminalNode ID() { return getToken(gic_fa1_bParser.ID, 0); }
		public CodigobarrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigobarras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).enterCodigobarras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).exitCodigobarras(this);
		}
	}

	public final CodigobarrasContext codigobarras() throws RecognitionException {
		CodigobarrasContext _localctx = new CodigobarrasContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_codigobarras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); match(ID);
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
		public TerminalNode EMPRESTADO() { return getToken(gic_fa1_bParser.EMPRESTADO, 0); }
		public TerminalNode ESTANTE() { return getToken(gic_fa1_bParser.ESTANTE, 0); }
		public TerminalNode PERMANENTE() { return getToken(gic_fa1_bParser.PERMANENTE, 0); }
		public DisponibContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disponib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).enterDisponib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).exitDisponib(this);
		}
	}

	public final DisponibContext disponib() throws RecognitionException {
		DisponibContext _localctx = new DisponibContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_disponib);
		try {
			setState(117);
			switch (_input.LA(1)) {
			case ESTANTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(113); match(ESTANTE);
				}
				break;
			case PERMANENTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(114); match(PERMANENTE);
				}
				break;
			case EMPRESTADO:
				enterOuterAlt(_localctx, 3);
				{
				setState(115); match(EMPRESTADO);
				setState(116); datadev();
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
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).enterDatadev(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).exitDatadev(this);
		}
	}

	public final DatadevContext datadev() throws RecognitionException {
		DatadevContext _localctx = new DatadevContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_datadev);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); ano();
			setState(120); match(5);
			setState(121); mes();
			setState(122); match(5);
			setState(123); dia();
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
		public TerminalNode NUM() { return getToken(gic_fa1_bParser.NUM, 0); }
		public MesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).enterMes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).exitMes(this);
		}
	}

	public final MesContext mes() throws RecognitionException {
		MesContext _localctx = new MesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(NUM);
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
		public TerminalNode NUM() { return getToken(gic_fa1_bParser.NUM, 0); }
		public DiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).enterDia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_bListener ) ((gic_fa1_bListener)listener).exitDia(this);
		}
	}

	public final DiaContext dia() throws RecognitionException {
		DiaContext _localctx = new DiaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(NUM);
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

		case 7: return autores_sempred((AutoresContext)_localctx, predIndex);

		case 12: return existencias_sempred((ExistenciasContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean existencias_sempred(ExistenciasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean registos_sempred(RegistosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean autores_sempred(AutoresContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\27\u0084\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\61\n\3\f\3\16"+
		"\3\64\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\7\tW\n\t\f\t\16\tZ\13\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16j\n\16\f\16\16\16m\13\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\5\21x\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"\2\4\3\2\f\16\3\2\16\20u\2(\3\2\2\2\4*\3\2\2\2\6\65\3\2\2\2\b<\3\2\2\2"+
		"\nJ\3\2\2\2\fL\3\2\2\2\16N\3\2\2\2\20P\3\2\2\2\22[\3\2\2\2\24]\3\2\2\2"+
		"\26_\3\2\2\2\30a\3\2\2\2\32c\3\2\2\2\34n\3\2\2\2\36q\3\2\2\2 w\3\2\2\2"+
		"\"y\3\2\2\2$\177\3\2\2\2&\u0081\3\2\2\2()\5\4\3\2)\3\3\2\2\2*+\b\3\1\2"+
		"+,\5\6\4\2,\62\3\2\2\2-.\6\3\2\3./\7\5\2\2/\61\5\6\4\2\60-\3\2\2\2\61"+
		"\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\5\3\2\2\2\64\62\3\2\2\2\65"+
		"\66\7\6\2\2\66\67\7\n\2\2\678\5\b\5\289\7\13\2\29:\5\32\16\2:;\7\3\2\2"+
		";\7\3\2\2\2<=\5\n\6\2=>\7\b\2\2>?\5\30\r\2?@\7\7\2\2@A\5\f\7\2AB\7\7\2"+
		"\2BC\5\16\b\2CD\7\t\2\2DE\5\20\t\2EF\7\4\2\2FG\5\24\13\2GH\7\7\2\2HI\5"+
		"\26\f\2I\t\3\2\2\2JK\7\24\2\2K\13\3\2\2\2LM\t\2\2\2M\r\3\2\2\2NO\7\25"+
		"\2\2O\17\3\2\2\2PQ\b\t\1\2QR\5\22\n\2RX\3\2\2\2ST\6\t\3\3TU\7\5\2\2UW"+
		"\5\22\n\2VS\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\21\3\2\2\2ZX\3\2\2"+
		"\2[\\\7\25\2\2\\\23\3\2\2\2]^\7\25\2\2^\25\3\2\2\2_`\7\26\2\2`\27\3\2"+
		"\2\2ab\t\3\2\2b\31\3\2\2\2cd\b\16\1\2de\5\34\17\2ek\3\2\2\2fg\6\16\4\3"+
		"gh\7\5\2\2hj\5\34\17\2if\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\33\3\2"+
		"\2\2mk\3\2\2\2no\5\36\20\2op\5 \21\2p\35\3\2\2\2qr\7\24\2\2r\37\3\2\2"+
		"\2sx\7\21\2\2tx\7\22\2\2uv\7\23\2\2vx\5\"\22\2ws\3\2\2\2wt\3\2\2\2wu\3"+
		"\2\2\2x!\3\2\2\2yz\5\26\f\2z{\7\7\2\2{|\5$\23\2|}\7\7\2\2}~\5&\24\2~#"+
		"\3\2\2\2\177\u0080\7\26\2\2\u0080%\3\2\2\2\u0081\u0082\7\26\2\2\u0082"+
		"\'\3\2\2\2\6\62Xkw";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}