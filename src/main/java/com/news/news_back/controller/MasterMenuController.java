package com.news.news_back.controller;

import com.news.news_back.VO.MasterResultVO;
import com.news.news_back.VO.MenuVO;
import com.news.news_back.dataobject.Menu;
import com.news.news_back.utils.MasterResultVOUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/master")
public class MasterMenuController {

    @GetMapping("/menu")
    public MasterResultVO Getmenu(){
        List<MenuVO> menuVOArrayList = new ArrayList<>();
        //第一个大类
        MenuVO menuVO = new MenuVO();
        menuVO.setId(101);
        menuVO.setAuthName("项目管理");
        menuVO.setPath(null);
        List<Menu> menuList = new ArrayList<>();
        Menu menu = new Menu();
        menu.setId(102);
        menu.setAuthName("新闻列表");
        menu.setPath("newsList");
        menuList.add(menu);

        Menu menu1 = new Menu();
        menu1.setId(104);
        menu1.setAuthName("新闻分类");
        menu1.setPath("category");
        menuList.add(menu1);
        menuVO.setChildren(menuList);
        menuVOArrayList.add(menuVO);
        //第二个
        MenuVO menu2 = new MenuVO();
        menu2.setId(125);
        menu2.setAuthName("成员管理");
        menu2.setPath("null");
        menuVOArrayList.add(menu2);

        MenuVO menu3 = new MenuVO();
        menu3.setId(145);
        menu3.setAuthName("数据分析");
        menu3.setPath(null);
        menuVOArrayList.add(menu3);

        MenuVO menu4 = new MenuVO();
        menu4.setId(103);
        menu4.setAuthName("关于我们");
        menu4.setPath(null);
        menuVOArrayList.add(menu4);
        return MasterResultVOUtil.success(menuVOArrayList,"获取菜单成功");
    }


}
