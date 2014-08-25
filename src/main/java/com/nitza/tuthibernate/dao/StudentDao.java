package com.nitza.tuthibernate.dao;

import java.util.List;

import com.nitza.tuthibernate.model.Student;

public interface StudentDao {
	
	public Student getStudent(int studentId);
	
	public void add(Student student);
	
	public void edit(Student student);
	
	public void delete(int studentId);
	
	public List<Student> list();
	
	/**
	 * Useful example by mkyong.com provide so many options here
	 * You can see at http://www.mkyong.com/hibernate/hibernate-criteria-examples/
	 * @param field
	 * @param order
	 * @param start
	 * @param num_row
	 * @return
	 */
	public List<Student> listOrderLimit(String field, String order, int start, int num_row);
}
