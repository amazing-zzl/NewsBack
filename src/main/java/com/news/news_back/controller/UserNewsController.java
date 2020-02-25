package com.news.news_back.controller;

import com.news.news_back.VO.NewsInfoVO;
import com.news.news_back.VO.NewsVO;
import com.news.news_back.VO.ResultVO;
import com.news.news_back.dataobject.NewsCategory;
import com.news.news_back.dataobject.NewsInfo;
import com.news.news_back.service.CategoryService;
import com.news.news_back.service.NewsService;
import com.news.news_back.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user/news")
public class UserNewsController {

    private final NewsService newsService;

    private final CategoryService categoryService;

    @Autowired
    public UserNewsController(NewsService newsService, CategoryService categoryService) {
        this.newsService = newsService;
        this.categoryService = categoryService;
    }

    @GetMapping("/list")
    public ResultVO list(){
        // 1.查询所有新闻
        PageRequest request = new PageRequest(0,6);
        Page<NewsInfo> newsInfoPage = newsService.findAll(request);
        List<NewsInfo> newsInfoList = newsInfoPage.getContent();

        // 2.查询类目
        List<Integer> categoryTypeList = new ArrayList<>();
        for (NewsInfo newsInfo : newsInfoList){
            categoryTypeList.add(newsInfo.getNewsCategory());
        }
        List<NewsCategory> newsCategoryList = categoryService.findByCategoryTypeIn(categoryTypeList);

        // 3.数据拼装
        List<NewsVO> newsVOList = new ArrayList<>();
        for(NewsCategory newsCategory : newsCategoryList){
            NewsVO newsVO = new NewsVO();
            newsVO.setCategoryType(newsCategory.getCategoryType());
            newsVO.setCategoryName(newsCategory.getCategoryName());

            //遍历新闻详情newsInfo
             List<NewsInfoVO> newsInfoVOList = new ArrayList<>();
            for (NewsInfo newsInfo : newsInfoList){
                if(newsInfo.getNewsCategory().equals(newsCategory.getCategoryType())){
                    NewsInfoVO newsInfoVO = new NewsInfoVO();
                    BeanUtils.copyProperties(newsInfo,newsInfoVO);
                    newsInfoVOList.add(newsInfoVO);
                }
            }
            newsVO.setNewsInfoVOList(newsInfoVOList);
            newsVOList.add(newsVO);
        }

        return ResultVOUtil.success(newsVOList);
    }
}
