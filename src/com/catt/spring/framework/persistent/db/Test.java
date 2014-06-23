package com.catt.spring.framework.persistent.db;

import java.util.HashMap;
import java.util.Map;

import com.catt.spring.framework.persistent.db.core.SimpleEntityWraper;
import com.catt.spring.mode.Client;

public class Test {

	public static void main(String[] args) {
		
		DatabaseOperation entity = new SimpleEntityWraper();
		Map whereClause = new HashMap();
		
		whereClause.put("a.id", "1");
		whereClause.put("b.id", "2");
//		entity.where(whereClause).groupBy(" group by a.id");
		Client c = new Client();
		entity.select("client_name").from("client").where(whereClause);
//									.groupBy("client_name")
//									.orderBy("client_name");
		entity.fetch();
	}
}
