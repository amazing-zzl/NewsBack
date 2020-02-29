CREATE TABLE `manager` (
  `manager_id` int NOT NULL AUTO_INCREMENT COMMENT '管理员id',
  `manager_name` varchar(32) NOT NULL DEFAULT '' COMMENT '管理员账号',
  `manager_pwd` varchar(16) NOT NULL DEFAULT '' COMMENT '管理员密码',
  `manager_level` tinyint DEFAULT '0' COMMENT '管理员等级',
  `col1` int DEFAULT NULL,
  `col2` varchar(16) DEFAULT NULL,
  `col3` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`manager_id`)
)comment '管理员表'

CREATE TABLE `user` (
  `user_id` int NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(32) NOT NULL COMMENT '用户名',
  `user_pwd` varchar(20) NOT NULL COMMENT '用户密码',
  `user_tel` varchar(16) DEFAULT NULL COMMENT '用户电话',
  `user_email` varchar(64) DEFAULT NULL COMMENT '用户邮箱',
  `col1` int DEFAULT NULL,
  `col2` varchar(64) DEFAULT NULL,
  `col3` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) comment '用户表'


CREATE TABLE `news_info` (
  `news_id` varchar(32) NOT NULL COMMENT '新闻id',
  `news_title` varchar(64) NOT NULL COMMENT '新闻标题',
  `news_content` varchar(2048) NOT NULL COMMENT '新闻内容',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新闻创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT'修改时间',
  `news_category` TINYINT NOT NULL COMMENT '新闻类别',
  `news_isreview` TINYINT DEFAULT '1' COMMENT '是否可以评论,默认为1',
  `col1` int DEFAULT NULL,
  `col2` varchar(16) DEFAULT NULL,
  `col3` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`news_id`)
)


-- 类目
create table `news_category` (
    `category_id` int not null auto_increment,
    `category_name` varchar(64) not null comment '类目名字',
    `category_type` int not null comment '类目编号',
    `create_time` timestamp not null default current_timestamp comment '创建时间',
    `update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key (`category_id`)
);



