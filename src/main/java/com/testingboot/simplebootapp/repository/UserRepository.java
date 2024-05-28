package com.testingboot.simplebootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testingboot.simplebootapp.models.onetoone.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
