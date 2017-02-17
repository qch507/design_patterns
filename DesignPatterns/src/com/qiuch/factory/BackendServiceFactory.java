package com.qiuch.factory;

/**
 * 抽象工厂实现
 * 
 * @author qiuch
 *
 */
public class BackendServiceFactory implements IAbstractFactory {

	@Override
	public IFactoryService getFactory() {
		return new BackendService();
	}

}
