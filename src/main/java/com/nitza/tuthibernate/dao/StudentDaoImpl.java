package com.nitza.tuthibernate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import com.nitza.tuthibernate.model.Student;

public class StudentDaoImpl implements StudentDao {

	private SessionFactory sessionFactory;
	
	public StudentDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
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
	public List<Student> listOrderLimit(String field,
			String direction, int start, int num_row) 
	{
		
		Criteria crit = sessionFactory.getCurrentSession().createCriteria(Student.class);
		
		if(direction.equalsIgnoreCase("asc")) {
			crit.addOrder(Order.asc(field));
		}
		else {
			crit.addOrder(Order.desc(field));
		}

		crit.setMaxResults(num_row);
		crit.setFirstResult(start);
		
		@SuppressWarnings("unchecked")
		List<Student> listStudent = (List<Student>)  crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return listStudent;
		
	}
	
	@Override
	@Transactional
	public List<Student> listRestrictionOrderLimit(String r_field,
			String r_value, String o_field, String o_direction, int start, int num_row) 
	{
		
		Criteria crit = sessionFactory.getCurrentSession().createCriteria(Student.class);
		
		crit.add(Restrictions.like(r_field, "%"+r_value+"%"));
		
		if(o_direction.equalsIgnoreCase("asc")) {
			crit.addOrder(Order.asc(o_field));
		}
		else {
			crit.addOrder(Order.desc(o_field));
		}

		crit.setMaxResults(num_row);
		crit.setFirstResult(start);
		
		@SuppressWarnings("unchecked")
		List<Student> listStudent = (List<Student>)  crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return listStudent;
		
	}

}
