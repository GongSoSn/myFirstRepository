-- 指定使用的数据库
use AngryBirdGameByDB;

-- 创建表
create table T_player (
    id int not null auto_increment,
    playerName varchar(50) not null,
    primary key (id)
);

-- 查看所有的表
show tables;

-- 查询指定表中的数据
select 
    *
from
    T_player;

-- 向指定的表中插入数据
insert into T_player values(001,'RedBird');


-- 查看字符集编码
show variables like '%character%';

-- Drop database 'angrybirdgamebydb'
drop database angrybirdgamebydb;

-- 新建bird数据库
create database bird;

-- 指定当前使用的数据库
use bird;

-- 创建一个存放bird的表；
create table T_player (
    id int not null auto_increment,
    p_name varchar(50) not null,
    primary key (id)
);

select 
    *
from
    t_player;

insert into t_player values(001,'红色小鸟');
insert into t_player values(002,'蓝色小鸟');
insert into t_player values(003,'黑色小鸟');

describe t_player;

select 
    *
from
    t_player
where
    id = 1;

use world;

show tables;

select 
    *
from
    city
where
    Name like 'B??';
describe city;


use bird;

select * from t_player;

-- 更新数据操作
update t_player set p_name = '老鹰' where id = 2;

-- 删除操作
delete from t_player where id = 1;

select * from t_player;

insert into t_player values(5,'大红');
insert into t_player values(4,'大红');
insert into t_player values(6,'大红');

-- TOP语句，用于限制显示的数据条目
select * from t_player limit 2;

use renjianyong;
drop table tb_temp;

 




























