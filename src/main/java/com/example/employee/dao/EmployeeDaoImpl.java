package com.example.employee.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.employee.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	private static final Map<Integer, Employee> employeeCache = new HashMap<>();
	
	@Override
	public Employee get(int id) {
		return employeeCache.get(id);
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> empList = new ArrayList<>();
		employeeCache.keySet().stream().forEach(id ->{
			empList.add(employeeCache.get(id));
		});
		return empList;
	}

	@Override
	public Employee addOrUpdate(Employee emp) {
		 
		return employeeCache.put(emp.getId(), emp);
	}


	@Override
	public Employee remove(int id) {
		return employeeCache.remove(id);
	}

	

}
