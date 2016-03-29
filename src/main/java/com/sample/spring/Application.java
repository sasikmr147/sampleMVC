package com.sample.spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.spring.data.entities.Media;
import com.sample.spring.data.entities.RentalLocation;
import com.sample.spring.data.repositories.RentalLocationRepository;
import com.sample.spring.data.services.RentalService;

public class Application {
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("application-contect.xml");
		RentalService repo=context.getBean(RentalService.class);
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter a title");
		String tit=s.nextLine();
		List<Media> medias=repo.findTitle(tit);
		System.out.println(tit);
		//System.out.println(medias.get(0).getLocation().getName());
		if(medias.isEmpty())
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println("find the below locations");
			for (int i = 0; i <medias.size(); i++) 
			{
				System.out.printf("%d. %s\n",i+1, medias.get(i).getLocation().getName());
				
			}
		}

	}
	

	
}
