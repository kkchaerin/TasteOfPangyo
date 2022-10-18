package com.example.tasteofpangyoapi.restaurant.dto;

import lombok.Data;

import java.util.List;

@Data
public class RestaurantListRequestDto {
    private List<Long> categoryIdList;
}
