package com.itproject.vn.Models;
import lombok.Data;

@Data
public class SignUpDto {
	private String username;
	private String password;
	private String email;
	private String name;
	private boolean enabled;
}
