package cn.serge.test;

import cn.serge.model.*;
import cn.serge.service.ProductService;

import org.springframework.context.*;
import org.springframework.context.support.*;
public class TestSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String("applicationContext.xml"));
		Category category = (Category)context.getBean("c");
		System.out.println(category.getName());
		Product product = (Product)context.getBean("p");
		System.out.println(product.getName()+" :"+product.getCategory().getName());
		//test aop
		ProductService productService = (ProductService)context.getBean("s");
		productService.doSomeService();
	}
	
	
}
