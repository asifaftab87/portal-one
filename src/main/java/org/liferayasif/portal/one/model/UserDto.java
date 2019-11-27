package org.liferayasif.portal.one.model;

import java.util.Set;

public class UserDto {

	private int id;
	
	private String password;
	private boolean active;
	private String email;
	private String firstName;
	private String lastName;
	
    private Set<RoleDto> roles;
	
    public UserDto() {}
    
	public UserDto(int id, String password, boolean active, String email, String firstName, String lastName,
			Set<RoleDto> roles) {
		super();
		this.id = id;
		this.password = password;
		this.active = active;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.roles = roles;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Set<RoleDto> getRoles() {
		return roles;
	}
	public void setRoles(Set<RoleDto> roles) {
		this.roles = roles;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
