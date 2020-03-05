package com.news.news_back.controller;

import com.news.news_back.VO.MasterResultVO;
import com.news.news_back.dataobject.NewsCategory;
import com.news.news_back.dataobject.NewsInfo;
import com.news.news_back.service.NewsService;
import com.news.news_back.utils.MasterResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/master")
public class MasterNewsController {

    @Autowired
    private NewsService newsService;

    /**
     * 获取新闻数据，分页返回
     *
     * @param page
     * @param size
     * @return
     */
    @GetMapping("/news")
    public MasterResultVO getNewsList(@RequestParam(value = "pagenum", defaultValue = "1") Integer page,
                                      @RequestParam(value = "pagesize", defaultValue = "10") Integer size) {
        Sort sort = new Sort(Sort.Direction.DESC, "newsId");
        Pageable pageable = new PageRequest(page - 1, size, sort);
        Page<NewsInfo> newsInfoPage = newsService.findAll(pageable);
        return MasterResultVOUtil.success(newsInfoPage, "获取新闻列表成功");
    }

    /**
     * 添加新闻
     * post
     */
    @PostMapping("/addnews")
    public MasterResultVO addCategory(@RequestBody NewsInfo newsInfo) {
//        System.out.println(newsInfo);
        try {
            newsService.save(newsInfo);
            return MasterResultVOUtil.success(newsInfo, "添加成功");
        } catch (Exception e) {
            return MasterResultVOUtil.fail(e.getMessage());
        }

    }

    /**
     * 删除新闻
     */

    @GetMapping("/deletenews")
    public MasterResultVO deleteCategory(@RequestParam("newsId") Integer newsId) {

        try {
            newsService.deleteByNewsId(newsId);
            return MasterResultVOUtil.success(null,"删除成功");
        }catch (Exception e){
            return MasterResultVOUtil.fail(e.getMessage());
        }
    }
}