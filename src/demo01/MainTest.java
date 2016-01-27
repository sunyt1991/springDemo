package demo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo01.entity.Person;

public class MainTest {
	public static void main(String[] args){
		//ApplicationContext spring容器，是BeanFactroy的子接口
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("spring ctx:"+ctx);
		/**
		 * 由spring来创建对象
		 */
		PersonService ps=ctx.getBean("personService",PersonService.class);
		ps.say();
		
		Person p=ctx.getBean("chinese",Person.class);
		p.useAxe();
		
		Person a=ctx.getBean("american",Person.class);
		a.useAxe();
	}
}
