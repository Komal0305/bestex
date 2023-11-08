package com.csi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")

public class Employee {
	
	@Id
	@GeneratedValue
	
	private int empId;
	
	private String empName;
	
	private double empSalary;
	
	private String empEmail;
	
	private String empPassword;
	

}
