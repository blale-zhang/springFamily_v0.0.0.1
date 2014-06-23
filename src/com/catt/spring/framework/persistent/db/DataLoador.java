package com.catt.spring.framework.persistent.db;

import java.sql.ResultSet;

public interface DataLoador<T> {
	
	public void loadData(T t, ResultSet rs);
	

}
