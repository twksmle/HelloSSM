package com.test.hander;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.entity.Role;
import com.test.service.impl.RoleServImpl;

@Controller("roleHander")
@RequestMapping("/role")
public class RoleHander {
	
	private static final String TAG = "RoleHander";
	
	
	
	@Autowired
	private RoleServImpl roleServImpl;
	
	public RoleServImpl getRoleServImpl() {
		return roleServImpl;
	}

	public void setRoleServImpl(RoleServImpl roleServImpl) {
		this.roleServImpl = roleServImpl;
	}

	@RequestMapping("/getRole")
	public ModelAndView getRole(int id) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("role");
		Role role = roleServImpl.selectRole((long)id);
		mv.addObject("role",role);
		return mv;
		
	}
	
	

}
