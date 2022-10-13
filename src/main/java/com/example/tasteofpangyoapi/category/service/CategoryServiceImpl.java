package com.example.tasteofpangyoapi.category.service;

import com.example.tasteofpangyoapi.category.domain.CategoryListResponseParam;
import com.example.tasteofpangyoapi.category.repository.CategoryRepository;
import com.example.tasteofpangyoapi.domain.categorytb.CategoryTb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<CategoryListResponseParam> categoryTbList(){
        List<CategoryTb> categoryTbList = categoryRepository.findAllBy();

        List<CategoryListResponseParam> responseParamList = new ArrayList<>();
        for(CategoryTb categoryTb : categoryTbList){
            CategoryListResponseParam responseParam = new CategoryListResponseParam();
            responseParam.setCategoryId(categoryTb.getCategoryId());
            responseParam.setCategoryName(categoryTb.getCategoryName());
            responseParamList.add(responseParam);
        }

        return responseParamList;
    }
}
