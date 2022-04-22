package com.springhibernate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.springhibernate.Model.Person;
import com.springhibernate.Service.ServiceI;

@Controller
public class PersonController {
	@Autowired
	private ServiceI s;

	public void saveController(Person person) {
		
		s.saveService(person);
	}
	
	


	
		
}
