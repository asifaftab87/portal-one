package org.liferayasif.portal.one.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.liferayasif.portal.one.model.RoleDto;
import org.liferayasif.portal.one.model.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	public UserDto findByEmail(String email) {
		
		Set<RoleDto> setRole = new HashSet<>(Arrays.asList(new RoleDto(1, "ROLE_USER")));
		return new UserDto(1, "test", true, "test@liferay.com", "firstName", "lastName", setRole);
	}
}
