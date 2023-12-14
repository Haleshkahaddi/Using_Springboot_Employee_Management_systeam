package com.smart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smart.model.Employee;
import com.smart.serviceEMP.EmployeServiceEmpl;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private EmployeServiceEmpl empservices;
	@GetMapping("/home")
	public String homePabge()
	{
		return "Welcome to Employee Manegement System";
	}
	@PostMapping("/addEmp")
	public ResponseEntity <Employee> addEmployee(@RequestBody Employee employee)
	{
		Employee emp=empservices.addEmployee(employee);
		return new ResponseEntity <Employee>( emp,HttpStatus.CREATED);
		
	}
	@DeleteMapping("/removeemp/{id}")
	public ResponseEntity<String>removEmployee(@PathVariable int id)
	{
		empservices.removeEmployee(id);
		return new ResponseEntity<String>("Removed Succesfull",HttpStatus.ACCEPTED);
		
	}
	@GetMapping("/findemp/{id}")
	public ResponseEntity<Optional<Employee>> findEmpById(@PathVariable int id)
	{
		Optional<Employee> emp=	empservices.findEmpById(id);
		return new  ResponseEntity<Optional<Employee>>(emp,HttpStatus.ACCEPTED);
		
	}
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> listofEmployees()
	{
		List<Employee> lemp=empservices.getAllEmployee();
		return new ResponseEntity<List<Employee>>(lemp,HttpStatus.ACCEPTED);
		
	}
	
}
