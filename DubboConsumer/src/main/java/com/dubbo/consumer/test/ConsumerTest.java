package com.dubbo.consumer.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbotest.service.TestService;
import com.entity.shuttle.test.TestEntity;

public class ConsumerTest {
	public void sayHello(){
		String path = "classpath*:spring/application*.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { path });  
	    context.start();  
	    TestService demoServer = (TestService) context.getBean("demoService");  
	    TestEntity entity = demoServer.sayHello("sunning");
	    System.out.println("client:" + entity.getHelloMessage());
	}
}
