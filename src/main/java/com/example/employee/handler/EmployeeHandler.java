package com.example.employee.handler;

import java.util.List;

import com.example.employee.model.Employee;

public interface EmployeeHandler {
	public Employee getEmployeeById(int id);
	
	public List<Employee> getAllEmployee();
	
	public int createEmployee(Employee emp);
	public int updateEmployee(Employee emp);
	public Employee removeEmployee(int id);

}
