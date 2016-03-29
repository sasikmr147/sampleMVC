package com.sample.spring.data.repositories;

public interface Repo<T> 
{
	public void insert(T entity);
	public void udpate(T entity);
	public void delete(T entity);
	public T findByID();
	

}
