package com.catt.spring.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.catt.spring.framework.persistent.ddl.DDL;
import com.catt.spring.framework.persistent.ddl.SqlCreaterFactory;
import com.catt.spring.framework.persistent.ddl.SqlCreator;
import com.catt.spring.mode.Client;

@Repository
public class BaseDao<T> extends NamedParameterJdbcDaoSupport {

	@Autowired
	protected JdbcTemplate jdbcTemplate;

	
	@SuppressWarnings("unchecked")
	public List<T> query(T t){
		
		SqlCreator sqlCreator = SqlCreaterFactory.build(DDL.SELECT);
		List<T> list = (List<T>)getNamedParameterJdbcTemplate().query(sqlCreator.createSql(t),
				ParameterizedBeanPropertyRowMapper.newInstance(t.getClass()));
		return list;
	}
	
	public List<T> query(T t , String querySql, List<String> params) {
		// TODO Auto-generated method stub
		return null;
	}

	public Client getOne(Object ...bac) {
		// TODO Auto-generated method stub
		
		return null;
	}
	
	
}
