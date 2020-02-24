package com.news.news_back.service;

import com.news.news_back.dataobject.NewsCategory;

import java.util.List;

public interface CategoryService {
    NewsCategory findOne(Integer categoryId);

    List<NewsCategory> findAll();

    List<NewsCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    NewsCategory save(NewsCategory newsCategory);
}
