package cg.feb18.spring.lab.lab1_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cg.feb18.spring.lab.model.Employee;

public class Lab1_2Ex {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig_lab2.xml");

		Employee emp = context.getBean(Employee.class);

		System.out.println("Employee details");
		System.out.println("-------------------------");
		System.out.println(emp.toString());

		((AbstractApplicationContext) context).close();

	}
}
