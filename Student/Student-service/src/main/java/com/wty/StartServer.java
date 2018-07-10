package com.wty;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartServer {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("dubbo-provider.xml");
		context.start();
		System.in.read();
	}
}
