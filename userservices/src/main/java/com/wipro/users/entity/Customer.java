package com.wipro.users.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Customer extends User {

	@NotNull
	@Size(min = 2, max = 30)
	private String firstName;
	
	@NotNull
	@Size(min = 2, max = 30)
	private String lastName;
	
	@NotNull
	private String address;

	@Digits(message = "Number should contain 10 digits.", fraction = 0, integer = 10)
	private String phoneNo;
}
