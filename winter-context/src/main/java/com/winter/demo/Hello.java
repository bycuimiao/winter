package com.winter.demo;

import com.winter.boot.WinterBoot;

/**
 * hello winter.
 *
 * @author cuimiao
 * @since 12 January 2019
 */
public class Hello {
	public static void main(String[] args) {
		WinterBoot winterBoot = new WinterBoot();
		winterBoot.initContext();
		HelloService helloService = (HelloService)winterBoot.getContext().getBean("hello");
		helloService.hello();
	}
}
