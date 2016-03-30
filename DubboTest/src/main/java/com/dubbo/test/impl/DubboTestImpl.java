package com.dubbo.test.impl;

import com.dubbotest.service.TestService;
import com.entity.shuttle.test.TestEntity;

public class DubboTestImpl implements TestService {

	public TestEntity sayHello(String name) {
		// TODO Auto-generated method stub
		TestEntity entity = new TestEntity();
		entity.setHelloMessage("hello, " + name + " welcom to dubbo's world");
		System.out.println("server" + entity.getHelloMessage());
		return entity;
	}

}