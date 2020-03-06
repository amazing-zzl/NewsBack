# 数据表实现的方法

## 新闻类目实现方法-CategoryService
### 包含：新闻ID 新闻名字 新闻编号
1. 通过id查找一个新闻类目
`NewsCategory findOne(Integer categoryId);`
2. 查找所有新闻类目
`List<NewsCategory> findAll();`
3. 查找符合这些类型的所有新闻类目
`List<NewsCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);`
4. 保存新闻类目（新建新闻---新闻名字，新闻类型）
`NewsCategory save(NewsCategory newsCategory);`
5. 删除新闻类目/新闻
`void deleteByCategoryId(Integer categoryId);`
6. 其他方法（详见CategoryService）


##新闻实体实现方法--NewsService
1. 查询可评论的新闻
` List<NewsInfo> FindByNewsIsreview(Integer newsIsreview);`
2. 根据id查询新闻详情
`NewsInfo findOne(Integer newsId);`
3. 查询所有新闻（实现分页）
`Page<NewsInfo> findAll(Pageable pageable);`
4. 保存新闻
`NewsInfo save(NewsInfo newsInfo);`
5. 删除新闻
`void deleteByNewsId(Integer newsId);`
6. 查找新闻列表
`Page<NewsInfo> findList(Integer category,Pageable pageable);`