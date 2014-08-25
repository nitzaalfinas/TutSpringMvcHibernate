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
	 * @param o_field order field
	 * @param o_direction order direction
	 * @param start
	 * @param num_row
	 * @return
	 */
	public List<Student> listOrderLimit(String o_field, String o_direction, int start, int num_row);
	
	
	/**
	 * Useful example by mkyong.com provide so many options here
	 * You can see at http://www.mkyong.com/hibernate/hibernate-criteria-examples/
	 * @param r_field
	 * @param r_value
	 * @param o_field
	 * @param o_direction
	 * @param start
	 * @param num_rows
	 * @return
	 */
	public List<Student> listRestrictionOrderLimit(String r_field, String r_value, String o_field, String o_direction, int start, int num_rows);
}
