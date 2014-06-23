package com.catt.test.jdbcTemplate;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.catt.spring.dao.BaseDao;
import com.catt.spring.mode.Client;
import com.catt.test.BaseTest;

public class BaseDaoTest extends BaseTest {

	@Autowired
	private BaseDao baseDao ;
	
	/*@Before
	public void getBean() {
		baseDao = (BaseDao)applicationContext.getBean("baseDao");
	}*/

	@Test
	public void testQuery() {
		List list = baseDao.getJdbcTemplate().queryForList("select * from User ");
		System.out.println(list);
		
		assert list.size() > 0;
	}
	
	@Test
	public void getTableMetaData(){
		DatabaseMetaData m_DBMetaData;
		try {
			m_DBMetaData = (DatabaseMetaData) baseDao.getJdbcTemplate().getDataSource().getConnection().getMetaData();
			ResultSet tableRet = m_DBMetaData.getTables(null, "%","",new String[]{"TABLE"});
			
			String columnName; 
			String columnType; 
			ResultSet colRet = m_DBMetaData.getColumns(null,"%", "java_class","%"); 
			while(colRet.next()) { 
				columnName = colRet.getString("COLUMN_NAME"); 
				columnType = colRet.getString("TYPE_NAME"); 
				int datasize = colRet.getInt("COLUMN_SIZE"); 
				int digits = colRet.getInt("DECIMAL_DIGITS"); 
				int nullable = colRet.getInt("NULLABLE"); 
				System.out.println(columnName+" "+columnType+" "+datasize+" "+digits+" "+ 
				nullable); 
			}
			while(tableRet.next()){
				System.out.println(tableRet.getString("TABLE_NAME"));
				ResultSet columnRet = m_DBMetaData.getColumns(null, "%", tableRet.getString("TABLE_NAME"), "");
				while(columnRet.next()){
					System.out.println(columnRet.getString("COLUMN_NAME"));
					
					//System.out.println(columnRet.getString("COLUMN_TYPE"));
				}
			}
			
			/*
			while(ColumnPrivilegesRet.next()){
				System.out.println(ColumnPrivilegesRet.getString("COLUMN_NAME"));
				//System.out.println(columnRet.getString("COLUMN_TYPE"));
			}*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	
	
	@Test
	public void testBaseQuery() {
		final Client c = new Client();
		
		List<String> params = new ArrayList();
//		List list = baseDao.query(c , params);
		
//		assert list.size() > 0;
	}
	
	

}
