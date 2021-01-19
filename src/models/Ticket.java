package models;

import service.HelperRnadomNumber;

public class Ticket {
	String ID;
	String number;
	FlightInstance flightInstance;
	Reservation reservation;

	public Ticket(FlightInstance flightInstance, Reservation reservation) {
		this.flightInstance = flightInstance;
		this.reservation = reservation;
		ID = number = HelperRnadomNumber.generateTicketNumber();
	}

	public Ticket(Reservation reservation) {
		this.reservation = reservation;
		ID = number = HelperRnadomNumber.generateTicketNumber();
	}

	public void setFlight(FlightInstance flight) {
		this.flightInstance = flight;
	}

	public String getID() {
		return ID;
	}

	public String getnumber() {
		return number;
	}

	@Override
	public String toString() {
		return ("id: " + this.ID + ",ticket number: " + this.number);
	}
}
