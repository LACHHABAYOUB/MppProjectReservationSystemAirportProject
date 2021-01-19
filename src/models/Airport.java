package models;
import java.util.ArrayList;
import java.util.List;

public class Airport {
	String airportId;
	String code;
	String name;
	List<Flight> flights;
	Adress adress;
	
	public Airport(String airportId, String code, String name,Adress adress) {
		super();
		this.airportId = airportId;
		this.code = code;
		this.name = name;
		this.adress = adress;
		flights = new ArrayList<Flight>();
	}
	public String getAirportId() {
		return airportId;
	}
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public Adress getadress() {
		return adress;
	}
	public List<Flight> getFlights(){
		return flights;
	}
	 @Override
	   public String toString() {
	        return ("id: " + this.airportId+
	        			",code: " + this.code+
	                    " ,name: "+ this.name);
	   }
	public void addFlight(Flight flight) {
		this.flights.add(flight);
	}
}