package com.example.tasteofpangyoapi.restaurant.service;

import com.example.tasteofpangyoapi.restaurant.dto.RestaurantListRequestDto;
import com.example.tasteofpangyoapi.restaurant.dto.RestaurantListResponseDto;

import java.util.List;

public interface RestaurantService {
    List<RestaurantListResponseDto> restaurantList(RestaurantListRequestDto requestDto);
}
