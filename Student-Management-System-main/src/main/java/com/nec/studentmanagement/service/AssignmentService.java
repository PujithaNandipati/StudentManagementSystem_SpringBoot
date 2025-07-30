package com.nec.studentmanagement.service;

import com.nec.studentmanagement.entity.Assignment;

public interface AssignmentService {
	
	public void save(Assignment assignment);
	
	public void deleteAssignmentById(int id);
}
