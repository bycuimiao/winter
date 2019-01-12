package com.bycuimiao.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bycuimiao.demo.HelloService;

/**
 * hello demo.
 *
 * @author cuimiao
 * @since 12 January 2019
 */
public class ServletDemo extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HelloService helloService = (HelloService) LoaderServlet.getBean("helloService");
		helloService.hello();
	}
}
