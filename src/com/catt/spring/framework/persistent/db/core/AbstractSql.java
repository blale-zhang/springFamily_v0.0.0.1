package com.catt.spring.framework.persistent.db.core;

import org.springframework.util.StringUtils;

import com.catt.spring.framework.persistent.db.DdlKeyWord;
import com.catt.spring.framework.persistent.db.SimpleSelect;

/**
 * 抽象sql
 * @author Thinkpad
 *
 * @param <T>
 */
public abstract class AbstractSql<T> implements DdlKeyWord{

//    StringBuffer sql = new StringBuffer("select {SELECT_CLAUSE} from {TABLE_NAME} where 1=1 {WHERE_CLAUSE} order by {ORDER_BY_CLAUSE}  ");

    
   StringBuffer sql = new StringBuffer(SELECT).append(SELECT_CLAUSE)
    .append(FROM).append(TABLE_CLAUSE)
    .append(LEFT_JOIN_CLAUSE)
    .append(JOIN_CLAUSE)
    .append(RIGHT_JOIN_CLAUSE)
    .append(JOIN_CONDITION)
    .append(ON_CLAUSE)
    .append(ON_CONDITION)
    .append(WHERE).append(" 1=1 ") 
    .append(WHERE_CLAUSE)
    .append(ORDER_BY)//不是必需都要带{};
    .append(ORDER_BY_CLAUSE);
   
	/**
	 * 子句构建
	 * @param clause 子句内容
	 * @param placeholder 占位符
	 * @param clauseName 子名名 如：group by,order by
	 * @return
	 */
	protected SimpleSelect<T> clause(String clause,String placeholder,String clauseName){
		
		int start = this.sql.indexOf(clauseName);
		if( start < 0 || StringUtils.isEmpty(clauseName)){
			this.sql.append(" ").append(clauseName).append(" ").append(clause);
			return (SimpleSelect<T>)this;
		}
		
		int end = start + placeholder.length();
		this.sql.replace(start, end, clause);
		return (SimpleSelect<T>)this;
	}
}
