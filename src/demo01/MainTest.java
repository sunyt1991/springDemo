package demo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("ctx:"+ctx);
	}
}
