package com.catt.spring.framework.persistent.ddl.concreteness;

import java.lang.reflect.Field;
import java.util.List;

import com.catt.spring.framework.persistent.annotation.Column;
import com.catt.spring.framework.persistent.annotation.Table;
import com.catt.spring.framework.persistent.ddl.SqlCreator;
import com.catt.spring.mode.Client;

public class SimpleUpdateSqlCreater<T> implements SqlCreator<T> {

	public String createSql(T t) {

		Class clazz = t.getClass();
		Table table = (Table) clazz.getAnnotation(Table.class);
		StringBuffer update = new StringBuffer();
		StringBuffer values = new StringBuffer();
		update.append(" update  ");
		System.out.println("table = " + table.name());
		update.append(table.name() + " set ");
		Field[] fields = clazz.getDeclaredFields();
		int i = 0;
		for (Field f : fields) {
			Column a = (Column) f.getAnnotation(Column.class);
			update.append(a.name() + " = ? ");
			if (i + 1 < fields.length) {
				update.append(",");
			}
			i++;
		}
		update.append(" ");
		return update.toString();
	}

	/**
	 * 实例化方法
	 * @return
	 */
	public static SimpleUpdateSqlCreater newSqlCreater(){
		return new SimpleUpdateSqlCreater();
	}
	
	public static void main(String[] args) {

		SqlCreator isc = new SimpleUpdateSqlCreater();
		System.out.println(isc.createSql(new Client()));
	}
	
	public String createSqlWithCondition(T t, List<String> params) {
		String sql = this.createSql(t);
		StringBuffer sb = new StringBuffer();
//		sb.
		
		return null;
		
	};

}
