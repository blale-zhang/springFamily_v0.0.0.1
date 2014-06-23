package com.catt.spring.framework.persistent.db;

import com.catt.spring.framework.persistent.db.core.AbstractSelectClause;

public class JoinClauseTest<T> extends AbstractSelectClause<T> implements SimpleSelect<T> {
	
	public static void main(String[] args) {
		JoinClauseTest ajc = new JoinClauseTest();
		
//		ajc.join(" table_b ");
		ajc.select(" a.column, a.id, c.id, c.name ").from(" table_a a ");
		ajc.join(" table_c c ").on(" c.id = a.id ");
		ajc.where(" c.id = 1");
		ajc.orderBy(" a.id ");
		ajc.showSql();
	}

	public  void showSql(){
		System.out.println(getSql());
	}
}
