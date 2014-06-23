package com.catt.spring.framework.persistent.db;

import java.util.Map;

/**
 * 实体包装
 * @author Thinkpad
 *
 */
public interface SimpleSelect<T> extends SimpleJoin<T>{

	/**
	 * 设置属性值
	 * @param propName 属性名(这里是表列名)
	 * @param value 属性值
	 */
	public void setValue(String propName,Object value);
	
	/**
	 * 包装
	 * @param t
	 */
	public void wrap(T t);
	
	/**
	 * 解包装
	 * @return
	 */
	public T deWrap();
	
	/**
	 *  设置属性值
	 * 
	 * 
	 * @param e key,value
	 */
	public void setValues(Map e);
	
	/**
	 * 简单的查询语句 如：select t.a,t.b,t.c from table t
	 * @param t 实体
	 * @return SimpleSelect<T> 
	 */
	public SimpleSelect<T> selectColumnsFrom(T t);
	
	/**
	 * 查询选择列
	 * @param selectClause 
	 * @return
	 */
	public SimpleSelect<T> select(String selectClause);

	/**
	 * 查询选择列
	 * @param columns
	 * @return
	 */
	public SimpleSelect<T> select(String[] columns);

	/**
	 * 查询选择列
	 * @param columns
	 * @return
	 */
	public SimpleSelect<T> select(Map columns);
	
	/**
	 * 简单查询
	 * @param t
	 * @return
	 */
	public SimpleSelect<T> from(T t);
	
	/**
	 * 简单查询
	 * @param tableName
	 * @return
	 */
	public SimpleSelect<T> from(String tableName);
	
	public SimpleSelect<T> join(String tableName, Class clazz);
	
	/**
	 * group by 子句
	 * @param groupByClause 子句
	 * @return
	 */
	public SimpleSelect<T> groupBy(String groupByClause);
	
	/**
	 * @param groupBy 字符串数组{a,b,c},
	 * 最终以 a,b,c 接上sql 如:select  * from a group by a,b,c
	 * @return 实体包装
	 */
	public SimpleSelect<T> groupBy(String[] groupBy);
	
	/**
	 * order by 子句
	 * @param orderByClause
	 * @return
	 */
	public SimpleSelect<T> orderBy(String orderByClause);
	
	/**
	 * 二次筛选
	 * @param tableName
	 * @return
	 */
	public SimpleSelect<T> having(String tableName);
	

}
