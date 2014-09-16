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
	 * Visit a parse tree produced by the {@code scalarSubquery}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarSubquery(@NotNull IdbParser.ScalarSubqueryContext ctx);
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
	 * Visit a parse tree produced by {@link IdbParser#query_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_expression(@NotNull IdbParser.Query_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#cast_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_expr(@NotNull IdbParser.Cast_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#scalar_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_subquery(@NotNull IdbParser.Scalar_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowClause}
	 * labeled alternative in {@link IdbParser#window_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowClause(@NotNull IdbParser.WindowClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code castOpExpr}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastOpExpr(@NotNull IdbParser.CastOpExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#offset_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset_clause(@NotNull IdbParser.Offset_clauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(@NotNull IdbParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#pattern_matcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_matcher(@NotNull IdbParser.Pattern_matcherContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#derived_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_column_list(@NotNull IdbParser.Derived_column_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tupleExpr}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleExpr(@NotNull IdbParser.TupleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantValue}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantValue(@NotNull IdbParser.ConstantValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#window_specifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_specifier_list(@NotNull IdbParser.Window_specifier_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessOrGreatThanExpr}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessOrGreatThanExpr(@NotNull IdbParser.LessOrGreatThanExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#primary_datetime_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_datetime_field(@NotNull IdbParser.Primary_datetime_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#window_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_definition(@NotNull IdbParser.Window_definitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPredicate(@NotNull IdbParser.InPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#time_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_literal(@NotNull IdbParser.Time_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#query_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_specification(@NotNull IdbParser.Query_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause(@NotNull IdbParser.Over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caretExpr}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaretExpr(@NotNull IdbParser.CaretExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#correlation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorrelation_name(@NotNull IdbParser.Correlation_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(@NotNull IdbParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition(@NotNull IdbParser.Column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#limit_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_clause(@NotNull IdbParser.Limit_clauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayConstructor}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayConstructor(@NotNull IdbParser.ArrayConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#nonreserved_keywords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonreserved_keywords(@NotNull IdbParser.Nonreserved_keywordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull IdbParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#exists_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists_predicate(@NotNull IdbParser.Exists_predicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableStmt}
	 * labeled alternative in {@link IdbParser#table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableStmt(@NotNull IdbParser.TableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#named_columns_join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_columns_join(@NotNull IdbParser.Named_columns_joinContext ctx);
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
	 * Visit a parse tree produced by the {@code nullOrNotExpr}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullOrNotExpr(@NotNull IdbParser.NullOrNotExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(@NotNull IdbParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#exists_window_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists_window_name(@NotNull IdbParser.Exists_window_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code castExpr}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpr(@NotNull IdbParser.CastExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#simple_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_table(@NotNull IdbParser.Simple_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#bit_position_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_position_function(@NotNull IdbParser.Bit_position_functionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOtherOp}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOtherOp(@NotNull IdbParser.UnaryOtherOpContext ctx);
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
	 * Visit a parse tree produced by {@link IdbParser#derived_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_table(@NotNull IdbParser.Derived_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#substring_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstring_function(@NotNull IdbParser.Substring_functionContext ctx);
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
	 * Visit a parse tree produced by {@link IdbParser#unsigned_numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_numeric_literal(@NotNull IdbParser.Unsigned_numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOpExpr}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOpExpr(@NotNull IdbParser.UnaryOpExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#extended_datetime_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtended_datetime_field(@NotNull IdbParser.Extended_datetime_fieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(@NotNull IdbParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#date_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_literal(@NotNull IdbParser.Date_literalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(@NotNull IdbParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code overlapsExpr}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverlapsExpr(@NotNull IdbParser.OverlapsExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#joined_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoined_table(@NotNull IdbParser.Joined_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#function_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_args(@NotNull IdbParser.Function_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#trim_operands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim_operands(@NotNull IdbParser.Trim_operandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#fetch_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_clause(@NotNull IdbParser.Fetch_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#interval_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_literal(@NotNull IdbParser.Interval_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(@NotNull IdbParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql(@NotNull IdbParser.SqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#table_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_subquery(@NotNull IdbParser.Table_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructor(@NotNull IdbParser.RowConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code otherOp}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherOp(@NotNull IdbParser.OtherOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#row_constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_constructor(@NotNull IdbParser.Row_constructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#value_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_function(@NotNull IdbParser.Value_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#sort_specifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_specifier_list(@NotNull IdbParser.Sort_specifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#time_zone_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_zone_field(@NotNull IdbParser.Time_zone_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(@NotNull IdbParser.Expr_listContext ctx);
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
	 * Visit a parse tree produced by {@link IdbParser#count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCount(@NotNull IdbParser.CountContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#select_sublist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_sublist(@NotNull IdbParser.Select_sublistContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#derived_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_column(@NotNull IdbParser.Derived_columnContext ctx);
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
	 * Visit a parse tree produced by {@link IdbParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(@NotNull IdbParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#trim_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim_function(@NotNull IdbParser.Trim_functionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenPredicate(@NotNull IdbParser.BetweenPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(@NotNull IdbParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#array_constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_constructor(@NotNull IdbParser.Array_constructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#table_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name_list(@NotNull IdbParser.Table_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#datetime_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_literal(@NotNull IdbParser.Datetime_literalContext ctx);
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
	 * Visit a parse tree produced by {@link IdbParser#tuple_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_value(@NotNull IdbParser.Tuple_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#join_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_column_list(@NotNull IdbParser.Join_column_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpr(@NotNull IdbParser.FunctionExprContext ctx);
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
	 * Visit a parse tree produced by {@link IdbParser#for_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_clause(@NotNull IdbParser.For_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#trim_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim_specification(@NotNull IdbParser.Trim_specificationContext ctx);
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
	 * Visit a parse tree produced by the {@code valueFunction}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueFunction(@NotNull IdbParser.ValueFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isDistinctExpr}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsDistinctExpr(@NotNull IdbParser.IsDistinctExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#frame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame(@NotNull IdbParser.FrameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(@NotNull IdbParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseWhen}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseWhen(@NotNull IdbParser.CaseWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#any_other_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_other_operator(@NotNull IdbParser.Any_other_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#outer_join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuter_join_type(@NotNull IdbParser.Outer_join_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code groupClause}
	 * labeled alternative in {@link IdbParser#group_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupClause(@NotNull IdbParser.GroupClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#timestamp_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp_literal(@NotNull IdbParser.Timestamp_literalContext ctx);
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
	 * Visit a parse tree produced by the {@code mulDivModExpr}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivModExpr(@NotNull IdbParser.MulDivModExprContext ctx);
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
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(@NotNull IdbParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(@NotNull IdbParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(@NotNull IdbParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#data_type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type_list(@NotNull IdbParser.Data_type_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusSubExpr}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusSubExpr(@NotNull IdbParser.PlusSubExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#column_definition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition_list(@NotNull IdbParser.Column_definition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#interval_precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_precision(@NotNull IdbParser.Interval_precisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#table_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_reference(@NotNull IdbParser.Table_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#extract_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract_field(@NotNull IdbParser.Extract_fieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCollate}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCollate(@NotNull IdbParser.ExprCollateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikePredicate(@NotNull IdbParser.LikePredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#order_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_specification(@NotNull IdbParser.Order_specificationContext ctx);
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
	 * Visit a parse tree produced by the {@code parenthesizedExpr}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpr(@NotNull IdbParser.ParenthesizedExprContext ctx);
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
	 * Visit a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(@NotNull IdbParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#postgis_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostgis_operator(@NotNull IdbParser.Postgis_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#extract_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract_function(@NotNull IdbParser.Extract_functionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeComparePredicate}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeComparePredicate(@NotNull IdbParser.TypeComparePredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#sort_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_specifier(@NotNull IdbParser.Sort_specifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnExpr}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExpr(@NotNull IdbParser.ColumnExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#null_ordering}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_ordering(@NotNull IdbParser.Null_orderingContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#interval_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_qualifier(@NotNull IdbParser.Interval_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#query_rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_rel(@NotNull IdbParser.Query_relContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(@NotNull IdbParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#case_when}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_when(@NotNull IdbParser.Case_whenContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#regex_matcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegex_matcher(@NotNull IdbParser.Regex_matcherContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valuesStmt}
	 * labeled alternative in {@link IdbParser#values_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesStmt(@NotNull IdbParser.ValuesStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(@NotNull IdbParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isExpr}
	 * labeled alternative in {@link IdbParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsExpr(@NotNull IdbParser.IsExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#join_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_condition(@NotNull IdbParser.Join_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdbParser#negativable_matcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativable_matcher(@NotNull IdbParser.Negativable_matcherContext ctx);
}