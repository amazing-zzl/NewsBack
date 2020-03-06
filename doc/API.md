# API文档

##用户端
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

###更多新闻

```
GET /news_back/user/newsList?categoryType=" + categoryType

```

> request参数

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
		"content": [{
				"newsId": 21,
				"newsTitle": "测试富文本编辑器展示",
				"newsContent": "<p>这是第一段</p><p><strong>这是第一段加粗</strong></p><p><em>这是第一段斜体</em></p><p> 这是第一段前面空了两格</p>",
				"newsCategory": 1,
				"newsIsreview": 1,
				"updateTime": 1583439941000
			},
			{
				"newsId": 19,
				"newsTitle": "sadsacasdcs",
				"newsContent": "<p>dsacdscsda</p>",
				"newsCategory": 1,
				"newsIsreview": 1,
				"updateTime": 1583395713000
			}
		],
		"last": false,
		"totalPages": 2,
		"totalElements": 12,
		"number": 0,
		"size": 10,
		"sort": [{
			"direction": "DESC",
			"property": "newsId",
			"ignoreCase": false,
			"nullHandling": "NATIVE",
			"ascending": false,
			"descending": true
		}],
		"first": true,
		"numberOfElements": 10
	}
}
```

##管理端
###用户登录
``
GET news_back/master/login（未做验证）
``

> response
```
{
	"data": {
		"name": "admin",
		"id": "500",
		"token": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjUwMCwicmlkIjowLCJpYXQiOjE1MTI1NDQyOTksImV4cCI6MTUxMjYzMDY5OX0.eGrsrvwHm-tPsO9r_pxHIQ5i5L1kX9RX444uwnRGaIM\""
	},
	"meta": {
		"msg": "登录成功",
		"status": 200
	}
}
```

###获取菜单列表
``
GET news_back/master/menu
``
> response
```
{
	"data": [{
		"id": 101,
		"authName": "项目管理",
		"path": null,
		"children": [{
			"id": 102,
			"authName": "新闻列表",
			"path": "newsList"
		}, {
			"id": 104,
			"authName": "新闻分类",
			"path": "category"
		}]
	}, {
		"id": 125,
		"authName": "成员管理",
		"path": "null",
		"children": null
	}, {
		"id": 145,
		"authName": "数据分析",
		"path": null,
		"children": null
	}, {
		"id": 103,
		"authName": "关于我们",
		"path": null,
		"children": null
	}],
	"meta": {
		"msg": "获取菜单成功",
		"status": 200
	}
}
```

###获取新闻列表

``
GET news_back/master/news?query=&pagenum=1&pagesize=10
``

> response
```
{
	"data": {
		"content": [{
			"newsId": 21,
			"newsTitle": "测试富文本编辑器展示",
			"newsContent": "<p>这是第一段</p><p><strong>这是第一段加粗</strong></p><p><em>这是第一段斜体</em></p><p>  这是第一段前面空了两格</p>",
			"newsCategory": 1,
			"newsIsreview": 1,
			"updateTime": 1583439941000
		}, {
			"newsId": 19,
			"newsTitle": "sadsacasdcs",
			"newsContent": "<p>dsacdscsda</p>",
			"newsCategory": 1,
			"newsIsreview": 1,
			"updateTime": 1583395713000
		}, {
			"newsId": 18,
			"newsTitle": "sadsacsda ",
			"newsContent": "<p>dsvsdv</p>",
			"newsCategory": 5,
			"newsIsreview": 1,
			"updateTime": 1583396687000
		}, {
			"newsId": 17,
			"newsTitle": "神仙新闻标题",
			"newsContent": "<p>这是一条</p><p>神仙新闻标题</p>",
			"newsCategory": 4,
			"newsIsreview": 1,
			"updateTime": 1583396675000
		}, {
			"newsId": 15,
			"newsTitle": "2222222222222222222222222222222222222",
			"newsContent": "2222222222222222222222222222222",
			"newsCategory": 1,
			"newsIsreview": 1,
			"updateTime": 1582910991000
		}, {
			"newsId": 14,
			"newsTitle": "222222222222",
			"newsContent": "2222222222222222222222",
			"newsCategory": 1,
			"newsIsreview": 1,
			"updateTime": 1582910996000
		}, {
			"newsId": 13,
			"newsTitle": "222222222222222",
			"newsContent": "222222222222222",
			"newsCategory": 1,
			"newsIsreview": 1,
			"updateTime": 1582910993000
		}, {
			"newsId": 12,
			"newsTitle": "第二题第二题第二题第二题第二题第二题第二题",
			"newsContent": "inin你念赛诺菲isif你是否能山东菜农三年就看见李经理快捷键",
			"newsCategory": 1,
			"newsIsreview": 1,
			"updateTime": 1582690718000
		}, {
			"newsId": 11,
			"newsTitle": "第一题第一题第一题第一题第一题第一题第一题第一题第一题第一题",
			"newsContent": "第一题第一题第一题第一题第一题第一题第一题第一题",
			"newsCategory": 1,
			"newsIsreview": 1,
			"updateTime": 1582690710000
		}, {
			"newsId": 8,
			"newsTitle": "111111111143143",
			"newsContent": "111111111114312412",
			"newsCategory": 1,
			"newsIsreview": 1,
			"updateTime": 1582678563000
		}],
		"last": false,
		"totalPages": 2,
		"totalElements": 16,
		"number": 0,
		"size": 10,
		"sort": [{
			"direction": "DESC",
			"property": "newsId",
			"ignoreCase": false,
			"nullHandling": "NATIVE",
			"ascending": false,
			"descending": true
		}],
		"first": true,
		"numberOfElements": 10
	},
	"meta": {
		"msg": "获取新闻列表成功",
		"status": 200
	}
}

