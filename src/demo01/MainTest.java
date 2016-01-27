package demo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo01.entity.Person;

public class MainTest {
	public static void main(String[] args){
		//ApplicationContext spring��������BeanFactroy���ӽӿ�
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("spring ctx:"+ctx);
		/**
		 * ��spring����������
		 */
		PersonService ps=ctx.getBean("personService",PersonService.class);
		ps.say();
		
		Person p=ctx.getBean("chinese",Person.class);
		p.useAxe();
		
		Person a=ctx.getBean("american",Person.class);
		a.useAxe();
	}
}
