package com.news.news_back.repository;

import com.news.news_back.dataobject.NewsInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NewsInfoRepository extends JpaRepository<NewsInfo,Integer> {
    List<NewsInfo> findByNewsIsreview(Integer newsIsreview);
    NewsInfo findByNewsId(Integer newsId);
    void deleteByNewsId(Integer newsId);
    Page<NewsInfo> findByNewsCategory(Integer newsCategory, Pageable pageable);
}
