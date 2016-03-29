package com.sample.spring.data.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.spring.data.entities.Media;
import com.sample.spring.data.entities.Rental;
import com.sample.spring.data.repositories.MediaRepository;
import com.sample.spring.data.repositories.RentalLocationRepository;

@Service
public class RentalService 
{
	@Autowired
	private MediaRepository mediaRepository;
	
	@Autowired
	private RentalLocationRepository locationRepository;

	@Transactional
	public List<Media> findTitle(String title)
	{
		List<Media> m=new ArrayList<Media>();
		System.out.println("get this " + title);
		m=mediaRepository.findByTitle(title);
		return m;//this.mediaRepository.findByTitle(title);
		
	}
	
	@Transactional
	public void rent(Media media)
	{
		Rental rental=new Rental();
		media.setIs_available(false);
		
		rental.setPickup_date(new Date());
		rental.setPickup_location(media.getLocation());
		rental.setMedia(media);
		
		media.getLocation().getMedia().getRentallocationid();
		mediaRepository.save(media);
	}

}
