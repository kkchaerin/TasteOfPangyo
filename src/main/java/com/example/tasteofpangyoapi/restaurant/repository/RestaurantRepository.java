package com.example.tasteofpangyoapi.restaurant.repository;

import com.example.tasteofpangyoapi.domain.restauranttb.RestaurantTb;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<RestaurantTb, Long>, RestaurantRepositoryForQueryDsl {
}

