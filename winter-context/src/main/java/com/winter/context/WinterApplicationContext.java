package com.winter.context;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.winter.bean.WinterBean;

/**
 * 上下文，缓存被装载的bean(目前还不是单例).
 *
 * @author cuimiao
 * @since 12 January 2019
 */
public class WinterApplicationContext {

	private Map<String,WinterBean> beanMap = new ConcurrentHashMap<>();

	public void add(WinterBean bean){
		beanMap.putIfAbsent(bean.getId(),bean);
	}

	public Object getBean(String id){
		//return beanMap.get(id);
		WinterBean bean = beanMap.get(id);
		try {
			Class clazz = Class.forName(bean.getClassName());
			return clazz.newInstance();
		}catch (Exception e){
			System.out.println("getBean error");
		}
		return null;
	}
}
