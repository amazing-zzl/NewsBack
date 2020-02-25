package com.news.news_back.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@DynamicUpdate
public class NewsInfo {
    @Id
    private Integer newsId;

    /*标题*/
    private String newsTitle;

    /*内容*/
    private String newsContent;

    /*类别*/
    private Integer newsCategory;

    /*是否可评论,1表示可以*/
    private Integer newsIsreview;

    /*更新时间*/
    private Date updateTime;
}
