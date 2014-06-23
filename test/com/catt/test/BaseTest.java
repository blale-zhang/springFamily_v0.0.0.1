package com.catt.test;

import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
/** 
 * 定义默认的Spring Context的主文件路径.以及你需要测试的配置文件 
 */
@ContextConfiguration(locations = { "classpath:applicationContext-dao.xml",
		"classpath:applicationContext.xml",
		"classpath:applicationContext-service.xml" })
public class BaseTest implements ApplicationContextAware {

	protected ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		this.applicationContext = arg0;

	}

}
