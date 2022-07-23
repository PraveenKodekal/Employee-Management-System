package com.ems.Service.Impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.ems.Entity.Employee;
import com.ems.Exception.ResourceNotFoundException;
import com.ems.Repository.EmployeeRepository;
import com.ems.Service.EmployeeService;

import org.springframework.stereotype.Service;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}


	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}


	@Override
	public Employee getEmployeeById(long id) {
		return employeeRepository.findById(id).orElseThrow(
						() -> new ResourceNotFoundException("Employee", "id", id));
		
	}


	@Override
	public Employee updateEmployee(Employee employee, long id) {
		Employee existingEmp= employeeRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Employee", "id", id));
		existingEmp.setId(employee.getId());
		existingEmp.setName(employee.getName());
		existingEmp.setEmail(employee.getName());
		employeeRepository.save(existingEmp);
		
		return existingEmp;
	}


	@Override
	public void deleteEmployee(long id) {
		
		employeeRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Employee", "id", id));
		employeeRepository.deleteById(id);
	}
	
	

}
