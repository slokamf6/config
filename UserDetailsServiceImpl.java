package com.sklm.sbi.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.sklm.sbi.DAO.LoginDAO;
import com.sklm.sbi.pojo.User;
import com.sklm.sbi.pojo.UserRole;

@Component
public class UserDetailsServiceImpl implements UserDetailsService{
	@Autowired
	private LoginDAO loginDao;

	@Override
	public UserDetails loadUserByUsername(String arg0)
			throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user=loginDao.loadUserByUsername(arg0);
		System.out.println("service method");
		/*UserRole role1=new UserRole();
		role1.setAuthority("ROLE_ADMIN");
		UserRole role2=new UserRole();
		role2.setAuthority("ROLE_USER");
		Collection<UserRole> roleList=new ArrayList<UserRole>();
		roleList.add(role1);
		roleList.add(role2);
		
		User user = new User();
		user.setUsername(arg0);
		user.setPassword(arg0);
		user.setEnabled(true);
		user.setAccountNonExpired(true);
		user.setAccountNonLocked(true);
		user.setCredentialsNonExpired(true);
		user.setAuthorities(roleList);
		*/
		return user;
	}

}
