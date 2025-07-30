package com.nec.studentmanagement.dao;

import com.nec.studentmanagement.entity.Role;

public interface RoleDao {
	
	public Role findRoleByName(String theRoleName);
}
