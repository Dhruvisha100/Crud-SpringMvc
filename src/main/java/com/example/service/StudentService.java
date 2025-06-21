package com.example.service;

import java.util.List;

import com.example.model.Student;

public interface StudentService {
	
	List<Student> getAll() throws Exception ;

	Student get(int id) throws Exception ;

	void save(Student student) throws Exception ;

	void delete(int id) throws Exception ;
}
