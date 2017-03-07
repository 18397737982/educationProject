--管理员表
create table admin(
	admin_id int primary key auto_increment,
	admin_password varchar(50),
	email varchar2(20), 
	temp01 varchar2(200),--备用字段
    temp02 varchar2(200)--备用字段
);
drop table admin;
--学员表
select user_name from userInfo where user_name='a';
create table userInfo(
	user_id int primary key auto_increment,
	user_name varchar(50) not null,
	realname varchar(50),
	age    int,
	sex   varchar(10),
	pic   longblob,
	password varchar(50) not null,
	usign varchar(500),
	introduce varchar(500),
	email varchar(50),
	status int,
	user_category varchar(10),
	tel varchar(11),
	qq   varchar(11),
	time date, 
	temp02 varchar(200),
    temp03 varchar(200)
);

--课程类别
create table class_category(
	class_id int primary key auto_increment,--课程类型id
	class_categorys varchar(50),--类型名
	temp01 varchar2(200)  --备用字段
);

--课程
create table course(
	course_id int primary key auto_increment,--课程id
	course_name varchar(50),--课程名
	author varchar(50)--作者
	class_id int,--课程类型Id
	course_view int ,--浏览量
	course_description varchar(500),-- 课程说明
	price numeric(8,2)--  DECIMAL价格 
);
alter table course 
	add constraint cs_class_id foreign key(class_id) references class_category(class_id);
	
--课时 
create table class_hour(
	class_hour_id int primary key auto_increment,--课时id
	class_hour_name varchar(50) not null,--课时名
	course_id int,--课程id
	class_seq int ,--课时序号
	rediao_address varchar(50) not null--视频地址
);
alter table class_hour 
	add constraint ch_course_id foreign key(course_id) references course(course_id);
	
--文件
create table files(
	files_id int primary key auto_increment,--文件id
	files_name varchar(50),--文件名
	file_content varchar(500),--文件内容
	course_id int --课程id
);
alter table files 
	add constraint fl_course_id foreign key(course_id) references course(course_id);
	
--评论
create table comment(
	comment_id int primary key auto_increment,--评论id
	comment_content varchar(500),--评论内容
	
);
--评论回复	
create table comment_detail(
	comment_id int,
	user_id int,
	rely_id int,
	content varchar(500)
	
)
alter table comment 
	add constraint cm_course_id foreign key(course_id) references course(course_id);

alter table comment 
	add constraint cm_stu_id foreign key(stu_id) references stu_user(stu_id);

--笔记
create table notes(
	notes_id int primary key auto_increment,--笔记id
	notes_content varchar(500),--笔记内容
	course_id int,--课程id
	user_id int,--学者id 
	comment_time date--时间
);
alter table notes 
	add constraint nt_course_id foreign key(course_id) references course(course_id);

alter table notes 
	add constraint nt_stu_id foreign key(stu_id) references stu_user(stu_id);



--课程学习总数(统计某课程被加入关注的总数)
create table stu_count(
	user_count_id int primary key auto_increment,--id
	course_id int,
	stu_id int
);
alter table stu_count 
	add constraint sc_course_id foreign key(course_id) references course(course_id);

alter table stu_count 
	add constraint sc_stu_id foreign key(stu_id) references stu_user(stu_id);

--账户表
 学生id  账户余额  
create table account(
	user_id int,--学员id 
	balance decimal
);
alter table account 
	add constraint ac_stu_id foreign key(stu_id) references stu_user(stu_id);







