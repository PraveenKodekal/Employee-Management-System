package com.ems.Service;

import java.util.List;

import com.ems.Entity.Employee;
import com.ems.Repository.EmployeeRepository;

public interface EmployeeService{
	
	Employee saveEmployee(Employee employee);
	
	List<Employee> getAllEmployees();
	
	Employee getEmployeeById(long id);
	
	Employee updateEmployee(Employee employee, long id);
	
	void deleteEmployee(long id);

}
