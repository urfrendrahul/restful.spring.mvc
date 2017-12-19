package com.example.employee.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.handler.EmployeeHandler;
import com.example.employee.model.Employee;

@RestController
public class EmployeetController {
	
	@Autowired
	private EmployeeHandler employeeHandler;
	
	@RequestMapping(value = "/employee/{id}", method = GET, produces = APPLICATION_JSON_VALUE)
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeHandler.getEmployeeById(id);
    }

	
	@RequestMapping(value = "/employee", method = GET, produces = APPLICATION_JSON_VALUE)
    public List<Employee> getAllEmployee() {
        return employeeHandler.getAllEmployee();
    }
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST,consumes=APPLICATION_JSON_VALUE , produces = APPLICATION_JSON_VALUE)
    public int addEmployee(@RequestBody Employee emp) {
        return employeeHandler.createEmployee(emp);
    }
	
	@RequestMapping(value = "/employee", method = RequestMethod.PUT,consumes=APPLICATION_JSON_VALUE , produces = APPLICATION_JSON_VALUE)
    public int updateEmployee(@RequestBody Employee emp) {
        return employeeHandler.updateEmployee(emp);
    }
	
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE,consumes=APPLICATION_JSON_VALUE , produces = APPLICATION_JSON_VALUE)
    public Employee updateEmployee(@PathVariable int id) {
        return employeeHandler.removeEmployee(id);
    }
}
