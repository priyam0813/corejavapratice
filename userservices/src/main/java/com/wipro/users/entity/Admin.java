package com.wipro.users.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Admin extends User {

	private String contactNum;
	private String email;

}
