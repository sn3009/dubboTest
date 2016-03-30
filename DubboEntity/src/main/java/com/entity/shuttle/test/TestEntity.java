package com.entity.shuttle.test;

import java.io.Serializable;

public class TestEntity implements Serializable {
	
	public String helloMessage;

	public String getHelloMessage() {
		return helloMessage;
	}

	public void setHelloMessage(String helloMessage) {
		this.helloMessage = "hello," + helloMessage;
	}
}
