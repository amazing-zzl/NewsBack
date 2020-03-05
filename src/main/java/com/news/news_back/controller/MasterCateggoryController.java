package com.news.news_back.controller;

import com.news.news_back.VO.MasterResultVO;
import com.news.news_back.dataobject.NewsCategory;
import com.news.news_back.service.CategoryService;
import com.news.news_back.utils.MasterResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/master")
public class MasterCateggoryController {

    private final CategoryService categoryService;

    @Autowired
    public MasterCateggoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    /*
    获取新闻列表
     */
    @GetMapping("/categories")
    public MasterResultVO getCategory(){
        List<NewsCategory> newsCategoryList = categoryService.findAll();
        return MasterResultVOUtil.success(newsCategoryList,"查询成功");
    }

    /*
    添加新闻
     */
    @PostMapping("/categories")
    public MasterResultVO addCategory(@RequestBody NewsCategory newsCategory){
//        System.out.println(newsCategory);
//        NewsCategory newsCategory1 = new NewsCategory();
//        BeanUtils.copyProperties(newsCategory,newsCategory1);
        try{
            categoryService.save(newsCategory);
            return MasterResultVOUtil.success(newsCategory,"添加成功");
        }catch (Exception e){
            return MasterResultVOUtil.fail(e.getMessage());
        }


    }

    /**
     * 修改新闻列表
     */
    @GetMapping("/alterCategories")
    public MasterResultVO addCategory(@RequestParam("categoryId") Integer categoryId){
        try{
            NewsCategory newsCategory = categoryService.findOne(categoryId);
            return MasterResultVOUtil.success(newsCategory,"查询成功");
        }catch (Exception e){
            return MasterResultVOUtil.fail(e.getMessage());
        }


    }

    /**
     * 删除新闻列表
     */
    @GetMapping("/deleteCategory")

    public MasterResultVO deleteCategory(@RequestParam("categoryId") Integer categoryId) {

        try {
            categoryService.deleteByCategoryId(categoryId);
            return MasterResultVOUtil.success(null,"删除成功");
        }catch (Exception e){
            return MasterResultVOUtil.fail(e.getMessage());
        }
    }




}
