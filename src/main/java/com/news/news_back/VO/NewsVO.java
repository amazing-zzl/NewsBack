package com.news.news_back.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 新闻（包含新闻类型）
 */
@Data
public class NewsVO {

    private String categoryName;

    private Integer categoryType;

    @JsonProperty("newsInfo")
    private List<NewsInfoVO> newsInfoVOList;
}
