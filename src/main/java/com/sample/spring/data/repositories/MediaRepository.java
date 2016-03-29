package com.sample.spring.data.repositories;

import java.util.List;

import javax.persistence.NamedQuery;

import org.jboss.logging.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.sample.spring.data.entities.Media;

@Repository
public interface MediaRepository extends JpaRepository<Media, Integer> 
{
	@Query
	public List<Media> findByTitle(String title); 
	
	@Query
	public List<Media> findByRating(Integer rating);
	

	
}
