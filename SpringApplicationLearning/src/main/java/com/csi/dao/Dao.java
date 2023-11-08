package com.csi.dao;

import java.util.List;

import com.csi.model.Employee;

public interface Dao {
	
	void signUp(Employee employee);
	
	boolean signIn(String empEmail, String empPassword);
	
	List<Employee> getAllData();
}
