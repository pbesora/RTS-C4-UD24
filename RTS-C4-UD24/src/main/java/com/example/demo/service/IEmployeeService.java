package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Employee;


public interface IEmployeeService {
	//CRUD
		public List<Employee> listEmployees(); //List All 
		
		public Employee saveEmployee(Employee employee);	//Creates an employee
		
		public Employee employeeByID(Long id); //Reads employee data
		
		public List<Employee> listEmployeeName(String name);//List Employees by name
		
		public Employee updateEmployee(Employee employee); //Updates employee data
		
		public void deleteEmployee(Long id);//Deletes an employee
		
}
