package com.catt.spring.framework.persistent.db.core;

import java.util.Map;
import java.util.Set;

import com.catt.spring.framework.persistent.db.SimpleSelect;
import com.catt.spring.framework.persistent.ddl.DDL;
import com.catt.spring.framework.persistent.ddl.SqlCreaterFactory;
import com.catt.spring.framework.persistent.ddl.SqlCreator;

public class AbstractSelectClause<T> extends AbstractJoinClause<T> implements SimpleSelect<T>{

	@Override
	public void setValue(String propName, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wrap(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T deWrap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setValues(Map e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SimpleSelect<T> selectColumnsFrom(T t) {
		SqlCreator sqlCreator = SqlCreaterFactory.build(DDL.SELECT);
		this.setSql(new StringBuffer(sqlCreator.createSql(t)));
		return (SimpleSelect<T>) this;
	}

	@Override
	public SimpleSelect<T> select(String selectClause) {
		return clause( selectClause, "{SELECT_CLAUSE}", "{SELECT_CLAUSE}");
	}

	@Override
	public SimpleSelect<T> select(String[] columns) {
		StringBuilder selectClause = new StringBuilder();
		for(String clauseItem : columns){
			//TODO 处理尾部逗号
			selectClause.append(clauseItem).append(" as ").append(" \"").append(clauseItem).append("\",");
		}
		return select(selectClause.toString());
	}
	
	@Override
	public SimpleSelect<T> select(Map columns) {
		Set<String> keySet = columns.keySet();
		StringBuilder selectClause = new StringBuilder();
		for(String clauseItem : keySet){
			//TODO 处理尾部逗号
			selectClause.append(clauseItem).append(" as ").append(" \"").append(columns.get(clauseItem)).append("\",");
		}
		return select(selectClause.toString());
	}


	@Override
	public SimpleSelect<T> from(T t) {
		SqlCreator sqlCreator = SqlCreaterFactory.build(DDL.SELECT);
		this.setSql(new StringBuffer(sqlCreator.createSql(t)));
		return (SimpleSelect<T>) this;
	}

	@Override
	public SimpleSelect<T> from(String tableName) {
		return clause( tableName, TABLE_CLAUSE, TABLE_CLAUSE);
	}

	
	@Override
	public SimpleSelect<T> groupBy(String groupBy) {
		
		return clause( groupBy, "{GROUP_BY}", "group by");
	}
	
	@Override
	public SimpleSelect<T> groupBy(String[] groupBy) {
		StringBuilder groupByClause = new StringBuilder();
		for(String clauseItem : groupBy){
			//TODO 处理尾部逗号
			groupByClause.append(clauseItem).append(",");
		}
		return groupBy(groupByClause.toString());
	}

	@Override
	public SimpleSelect<T> orderBy(String orderByClause) {
		
		return clause(orderByClause,"{ORDER_BY_CLAUSE}", "{ORDER_BY_CLAUSE}");
	}
	

	@Override
	public SimpleSelect<T> having(String tableName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SimpleSelect<T> join(String tableName, Class clazz) {
		// TODO Auto-generated method stub
		return null;
	}


}
