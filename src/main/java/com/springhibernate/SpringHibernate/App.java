package com.springhibernate.SpringHibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springhibernate.Controller.PersonController;
import com.springhibernate.Dao.PersonDaoImpl;
import com.springhibernate.Model.Person;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =new ClassPathXmlApplicationContext("com/springhibernate/SpringHibernate/config.xml");
    	
    	//PersonDaoImpl persondao=context.getBean(PersonDaoImpl.class);
    	
    	PersonController pc =context.getBean("personController",PersonController.class);
    	
    	Person person = new Person();
    	person.setId(18);
    	
		person.setName("Virat");
		person.setCountry("India");
		
		pc.saveController(person);
		
		System.out.println("Person::"+person);
		
		
		
		
		
	}
}
    	
    	



