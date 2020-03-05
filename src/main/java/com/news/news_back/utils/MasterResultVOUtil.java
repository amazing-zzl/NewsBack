package com.news.news_back.utils;

import com.news.news_back.VO.MasterResultVO;
import com.news.news_back.enums.MasterStatusCode;

public class MasterResultVOUtil {

    public static MasterResultVO success(Object data, String message) {
        return buildResult(data,message, MasterStatusCode.SUCCESS.code);
    }

    public static MasterResultVO fail(String message) {
        return buildResult(null,message,MasterStatusCode.FAIL.code);
    }

    public static MasterResultVO buildResult(Object data, String message,Integer resultCode) {
        return new MasterResultVO(data, message, resultCode);
    }
}
