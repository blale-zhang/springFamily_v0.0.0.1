package com.catt.spring.framework.persistent.db;

import java.util.List;

/**
 * 数据库操作
 * @author Thinkpad
 *
 * @param <T>
 */
public interface DatabaseOperation<T> extends SimpleSelect<T>{

	/**
	 * 抓取数据
	 * @return
	 */
	public List<T> fetch();
	
	/**
	 * 更新
	 * @return
	 */
	public int upgrad();
	
	/**
	 * 删除
	 * @return
	 */
	public int remove();
	
	/**
	 * 新增
	 * @return
	 */
	public int add();
}
