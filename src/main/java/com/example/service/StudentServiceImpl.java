package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.StudentDao;
import com.example.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao dao;

    @Transactional
    public List<Student> getAll() throws Exception {
        return dao.getAll();
    }

    @Transactional
    public Student get(int id) throws Exception {
        return dao.get(id);
    }

    @Transactional
    public void save(Student student) throws Exception {
        dao.save(student);
    }

    @Transactional
    public void delete(int id) throws Exception {
        dao.delete(id);
    }
}