```

###添加新闻
``
POST /news_back/master/addnews
``
>request
``
{
	newsTitle: "我在添加新闻",
	newsIsreview: 1,
	newsCategory: "1",
	newsContent: "<p>这是新添加的新闻</p>"
}
``
>response
```
{
	"data": {
		"newsId": 22,
		"newsTitle": "我在添加新闻",
		"newsContent": "<p>这是新添加的新闻</p>",
		"newsCategory": 1,
		"newsIsreview": 1,
		"updateTime": null
	},
	"meta": {
		"msg": "添加成功",
		"status": 200
	}
}
```

###删除新闻

``
POST news_back/master/deletenews?newsId=
``

> request
``
newsId: 
``

>response
```
{
	"data": null,
	"meta": {
		"msg": "删除成功",
		"status": 200
	}
}
```

###获取新闻分类

``
GET /news_back/master/categories
``

>response
```
{
	"data": [{
		"categoryId": 1,
		"categoryName": "最新通知",
		"categoryType": 1,
		"newsIsreview": 1,
		"createTime": 1582523043000
	}, {
		"categoryId": 2,
		"categoryName": "中国新闻",
		"categoryType": 2,
		"newsIsreview": 1,
		"createTime": 1582523403000
	}, {
		"categoryId": 8,
		"categoryName": "我的新闻",
		"categoryType": 3,
		"newsIsreview": 1,
		"createTime": 1582532495000
	}, {
		"categoryId": 9,
		"categoryName": "测试新闻",
		"categoryType": 4,
		"newsIsreview": 0,
		"createTime": 1583359321000
	}],
	"meta": {
		"msg": "查询成功",
		"status": 200
	}
}
```

###编辑/新增新闻分类

``
POST /news_back/master/categories
``
>request
```
{
	categoryId: 8,
	categoryName: "我的新闻",
	categoryType: 3,
	newsIsreview: "0",
	createTime: 1582532495000
}
```
>response
```
{
	"data": {
		"categoryId": 8,
		"categoryName": "我的新闻",
		"categoryType": 3,
		"newsIsreview": 0,
		"createTime": 1582532495000
	},
	"meta": {
		"msg": "添加成功",
		"status": 200
	}
}

```

###删除新闻分类
``
GET news_back/master/deleteCategory?categoryId=
``
>request
``
categoryId
``
>response
```
{
	"data": null,
	"meta": {
		"msg": "删除成功",
		"status": 200
	}
}

```