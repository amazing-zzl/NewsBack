package com.news.news_back.repository;

import com.news.news_back.dataobject.NewsCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewsCategoryRepository extends JpaRepository<NewsCategory,Integer> {

    List<NewsCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
