package spring.project.springbarberreservation.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Users extends BaseEntity {
	private String userName;
	private String surName;
	private String phoneNumber;
	private String password;
	@OneToMany(mappedBy = "user")
	private List<Reservation>reservations;
	

	
	public void update(Users user) {
		this.userName=user.userName;
		this.surName=user.surName;
	}



	public Users(String name, String surName, String phoneNumber,String password, List<Reservation> reservations) {
		super();
		this.userName = name;
		this.surName = surName;
		this.phoneNumber = phoneNumber;
		this.password=password;
		this.reservations = reservations;
	}
}
