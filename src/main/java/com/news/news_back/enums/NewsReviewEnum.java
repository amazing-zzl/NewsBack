package com.news.news_back.enums;

import lombok.Getter;

/*
* 新闻是否可评论枚举
*/
@Getter
public enum NewsReviewEnum {
    YES(1,"可评论"),
    NO(0,"不可评论");

    private Integer code;
    private String msg;

    NewsReviewEnum(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }

}

