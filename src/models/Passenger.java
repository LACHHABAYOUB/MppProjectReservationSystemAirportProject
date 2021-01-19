package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Passenger {
	private String id;
	private String FirstName;
	private String LastName;
	private LocalDate DOB;
	private String Email;
	private List<Reservation> reservations;

	public Passenger(String id, String firstName, String lastName, LocalDate dOB, String email) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		DOB = dOB;
		Email = email;
		reservations = new ArrayList<Reservation>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", DOB=" + DOB
				+ ", Email=" + Email + ", getId()=" + getId() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getDOB()=" + getDOB() + ", getEmail()=" + getEmail()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public void addReservation(Reservation reservation) {
		this.addReservation(reservation);
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

}
