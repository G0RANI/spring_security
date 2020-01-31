package com.security.web.comm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.security.web.domain.SecurityDTO;
import com.security.web.service.SecurityServiceImpl;

public class CustomAuthenticationProvider implements AuthenticationProvider {
	
	@Autowired 
	private SecurityServiceImpl secSer;
	
	//BCrypt
	@Autowired
	PasswordEncoder passwordEncoder;
	
	/*	
	//SHA256
    private boolean matchPassword(String loginPwd, String password) {
        return loginPwd.equals(password);
    }
    */

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
			
		String username = (String) authentication.getPrincipal();
		String password = (String) authentication.getCredentials();
		//BCrypt
		String encPassword = passwordEncoder.encode(password);
		
		SecurityDTO user = (SecurityDTO) secSer.loadUserByUsername(username);
		
		//BCrypt
		if(!passwordEncoder.matches(encPassword, user.getPassword())) {
            throw new BadCredentialsException(username);
        }
		
		/*
		//SHA256
		if(!matchPassword(password, user.getPassword())) {
            throw new BadCredentialsException(username);
        }
        */
 
        if(!user.isEnabled()) {
            throw new BadCredentialsException(username);
        }	
		
		return new UsernamePasswordAuthenticationToken(username, password, user.getAuthorities());
	}

	@Override
	public boolean supports(Class<?> authentication) {
		 return true;
	}

}
