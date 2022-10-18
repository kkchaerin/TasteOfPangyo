package com.example.tasteofpangyoapi.restaurant.controller;

import com.example.tasteofpangyoapi.restaurant.dto.RestaurantListRequestDto;
import com.example.tasteofpangyoapi.restaurant.dto.RestaurantListResponseDto;
import com.example.tasteofpangyoapi.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tast-of-panqyo/restaurant")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @PostMapping(value="/restaurant-list")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<RestaurantListResponseDto> restaurantList(@RequestBody RestaurantListRequestDto requestDto){
        return restaurantService.restaurantList(requestDto);
    }
}
