use renjianyong;

show tables;

create table new_test like websites;

show tables;

desc new_test;

drop table new_test;

show tables;

create table new_table as (select * from websites);

select * from new_test;


desc new_table;

select * from new_table;

drop table new_table;

-- 复制表（但是不会复制主键）
create table tb_test as (select * from websites);

desc tb_test;

drop table tb_test;

show tables;

-- 复制表，也会复制主键信息
create table tb_test like websites;

desc tb_test;

select * from tb_test;

-- 复制旧表中的数据到新表中
insert into tb_test (select * from websites);

select * from tb_test;

show create table tb_test;

-- 清空表数据
truncate table tb_test;

select * from tb_test;

insert into tb_test (select * from websites);

select * from tb_test where name in('淘宝','菜鸟教程');

select * from tb_test;

select * from tb_test where url like 'https%';

select * from tb_test;

select * from tb_test limit 3,4;

select * from tb_test ;

select * from tb_test where url like '%_p:%';

select * from tb_test limit 5;

select * from tb_test limit 1,5;

alter table websites change name tb_name varchar(20) not null;

select * from websites;

alter table websites modify tb_url varchar(50) not null;

desc tb_test;

alter table websites change url tb_url varchar(50) not null;

alter table websites modify tb_url varchar(55) not null;
desc websites;

select * from websites; 

select * from websites order by country,alexa ASC;

-- 失败的查询
select tb_name,tb_url,AVG(alexa) from websites order by country ASC; 

select * from websites where alexa > (select AVG(alexa) from websites) order by country ASC;

select SUM(alexa) from websites;

select MAX(alexa) from websites;

select MIN(alexa) as '最小值',MAX(alexa) as '最大值',SUM(alexa)/6 as '总和', AVG(alexa) as '平均数', COUNT(alexa) as '总行数' from websites;

select * from websites;

insert into websites(tb_name,tb_url,alexa) values('Google','LLLLLLLLLLLLLL',322);

select tb_name '厂商',AVG(alexa) from websites group by tb_name;

select * from websites;

select group_concat(tb_name) as '分组显示' from websites;

select now();

select ascii('A');

select concat('Stri','ng');

select concat_ws('&*','AA','BB','cC');

select database();

select version();

select version();

select database();

select abs(-34);

select bin(90);

select ceiling(3);

select exp(2);

select floor(3.7);

select greatest(1,4,5,99,6767);

select least(3,5,2,8,0);

select ln(3);

select log(10,100000);

select mod(9,6);

select rand();

select round(2.45954545,2);

select sign(88889);

select sqrt(4);

select truncate(333,833);




































































