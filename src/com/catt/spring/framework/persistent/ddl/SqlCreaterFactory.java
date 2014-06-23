package com.catt.spring.framework.persistent.ddl;

import com.catt.spring.framework.persistent.ddl.concreteness.SimpleInsertSqlCreater;
import com.catt.spring.framework.persistent.ddl.concreteness.SimpleQuerySqlCreater;
import com.catt.spring.framework.persistent.ddl.concreteness.SimpleUpdateSqlCreater;

public class SqlCreaterFactory {

	/**
	 * sql语句产生者
	 * @param e
	 * @return
	 */
	public static SqlCreator build(DDL e) {
		SqlCreator sqlCreator = null;
		switch (e) {
			case DELETE:
				sqlCreator = null;
				break;
			case UPDATE:
				sqlCreator =  SimpleUpdateSqlCreater.newSqlCreater();
				break;
			case INSERT:
				sqlCreator = SimpleInsertSqlCreater.newSqlCreater();
				break;
			case SELECT:
				sqlCreator =  SimpleQuerySqlCreater.newSqlCreater();
				break;
		}
		return sqlCreator;

	}
	
}
