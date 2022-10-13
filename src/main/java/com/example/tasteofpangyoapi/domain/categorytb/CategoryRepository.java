package com.example.tasteofpangyoapi.domain.categorytb;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryTb, Long> {
    CategoryTb findByCategoryName(String categoryName);
}
