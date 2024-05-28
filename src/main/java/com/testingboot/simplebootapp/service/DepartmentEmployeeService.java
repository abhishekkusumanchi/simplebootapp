package com.testingboot.simplebootapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testingboot.simplebootapp.models.onetomany.Department;
import com.testingboot.simplebootapp.models.onetomany.Employee;
import com.testingboot.simplebootapp.repository.DepartmentRepository;
import com.testingboot.simplebootapp.repository.EmployeeRepository;

@Service
public class DepartmentEmployeeService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Department getDepartmentById(Long id) {
		return departmentRepository.findById(id).orElse(null);
	}

	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id).orElse(null);
	}
}
