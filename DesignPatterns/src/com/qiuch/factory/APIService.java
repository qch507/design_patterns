package com.qiuch.factory;

/**
 * 一般用于APP接口，查询需要显示的信息，节约流量
 * 
 * @author qiuch
 *
 */
public class APIService implements IFactoryService {

	@Override
	public void getUser() {
		System.out.println("userid,name....");
	}

}
