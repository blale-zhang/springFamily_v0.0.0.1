package com.catt.spring.framework.persistent.db.core;

import com.catt.spring.framework.persistent.db.SimpleJoin;

public class AbstractJoinClause<T> extends  AbstractWhereClause<T> implements SimpleJoin<T> {

	
	/**
	 * 连接
	 * 
	 * @param joinClause
	 * @return
	 */
	public SimpleJoin<T> join(String joinClause) {
		clause(JOIN, JOIN_CLAUSE, JOIN_CLAUSE);
		return clause(joinClause, JOIN_CONDITION, JOIN_CONDITION);
	}

	/**
	 * 左连接
	 * 
	 * @param joinClause
	 * @return
	 */
	public SimpleJoin<T> leftJoin(String joinClause) {
		
		clause(LEFT_JOIN, LEFT_JOIN_CLAUSE, LEFT_JOIN_CLAUSE);
		return clause(joinClause, JOIN_CONDITION, JOIN_CONDITION);
	}

	/**
	 * 右连接
	 * 
	 * @param joinClause
	 * @return
	 */
	public SimpleJoin<T> rightJoin(String joinClause) {
		
		clause(RIGHT_JOIN, RIGHT_JOIN_CLAUSE, RIGHT_JOIN_CLAUSE);
		return clause(joinClause, JOIN_CONDITION, JOIN_CONDITION);
	}

	/**
	 * 外连接
	 * 
	 * @param joinClause
	 * @return
	 */
	public SimpleJoin<T> outerJoin(String joinClause) {
		
		
		clause(OUTER_JOIN, OUTER_JOIN_CLAUSE, OUTER_JOIN_CLAUSE);
		return clause(joinClause, JOIN_CONDITION, JOIN_CONDITION);
	}

	/**
	 * 连接条件
	 * 
	 * @param joinCondition
	 * @return
	 */
	public SimpleJoin<T> on(String joinCondition) {
		
		clause(ON, ON_CLAUSE, ON_CLAUSE);
		return clause(joinCondition, ON_CONDITION, ON_CONDITION);
	}

	
	public SimpleJoin<T> join(String joinCondition,Class clazz) {
		
		return (SimpleJoin<T>) this;
	}

	public void setSql(StringBuffer sql) {
		this.sql = sql;
	}

	public StringBuffer getSql() {
		return sql;
	}
}
