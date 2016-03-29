package com.sample.spring.data.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.transaction.TransactionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name="media")
public class Media 
{
	@Id
	@Column(name="media_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer mediaid;
	
	@Column(name="title")
	private String title;

	@Column(name="format")
	private String format;
	
	@Column(name="length")
	private Integer length;
	
	@Column(name="rating")
	private Integer rating;

	@Column(name="is_available")
	private Boolean is_available;

	@Column(name="rental_location_id")
	private Integer rentallocationid  ;
	
	public void setRentallocationid(Integer rentallocationid) 
	{
		this.rentallocationid = rentallocationid;
	}
	
	public Integer getRentallocationid() 
	{
		return rentallocationid;
	}
	
	@Transient
	public RentalLocation location;
	
	
	public RentalLocation getLocation() {
		return location;
	}

	public void setLocation(RentalLocation location) {
		this.location = location;
	}

	public Integer getMediaid() 
	{
		return mediaid;
	}

	public void setMediaid(Integer mediaid) 
	{
		this.mediaid = mediaid;
	}

	public String getTitle() 
	{
		return title;
	}


	public void setTitle(String title) 
	{
		this.title = title;
	}

	public String getFormat() 
	{
		return format;
	}

	public void setFormat(String format) 
	{
		this.format = format;
	}

	public Integer getLength() 
	{
		return length;
	}

	public void setLength(Integer length) 
	{
		this.length = length;
	}

	public Integer getRating() 
	{
		return rating;
	}

	public void setRating(Integer rating) 
	{
		this.rating = rating;
	}

	public Boolean getIs_available() 
	{
		return is_available;
	}
	public void setIs_available(Boolean is_available) 
	{
		this.is_available = is_available;
	}
	
}