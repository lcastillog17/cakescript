// Generated from com/compiladores/cakescript/interprete/CakeScript.g4 by ANTLR 4.5.1
package com.compiladores.cakescript.interprete;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CakeScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CakeScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CakeScriptParser#receta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceta(CakeScriptParser.RecetaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CakeScriptParser#ingredientes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIngredientes(CakeScriptParser.IngredientesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CakeScriptParser#listaIngredientes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaIngredientes(CakeScriptParser.ListaIngredientesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CakeScriptParser#ingrediente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIngrediente(CakeScriptParser.IngredienteContext ctx);
	/**
	 * Visit a parse tree produced by {@link CakeScriptParser#cantidad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCantidad(CakeScriptParser.CantidadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CakeScriptParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(CakeScriptParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link CakeScriptParser#unidad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnidad(CakeScriptParser.UnidadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CakeScriptParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CakeScriptParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CakeScriptParser#pasos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasos(CakeScriptParser.PasosContext ctx);
	/**
	 * Visit a parse tree produced by {@link CakeScriptParser#listaPasos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaPasos(CakeScriptParser.ListaPasosContext ctx);
	/**
	 * Visit a parse tree produced by {@link CakeScriptParser#paso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaso(CakeScriptParser.PasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CakeScriptParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(CakeScriptParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link CakeScriptParser#listaParametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParametros(CakeScriptParser.ListaParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link CakeScriptParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(CakeScriptParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link CakeScriptParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(CakeScriptParser.ComandoContext ctx);
}