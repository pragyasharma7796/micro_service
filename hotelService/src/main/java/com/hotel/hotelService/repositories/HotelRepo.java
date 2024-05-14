package com.hotel.hotelService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.hotelService.entities.Hotel;

public interface HotelRepo extends JpaRepository<Hotel,String>{

}
