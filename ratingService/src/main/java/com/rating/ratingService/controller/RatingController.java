package com.rating.ratingService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.ratingService.entities.Rating;
import com.rating.ratingService.service.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@Autowired
	RatingService ratingService;
	
	@PostMapping
	ResponseEntity<Rating> createRating(@RequestBody Rating rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.crearteRating(rating)) ;
	}
	
	@GetMapping
	ResponseEntity<List<Rating>> getAll(){
		return ResponseEntity.status(HttpStatus.OK).body(ratingService.getAll());
	}
	@GetMapping("/user/{userId}")
	ResponseEntity<List<Rating>> getAllByUserID(@PathVariable int userId){
		return ResponseEntity.status(HttpStatus.OK).body(ratingService.getByUserId(userId));
	}
	@GetMapping("/hotel/{hotelId}")
	ResponseEntity<List<Rating>> getByHotelId(@PathVariable String hotelId){
		return ResponseEntity.status(HttpStatus.OK).body(ratingService.getByHotelId(hotelId));
	}


}
