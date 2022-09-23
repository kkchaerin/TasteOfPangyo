package com.example.tasteofpangyoapi;

import com.example.tasteofpangyoapi.domain.categorytb.CategoryTb;
import com.example.tasteofpangyoapi.domain.restauranttb.RestaurantTb;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TasteOfPangyoApiApplication {

	@Autowired
	private JPAQueryFactory query;

//	@Autowired
//	private CategoryTb categoryTb;
//
//	@Autowired
//	private RestaurantTb restaurantTb;

	public static void main(String[] args) {
		SpringApplication.run(TasteOfPangyoApiApplication.class, args);
	}

}
