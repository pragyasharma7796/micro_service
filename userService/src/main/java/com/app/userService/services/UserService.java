package com.app.userService.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.userService.entities.Hotel;
import com.app.userService.entities.Rating;
import com.app.userService.entities.User;
import com.app.userService.exception.ResourceNotFoundException;
import com.app.userService.external.service.HotelService;
import com.app.userService.repository.UserRepository;

@Service
public class UserService implements UserServiceInt{
	UserRepository  repository;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	HotelService hotelService;
	
	UserService(UserRepository  repository){
		this.repository = repository;
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		User user =repository.findById(id).orElseThrow(()->new ResourceNotFoundException("User with give id not found iin server : "+id));
		
		Rating[] ratingList = restTemplate.getForObject("http://RATINGSERVICE/rating/user/1", Rating[].class);
		
		List<Rating> ratings = Arrays.stream(ratingList).toList();
		
		List<Rating> ratingL = ratings.stream().map(rating-> {
//		Hotel hotel = restTemplate.getForEntity("http://HOTELSERVICE/hotels/"+rating.getHotelId(), Hotel.class).getBody() ;
			Hotel hotel = hotelService.getHotelById(rating.getHotelId());
		rating.setHotel(hotel); 
		return rating; 
		}).collect(Collectors.toList());
		user.setRating(ratingL);
		return user;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		
		return repository.save(user);
	}

}
