// Generated from D:/Work/Code/Intelij IDEA/grammars-v4/idb\IdbParser.g4 by ANTLR 4.4.1-dev

    package com.intple.dbone.parser.idb;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IdbParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IdbParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IdbParser#dml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml(@NotNull IdbParser.DmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull IdbParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql(@NotNull IdbParser.SqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#nonreserved_keywords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonreserved_keywords(@NotNull IdbParser.Nonreserved_keywordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#ddl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl(@NotNull IdbParser.DdlContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull IdbParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(@NotNull IdbParser.DclContext ctx);
}