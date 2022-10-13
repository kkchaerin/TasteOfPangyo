package com.example.tasteofpangyoapi.category.controller;

import com.example.tasteofpangyoapi.category.domain.CategoryListResponseParam;
import com.example.tasteofpangyoapi.category.service.CategoryService;
import com.example.tasteofpangyoapi.domain.categorytb.CategoryTb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tast-of-panqyo/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("category-list")
    public List<CategoryListResponseParam> categoryTbList(){
        return categoryService.categoryTbList();
    }

}
