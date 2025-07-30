package com.nec.studentmanagement.service;

import com.nec.studentmanagement.entity.AssignmentDetails;

public interface AssignmentDetailsService {
	
	public AssignmentDetails findByAssignmentAndStudentCourseDetailsId(int assignmentId, int studentCourseDetailsId);
	
	public void save(AssignmentDetails studentCourseAssignmentDetails);
}
