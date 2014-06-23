package com.catt.spring.framework.persistent.db.core;

import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.catt.spring.framework.persistent.db.DatabaseOperation;
import com.catt.spring.framework.persistent.db.SimpleSelect;
import com.catt.spring.framework.persistent.ddl.DDL;
import com.catt.spring.framework.persistent.ddl.SqlCreaterFactory;
import com.catt.spring.framework.persistent.ddl.SqlCreator;

public class SimpleEntityWraper<T> extends AbstractEntityWraper<T> implements SimpleSelect<T> {

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
		this.sql = new StringBuffer(sqlCreator.createSql(t));
		return (SimpleSelect<T>) this;
	}

	@Override
	public SimpleSelect<T> select(String selectClause) {
		return clause( selectClause, "{SELECT_CLAUSE}", "{SELECT_CLAUSE}");
	}

	@Override
	public SimpleSelect<T> select(String[] columns) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SimpleSelect<T> from(T t) {
		SqlCreator sqlCreator = SqlCreaterFactory.build(DDL.SELECT);
		this.sql = new StringBuffer(sqlCreator.createSql(t));
		return (SimpleSelect<T>) this;
	}

	@Override
	public SimpleSelect<T> from(String tableName) {
		return clause( tableName, "{TABLE_NAME}", "{TABLE_NAME}");
	}

	@Override
	public SimpleSelect<T> join(String tableName, Class clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SimpleSelect<T> groupBy(String groupBy) {
		return clause( groupBy, "{GROUP_BY}", "group by");
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
	public SimpleSelect<T> groupBy(String[] groupBy) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> fetchData() {
		System.out.println(this.sql);
		return null;
	}

	@Override
	public DatabaseOperation<T> leftJoin(String leftJoinClause) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DatabaseOperation<T> on(String joinCondition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DatabaseOperation<T> join(String joinClause) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DatabaseOperation<T> rightJoin(String joinClause) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DatabaseOperation<T> outerJoin(String joinClause) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SimpleSelect<T> select(Map columns) {
		// TODO Auto-generated method stub
		return null;
	}

}
