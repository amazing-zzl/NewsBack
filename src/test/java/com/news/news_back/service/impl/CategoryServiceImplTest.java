package com.news.news_back.service.impl;

import com.news.news_back.dataobject.NewsCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() {
        NewsCategory newsCategory = categoryService.findOne(1);
        Assert.assertEquals(new  Integer (1),newsCategory.getCategoryId());
    }

    @Test
    public void findAll() {
        List<NewsCategory> newsCategoryList = categoryService.findAll();
        Assert.assertNotEquals(0,newsCategoryList.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<NewsCategory> newsCategoryList = categoryService.findByCategoryTypeIn(Arrays.asList(1,2,3,4));
        Assert.assertNotEquals(0,newsCategoryList.size());

    }

    @Test
    public void save() {
        NewsCategory newsCategory = new NewsCategory("我的新闻",3);
        NewsCategory result = categoryService.save(newsCategory);
        Assert.assertNotEquals(null,result);
    }
}