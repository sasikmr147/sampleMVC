package com.sample.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringApplication
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		ApplicationContext Context=new ClassPathXmlApplicationContext("application-contect.xml");
		
		JdbcTemplate jdbcTemplate=Context.getBean("template",JdbcTemplate.class);
		
		int t=jdbcTemplate.update("insert into rental_location values(?,?,?,?,?,?,?)",2,"Grostore","add1","add2","city2","state2","600028");
		
		System.out.println(t);
		
		
	}

}
