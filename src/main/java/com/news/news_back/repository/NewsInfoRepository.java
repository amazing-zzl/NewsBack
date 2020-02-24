package com.news.news_back.repository;

import com.news.news_back.dataobject.NewsInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewsInfoRepository extends JpaRepository<NewsInfo,String> {
    List<NewsInfo> findByNewsIsreview(Integer newsIsreview);
}
