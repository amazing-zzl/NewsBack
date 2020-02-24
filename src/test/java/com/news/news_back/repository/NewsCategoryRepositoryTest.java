package com.news.news_back.repository;

import com.news.news_back.dataobject.NewsCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.criteria.CriteriaBuilder;
import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsCategoryRepositoryTest {
    @Autowired
    private NewsCategoryRepository repository;

    @Test
    public void findOneTest(){
        NewsCategory newsCategory = repository.findOne(1);
        System.out.println(newsCategory.toString());
    }

    @Test
    @Transactional
    public void saveTest(){
        NewsCategory newsCategory = new NewsCategory("校园新闻",5);
        NewsCategory result = repository.save(newsCategory);
        Assert.assertNotNull(result);
    }
    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(3,4);
        List<NewsCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }





}