// Generated from D:/Work/Code/Intelij IDEA/grammars-v4/idb\IdbParser.g4 by ANTLR 4.4.1-dev

    package com.intple.dbone.parser.v4.idb;

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
	 * Visit a parse tree produced by {@link IdbParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(@NotNull IdbParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whereClause}
	 * labeled alternative in {@link IdbParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(@NotNull IdbParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_name(@NotNull IdbParser.Schema_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#qualified_asterisk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_asterisk(@NotNull IdbParser.Qualified_asteriskContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#select_sublist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_sublist(@NotNull IdbParser.Select_sublistContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#query_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_expression(@NotNull IdbParser.Query_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCount(@NotNull IdbParser.CountContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowClause}
	 * labeled alternative in {@link IdbParser#window_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowClause(@NotNull IdbParser.WindowClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#derived_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_column(@NotNull IdbParser.Derived_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#offset_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset_clause(@NotNull IdbParser.Offset_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_type(@NotNull IdbParser.Join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(@NotNull IdbParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#into_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_expression(@NotNull IdbParser.Into_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull IdbParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#derived_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_column_list(@NotNull IdbParser.Derived_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#window_specifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_specifier_list(@NotNull IdbParser.Window_specifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#function_reserved_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_reserved_name(@NotNull IdbParser.Function_reserved_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#window_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_specifier(@NotNull IdbParser.Window_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#join_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_specification(@NotNull IdbParser.Join_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(@NotNull IdbParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#window_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_definition(@NotNull IdbParser.Window_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#table_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name_list(@NotNull IdbParser.Table_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(@NotNull IdbParser.Any_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(@NotNull IdbParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#join_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_column_list(@NotNull IdbParser.Join_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#function_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_arg(@NotNull IdbParser.Function_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#with_query_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_query_name(@NotNull IdbParser.With_query_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#query_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_specification(@NotNull IdbParser.Query_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#for_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_clause(@NotNull IdbParser.For_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#correlation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorrelation_name(@NotNull IdbParser.Correlation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#correlation_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorrelation_specification(@NotNull IdbParser.Correlation_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#column_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name_list(@NotNull IdbParser.Column_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull IdbParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition(@NotNull IdbParser.Column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#frame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame(@NotNull IdbParser.FrameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#limit_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_clause(@NotNull IdbParser.Limit_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#nonreserved_keywords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonreserved_keywords(@NotNull IdbParser.Nonreserved_keywordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(@NotNull IdbParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull IdbParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableStmt}
	 * labeled alternative in {@link IdbParser#table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableStmt(@NotNull IdbParser.TableStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code groupClause}
	 * labeled alternative in {@link IdbParser#group_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupClause(@NotNull IdbParser.GroupClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#outer_join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuter_join_type(@NotNull IdbParser.Outer_join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#named_columns_join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_columns_join(@NotNull IdbParser.Named_columns_joinContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull IdbParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(@NotNull IdbParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fromClause}
	 * labeled alternative in {@link IdbParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(@NotNull IdbParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code withQuery}
	 * labeled alternative in {@link IdbParser#with_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithQuery(@NotNull IdbParser.WithQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#dml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml(@NotNull IdbParser.DmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#frame_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_clause(@NotNull IdbParser.Frame_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(@NotNull IdbParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(@NotNull IdbParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#exists_window_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists_window_name(@NotNull IdbParser.Exists_window_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#truth_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruth_value(@NotNull IdbParser.Truth_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#column_definition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition_list(@NotNull IdbParser.Column_definition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#simple_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_table(@NotNull IdbParser.Simple_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#table_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_reference(@NotNull IdbParser.Table_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull IdbParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code havingClause}
	 * labeled alternative in {@link IdbParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(@NotNull IdbParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#set_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_qualifier(@NotNull IdbParser.Set_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#order_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_specification(@NotNull IdbParser.Order_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#derived_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_table(@NotNull IdbParser.Derived_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(@NotNull IdbParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#window_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_name(@NotNull IdbParser.Window_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orderClause}
	 * labeled alternative in {@link IdbParser#order_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderClause(@NotNull IdbParser.OrderClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#search_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition(@NotNull IdbParser.Search_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(@NotNull IdbParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#collate_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollate_expression(@NotNull IdbParser.Collate_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#as_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_clause(@NotNull IdbParser.As_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperators(@NotNull IdbParser.OperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#postgis_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostgis_operator(@NotNull IdbParser.Postgis_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#sort_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_specifier(@NotNull IdbParser.Sort_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#joined_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoined_table(@NotNull IdbParser.Joined_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#null_ordering}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_ordering(@NotNull IdbParser.Null_orderingContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#function_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_args(@NotNull IdbParser.Function_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(@NotNull IdbParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#query_rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_rel(@NotNull IdbParser.Query_relContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_literal(@NotNull IdbParser.Numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#fetch_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_clause(@NotNull IdbParser.Fetch_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#table_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_subquery(@NotNull IdbParser.Table_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql(@NotNull IdbParser.SqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(@NotNull IdbParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valuesStmt}
	 * labeled alternative in {@link IdbParser#values_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesStmt(@NotNull IdbParser.ValuesStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#sort_specifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_specifier_list(@NotNull IdbParser.Sort_specifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(@NotNull IdbParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(@NotNull IdbParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#join_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_condition(@NotNull IdbParser.Join_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(@NotNull IdbParser.Expr_listContext ctx);
}