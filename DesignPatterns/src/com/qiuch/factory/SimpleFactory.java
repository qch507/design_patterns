package com.qiuch.factory;
/**
 * 普通工厂，用类型区分不同实现，很少这么做
 * @author qiuch
 *
 */
public class SimpleFactory {
	public IFactoryService getFactory(String serviceType) {
		if ("backend".equals(serviceType))
			return new BackendService();

		if ("api".equals(serviceType))
			return new APIService();

		System.out.println("type error!");
		return null;
	}
}
