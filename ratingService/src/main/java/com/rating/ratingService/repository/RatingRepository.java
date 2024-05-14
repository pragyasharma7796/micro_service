package com.rating.ratingService.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.rating.ratingService.entities.Rating;

public interface RatingRepository extends MongoRepository<Rating, String> {
	
	List<Rating> findByUserId(int userId);
	
	
	List<Rating> findByHotelId(String hotelId);

}
