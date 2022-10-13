package com.example.tasteofpangyoapi.restaurant.dto;

import lombok.Data;

@Data
public class RestaurantListResponseDto {
    private long restaurantId;

    private String restaurantName;

    private String latitude;

    private String longitude;

    private String categoryName;
}
