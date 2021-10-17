package com.travelplanner.entity;



import java.sql.Date;


import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.travelplanner.util.DateConstraint;
import com.travelplanner.util.EmailConstraint;

@Entity
public class TravelForm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@NotEmpty(message = "Name can't be null")
	private String Name;
	
	@EmailConstraint
	private String Email;
	
	@Size(min = 6, max=10, message = "Phone no. must be between 6 to 10")
	private String Phone;
	
	
	private int Number_Of_Travelers;
	
	@NotEmpty(message = "Required")
	private String Origin_City;
	
	@NotEmpty(message = "Required")
	private String Destination_City;
	
	
	@DateConstraint
	private Date Travel_Date;
	
	@NotEmpty(message = "Required")
	private String Languages_Spoken;
	
	@NotEmpty(message = "Booking done or not")
	private String Tickets_booked;
	
	
	private Timestamp BookingTime_Date;
	
	
	
	public Timestamp getBookingTime_Date() {
		return BookingTime_Date;
	}
	public void setBookingTime_Date(Timestamp bookingTime_Date) {
		BookingTime_Date = bookingTime_Date;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public int getNumber_Of_Travelers() {
		return Number_Of_Travelers;
	}
	public void setNumber_Of_Travelers(int number_Of_Travelers) {
		Number_Of_Travelers = number_Of_Travelers;
	}
	public String getOrigin_City() {
		return Origin_City;
	}
	public void setOrigin_City(String origin_City) {
		Origin_City = origin_City;
	}
	public String getDestination_City() {
		return Destination_City;
	}
	public void setDestination_City(String destination_City) {
		Destination_City = destination_City;
	}
	
	public Date getTravel_Date() {
		return Travel_Date;
	}
	public void setTravel_Date(Date travel_Date) {
		Travel_Date = travel_Date;
	}
	public String getLanguages_Spoken() {
		return Languages_Spoken;
	}
	public void setLanguages_Spoken(String languages_Spoken) {
		Languages_Spoken = languages_Spoken;
	}
	
	public String getTickets_booked() {
		return Tickets_booked;
	}
	public void setTickets_booked(String tickets_booked) {
		Tickets_booked = tickets_booked;
	}
	
	
	public TravelForm(int id, String name, String email, String phone, int number_Of_Travelers, String origin_City,
			String destination_City, Date travel_Date, String languages_Spoken, String tickets_booked,
			Timestamp bookingTime_Date) {
		super();
		Id = id;
		Name = name;
		Email = email;
		Phone = phone;
		Number_Of_Travelers = number_Of_Travelers;
		Origin_City = origin_City;
		Destination_City = destination_City;
		Travel_Date = travel_Date;
		Languages_Spoken = languages_Spoken;
		Tickets_booked = tickets_booked;
		BookingTime_Date = bookingTime_Date;
	}
	
	
	@Override
	public String toString() {
		return "TravelForm [Id=" + Id + ", Name=" + Name + ", Email=" + Email + ", Phone=" + Phone
				+ ", Number_Of_Travelers=" + Number_Of_Travelers + ", Origin_City=" + Origin_City
				+ ", Destination_City=" + Destination_City + ", Travel_Date=" + Travel_Date + ", Languages_Spoken="
				+ Languages_Spoken + ", Tickets_booked=" + Tickets_booked + ", BookingTime_Date=" + BookingTime_Date
				+ "]";
	}
	public TravelForm() {
	}
	
	
	
}
