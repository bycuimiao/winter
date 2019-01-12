package com.winter.listen;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.winter.boot.WinterBoot;

/**
 * web监听.
 *
 * @author cuimiao
 * @since 12 January 2019
 */
public class WebContextLoaderListener implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		WinterBoot winterBoot = new WinterBoot();
		winterBoot.initContext();
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}
}
