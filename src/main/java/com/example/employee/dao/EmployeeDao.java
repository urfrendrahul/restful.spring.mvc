package com.example.employee.dao;

import java.util.List;

import com.example.employee.model.Employee;

public interface EmployeeDao {
	
	public Employee get(int id);
	public List<Employee> getAll();
	public Employee addOrUpdate(Employee emp);
	public Employee remove(int id);

}
