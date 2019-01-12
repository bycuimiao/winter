package com.bycuimiao.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.winter.boot.WinterBoot;
import com.winter.context.WinterApplicationContext;

/**
 * 启动加载类.
 *
 * @author cuimiao
 * @since 12 January 2019
 */
public class LoaderServlet extends HttpServlet {
	private static WinterApplicationContext context=null;

	@Override
	public void init() throws ServletException {

		System.out.println("初始化servlet");

		WinterBoot winterBoot = new WinterBoot();
		winterBoot.initContext();
		context = winterBoot.winterApplicationContext;
	}

	public static Object getBean(String beanName){
		Object bean=null;

		bean=context.getBean(beanName);

		return bean;
	}


	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
}
