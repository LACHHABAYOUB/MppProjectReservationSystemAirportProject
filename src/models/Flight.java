package models;

import java.time.LocalTime;
import java.util.List;

public class Flight {
	String id;
	int number;
	int capacity;
	LocalTime Deptime;
	LocalTime Arrivtime;
	List<FlightInstance> flightInstances;

	public Flight(String id, int number, int capacity, LocalTime deptime, LocalTime arrivtime,
			List<FlightInstance> flightInstances) {
		super();
		this.id = id;
		this.number = number;
		this.capacity = capacity;
		Deptime = deptime;
		Arrivtime = arrivtime;
		this.flightInstances = flightInstances;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public LocalTime getDeptime() {
		return Deptime;
	}

	public void setDeptime(LocalTime deptime) {
		Deptime = deptime;
	}

	public LocalTime getArrivtime() {
		return Arrivtime;
	}

	public void setArrivtime(LocalTime arrivtime) {
		Arrivtime = arrivtime;
	}

	public List<FlightInstance> getFlightInstances() {
		return flightInstances;
	}

	public void setFlightInstances(List<FlightInstance> flightInstances) {
		this.flightInstances = flightInstances;
	}

	public void addFlightInstance(FlightInstance instance) {
		flightInstances.add(instance);
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", number=" + number + ", capacity=" + capacity + ", Deptime=" + Deptime
				+ ", Arrivtime=" + Arrivtime + ", flightInstances=" + flightInstances + ", getId()=" + getId()
				+ ", getNumber()=" + getNumber() + ", getCapacity()=" + getCapacity() + ", getDeptime()=" + getDeptime()
				+ ", getArrivtime()=" + getArrivtime() + ", getFlightInstances()=" + getFlightInstances()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
