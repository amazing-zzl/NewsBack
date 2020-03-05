package com.news.news_back.service;

import com.news.news_back.dataobject.NewsInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface NewsService {

    NewsInfo findOne(Integer newsId);

    /*查询可评论的新闻*/
    List<NewsInfo> findUpAll();

    Page<NewsInfo> findAll(Pageable pageable);

    NewsInfo save(NewsInfo newsInfo);

    void deleteByNewsId(Integer newsId);

    Page<NewsInfo> findList(Integer category,Pageable pageable);
}
