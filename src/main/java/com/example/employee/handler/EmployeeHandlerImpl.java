package com.example.employee.handler;


import static com.example.employee.util.EmployeeUtils.getRandomNumber;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.dao.EmployeeDao;
import com.example.employee.model.Employee;

@Service
public class EmployeeHandlerImpl implements EmployeeHandler {
	
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee getEmployeeById(int id) {
		return employeeDao.get(id);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeDao.getAll();
	}

	@Override
	public int createEmployee(Employee emp) {
		int id = getRandomNumber();
		emp.setId(id);
		employeeDao.addOrUpdate(emp);
		return id;
	}

	@Override
	public int updateEmployee(Employee emp) {
		employeeDao.addOrUpdate(emp);
		return emp.getId();
	}

	@Override
	public Employee removeEmployee(int id) {
		
		return employeeDao.remove(id);
	}

	
}
