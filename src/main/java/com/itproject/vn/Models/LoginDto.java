package com.itproject.vn.Models;

import lombok.Data;

@Data
public class LoginDto {
	private String username;
	private String password;
	public Object getUsernameOrEmail() {		return null;
	}
}
