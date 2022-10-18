package com.example.tasteofpangyoapi.restaurant.repository;

import com.example.tasteofpangyoapi.restaurant.dto.RestaurantListResponseDto;

import java.util.List;

public interface RestaurantRepositoryForQueryDsl {
    List<RestaurantListResponseDto> restaurantList(List<Long> categoryIdList);
}
