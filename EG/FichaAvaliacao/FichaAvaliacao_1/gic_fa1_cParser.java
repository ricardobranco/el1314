// Generated from /Users/ricardobranco/Documents/git/el1314/EG/FichaAvaliacao/FichaAvaliacao_1/gic_fa1_c.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gic_fa1_cParser extends Parser {
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
	public String getGrammarFileName() { return "gic_fa1_c.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public gic_fa1_cParser(TokenStream input) {
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
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).enterBiblioteca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).exitBiblioteca(this);
		}
	}

	public final BibliotecaContext biblioteca() throws RecognitionException {
		BibliotecaContext _localctx = new BibliotecaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_biblioteca);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); registos();
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
		public RegistoContext registo() {
			return getRuleContext(RegistoContext.class,0);
		}
		public RegistosContext registos() {
			return getRuleContext(RegistosContext.class,0);
		}
		public RegistosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).enterRegistos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).exitRegistos(this);
		}
	}

	public final RegistosContext registos() throws RecognitionException {
		RegistosContext _localctx = new RegistosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_registos);
		try {
			setState(45);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40); registo();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41); registo();
				setState(42); match(3);
				setState(43); registos();
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

	public static class RegistoContext extends ParserRuleContext {
		public DescricaoContext descricao() {
			return getRuleContext(DescricaoContext.class,0);
		}
		public TerminalNode REGISTO() { return getToken(gic_fa1_cParser.REGISTO, 0); }
		public TerminalNode EXISTENCIAS() { return getToken(gic_fa1_cParser.EXISTENCIAS, 0); }
		public ExistenciasContext existencias() {
			return getRuleContext(ExistenciasContext.class,0);
		}
		public RegistoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).enterRegisto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).exitRegisto(this);
		}
	}

	public final RegistoContext registo() throws RecognitionException {
		RegistoContext _localctx = new RegistoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_registo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(4);
			setState(48); match(REGISTO);
			setState(49); descricao();
			setState(50); match(EXISTENCIAS);
			setState(51); existencias(0);
			setState(52); match(1);
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
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).enterDescricao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).exitDescricao(this);
		}
	}

	public final DescricaoContext descricao() throws RecognitionException {
		DescricaoContext _localctx = new DescricaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_descricao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); referencia();
			setState(55); match(6);
			setState(56); catalogo();
			setState(57); match(5);
			setState(58); tipo();
			setState(59); match(5);
			setState(60); titulo();
			setState(61); match(7);
			setState(62); autores(0);
			setState(63); match(2);
			setState(64); editora();
			setState(65); match(5);
			setState(66); ano();
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
		public TerminalNode ID() { return getToken(gic_fa1_cParser.ID, 0); }
		public ReferenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).enterReferencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).exitReferencia(this);
		}
	}

	public final ReferenciaContext referencia() throws RecognitionException {
		ReferenciaContext _localctx = new ReferenciaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_referencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(ID);
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
		public TerminalNode OUTRO() { return getToken(gic_fa1_cParser.OUTRO, 0); }
		public TerminalNode CDROM() { return getToken(gic_fa1_cParser.CDROM, 0); }
		public TerminalNode LIVRO() { return getToken(gic_fa1_cParser.LIVRO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
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
		public TerminalNode STRING() { return getToken(gic_fa1_cParser.STRING, 0); }
		public TituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).enterTitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).exitTitulo(this);
		}
	}

	public final TituloContext titulo() throws RecognitionException {
		TituloContext _localctx = new TituloContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_titulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(STRING);
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
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).enterAutores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).exitAutores(this);
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
			setState(75); autor();
			}
			_ctx.stop = _input.LT(-1);
			setState(82);
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
					setState(77);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(78); match(3);
					setState(79); autor();
					}
					} 
				}
				setState(84);
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
		public TerminalNode STRING() { return getToken(gic_fa1_cParser.STRING, 0); }
		public AutorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).enterAutor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).exitAutor(this);
		}
	}

	public final AutorContext autor() throws RecognitionException {
		AutorContext _localctx = new AutorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_autor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(STRING);
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
		public TerminalNode STRING() { return getToken(gic_fa1_cParser.STRING, 0); }
		public EditoraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_editora; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).enterEditora(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).exitEditora(this);
		}
	}

	public final EditoraContext editora() throws RecognitionException {
		EditoraContext _localctx = new EditoraContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_editora);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(STRING);
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
		public TerminalNode NUM() { return getToken(gic_fa1_cParser.NUM, 0); }
		public AnoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).enterAno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).exitAno(this);
		}
	}

	public final AnoContext ano() throws RecognitionException {
		AnoContext _localctx = new AnoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ano);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(NUM);
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
		public TerminalNode OUTRO() { return getToken(gic_fa1_cParser.OUTRO, 0); }
		public TerminalNode BGUM() { return getToken(gic_fa1_cParser.BGUM, 0); }
		public TerminalNode BAUM() { return getToken(gic_fa1_cParser.BAUM, 0); }
		public CatalogoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catalogo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).enterCatalogo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).exitCatalogo(this);
		}
	}

	public final CatalogoContext catalogo() throws RecognitionException {
		CatalogoContext _localctx = new CatalogoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_catalogo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
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
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).enterExistencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).exitExistencias(this);
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
			setState(94); estado();
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
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
					setState(96);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(97); match(3);
					setState(98); estado();
					}
					} 
				}
				setState(103);
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
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).enterEstado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).exitEstado(this);
		}
	}

	public final EstadoContext estado() throws RecognitionException {
		EstadoContext _localctx = new EstadoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_estado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); codigobarras();
			setState(105); disponib();
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
		public TerminalNode ID() { return getToken(gic_fa1_cParser.ID, 0); }
		public CodigobarrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigobarras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).enterCodigobarras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).exitCodigobarras(this);
		}
	}

	public final CodigobarrasContext codigobarras() throws RecognitionException {
		CodigobarrasContext _localctx = new CodigobarrasContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_codigobarras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(ID);
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
		public TerminalNode EMPRESTADO() { return getToken(gic_fa1_cParser.EMPRESTADO, 0); }
		public TerminalNode ESTANTE() { return getToken(gic_fa1_cParser.ESTANTE, 0); }
		public TerminalNode PERMANENTE() { return getToken(gic_fa1_cParser.PERMANENTE, 0); }
		public DisponibContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disponib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).enterDisponib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).exitDisponib(this);
		}
	}

	public final DisponibContext disponib() throws RecognitionException {
		DisponibContext _localctx = new DisponibContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_disponib);
		try {
			setState(113);
			switch (_input.LA(1)) {
			case ESTANTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(109); match(ESTANTE);
				}
				break;
			case PERMANENTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(110); match(PERMANENTE);
				}
				break;
			case EMPRESTADO:
				enterOuterAlt(_localctx, 3);
				{
				setState(111); match(EMPRESTADO);
				setState(112); datadev();
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
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).enterDatadev(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).exitDatadev(this);
		}
	}

	public final DatadevContext datadev() throws RecognitionException {
		DatadevContext _localctx = new DatadevContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_datadev);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); ano();
			setState(116); match(5);
			setState(117); mes();
			setState(118); match(5);
			setState(119); dia();
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
		public TerminalNode NUM() { return getToken(gic_fa1_cParser.NUM, 0); }
		public MesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).enterMes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).exitMes(this);
		}
	}

	public final MesContext mes() throws RecognitionException {
		MesContext _localctx = new MesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(NUM);
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
		public TerminalNode NUM() { return getToken(gic_fa1_cParser.NUM, 0); }
		public DiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).enterDia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gic_fa1_cListener ) ((gic_fa1_cListener)listener).exitDia(this);
		}
	}

	public final DiaContext dia() throws RecognitionException {
		DiaContext _localctx = new DiaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); match(NUM);
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
		case 7: return autores_sempred((AutoresContext)_localctx, predIndex);

		case 12: return existencias_sempred((ExistenciasContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean existencias_sempred(ExistenciasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean autores_sempred(AutoresContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\27\u0080\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tS\n\t\f\t\16\t"+
		"V\13\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16f\n\16\f\16\16\16i\13\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\5\21t\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\4\3\2\f\16\3\2\16"+
		"\20q\2(\3\2\2\2\4/\3\2\2\2\6\61\3\2\2\2\b8\3\2\2\2\nF\3\2\2\2\fH\3\2\2"+
		"\2\16J\3\2\2\2\20L\3\2\2\2\22W\3\2\2\2\24Y\3\2\2\2\26[\3\2\2\2\30]\3\2"+
		"\2\2\32_\3\2\2\2\34j\3\2\2\2\36m\3\2\2\2 s\3\2\2\2\"u\3\2\2\2${\3\2\2"+
		"\2&}\3\2\2\2()\5\4\3\2)\3\3\2\2\2*\60\5\6\4\2+,\5\6\4\2,-\7\5\2\2-.\5"+
		"\4\3\2.\60\3\2\2\2/*\3\2\2\2/+\3\2\2\2\60\5\3\2\2\2\61\62\7\6\2\2\62\63"+
		"\7\n\2\2\63\64\5\b\5\2\64\65\7\13\2\2\65\66\5\32\16\2\66\67\7\3\2\2\67"+
		"\7\3\2\2\289\5\n\6\29:\7\b\2\2:;\5\30\r\2;<\7\7\2\2<=\5\f\7\2=>\7\7\2"+
		"\2>?\5\16\b\2?@\7\t\2\2@A\5\20\t\2AB\7\4\2\2BC\5\24\13\2CD\7\7\2\2DE\5"+
		"\26\f\2E\t\3\2\2\2FG\7\24\2\2G\13\3\2\2\2HI\t\2\2\2I\r\3\2\2\2JK\7\25"+
		"\2\2K\17\3\2\2\2LM\b\t\1\2MN\5\22\n\2NT\3\2\2\2OP\6\t\2\3PQ\7\5\2\2QS"+
		"\5\22\n\2RO\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\21\3\2\2\2VT\3\2\2"+
		"\2WX\7\25\2\2X\23\3\2\2\2YZ\7\25\2\2Z\25\3\2\2\2[\\\7\26\2\2\\\27\3\2"+
		"\2\2]^\t\3\2\2^\31\3\2\2\2_`\b\16\1\2`a\5\34\17\2ag\3\2\2\2bc\6\16\3\3"+
		"cd\7\5\2\2df\5\34\17\2eb\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\33\3\2"+
		"\2\2ig\3\2\2\2jk\5\36\20\2kl\5 \21\2l\35\3\2\2\2mn\7\24\2\2n\37\3\2\2"+
		"\2ot\7\21\2\2pt\7\22\2\2qr\7\23\2\2rt\5\"\22\2so\3\2\2\2sp\3\2\2\2sq\3"+
		"\2\2\2t!\3\2\2\2uv\5\26\f\2vw\7\7\2\2wx\5$\23\2xy\7\7\2\2yz\5&\24\2z#"+
		"\3\2\2\2{|\7\26\2\2|%\3\2\2\2}~\7\26\2\2~\'\3\2\2\2\6/Tgs";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}