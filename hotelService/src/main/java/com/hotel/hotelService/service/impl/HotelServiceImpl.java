package com.hotel.hotelService.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.hotelService.entities.Hotel;
import com.hotel.hotelService.exception.ResourceNotFoundException;
import com.hotel.hotelService.repositories.HotelRepo;
import com.hotel.hotelService.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	HotelRepo hotelRepo;

	@Override
	public Hotel createHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return hotelRepo.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotel() {
		// TODO Auto-generated method stub
		return hotelRepo.findAll();
	}

	@Override
	public Hotel getHotelById(String id) {
		// TODO Auto-generated method stub
		return hotelRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Resource data not found for id :"+id));
	}

}
