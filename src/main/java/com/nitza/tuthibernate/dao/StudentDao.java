package com.nitza.tuthibernate.dao;

import java.util.List;

import com.nitza.tuthibernate.model.Student;

public interface StudentDao {
	
	public List<Student> list();
	
	public Student getStudent(int studentId);
	
	public void add(Student student);
	
	public void edit(Student student);
	
	public void delete(int studentId);
}
