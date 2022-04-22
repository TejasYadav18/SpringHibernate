package com.springhibernate.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springhibernate.Model.Person;

@Repository
public class PersonDaoImpl implements dao {
	@Autowired
	private SessionFactory sessionfactory;
	
	public void setSessionFactory(SessionFactory sessionfactory) {
		
		this.sessionfactory=sessionfactory;
	}

	public void saveDao(Person person) {
		Session s = sessionfactory.openSession();
		Transaction t=s.beginTransaction();
		s.save(person);
		t.commit();
		s.close();
		
	}

	
		
		
	}

	
		
	

	

	

	
	
	
	


