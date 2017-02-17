package com.qiuch.factory;

/**
 * 抽象工厂，避免扩展时修改原有工厂类,新增抽象工厂实现和原对象接口实现即可实现扩展
 * 
 * 比较适用于当需要创建的对象是一系列相互关联或相互依赖的对象集合时
 * 
 * 当新增对象与原有对象集合无关联时，则牵涉的修改更多
 * 
 * @author qiuch
 *
 */
public interface IAbstractFactory {
	public IFactoryService getFactory();
}
