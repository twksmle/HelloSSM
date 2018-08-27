package com.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.RoleMapper;
import com.test.entity.Role;
import com.test.service.RoleServ;

@Service(value="roleServImpl")
public class RoleServImpl implements RoleServ{
	
	@Autowired
	private RoleMapper roleMapper;

	public int insertRole(Role role) {
		
		return roleMapper.insertRole(role);
	}

	public Role selectRole(Long id) {
		return roleMapper.selectRole(id);
	}

	public int updateRole(Role role) {
		
		return roleMapper.updateRole(role);
	}

	public int deleteRole(Long id) {
		return roleMapper.deleteRole(id);
	}
	
	public RoleMapper getRoleMapper() {
		return roleMapper;
	}

	public void setRoleMapper(RoleMapper roleMapper) {
		this.roleMapper = roleMapper;
	}

}
