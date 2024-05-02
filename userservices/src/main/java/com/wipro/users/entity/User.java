package com.wipro.users.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long userId;
	private String username;
	private String password;

}
