package com.zensar.springbootdemo.service;

import java.util.List;

import com.zensar.springbootdemo.dto.StudentDto;
import com.zensar.springbootdemo.entity.Student;

public interface StudentService {

	public StudentDto getStudent(int studentId);
	public List<StudentDto> getStudents();
	public StudentDto insertStudent(StudentDto student);
	public StudentDto updateStudent(int studentId, StudentDto studentDto);
	public void deleteStudent(int studentId);
	
}