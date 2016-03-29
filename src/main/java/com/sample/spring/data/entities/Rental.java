package com.sample.spring.data.entities;

import java.util.Date;

public class Rental 
{
	
	private Integer rental_id; 
	private Media media;
	private RentalLocation pickup_location;
	private RentalLocation return_location;
	private Date pickup_date;
	private Date return_date;
	public Integer getRental_id() {
		return rental_id;
	}
	public void setRental_id(Integer rental_id) {
		this.rental_id = rental_id;
	}
	public Media getMedia() {
		return media;
	}
	public void setMedia(Media media) {
		this.media = media;
	}
	public RentalLocation getPickup_location() {
		return pickup_location;
	}
	public void setPickup_location(RentalLocation pickup_location) {
		this.pickup_location = pickup_location;
	}
	public RentalLocation getReturn_location() {
		return return_location;
	}
	public void setReturn_location(RentalLocation return_location) {
		this.return_location = return_location;
	}
	public Date getPickup_date() {
		return pickup_date;
	}
	public void setPickup_date(Date pickup_date) {
		this.pickup_date = pickup_date;
	}
	public Date getReturn_date() {
		return return_date;
	}
	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}
	
	


}
