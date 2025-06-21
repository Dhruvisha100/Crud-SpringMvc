package com.example.dao;

import java.util.List;

import com.example.model.Student;

public interface StudentDao {

	public List<Student> getAll() throws Exception;
	
	public Student get(int id) throws Exception;
	
	public void save(Student student) throws Exception;
	
	public void delete(int id) throws Exception;
}
