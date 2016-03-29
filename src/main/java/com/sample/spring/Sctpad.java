package com.sample.spring;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.spring.data.entities.Media;
import com.sample.spring.data.repositories.MediaRepository;
import com.sample.spring.data.repositories.RentalLocationRepository;


public class Sctpad 
{ 
	
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("application-contect.xml");
		MediaRepository repo=context.getBean(MediaRepository.class);

//		repo.save(getmedia());
		List<Media> media= repo.findByRating(10);
		
		
		for (Media media2 : media) 
		{
			System.out.println(media2.getTitle()+media2.getFormat());
			
		}
	}
	public static Media getmedia()
	{
		Media media=new Media();
		media.setTitle("The Wolf of wall Street");
		media.setFormat("VCD");
		media.setRating(5);
		media.setLength(220);
		return media;
	}

}
