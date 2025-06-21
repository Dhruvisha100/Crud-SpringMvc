package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Student> getAll() throws Exception{
//		Session session = sessionFactory.getCurrentSession();
//		StringBuffer sb = new StringBuffer();
//		sb.append("from Student");
//		return session.createQuery(sb.toString(), Student.class).list();
		return sessionFactory.getCurrentSession().createQuery("FROM Student").list();
	}
	
	public Student get(int id) throws Exception {
		return sessionFactory.getCurrentSession().get(Student.class, id);
	}
	
	public void save(Student student) throws Exception {
		sessionFactory.getCurrentSession().saveOrUpdate(student);
	}
	
	public void delete(int id) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Student s = get(id);
		if (s != null) {
			session.delete(s);
		}
	}
	
}
