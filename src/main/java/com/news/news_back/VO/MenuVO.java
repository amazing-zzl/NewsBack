package com.news.news_back.VO;

import com.news.news_back.dataobject.Menu;
import lombok.Data;

import java.util.List;

@Data
public class MenuVO{
    private Integer id;
    private String authName;
    private String path;
    private List<Menu> children;

}

