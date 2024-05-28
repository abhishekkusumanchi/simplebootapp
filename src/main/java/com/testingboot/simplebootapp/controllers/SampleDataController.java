package com.testingboot.simplebootapp.controllers;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testingboot.simplebootapp.models.onetomany.Department;
import com.testingboot.simplebootapp.models.onetomany.Employee;
import com.testingboot.simplebootapp.service.DepartmentEmployeeService;

@RestController
@RequestMapping("/api/sample")
public class SampleDataController {

	@Autowired
	private DepartmentEmployeeService service;

	@GetMapping("/populate")
	public String populateSampleData() {
		// Creating sample departments
		Department department1 = new Department();
		department1.setName("Engineering");

		Department department2 = new Department();
		department2.setName("HR");

		// Creating sample employees
		Employee employee1 = new Employee();
		employee1.setFirstName("John");
		employee1.setLastName("Doe");
		employee1.setDepartment(department1);

		Employee employee2 = new Employee();
		employee2.setFirstName("Jane");
		employee2.setLastName("Smith");
		employee2.setDepartment(department1);

		Employee employee3 = new Employee();
		employee3.setFirstName("Alice");
		employee3.setLastName("Johnson");
		employee3.setDepartment(department2);

		Employee employee4 = new Employee();
		employee4.setFirstName("Bob");
		employee4.setLastName("Brown");
		employee4.setDepartment(department2);

		// Adding employees to their respective departments
		department1.setEmployees(Arrays.asList(employee1, employee2));
		department2.setEmployees(Arrays.asList(employee3, employee4));

		// Saving departments and employees to the database
		service.saveDepartment(department1);
		service.saveDepartment(department2);

		return "Sample data populated successfully";
	}
}
