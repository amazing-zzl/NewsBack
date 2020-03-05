package com.news.news_back.controller;


import com.news.news_back.VO.MasterResultVO;
import com.news.news_back.utils.MasterResultVOUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/master")
public class MasterLoginController {

    @GetMapping("/login")
    public MasterResultVO Login(){
        //返回login的json信息，逻辑处理之后再做
        try {
            //拼接返回对象
            HashMap<Object, Object> data = new HashMap<>();
            data.put("id","500");
            data.put("name","admin");
            //生成token返回给客户端
            data.put("token","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjUwMCwicmlkIjowLCJpYXQiOjE1MTI1NDQyOTksImV4cCI6MTUxMjYzMDY5OX0.eGrsrvwHm-tPsO9r_pxHIQ5i5L1kX9RX444uwnRGaIM\"");
            return MasterResultVOUtil.success(data,"登录成功");
        } catch (Exception e) {
            //登录失败
            return MasterResultVOUtil.fail(e.getMessage());
        }

    }

}
