package models;


public class Adress {
	
	String id ;
	String Street;
	String city ;
	String state ;
	String ZipCode;
	
	
	public Adress(String id, String street, String city, String state, String zipCode) {
		super();
		this.id = id;
		Street = street;
		this.city = city;
		this.state = state;
		ZipCode = zipCode;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return ZipCode;
	}
	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Adress [id=" + id + ", Street=" + Street + ", city=" + city + ", state=" + state + ", ZipCode="
				+ ZipCode + ", getId()=" + getId() + ", getStreet()=" + getStreet() + ", getCity()=" + getCity()
				+ ", getState()=" + getState() + ", getZipCode()=" + getZipCode() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
