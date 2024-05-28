package com.testingboot.simplebootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testingboot.simplebootapp.models.onetomany.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

