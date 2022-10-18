package com.example.tasteofpangyoapi.restaurant.repository;

import com.example.tasteofpangyoapi.domain.categorytb.QCategoryTb;
import com.example.tasteofpangyoapi.domain.restauranttb.QRestaurantTb;
import com.example.tasteofpangyoapi.restaurant.dto.RestaurantListResponseDto;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import static java.util.Objects.isNull;

@Repository
public class RestaurantRepositoryImpl implements RestaurantRepositoryForQueryDsl{

    @PersistenceContext
    EntityManager em;

    @Override
    public List<RestaurantListResponseDto> restaurantList(List<Long> categoryIdList) {
        JPAQueryFactory queryFactory = new JPAQueryFactory(em);

        QRestaurantTb qRestaurantTb = QRestaurantTb.restaurantTb;
        QCategoryTb qCategoryTb = QCategoryTb.categoryTb;

        BooleanBuilder builder = new BooleanBuilder();

        if(categoryIdList.size() > 0){
            builder.and(qRestaurantTb.categoryId.in(categoryIdList));
        }

        return queryFactory.select(
                Projections.fields(
                                RestaurantListResponseDto.class
                        ,qRestaurantTb.restaurantId
                        ,qRestaurantTb.restaurantName
                        ,qRestaurantTb.latitude
                        ,qRestaurantTb.longitude
                        ,qCategoryTb.categoryName
                )
        ).from(qRestaurantTb)
                .join(qCategoryTb)
                .on(qRestaurantTb.categoryId.eq(qCategoryTb.categoryId))
                .where(builder)
                .fetch();
    }
}
