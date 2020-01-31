package com.security.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.web.domain.SecurityDTO;
import com.security.web.mapper.SecurityMapper;

public class SecurityServiceImpl implements UserDetailsService{
	
	@Autowired SecurityMapper secMap;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		SecurityDTO user = secMap.user(username);
		if(user==null) {
			 throw new UsernameNotFoundException(username);
		}
		return user;
	}

}
