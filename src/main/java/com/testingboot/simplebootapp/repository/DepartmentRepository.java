package com.testingboot.simplebootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testingboot.simplebootapp.models.onetomany.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
