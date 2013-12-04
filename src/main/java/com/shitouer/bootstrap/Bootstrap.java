package com.shitouer.bootstrap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shitouer.common.MyBean;

/**
 * @author fowler
 * @since Nov 14, 2013
 *
 */
public class Bootstrap {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		MyBean  bean = (MyBean) context.getBean("myBean");
		bean.getName();
	}
}
