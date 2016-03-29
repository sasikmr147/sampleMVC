package com.sample.spring.data.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.context.annotation.Bean;

@Entity
@Table(name="Rental_Location")
public class RentalLocation 
{
	@Id
	@Column(name="rental_location_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer rentallocationid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address1")
	private String address1;
	
	@Column(name="address2")
	private String address2;
	
	@Column(name="State")
	private String State;
	
	@Column(name="city")
	private String city;
	
	@Column(name="postal_code")
	private String postal_code;
	
	@Transient
	public Media media;
	
	public Media getMedia() 
	{
		return media;
	}
	public void setMedia(Media media) 
	{
		this.media = media;
	}
//	private List<Media> media=new ArrayList<Media>();
	
	public Integer getRentallocationid() {
		return rentallocationid;
	}
	public void setRentallocationid(Integer rentallocationid) {
		this.rentallocationid = rentallocationid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	/*public List<Media> getMedia() 
	{
		return media;
	}
	
	public void setMedia(List<Media> media) 
	{
		this.media = media;
	}*/

}
     