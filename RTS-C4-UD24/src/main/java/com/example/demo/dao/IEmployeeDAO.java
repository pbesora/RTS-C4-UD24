package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Employee;

public interface IEmployeeDAO extends JpaRepository<Employee, Long>{
	
	//List employees by name
	public List<Employee> findByName(String name);
	
}
