package com.csi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.csi.dao.DaoImpl;
import com.csi.model.Employee;

@RestController
@RequestMapping("/employee")
public class ApplicationController {

	@Autowired
	DaoImpl daoImpl;
	
	@PostMapping("/signup")
	public ResponseEntity<String> signUp(@RequestBody Employee employee){
		daoImpl.signUp(employee);
		return ResponseEntity.ok("Data Add Successfully");
	}
	@GetMapping("/signin")
	public ResponseEntity<String> signIn(@PathVariable String empEmail, @PathVariable String empPassword){
		daoImpl.signIn(empEmail, empPassword);
		return ResponseEntity.ok("Succesfully Login");
	}
	@GetMapping("/getAllData")
	public ResponseEntity<List<Employee>> getAllData(){
		return ResponseEntity.ok(daoImpl.getAllData());
	}
	
}
