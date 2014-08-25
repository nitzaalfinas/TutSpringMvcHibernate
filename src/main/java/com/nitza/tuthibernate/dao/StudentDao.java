package com.nitza.tuthibernate.dao;

import java.util.List;

import com.nitza.tuthibernate.model.Student;

public interface StudentDao {
	
	public Student getStudent(int studentId);
	
	public void add(Student student);
	
	public void edit(Student student);
	
	public void delete(int studentId);
	
	public List<Student> list();
	
	public List<Student> listOrderLimit(String field, String order, int start, int num_row);
}
