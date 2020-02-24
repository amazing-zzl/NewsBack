package com.news.news_back.repository;

import com.news.news_back.dataobject.NewsInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsInfoRepositoryTest {

    @Autowired
    private NewsInfoRepository repository;

    @Test
    public void saveTest(){
        NewsInfo newsInfo = new NewsInfo();
        newsInfo.setNewsId("123456");
        newsInfo.setNewsTitle("这是我们的第一条新闻");
        newsInfo.setNewsContent("这是我们的第一条新闻的内容");
        newsInfo.setNewsCategory(1);
        newsInfo.setNewsIsreview(1);
        NewsInfo result =  repository.save(newsInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByNewsIsreview() {
        List<NewsInfo> newsInfoList = repository.findByNewsIsreview(1);
        Assert.assertNotEquals(0,newsInfoList.size());

    }
}