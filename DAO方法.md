# 数据表实现的方法
## 新闻类目实现方法-news_category
### 包含：新闻ID 新闻名字 新闻编号
1. 通过id查找一个新闻类目
`NewsCategory findOne(Integer categoryId);`
2. 查找所有新闻类目
`List<NewsCategory> findAll();`
3. 查找符合这些类型的所有新闻类目
`List<NewsCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);`
4. 保存新闻类目（新建新闻---新闻名字，新闻类型）
`NewsCategory save(NewsCategory newsCategory);`


##新闻实体实现方法--news_info
1. 查询可评论的新闻
` List<NewsInfo> FindByNewsIsreview(Integer newsIsreview);`
