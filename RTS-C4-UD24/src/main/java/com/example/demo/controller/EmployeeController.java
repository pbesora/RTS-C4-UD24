package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Employee;
import com.example.demo.service.EmployeeServiceImpl;


@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
	@GetMapping("/employees")
	public List<Employee> listEmployees(){
		return employeeServiceImpl.listEmployees();
	}
	
	//list employees by name
	@GetMapping("/employees/name/{name}")
	public List<Employee> listEmployeeName(@PathVariable(name="name") String name) {
	    return employeeServiceImpl.listEmployeeName(name);
	}
	
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee) {
		
		return employeeServiceImpl.saveEmployee(employee);
	}
	
	
	@GetMapping("/employees/{id}")
	public Employee employeeByID(@PathVariable(name="id") Long id) {
		
		Employee employee_byid= new Employee();
		
		employee_byid = employeeServiceImpl.employeeByID(id);
		
		System.out.println("WORKER by ID: " + employee_byid);
		
		return employee_byid;
	}
	
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable(name="id")Long id, @RequestBody Employee employee) {
		
		Employee selected_employee= new Employee();
		Employee updated_employee= new Employee();
		
		selected_employee = employeeServiceImpl.employeeByID(id);
		
		selected_employee.setName(employee.getName());
		selected_employee.setJob(employee.getJob());
		
		updated_employee = employeeServiceImpl.updateEmployee(selected_employee);
		
		System.out.println("Updated employee: "+ updated_employee);
		
		return updated_employee;
	}
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable(name="id")Long id) {
		employeeServiceImpl.deleteEmployee(id);
	}
	
	
}