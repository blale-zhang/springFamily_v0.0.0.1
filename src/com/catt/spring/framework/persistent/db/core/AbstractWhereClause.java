package com.catt.spring.framework.persistent.db.core;

import java.util.Map;
import java.util.Set;
import com.catt.spring.framework.persistent.db.SimpleWhere;

public abstract class AbstractWhereClause<T> extends AbstractSql<T> implements SimpleWhere<T> {

	/**
	 * 构成where子句
	 * @param whereClause
	 * @return
	 */
	public SimpleWhere<T> where(String whereClause){
		
		int start = this.sql.indexOf(WHERE_CLAUSE);
		if( start < 0 ){
			sql.append(WHERE).append(" 1=1 ").append(" and ").append(whereClause);
			return (SimpleWhere<T>)this;
		}
		int end = start + WHERE_CLAUSE.length();
		this.sql.replace(start, end, AND + whereClause);
		
		return (SimpleWhere<T>)this;
	}

	/**
	 * 构成where子句
	 * @param whereClause
	 * @return
	 */
	public SimpleWhere<T> where(Map whereClause){
		
		
		StringBuilder whereClauseStringBuilder = new StringBuilder();
		
		Set<String> keySet = whereClause.keySet();
		for(String key : keySet){
			//TODO 进行条件封装
			whereClauseStringBuilder.append(" and ")
									.append(key).append(" = ")
									.append(whereClause.get(key));
		}
		this.where(whereClauseStringBuilder.toString());
		
		return (SimpleWhere<T>)this;
	}
}
