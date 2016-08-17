-- 积累 MySQL Statement

-- (1)复制旧表中的数据到新表中
insert into tb_test (select * from websites);

-- 清空表数据
truncate table tb_test;

-- 模糊查询
select * from tb_test where name like '%BB%';-- '表示包含有BB字符的name'
select * from tb_test where name like '%A_B%';-- ‘表示包含A_B其中AB中间是任意字符的name’

-- 设置查询显示的行
select * from tb_test limit 0,9;-- 表示从第一行开始，显示9行数据（每次查询）
select * from tb_test limit 10;-- 表示设置每次查询显示10行数据

-- 查询条件是一个集合的情况
select * from tb_test where name in('A','B','c');

-- 修改列名
alter table websites change name tb_name varchar(40) not null;

-- 修改列的类型
alter table websites modify name varchar(20) not null;

-- 查询表数据，并且按照‘country’字段升序显示，如果此字段有重复，那么重复的数据再按照‘alexa’字段降序排列
select * from websites order by country ASC,alexa DESC;

-- 查询中使用函数AVG()求平均数
select * from websites where alexa > (select AVG(alexa) from websites) order by country ASC;

select MIN(alexa) as '最小值',MAX(alexa) as '最大值',SUM(alexa)/6 as '总和', AVG(alexa) as '平均数', COUNT(alexa) as '总行数' from websites;

-- 分组查询(group by)
select tb_name '厂商',AVG(alexa) from websites group by tb_name;

-- outer join(外部链接)
-- select * from emp e,dept d where e.deptno(+) = d.deptno;

-- 返回在同一列中所有数据的一个集合
select group_concat(tb_name) as '分组显示' from websites;






































































