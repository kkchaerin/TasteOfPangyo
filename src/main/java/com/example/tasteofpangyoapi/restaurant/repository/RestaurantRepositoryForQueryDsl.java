package com.example.tasteofpangyoapi.restaurant.repository;

import com.example.tasteofpangyoapi.restaurant.dto.RestaurantListResponseDto;
import com.querydsl.jpa.impl.JPAQueryFactory;

import java.util.List;

public interface RestaurantRepositoryForQueryDsl {
    List<RestaurantListResponseDto> restaurantList();
}
