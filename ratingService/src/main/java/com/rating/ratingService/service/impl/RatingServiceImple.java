package com.rating.ratingService.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.ratingService.entities.Rating;
import com.rating.ratingService.repository.RatingRepository;
import com.rating.ratingService.service.RatingService;


@Service
public class RatingServiceImple implements RatingService {
	@Autowired
	 RatingRepository ratingRepository;
	@Override
	public Rating crearteRating(Rating rating) {
		// TODO Auto-generated method stub
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getAll() {
		// TODO Auto-generated method stub
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getByUserId(int userId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> getByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByHotelId(hotelId);
	}

}
