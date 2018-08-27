package com.test.dao;
import org.apache.ibatis.annotations.Param;

import com.test.annotation.mybatisRepository;
import com.test.entity.Role;
@mybatisRepository
public interface RoleMapper {
	public int insertRole(Role role);
	public Role selectRole(@Param("id") Long id);
	public int updateRole(Role role);
	public int deleteRole(@Param("id") Long id);
}
