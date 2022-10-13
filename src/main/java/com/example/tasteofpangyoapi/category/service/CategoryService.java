package com.example.tasteofpangyoapi.category.service;

import com.example.tasteofpangyoapi.category.domain.CategoryListResponseParam;

import java.util.List;

public interface CategoryService {
    List<CategoryListResponseParam> categoryTbList();
}
