package com.news.news_back.enums;

import lombok.Getter;

@Getter
public enum MasterStatusCode {
    SUCCESS(200),
    FAIL(400);
    public int code;

    MasterStatusCode(int code) {
        this.code = code;
    }
}
