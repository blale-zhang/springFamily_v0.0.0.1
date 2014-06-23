package com.catt.spring.framework.persistent.ddl.concreteness;

import java.lang.reflect.Field;
import java.util.List;

import com.catt.spring.framework.persistent.annotation.Column;
import com.catt.spring.framework.persistent.annotation.Table;
import com.catt.spring.framework.persistent.ddl.SqlCreator;
import com.catt.spring.mode.Client;

public class SimpleQuerySqlCreater<T> implements SqlCreator<T> {

	@Override
	public String createSql(T t) {

		Class clazz = t.getClass();
		Table table = (Table) clazz.getAnnotation(Table.class);
		StringBuffer sql = new StringBuffer();

		sql.append(" select ");
		System.out.println("table = " + table.name());
		Field[] fields = clazz.getDeclaredFields();
		int i = 0;
		for (Field f : fields) {
			Column a = (Column) f.getAnnotation(Column.class);
			sql.append(a.name());
			if (i + 1 < fields.length) {
				sql.append(",");
			}
			i++;
		}

		sql.append(" from ");
		sql.append(table.name());
		return sql.toString();
	}

	/**
	 * 实例化方法
	 * 
	 * @return
	 */
	public static SimpleQuerySqlCreater newSqlCreater() {
		return new SimpleQuerySqlCreater();
	}

	public static void main(String[] args) {

		SqlCreator isc = new SimpleQuerySqlCreater();
		System.out.println(isc.createSql(new Client()));
		;
	}

	public String createSqlWithCondition(T t, List<String> params) {

		return null;

	};
}
