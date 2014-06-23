package com.catt.spring.framework.persistent.db;

import java.util.Map;

public interface SimpleWhere<T> extends DdlKeyWord{
	
	/**
	 * where子句
	 * @param whereClause
	 * @return
	 */
	public SimpleWhere<T> where(String whereClause);

	/**
	 * where子句构建
	 * @param whereClause
	 * @return
	 */

	public SimpleWhere<T> where(Map whereClause);


}
