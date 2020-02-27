package com.news.news_back.service.impl;

import com.news.news_back.dataobject.NewsInfo;
import com.news.news_back.enums.NewsReviewEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsServiceImplTest {

    @Autowired
    private NewsServiceImpl newsService;

    @Test
    public void findOne() {
        NewsInfo newsInfo = newsService.findOne(1);
        Assert.assertEquals(new Integer(1),newsInfo.getNewsId());
    }

    @Test
    public void findUpAll() {
        List<NewsInfo> newsInfoList = newsService.findUpAll();
        Assert.assertNotEquals(0,newsInfoList.size());
    }

    @Test
    public void findAll() {
        PageRequest request = new PageRequest(0,6);
        Page<NewsInfo> newsInfoPage = newsService.findAll(request);
        System.out.println(newsInfoPage.getTotalElements());
    }

    @Test
    public void save() {
        NewsInfo newsInfo = new NewsInfo();
        newsInfo.setNewsId(24212);
        newsInfo.setNewsTitle("这是我们的第5条新闻");
        newsInfo.setNewsContent("这是我们的第2222222222222222条新闻的内容");
        newsInfo.setNewsCategory(5);
        newsInfo.setNewsIsreview(NewsReviewEnum.NO.getCode());
        NewsInfo result = newsService.save(newsInfo);
        Assert.assertNotEquals(null,result);
    }
}