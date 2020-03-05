package com.news.news_back.VO;


import lombok.Data;

import java.util.HashMap;

@Data
public class MasterResultVO<T> {
    private T data;
    private HashMap<String,Object> meta =new HashMap<>();

    public MasterResultVO(T data, String msg, Integer status) {
        meta.put("msg",msg);
        meta.put("status",status);
        this.data = data;
    }

}
