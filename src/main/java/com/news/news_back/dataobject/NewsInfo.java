package com.news.news_back.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class NewsInfo {
    @Id
    private String newsId;

    /*标题*/
    private String newsTitle;

    /*内容*/
    private String newsContent;

    /*类别*/
    private Integer newsCategory;

    /*是否可评论,1表示可以*/
    private Integer newsIsreview;
}
