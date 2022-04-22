package com.springhibernate.Service;

import java.lang.annotation.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springhibernate.Dao.dao;
import com.springhibernate.Model.Person;

@Service
public class PersonService implements ServiceI {
	@Autowired
	private dao ds;

	public void saveService(Person person) {
		
		ds.saveDao(person);
		
	}

	
	
	
	
	}


	
	
	
		
		
		
	
		
		


