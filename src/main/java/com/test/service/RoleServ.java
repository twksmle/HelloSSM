package com.test.service;

import com.test.entity.Role;


public interface RoleServ {
	public int insertRole(Role role);
	public Role selectRole(Long id);
	public int updateRole(Role role);
	public int deleteRole(Long id);
}
