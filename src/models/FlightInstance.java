package models;

import java.time.LocalDate;
import java.util.List;

public class FlightInstance {

	String ID;
	LocalDate Date;
	List<String> pilots;
	List<String> Crew;

	public FlightInstance(String iD, LocalDate date, List<String> pilots, List<String> crew) {
		super();
		ID = iD;
		Date = date;
		this.pilots = pilots;
		Crew = crew;
	}

	public FlightInstance(Flight flight1, String string, LocalDate of) {
		// TODO Auto-generated constructor stub
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public LocalDate getDate() {
		return Date;
	}

	public void setDate(LocalDate date) {
		Date = date;
	}

	public List<String> getPilots() {
		return pilots;
	}

	public void setPilots(List<String> pilots) {
		this.pilots = pilots;
	}

	public List<String> getCrew() {
		return Crew;
	}

	public void setCrew(List<String> crew) {
		Crew = crew;
	}

	@Override
	public String toString() {
		return "FlightInstance [ID=" + ID + ", Date=" + Date + ", pilots=" + pilots + ", Crew=" + Crew + ", getID()="
				+ getID() + ", getDate()=" + getDate() + ", getPilots()=" + getPilots() + ", getCrew()=" + getCrew()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public List<Ticket> getTickets() {
		return getTickets();
	}
	public void addTicket(Ticket ticket) {
		this.addTicket(ticket);
	}
	public void addReservation(Reservation reservation) {
		this.addReservation(reservation);
	}

}
