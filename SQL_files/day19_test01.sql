use renjianyong;

create table temp(
	id int not null auto_increment,
	t_name varchar(20) not null,
	t_age int not null,
	primary key(id)
);

desc temp;

insert into temp(t_name,t_age) values('FF',34);

select * from temp;

-- 添加表结构
alter table temp add column t_score int;

-- TOP
select * from temp limit 5;

desc temp;

-- 修改指定列的数据类型
alter table temp modify t_age varchar(20);

-- 删除表中的列
alter table temp drop t_score;

alter table temp add column t_score int;

desc temp;

select * from temp;

insert into temp(t_name,t_score) values('GG',99);
select * from temp;

update temp set t_name = 'gg' where id = 7;

use bird;
drop database bird;
create database abgame;


use abgame;

create table tgame(
		id int not null auto_increment,
		loginname varchar(45) not null,
		password varchar(45) not null,
		nickname varchar(45) not null,
		sex varchar(45) not null,
		age int not null,
		primary key(id)
);


create table tplayer(
		id int not null auto_increment,
		pid int not null,
		playtime datetime not null,
		score int not null,
		loginname varchar(45),
		primary key(id)
);

alter table tgame change password loginpass varchar(45);
desc tgame;

insert into tgame(loginname,loginpass,nickname,sex,age) values('Allen','333','aa','男',34);
select * from tgame;

insert into t_player(pid,playtime,score,loginname) values(1003,'2016-05-09',1000,'James');
select * from tplayer;

rename table tgame to t_game;
rename table tplayer to t_player;

select * from t_player;

create database test;

use test;

set names utf8;

use renjianyong;

select * from websites;







































































































































