// Generated from Casualintellect.g4 by ANTLR 4.1
package org.casualintellect.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CasualintellectParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CasualintellectVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CasualintellectParser#states_before}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStates_before(@NotNull CasualintellectParser.States_beforeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CasualintellectParser#left_brace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_brace(@NotNull CasualintellectParser.Left_braceContext ctx);

	/**
	 * Visit a parse tree produced by {@link CasualintellectParser#transitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitions(@NotNull CasualintellectParser.TransitionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link CasualintellectParser#list_of_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_id(@NotNull CasualintellectParser.List_of_idContext ctx);

	/**
	 * Visit a parse tree produced by {@link CasualintellectParser#transition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransition(@NotNull CasualintellectParser.TransitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CasualintellectParser#states}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStates(@NotNull CasualintellectParser.StatesContext ctx);

	/**
	 * Visit a parse tree produced by {@link CasualintellectParser#right_brace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_brace(@NotNull CasualintellectParser.Right_braceContext ctx);

	/**
	 * Visit a parse tree produced by {@link CasualintellectParser#states_after}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStates_after(@NotNull CasualintellectParser.States_afterContext ctx);

	/**
	 * Visit a parse tree produced by {@link CasualintellectParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(@NotNull CasualintellectParser.Bool_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CasualintellectParser#states_in_process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStates_in_process(@NotNull CasualintellectParser.States_in_processContext ctx);

	/**
	 * Visit a parse tree produced by {@link CasualintellectParser#bool_bin_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_bin_operation(@NotNull CasualintellectParser.Bool_bin_operationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CasualintellectParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(@NotNull CasualintellectParser.StateContext ctx);

	/**
	 * Visit a parse tree produced by {@link CasualintellectParser#bool_un_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_un_operation(@NotNull CasualintellectParser.Bool_un_operationContext ctx);
}