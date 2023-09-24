package com.talk.vo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class Member {
	//@NotNull, @NotEmpty, @NotBlank 검증
	// -> 해당 필드에 @NotNull 등을 설정 후 api내의 파라미터에 @Vaild를 추가해주면 Bean Validation을 사용할수 있다.
	@NotNull
	private String user_no;
	
	@NotEmpty
	@Length(min=2, max=10)
	private String name;
	
	@NotEmpty
	private String id;
	
	@NotEmpty
	@Length(min=4, max=16)
	private String password;
	
	private String status;
	
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUser_no() {
		return user_no;
	}

	public void setUser_no(String user_no) {
		this.user_no = user_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Member [user_no=" + user_no + ", name=" + name + ", id=" + id + ", password=" + password + ", status="
				+ status + ", role=" + role + "]";
	}
	
	

}
