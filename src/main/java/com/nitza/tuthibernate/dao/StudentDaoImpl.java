package com.nitza.tuthibernate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.nitza.tuthibernate.model.Student;

public class StudentDaoImpl implements StudentDao {
	
	private SessionFactory sessionFactory;
	
	public StudentDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	@Transactional
	public List<Student> list() {
		@SuppressWarnings("unchecked")
		List<Student> listStudent = (List<Student>) sessionFactory.getCurrentSession()
								.createCriteria(Student.class)
								.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listStudent;
	}

	@Override
	@Transactional
	public Student getStudent(int studentId) {
		Student student = (Student) sessionFactory.getCurrentSession().get(Student.class, studentId);
		
		return student;
	}

	@Override
	@Transactional
	public void add(Student student) {
		sessionFactory.getCurrentSession().save(student);
	}

	@Override
	@Transactional
	public void edit(Student student) {
		sessionFactory.getCurrentSession().update(student);
	}

	@Override
	@Transactional
	public void delete(int studentId) {
		sessionFactory.getCurrentSession().delete(getStudent(studentId));
	}

}
