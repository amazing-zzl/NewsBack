package com.news.news_back.controller;

import com.news.news_back.VO.ResultVO;
import com.news.news_back.dataobject.NewsInfo;
import com.news.news_back.service.NewsService;
import com.news.news_back.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserNewsListController {

    private final NewsService newsService;

    @Autowired
    public UserNewsListController(NewsService newsService) {
        this.newsService = newsService;
    }
    @GetMapping("/newsList")
    public ResultVO<Page> newsList(@RequestParam("categoryType") Integer category,
                             @RequestParam(value = "pageNum",defaultValue = "1") Integer page,
                             @RequestParam(value = "size",defaultValue = "10") Integer size){
        Sort sort = new Sort(Sort.Direction.DESC, "newsId");
        Pageable pageable = new PageRequest(page-1,size,sort);
        Page<NewsInfo> newsInfoPage = newsService.findList(category,pageable);

        ResultVO<Page> resultVO = new ResultVO<>();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(newsInfoPage);
        return resultVO;
    }

}
