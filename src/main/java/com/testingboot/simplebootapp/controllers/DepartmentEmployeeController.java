package com.testingboot.simplebootapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testingboot.simplebootapp.models.onetomany.Department;
import com.testingboot.simplebootapp.models.onetomany.Employee;
import com.testingboot.simplebootapp.service.DepartmentEmployeeService;

@RestController
@RequestMapping("/api")
public class DepartmentEmployeeController {

	@Autowired
	private DepartmentEmployeeService service;

	@PostMapping("/departments")
	public Department createDepartment(@RequestBody Department department) {
		return service.saveDepartment(department);
	}

	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}

	@GetMapping("/departments/{id}")
	public Department getDepartmentById(@PathVariable Long id) {
		return service.getDepartmentById(id);
	}

	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		return service.getEmployeeById(id);
	}
	
}
