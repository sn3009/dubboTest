package com.dubbo.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServerRun {
	public static void main(String [] args) throws IOException{
		String path = "classpath*:application*.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { path });  
        context.start();  
        System.out.println("按任意键退出");  
        System.in.read(); 
	}
}
