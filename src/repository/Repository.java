package repository;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import models.Adress;
import models.Agent;
import models.Airline;
import models.Airport;
import models.Flight;
import models.FlightInstance;
import models.Passenger;
import models.Reservation;

public class Repository {

	List<Airport> airports;
	List<Airline> airlines;
	List<Flight> flights;
	List<FlightInstance> flightInstances;
	List<Passenger> passengers;
	List<Agent> agents;
	List<Reservation> reservations;
	
	static Repository repository = null;
	public static Repository getInstance(){
		if(repository == null)
			repository = new Repository();
		return repository;
	}
	
	Repository() {
		Initialize();
	}
	private void Initialize() {
		InitAirports();
		InitAirlines();
		InitFlights();
		InitFlightInstances();
		InitPassengers();
		InitAgents();
		InitReservations();
		
	}
	
	private void InitAirports() {
		airports  = new ArrayList<Airport>();
		var Adress1 = new Adress("1","2121 Arthur Collins Pkwy SW","IA","Cedar Rapids","52404");
		var airport1 = new Airport("111","CID","Cedar Rapids", Adress1);
		var Adress2 = new Adress("2","10000 W O'Hare Ave","IL","Chicago","60666");
		var airport2 = new Airport("112","ORD","O'Hare", Adress2);
		airports.add(airport1);
		airports.add(airport2);
	}
	
	private void InitAirlines() {
		airlines = new ArrayList<Airline>();
		var airline1 = new Airline("1", "AA", "American Airlines", "");
		var airline2 = new Airline("2", "UA","United Airlines","");
		var airline3 = new Airline("3", "DEL","Delta Airlines", "");
		airlines.add(airline1);
		airlines.add(airline2);
		airlines.add(airline3);
	}
	
	private void InitFlights() {
		flights = new ArrayList<Flight>();

		var flight1 = new Flight("A001",001,55,LocalTime.of(7, 0),LocalTime.of(9, 15), flightInstances);
		var flight2 = new Flight("A002",002,55,LocalTime.of(7, 0),LocalTime.of(9, 15), flightInstances);;
		flights.add(flight1);
		flights.add(flight2);
		
	}
	
	
	private void InitFlightInstances() {
		flightInstances = new ArrayList<FlightInstance>();
		String[] crews = {"Mary", "Lisa"};
		String[] pilots = {"Kha Nguyen","Anuj","Munkhdalai"};
		var flight1 = flights.get(0);
		var instance1 = new FlightInstance(flight1, "1111", LocalDate.of(2020, 12, 1));
		instance1.setCrew(List.of(crews));
		instance1.setPilots(List.of(pilots));
		flight1.addFlightInstance(instance1);
		var instance2 = new FlightInstance(flight1, "1112", LocalDate.of(2020, 12, 2));
		instance2.setCrew(List.of(crews));
		instance2.setPilots(List.of(pilots));
		flight1.addFlightInstance(instance2);
		var instance3 = new FlightInstance(flight1, "1113", LocalDate.of(2020, 12, 3));
		instance3.setCrew(List.of(crews));
		instance3.setPilots(List.of(pilots));
		flight1.addFlightInstance(instance3);
		var instance4 = new FlightInstance(flight1, "1114", LocalDate.of(2020, 12, 4));
		instance4.setCrew(List.of(crews));
		instance4.setPilots(List.of(pilots));
		flight1.addFlightInstance(instance4);
		
		var flight2 = flights.get(1);
		var instance5 = new FlightInstance(flight2, "1115", LocalDate.of(2020, 12, 1));
		instance5.setCrew(List.of(crews));
		instance5.setPilots(List.of(pilots));
		flight2.addFlightInstance(instance5);
		
		var instance6 = new FlightInstance(flight2, "1116", LocalDate.of(2020, 12, 2));
		instance6.setCrew(List.of(crews));
		instance6.setPilots(List.of(pilots));
		flight2.addFlightInstance(instance6);
		var instance7 = new FlightInstance(flight2, "1117", LocalDate.of(2020, 12, 3));
		instance7.setCrew(List.of(crews));
		instance7.setPilots(List.of(pilots));
		flight2.addFlightInstance(instance7);
		var instance8 = new FlightInstance(flight2, "1118", LocalDate.of(2020, 12, 4));
		instance8.setCrew(List.of(crews));
		instance8.setPilots(List.of(pilots));
		flight2.addFlightInstance(instance8);
		flightInstances.add(instance1);
		flightInstances.add(instance2);
		flightInstances.add(instance3);
		flightInstances.add(instance4);
		flightInstances.add(instance5);
		flightInstances.add(instance6);
		flightInstances.add(instance7);
		flightInstances.add(instance8);
	}
	
	private void InitPassengers() {
		passengers = new ArrayList<Passenger>();
		var p1 = new Passenger("1", "Slimen", "Nafti",LocalDate.of(1990, 9, 10) ,"jonhchurchill@gmail.com");
		var p2 = new Passenger("2", "Obadah", "Walid",LocalDate.of(1991, 12, 19) ,"marychurchill@gmail.com");
		passengers.add(p1);
		passengers.add(p2);
	}
	
	private void InitAgents() {
		agents = new ArrayList<Agent>();
		var agent1 = new Agent("1", "Agent 1");
		var agent2 = new Agent("2", "Agent 2");
		agents.add(agent1);
		agents.add(agent2);
	}
	
	private void InitReservations() {
		reservations = new ArrayList<Reservation>();
		var instances = new ArrayList<FlightInstance>(); 
		instances.add(flightInstances.get(0)); //2020 12 01
		instances.add(flightInstances.get(5)); // 2020 12 02
		var reser1 = new Reservation("000002",instances, agents.get(0).getId(),
				passengers.get(0));
		passengers.get(0).addReservation(reser1);
		var reser2 = new Reservation("000001",instances, agents.get(0).getId(),
				passengers.get(1));
		passengers.get(1).addReservation(reser2);
		reservations.add(reser1);
		reservations.add(reser2);
	}

	public boolean deleteReservation(String reservationId) {
		for(var item: this.reservations) {
			if(item.getReservationId().equalsIgnoreCase(reservationId)) {
				this.reservations.remove(item);
				return true;
			}
		}
		return false;
	}
}

