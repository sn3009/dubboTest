package com.dubbo.test.impl;

import com.dubbo.test.DubboTestInterface;

public class DubboTestImpl implements DubboTestInterface {

	public String sayHello(String name) {
		// TODO Auto-generated method stub
		String retStr = "hello, " + name + " welcom to dubbo's world";
		System.out.println(retStr);
		return retStr;
	}

}