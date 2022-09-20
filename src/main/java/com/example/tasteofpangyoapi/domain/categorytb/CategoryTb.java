package com.example.tasteofpangyoapi.domain.categorytb;

import com.example.tasteofpangyoapi.domain.restauranttb.RestaurantTb;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Setter
@NoArgsConstructor
@Table(name="CATEGORY_TB")
public class CategoryTb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CATEGORY_ID", unique=true, nullable = false)
    private Long categoryId;

    @Column(name="CATEGORY_NAME")
    private String categoryName;

//    @OneToMany(mappedBy = "CATEGORY", cascade = CascadeType.MERGE, orphanRemoval = true)
//    private List<RestaurantTb> restaurantTb = new ArrayList<>();

    @Builder
    public CategoryTb(Long categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

}
