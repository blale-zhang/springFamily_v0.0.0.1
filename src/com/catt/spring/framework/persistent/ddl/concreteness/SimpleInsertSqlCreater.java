package com.catt.spring.framework.persistent.ddl.concreteness;

import java.lang.reflect.Field;
import java.util.List;

import com.catt.spring.framework.persistent.annotation.Column;
import com.catt.spring.framework.persistent.annotation.Table;
import com.catt.spring.framework.persistent.ddl.DDL;
import com.catt.spring.framework.persistent.ddl.SqlCreaterFactory;
import com.catt.spring.framework.persistent.ddl.SqlCreator;
import com.catt.spring.mode.Client;

public class SimpleInsertSqlCreater<T> implements SqlCreator<T> {

	public String createSql(T t) {

		Class clazz = t.getClass();
		Table table = (Table) clazz.getAnnotation(Table.class);
		StringBuffer insert = new StringBuffer();
		StringBuffer values = new StringBuffer();
		insert.append(" insert  ");
		System.out.println("table = " + table.name());
		insert.append(table.name() + "(");
		Field[] fields = clazz.getDeclaredFields();
		int i = 0;
		for (Field f : fields) {
			Column a = (Column) f.getAnnotation(Column.class);
			insert.append(a.name());
			values.append("?");
			if (i + 1 < fields.length) {
				insert.append(",");
				values.append(",");
			}
			i++;
		}

		insert.append(") values ( ");
		insert.append(values);
		insert.append(")");
		return insert.toString();
	}

	/**
	 * 实例化方法
	 * 
	 * @return
	 */
	public static SimpleInsertSqlCreater newSqlCreater() {
		return new SimpleInsertSqlCreater();
	}

	public static void main(String[] args) {

		SqlCreator isc = SqlCreaterFactory.build(DDL.INSERT);
		System.out.println(isc.createSql(new Client()));
		;
	}

	public String createSqlWithCondition(T t , List<String> params) {

		
		return null;

	};

}
