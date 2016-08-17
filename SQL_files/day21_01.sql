-- MySQL的算术运算符

select 2+9,8-9,8*8,9/3 '商',9%6 '取模、取余';

-- MySQL中的比较运算符
select 3=3,3<>4,3<8,9>8,9>=9 '9>9 or 9=9';
select 3 between 3 and 4;
select 4 between 4 and 6;-- between(包含开始和结尾) 


select 3 in (3,2,0);

select 'abc' like 'a%';
select 'abc' like '_b_';

select 'ad' > 'abcd';

select !1;

select 1 && 0;

select 1 OR 0;

select 0 || 8;

select 1 XOR 7;

use test;
show tables;
select * from emp;
select * from dept;
select * from salgrade;
select * from bonus;
delete from salgrade where grade = 5;

set sql_safe_updates = 0;
insert into salgrade values(5,3001,9999);

select * from emp order by hiredate;

-- 1.显示部门编号是10的所有员工的姓名和入职时间
select empno '部门编号',hiredate '入职时间' from emp where deptno = 10;

-- 2.显示部门10和20的员工的个人信息
select * from emp where deptno in(10,20) order by deptno;

-- 3.显示入职时间晚于1985年1月1日或者工资低于1500的员工信息
select hiredate from emp order by hiredate;
select * from emp where sal < 1500 and hiredate > '1985-1-1';

-- 4.显示工资在1000到2000之间的员工信息
select * from emp where sal between 1000 and 2000 order by sal;

-- 5.显示工资为800，1500，3000，5000的员工信息
select * from emp where sal in(800,1500,3000,5000) order by sal;

-- 6.显示姓名以A开头的员工信息
select * from emp where ename like 'A%';

-- 7.显示姓名第二个字母是a的员工信息
select * from emp where ename like '_a%';

-- 8.显示姓名不包含M的员工信息
-- 9.显示所有人的姓名和个人年收入
-- 10.求最高工资和最低工资
-- 11.求各个部门的人数
-- 12.求人数大于5的部门编号
-- 13.按工资由高到低，部门由低到高显示所有信息
-- 14.求所有部门中工资大于2000的人数超过1个的部门编号，部门编号按从小到大排列
-- 15.求部门名称为ACCOUNTING的员工信息（分别使用子查询和连接）
-- 16.求工资高于平均工资的人员的工资和姓名
-- 17.通过emp表查询部门编号有哪些
-- 18.查询所有领导的信息
-- 19.查询各个部门里工资最高的个人信息
-- 20.显示员工的编号，姓名和薪水等级（位于salgrade表）
-- 21.查询部门薪水等级的平均值
-- 22.查询部门薪水平均值的等级
-- 23.求各个部门的人数，要求没有人的也要显示

use renjianyong;
select * from student;

select st_id id,st_name name,st_age age from student where st_id = 1002;

create database temp;

use test;
desc emp;

select * from emp;

select * from dept;


























































































