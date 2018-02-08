package com.ricky.codelab.dubbo.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Dubbo provider
 *
 */
public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		context.start();
		
		System.out.println("Dubbo provider start...");
		
		try {
			System.in.read();	// 按任意键退出
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}
}
