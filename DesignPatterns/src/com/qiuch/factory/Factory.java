package com.qiuch.factory;

/**
 * 多个工厂，不使用类型，避免类型出错
 * 
 * @author qiuch
 *
 */
public class Factory {
	public BackendService getBackendService() {
		return new BackendService();
	}

	public APIService getAPIService() {
		return new APIService();
	}
}
