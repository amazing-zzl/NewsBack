package com.news.news_back.service.impl;

import com.news.news_back.dataobject.NewsCategory;
import com.news.news_back.repository.NewsCategoryRepository;
import com.news.news_back.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private NewsCategoryRepository repository;

    @Override
    public NewsCategory findOne(Integer categoryId) {
        return repository.findOne(categoryId);
    }

    @Override
    public List<NewsCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<NewsCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public NewsCategory save(NewsCategory newsCategory) {
        return repository.save(newsCategory);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByCategoryId(Integer categoryId) {
        repository.deleteByCategoryId(categoryId);
    }
}
