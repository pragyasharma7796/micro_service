package com.rating.ratingService.service;

import java.util.List;

import com.rating.ratingService.entities.Rating;

public interface RatingService {
	
	//create
	
	Rating crearteRating(Rating rating) ;
	
	//getAll
	List<Rating> getAll();
	
	
	//get rating by user Id
	List<Rating> getByUserId(int userId);
	
	//get rating by hotelId
	List<Rating> getByHotelId(String hotelId);

}
