package spring.project.springbarberreservation.responses;

import java.time.LocalDateTime;

import spring.project.springbarberreservation.entities.Users;

public record UserResponse(
		Long id,
		String name,
		String surName,
		String phoneNumber,
		String password,
		LocalDateTime date
		)  {
public static UserResponse fromEntity(Users user) {
	return new UserResponse(user.getId(),user.getUserName(), user.getSurName(), user.getPhoneNumber(),user.getPassword(),user.getCreatedDate());
}
}
