package com.news.news_back.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@DynamicUpdate
@Data
public class NewsCategory {
    /*类目id*/
    @Id
    @GeneratedValue
    private Integer categoryId;

    /*类目名字*/
    @NotNull(message = "类目名称不能空。")
    private String categoryName;

    /*类目编号*/
    @NotNull(message = "类目编号不能空。")
    private Integer categoryType;

    /*是否可评论，默认为1*/
    private Integer newsIsreview;

    /*创建时间*/
    private Date createTime;

    public NewsCategory(){}

    public NewsCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
