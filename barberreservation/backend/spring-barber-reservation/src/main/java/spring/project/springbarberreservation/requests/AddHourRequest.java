package spring.project.springbarberreservation.requests;


import jakarta.validation.constraints.NotEmpty;
import spring.project.springbarberreservation.entities.Barber;
import spring.project.springbarberreservation.entities.Hour;

public record AddHourRequest(
		@NotEmpty
		String hour,
		Boolean status,
		Barber barber
		) {
public Hour toEntity() {
	return new Hour(hour,status,barber);
}
}