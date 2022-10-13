package com.example.tasteofpangyoapi.category.repository;

import com.example.tasteofpangyoapi.category.domain.CategoryListResponseParam;
import com.example.tasteofpangyoapi.domain.categorytb.CategoryTb;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<CategoryTb, Long> {
    List<CategoryTb> findAllBy();
}
