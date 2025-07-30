package com.nec.studentmanagement.dao;

import com.nec.studentmanagement.entity.Assignment;

public interface AssignmentDao {
	
	public void save(Assignment assignment);
	
	public void deleteAssignmentById(int id);
}
