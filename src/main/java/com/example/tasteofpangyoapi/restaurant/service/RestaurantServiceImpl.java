package com.example.tasteofpangyoapi.restaurant.service;

import com.example.tasteofpangyoapi.restaurant.dto.RestaurantListResponseDto;
import com.example.tasteofpangyoapi.restaurant.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService{

    @Autowired
    RestaurantRepository restaurantRepository;

    @Override
    public List<RestaurantListResponseDto> restaurantList() {
        return restaurantRepository.restaurantList();
    }
}
