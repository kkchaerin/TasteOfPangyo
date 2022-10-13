package com.example.tasteofpangyoapi.domain.restauranttb;

import com.example.tasteofpangyoapi.domain.categorytb.CategoryTb;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@NoArgsConstructor
@Table(name="RESTAURANT_TB")
public class RestaurantTb {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="RESTAURANT_ID", unique=true, nullable = false)
    private Long restaurantId;

    @Column(name="RESTAURANT_NAME")
    private String restaurantName;

//    @ManyToOne(cascade = CascadeType.MERGE, targetEntity = CategoryTb.class)
//    @JoinColumn(name = "CATRGORY_ID")
//    private CategoryTb category;
    @Column(name="category_id")
    private long categoryId;

    @Column(name="LOCATION")
    private String location;

    @Column(name="LATITUDE")
    private String latitude;

    @Column(name="LONGITUDE")
    private String longitude;

    @Builder
    public RestaurantTb(Long restaurantId, String restaurantName, CategoryTb category, String location, String latitude, String longitude){
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
//        this.category = category;
        this.location = location;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
