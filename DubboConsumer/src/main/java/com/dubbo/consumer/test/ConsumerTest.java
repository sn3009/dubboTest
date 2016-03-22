package com.dubbo.consumer.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.test.DubboTestInterface;

public class ConsumerTest {
	public void sayHello(){
		String path = "classpath*:spring/application*.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { path });  
	    context.start();  
	    DubboTestInterface demoServer = (DubboTestInterface) context.getBean("demoService");  
	    System.out.println("client:"+demoServer.sayHello("sunning"));
	}
}
