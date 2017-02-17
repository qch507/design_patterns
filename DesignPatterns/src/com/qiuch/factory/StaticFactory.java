package com.qiuch.factory;

/**
 * 静态工厂，频繁使用或者大对象的情况下使用
 * 可配合单例模式一起使用
 * 
 * @author qiuch
 *
 */
public class StaticFactory {
	public static BackendService getBackendService() {
		return new BackendService();
	}

	public static APIService getAPIService() {
		return new APIService();
	}
}
