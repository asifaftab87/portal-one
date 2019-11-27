package org.liferayasif.portal.one.service;

import org.liferayasif.portal.one.model.UserDetailsImpl;
import org.liferayasif.portal.one.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserDto user = userService.findByEmail(username);
		
		if(user==null) {
			throw new UsernameNotFoundException("Not found: "+username);
		}
		
		return new UserDetailsImpl(user);//user.map(UserDetailsImpl::new).get();
	}
	
	public void malll() {
		
	}
}
