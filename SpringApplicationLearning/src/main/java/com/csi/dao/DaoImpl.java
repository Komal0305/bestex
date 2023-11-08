package com.csi.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.csi.model.Employee;

@Component
public class DaoImpl implements Dao {

	@Autowired
	private static SessionFactory factory =  new AnnotationConfiguration().configure().buildSessionFactory();
	
	@Override
	public void signUp(Employee employee) {
		// TODO Auto-generated method stub
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(employee);
		transaction.commit();
		}

	@Override
	public boolean signIn(String empEmail, String empPassword) {
		// TODO Auto-generated method stub
		
		boolean flag = false;
		Session session = factory.openSession();
		
		List<Employee> emplist = session.createQuery("from Employee").list();
		
		for(Employee employee : emplist) {
			flag= true;
		}
		return flag;
		
	}

	@Override
	public List<Employee> getAllData() {
		// TODO Auto-generated method stub
		
		Session session = factory.openSession();
		
		List<Employee> emplist = session.createQuery("from Employee").list();
		return emplist;
	}

	
}
