package com.catt.spring.framework.persistent.ddl;

import java.util.List;

public interface SqlCreator<T> {
	
	/**
	 * 产生sql
	 * @param t
	 * @return
	 */
	String createSql(T t);
	
	/**
	 * 产生带条件的sql
	 * @param t
	 * @param param 
	 * @return
	 */
	String createSqlWithCondition(T t, List<String> param);

}
