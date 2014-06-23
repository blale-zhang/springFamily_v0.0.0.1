package com.catt.spring.framework.Utils;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseUtils {

	
	public static List<String> getTables(Connection connection) throws SQLException{
		DatabaseMetaData  m_DBMetaData = (DatabaseMetaData) connection.getMetaData();
		ResultSet tableRet = m_DBMetaData.getTables(null, "%","",new String[]{"TABLE"});
		
		List<String> tables = new ArrayList<String>();
		while(tableRet.next()){
			tables.add(tableRet.getString("TABLE_NAME"));
		}
		return tables;
	}
	
	/**
	 * 获取表详细描述
	 * @param connection 连接对象
	 * @param tableName 表名
	 * @param catalog 
	 * @param schemaPattern 
	 * @param columnNamePattern 
	 * @return
	 * @throws SQLException
	 */
	public static Map<String,List<ColumnDesc>> getTableDetail(Connection connection,String tableName,String catalog,
			String schemaPattern,String columnNamePattern) throws SQLException{
		DatabaseMetaData  m_DBMetaData = (DatabaseMetaData) connection.getMetaData();
		ResultSet colRet = m_DBMetaData.getColumns(catalog,schemaPattern, tableName,columnNamePattern);
		Map tables = new HashMap();
		List<ColumnDesc>  	columnDesces = new ArrayList<ColumnDesc>(); ;
		tables.put(tableName, null);
		while(colRet.next()) {
			ColumnDesc cd = new ColumnDesc();
			cd.setColumnName(colRet.getString("COLUMN_NAME"));
			cd.setColumnSize(colRet.getInt("COLUMN_SIZE"));
			cd.setColumnType(colRet.getString("TYPE_NAME"));
			cd.setDecimalDigits(colRet.getInt("DECIMAL_DIGITS"));
			cd.setNullAble(colRet.getInt("NULLABLE"));
			columnDesces.add(cd);
		}
		tables.put(tableName, columnDesces);
		return tables;
	}
	
	/**
	 * 获取表详细描述
	 * @param connection 连接对象
	 * @param tableName 表名
	 * @return
	 * @throws SQLException
	 */
	public static Map<String,List<ColumnDesc>>  getTableDetail(Connection connection,String tableName) throws SQLException{
		return getTableDetail(connection,tableName,null,null,"%") ;
	}

	
}
