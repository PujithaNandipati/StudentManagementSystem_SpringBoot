package com.nec.studentmanagement.dao;

import com.nec.studentmanagement.entity.AssignmentDetails;

public interface AssignmentDetailsDao {
	
	public AssignmentDetails findByAssignmentAndStudentCourseDetailsId(int assignmentId, int studentCourseDetailsId);
	
	public void save(AssignmentDetails studentCourseAssignmentDetails);
}
