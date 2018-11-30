package org.apache.dubbo.demo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.dubbo.config.annotation.Reference;

import org.apache.dubbo.demo.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:dubbo-demo-consumer.xml")
public class Consumer {
	
	@Reference(loadbalance="roundrobin")
	DemoService demoService;
	
	@Test
	public void test() {
		// 调用方法
		String hello = demoService.sayHello("world");
		// 显示结果
		System.out.println(hello);
	}
	
	
//	@Test
//	public void test() {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-demo-consumer.xml"});
//        context.start();
//        // 获取bean对象
//        DemoService demoService = (DemoService)context.getBean("demoService");
//        // 调用方法
//        String hello = demoService.sayHello("world");
//        // 显示结果
//        System.out.println(hello);
//    }
	
}