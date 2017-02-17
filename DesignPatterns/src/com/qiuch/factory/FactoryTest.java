package com.qiuch.factory;

/**
 * 关于在Service层解耦，还是DAO层解耦 个人认为如果用MyBatis的情况下，直接在service层解耦
 * 
 * SSH年代，Hibernate dao层解耦是封装crud，返回不同对象
 * 
 * Service 的解耦针对PO、DO、BO、DTO等（不同业务场景下的调用）
 * 
 * @author qiuch
 *
 */
public class FactoryTest {
	public static void main(String[] args) {
		// 简单工厂
		SimpleFactory simpleFactory = new SimpleFactory();
		simpleFactory.getFactory("backend").getUser();
		simpleFactory.getFactory("api").getUser();
		// simpleFactory.getFactory("other").getUser();

		// 多个工厂
		Factory factory = new Factory();
		factory.getBackendService().getUser();
		factory.getAPIService().getUser();

		// 静态工厂
		StaticFactory.getBackendService().getUser();
		StaticFactory.getAPIService().getUser();

		// 抽象工厂
		testAbstractFactory(new BackendServiceFactory());
		testAbstractFactory(new APIServiceFactory());
	}

	/**
	 * 新增对象类型时，调用处可以不用修改
	 * 
	 * @param abstractFactory
	 */
	public static void testAbstractFactory(IAbstractFactory abstractFactory) {
		abstractFactory.getFactory().getUser();
	}

}
