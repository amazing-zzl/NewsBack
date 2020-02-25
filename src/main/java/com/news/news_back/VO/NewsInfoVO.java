package com.news.news_back.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import java.util.Date;

/**
 * 新闻详情
 */
@Data
@DynamicUpdate
public class NewsInfoVO {

    @JsonProperty("id")
    private Integer newsId;

    @JsonProperty("title")
    private String newsTitle;

    @JsonProperty("content")
    private String newsContent;


    @JsonProperty("isreview")
    private Integer newsIsreview;

    private Date updateTime;
}
