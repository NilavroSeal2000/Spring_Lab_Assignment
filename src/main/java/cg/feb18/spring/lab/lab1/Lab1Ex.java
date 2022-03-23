package cg.feb18.spring.lab.lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1Ex {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

		Employee emp = context.getBean(Employee.class);

		System.out.println("Employee details");
		System.out.println("-------------------------");
		System.out.println(emp.toString());

		((AbstractApplicationContext) context).close();

	}
}
