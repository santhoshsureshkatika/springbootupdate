package com.zensar.springbootdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.springbootdemo.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {
	
}

