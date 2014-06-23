package com.catt.spring.framework.persistent.ddl;

public enum DDL_KEY_WORK {

	SELECT("select"),
	FROM("from"),
	TABLE("table"),
	WHERE("where"),
	JOIN("join"),
	LEFT_JOIN("left join"),
	RIGHT_JOIN("right join"),
	GROUP_BY("group by"), 
	ORDER_BY("order by"),
	DESC("desc"),
	ASC("asc"),
	HAVING("having"),
	COUNT("count"),
	SUM("sum"),
	MAX("max"),
	MIN("min"),
	SELECT_CLAUSE("{SELECT_CLAUSE}"),
	FROM_CALUSE("{FROM_CLAUSE}"),
	TABLE_CLAUSE("TABLE_CLAUSE"),
	WHERE_CLAUSE("{WHERE_CLAUSE}"),
	JOIN_CLAUSE("{JOIN_CLAUSE}"),
	LEFT_JOIN_CLAUSE("{LEFT_JOIN_CLAUSE}"),
	RIGHT_JOIN_CLAUSE("{RIGHT_JOIN_CLAUSE}"),
	GROUP_BY_CLAUSE("{GROUP_BY_CLAUSE}"), 
	ORDER_BY_CLAUSE("{ORDER_BY_CLAUSE}"),
	DESC_CLAUSE("{DESC_CLAUSE}"),
	ASC_CLAUSE("{ASC_CLAUSE}"),
	HAVING_CLAUSE("{HAVING_CLAUSE}"),
	COUNT_CLAUSE("{COUNT_CLAUSE}"),
	SUM_CLAUSE("{SUM_CLAUSE}"),
	MAX_CLAUSE("{MAX_CLAUSE}"),
	MIN_CLAUSE("{MIN_CLAUSE}");
	
	DDL_KEY_WORK(String name) {
	}
	
	DDL_KEY_WORK() {
	}
	
	public static void main(String[] args) {
		DDL_KEY_WORK ddl = 	DDL_KEY_WORK.ASC_CLAUSE;
		System.out.println(ddl.ordinal());
	}
}
