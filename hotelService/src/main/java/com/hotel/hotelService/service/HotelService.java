package com.hotel.hotelService.service;

import java.util.List;

import com.hotel.hotelService.entities.Hotel;

public interface HotelService {
	//create hotel
	
	Hotel createHotel(Hotel hotel);
	//get All Hotel
	
	List<Hotel> getAllHotel();
	//getHotel By id
	
	Hotel getHotelById(String id);
}
