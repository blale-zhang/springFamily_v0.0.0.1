package com.catt.spring.framework.persistent.db.core;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.catt.spring.framework.persistent.annotation.Column;
import com.catt.spring.framework.persistent.db.DataLoador;
import com.catt.spring.framework.persistent.db.SimpleSelect;
import com.catt.spring.mode.Client;

public class SimpleDataLoador<T> implements DataLoador<T>{

	public SimpleDataLoador() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 */
	public void loadData(T t, ResultSet rs) {
		T e = this.newEntityInstance(t);
		
		entityWraper.wrap(t);
		try {
			ResultSetMetaData rsmd =  rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			
			
			
			
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	private T newEntityInstance(T t){
		T entity = null;
		try {
			entity = (T)t.getClass().newInstance();
			
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entity;
	}
	
	public void setValue(T t ,String key, Object val){
		entityWraper.wrap(t);
		entityWraper.setValue(key, val);
		Client e = (Client)entityWraper.deWrap();
		System.out.println(e.getClientName());
	}
	
	public static void main(String[] args) {
		Client c = new Client();
		new SimpleDataLoador<Client>().setValue(c, "client_name", "clientName");
	}
	
	SimpleSelect<T>  entityWraper = new SimpleSelect<T>(){
		
		T t;
		@Override
		public void setValue(String key, Object val) {
			
			try {
//				Field[] fields = 	t.getClass().getFields();
				Field[] fields = 	t.getClass().getDeclaredFields();

				for(Field field : fields){
					Column a = (Column) field.getAnnotation(Column.class);
					if(a.name().equals(key)){
						field.setAccessible(true);
						field.set(t, val);
						field.setAccessible(false);
						break;
					}
				}
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		@Override
		public void wrap(T t) {
			this.t = t;
		}
		
		public T deWrap(){
			return t;
		}
		
		@Override
		public void setValues(Map e) {
			Set<String> keySet = e.keySet();
			for(String key : keySet){
				setValue(key, e.get(key));
			}
		}

		@Override
		public SimpleSelect<T> selectColumnsFrom(T t) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public SimpleSelect<T> select(String selectClause) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public SimpleSelect<T> select(String[] columns) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public SimpleSelect<T> from(T t) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public SimpleSelect<T> from(String tableName) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public SimpleSelect<T> join(String tableName, Class clazz) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public SimpleSelect<T> where(String whereClause) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public SimpleSelect<T> where(Map whereClause) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public SimpleSelect<T> groupBy(String groupByClause) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public SimpleSelect<T> groupBy(String[] groupBy) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public SimpleSelect<T> orderBy(String orderByClause) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public SimpleSelect<T> having(String tableName) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<T> fetchData() {
			// TODO Auto-generated method stub
			return null;
		}
	};
}
