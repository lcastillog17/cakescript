// Generated from com/compiladores/cakescript/interprete/CakeScript.g4 by ANTLR 4.5.1
package com.compiladores.cakescript.interprete;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CakeScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, MIX=15, BATIR=16, HORNEAR=17, 
		CONGELAR=18, DECORAR=19, LETRA=20, DIGITO=21, WS=22;
	public static final int
		RULE_receta = 0, RULE_ingredientes = 1, RULE_listaIngredientes = 2, RULE_ingrediente = 3, 
		RULE_cantidad = 4, RULE_numero = 5, RULE_unidad = 6, RULE_variable = 7, 
		RULE_pasos = 8, RULE_listaPasos = 9, RULE_paso = 10, RULE_parametros = 11, 
		RULE_listaParametros = 12, RULE_parametro = 13, RULE_comando = 14;
	public static final String[] ruleNames = {
		"receta", "ingredientes", "listaIngredientes", "ingrediente", "cantidad", 
		"numero", "unidad", "variable", "pasos", "listaPasos", "paso", "parametros", 
		"listaParametros", "parametro", "comando"
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

	@Override
	public String getGrammarFileName() { return "CakeScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CakeScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RecetaContext extends ParserRuleContext {
		public IngredientesContext ingredientes() {
			return getRuleContext(IngredientesContext.class,0);
		}
		public PasosContext pasos() {
			return getRuleContext(PasosContext.class,0);
		}
		public RecetaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).enterReceta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).exitReceta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CakeScriptVisitor ) return ((CakeScriptVisitor<? extends T>)visitor).visitReceta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecetaContext receta() throws RecognitionException {
		RecetaContext _localctx = new RecetaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_receta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			ingredientes();
			setState(31);
			pasos();
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

	public static class IngredientesContext extends ParserRuleContext {
		public ListaIngredientesContext listaIngredientes() {
			return getRuleContext(ListaIngredientesContext.class,0);
		}
		public IngredientesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingredientes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).enterIngredientes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).exitIngredientes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CakeScriptVisitor ) return ((CakeScriptVisitor<? extends T>)visitor).visitIngredientes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IngredientesContext ingredientes() throws RecognitionException {
		IngredientesContext _localctx = new IngredientesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ingredientes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__0);
			setState(34);
			listaIngredientes();
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

	public static class ListaIngredientesContext extends ParserRuleContext {
		public List<IngredienteContext> ingrediente() {
			return getRuleContexts(IngredienteContext.class);
		}
		public IngredienteContext ingrediente(int i) {
			return getRuleContext(IngredienteContext.class,i);
		}
		public ListaIngredientesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaIngredientes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).enterListaIngredientes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).exitListaIngredientes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CakeScriptVisitor ) return ((CakeScriptVisitor<? extends T>)visitor).visitListaIngredientes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaIngredientesContext listaIngredientes() throws RecognitionException {
		ListaIngredientesContext _localctx = new ListaIngredientesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_listaIngredientes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETRA) {
				{
				{
				setState(36);
				ingrediente();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class IngredienteContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public CantidadContext cantidad() {
			return getRuleContext(CantidadContext.class,0);
		}
		public IngredienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingrediente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).enterIngrediente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).exitIngrediente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CakeScriptVisitor ) return ((CakeScriptVisitor<? extends T>)visitor).visitIngrediente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IngredienteContext ingrediente() throws RecognitionException {
		IngredienteContext _localctx = new IngredienteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ingrediente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			variable();
			setState(43);
			match(T__1);
			setState(44);
			cantidad();
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

	public static class CantidadContext extends ParserRuleContext {
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public UnidadContext unidad() {
			return getRuleContext(UnidadContext.class,0);
		}
		public CantidadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cantidad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).enterCantidad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).exitCantidad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CakeScriptVisitor ) return ((CakeScriptVisitor<? extends T>)visitor).visitCantidad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CantidadContext cantidad() throws RecognitionException {
		CantidadContext _localctx = new CantidadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cantidad);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			numero();
			setState(48);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
				{
				setState(47);
				unidad();
				}
			}

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

	public static class NumeroContext extends ParserRuleContext {
		public List<TerminalNode> DIGITO() { return getTokens(CakeScriptParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(CakeScriptParser.DIGITO, i);
		}
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).exitNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CakeScriptVisitor ) return ((CakeScriptVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				match(DIGITO);
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGITO );
			setState(61);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(55);
				match(T__2);
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(56);
					match(DIGITO);
					}
					}
					setState(59); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGITO );
				}
			}

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

	public static class UnidadContext extends ParserRuleContext {
		public UnidadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unidad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).enterUnidad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).exitUnidad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CakeScriptVisitor ) return ((CakeScriptVisitor<? extends T>)visitor).visitUnidad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnidadContext unidad() throws RecognitionException {
		UnidadContext _localctx = new UnidadContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unidad);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> LETRA() { return getTokens(CakeScriptParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(CakeScriptParser.LETRA, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CakeScriptVisitor ) return ((CakeScriptVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				match(LETRA);
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETRA );
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

	public static class PasosContext extends ParserRuleContext {
		public ListaPasosContext listaPasos() {
			return getRuleContext(ListaPasosContext.class,0);
		}
		public PasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pasos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).enterPasos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).exitPasos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CakeScriptVisitor ) return ((CakeScriptVisitor<? extends T>)visitor).visitPasos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasosContext pasos() throws RecognitionException {
		PasosContext _localctx = new PasosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pasos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__10);
			setState(71);
			listaPasos();
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

	public static class ListaPasosContext extends ParserRuleContext {
		public List<PasoContext> paso() {
			return getRuleContexts(PasoContext.class);
		}
		public PasoContext paso(int i) {
			return getRuleContext(PasoContext.class,i);
		}
		public ListaPasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaPasos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).enterListaPasos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).exitListaPasos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CakeScriptVisitor ) return ((CakeScriptVisitor<? extends T>)visitor).visitListaPasos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaPasosContext listaPasos() throws RecognitionException {
		ListaPasosContext _localctx = new ListaPasosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listaPasos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MIX) | (1L << BATIR) | (1L << HORNEAR) | (1L << CONGELAR) | (1L << DECORAR))) != 0)) {
				{
				{
				setState(73);
				paso();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class PasoContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public PasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).enterPaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).exitPaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CakeScriptVisitor ) return ((CakeScriptVisitor<? extends T>)visitor).visitPaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasoContext paso() throws RecognitionException {
		PasoContext _localctx = new PasoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_paso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			comando();
			setState(81);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(80);
				parametros();
				}
			}

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

	public static class ParametrosContext extends ParserRuleContext {
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CakeScriptVisitor ) return ((CakeScriptVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parametros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__11);
			setState(84);
			listaParametros();
			setState(85);
			match(T__12);
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

	public static class ListaParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ListaParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).enterListaParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).exitListaParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CakeScriptVisitor ) return ((CakeScriptVisitor<? extends T>)visitor).visitListaParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listaParametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if (_la==LETRA || _la==DIGITO) {
				{
				setState(87);
				parametro();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(88);
					match(T__13);
					setState(89);
					parametro();
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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

	public static class ParametroContext extends ParserRuleContext {
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CakeScriptVisitor ) return ((CakeScriptVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parametro);
		try {
			setState(99);
			switch (_input.LA(1)) {
			case DIGITO:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				numero();
				}
				break;
			case LETRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				variable();
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

	public static class ComandoContext extends ParserRuleContext {
		public TerminalNode MIX() { return getToken(CakeScriptParser.MIX, 0); }
		public TerminalNode BATIR() { return getToken(CakeScriptParser.BATIR, 0); }
		public TerminalNode HORNEAR() { return getToken(CakeScriptParser.HORNEAR, 0); }
		public TerminalNode CONGELAR() { return getToken(CakeScriptParser.CONGELAR, 0); }
		public TerminalNode DECORAR() { return getToken(CakeScriptParser.DECORAR, 0); }
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CakeScriptListener ) ((CakeScriptListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CakeScriptVisitor ) return ((CakeScriptVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MIX) | (1L << BATIR) | (1L << HORNEAR) | (1L << CONGELAR) | (1L << DECORAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30j\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\7\4(\n\4\f\4\16\4+\13\4\3\5\3\5\3\5\3\5\3\6\3\6\5\6\63\n\6\3\7\6\7"+
		"\66\n\7\r\7\16\7\67\3\7\3\7\6\7<\n\7\r\7\16\7=\5\7@\n\7\3\b\3\b\3\t\6"+
		"\tE\n\t\r\t\16\tF\3\n\3\n\3\n\3\13\7\13M\n\13\f\13\16\13P\13\13\3\f\3"+
		"\f\5\fT\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16]\n\16\f\16\16\16`\13\16"+
		"\5\16b\n\16\3\17\3\17\5\17f\n\17\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36\2\4\3\2\6\f\3\2\21\25e\2 \3\2\2\2\4#\3\2\2\2"+
		"\6)\3\2\2\2\b,\3\2\2\2\n\60\3\2\2\2\f\65\3\2\2\2\16A\3\2\2\2\20D\3\2\2"+
		"\2\22H\3\2\2\2\24N\3\2\2\2\26Q\3\2\2\2\30U\3\2\2\2\32a\3\2\2\2\34e\3\2"+
		"\2\2\36g\3\2\2\2 !\5\4\3\2!\"\5\22\n\2\"\3\3\2\2\2#$\7\3\2\2$%\5\6\4\2"+
		"%\5\3\2\2\2&(\5\b\5\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\7\3\2"+
		"\2\2+)\3\2\2\2,-\5\20\t\2-.\7\4\2\2./\5\n\6\2/\t\3\2\2\2\60\62\5\f\7\2"+
		"\61\63\5\16\b\2\62\61\3\2\2\2\62\63\3\2\2\2\63\13\3\2\2\2\64\66\7\27\2"+
		"\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28?\3\2\2\29;\7"+
		"\5\2\2:<\7\27\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?9"+
		"\3\2\2\2?@\3\2\2\2@\r\3\2\2\2AB\t\2\2\2B\17\3\2\2\2CE\7\26\2\2DC\3\2\2"+
		"\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\21\3\2\2\2HI\7\r\2\2IJ\5\24\13\2J\23"+
		"\3\2\2\2KM\5\26\f\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\25\3\2\2"+
		"\2PN\3\2\2\2QS\5\36\20\2RT\5\30\r\2SR\3\2\2\2ST\3\2\2\2T\27\3\2\2\2UV"+
		"\7\16\2\2VW\5\32\16\2WX\7\17\2\2X\31\3\2\2\2Y^\5\34\17\2Z[\7\20\2\2[]"+
		"\5\34\17\2\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2"+
		"\2aY\3\2\2\2ab\3\2\2\2b\33\3\2\2\2cf\5\f\7\2df\5\20\t\2ec\3\2\2\2ed\3"+
		"\2\2\2f\35\3\2\2\2gh\t\3\2\2h\37\3\2\2\2\r)\62\67=?FNS^ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}