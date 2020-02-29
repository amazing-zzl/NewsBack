# API

###新闻主页
```
GET /news_back/user/news/index
```

参数

```
无
```

返回

```
{
    "code": 0,
    "msg": "成功",
    "data": [                    
        {
            "categoryName": "时事热点",
            "categoryType": 1,
            "newsInfo": [
                {
                    "id": 6,
                    "title": "这是一条时事热点新闻",
                    "content": "这是一条时事热点新闻的内容",
                    "updateTime": 1582611269,
                    "isreview": 1,
                }
            ]
        },
        {
            "categoryName": "校园新闻",
            "categoryType": 2,
            "newsInfo": [
                {
                    "id": 1,
                    "title": "这是一条校园新闻",
                    "content": "这是一条校园新闻的内容",
                    "updateTime": 1582611270,
                    "isreview": 0,
                }
            ]
        }
    ]
}
```


###新闻详情

```
GET /news_back/user/news/details?id=
```

参数
* 请求request
```
newsId
```
* 返回response

```
{
  "code": 0,
  "msg": "成功",
  "data": {
        id:1,
        title:"标题",
        content:"内容",
        isreview:1,
        updateTime:202002020
  }
}
```

####1.订单List

http://localhost:8080/newsList/1/最新通知

**newsList/newsCategory/categoryName**

> request

```
categoryType 新闻类型
pageSize(default=10)
pageNum(default=1)
```

> response

success

```
{
  "code": 0,
  "msg": "成功",
  "data": {
    "list": [
    
        ],
}
```



