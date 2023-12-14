package com.smart.serviceEMP;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.smart.model.Employee;
import com.smart.repositry.EmployeeRepo;
import com.smart.service.Service;
@org.springframework.stereotype.Service
public class EmployeServiceEmpl implements Service {
     @Autowired
     private EmployeeRepo employeerepo;
	@Override
	public Employee addEmployee(Employee employee) {
	Employee emp=	employeerepo.save(employee);
		return emp;
	}

	@Override
	public String removeEmployee(int id) {
		employeerepo.deleteById(id);
		return "Delete Data Succefully";
	}

	@Override
	public Optional<Employee> findEmpById(int id) {
		Optional<Employee> emp=employeerepo.findById(id);
		if(emp.isPresent())
		{
			return emp;
		}
		else
		{
		return null;
		}
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> emplist=employeerepo.findAll();
		return emplist;
	}

	@Override
	public String updateEmployee(int id) {
		Optional<Employee> emp=employeerepo.findById(id);
		if(emp.isPresent())
		{
			Employee employee=new Employee();
			employeerepo.save(employee);
			return "Employee Updated Succefully";
		}
		else
		{
		return "Employee not Found";
		}
		
	}

}
