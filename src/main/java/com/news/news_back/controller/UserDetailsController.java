package com.news.news_back.controller;

import com.news.news_back.VO.ResultVO;
import com.news.news_back.dataobject.NewsInfo;
import com.news.news_back.service.NewsService;
import com.news.news_back.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 新闻详情页
 */
@RestController
@RequestMapping("/user/news")
public class UserDetailsController{

    private final NewsService newsService;

    @Autowired
    public UserDetailsController(NewsService newsService) {
        this.newsService = newsService;
    }
    /**
     * @param id
     * GET url:news_back/user/news/details?id=" + id
     * url参数中的id必须要于RequestParam中的参数名相同
     */
    @GetMapping("/details")
    public ResultVO Details(@RequestParam("id") Integer id){
        //1.根据新闻id，查询新闻
        NewsInfo newsDetails = newsService.findOne(id);
        //2.组装数据返回
        return ResultVOUtil.success(newsDetails);

    }
}
