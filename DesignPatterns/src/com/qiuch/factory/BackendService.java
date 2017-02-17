package com.qiuch.factory;

/**
 * 一般用于后台，查询完整的信息
 * 
 * @author qiuch
 *
 */
public class BackendService implements IFactoryService {

	@Override
	public void getUser() {
		System.out.println("userid,name,gender,age,phone....");
	}

}
