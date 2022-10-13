package com.example.tasteofpangyoapi.domain.categorytb;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Setter
@Getter
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
