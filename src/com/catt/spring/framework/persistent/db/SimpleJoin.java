package com.catt.spring.framework.persistent.db;

/**
 * 连接子句
 * @author Thinkpad
 *
 * @param <T>
 */
public interface SimpleJoin<T> extends SimpleWhere<T>{

	/**
	 * 连接
	 * @param joinClause
	 * @return
	 */
	public SimpleJoin<T> join(String joinClause);
	
	/**
	 * 左连接
	 * @param joinClause
	 * @return
	 */
	public SimpleJoin<T> leftJoin(String joinClause);
	
	/**
	 * 右连接
	 * @param joinClause
	 * @return
	 */
	public SimpleJoin<T> rightJoin(String joinClause);
	
	/**
	 * 外连接
	 * @param joinClause
	 * @return
	 */
	public SimpleJoin<T> outerJoin(String joinClause);
	
	/**
	 * 连接条件
	 * @param joinCondition
	 * @return
	 */
	public SimpleJoin<T> on(String joinCondition);

}
