use test;

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
select * from emp where ename not like '%m%';

-- 9.显示所有人的姓名和个人年收入
select ename '姓名',sal*12 '个人年收入' from emp;

-- 10.求最高工资和最低工资
select MAX(sal) '最高工资',MIN(sal) '最低工资' from emp;

-- 11.求各个部门的人数
-- select * from emp order by deptno;
-- select deptno,COUNT(ename) from emp group by deptno;
select d.deptno,COUNT(e.ename) from emp e,dept d where e.deptno = d.deptno group by deptno;
select d.deptno '部门编号',COUNT(e.ename) '员工数量',d.dname '部门名称' from emp e right join dept d on d.deptno = e.deptno group by d.deptno;

-- 12.求人数大于5的部门编号
select d.deptno '部门编号',COUNT(e.ename) '部门人数',d.dname '部门名称' from emp e right join dept d on e.deptno = d.deptno group by d.deptno having COUNT(e.ename) > 5;

-- 13.按工资由高到低，部门由低到高显示所有信息
select * from emp order by sal DESC,deptno ASC;

-- 14.求所有部门中工资大于2000的人数超过1个的部门编号，部门编号按从小到大排列
-- select sal,deptno from emp where sal > 2000 order by deptno; 
select deptno '部门编号' from emp where sal > 2000  group by deptno having COUNT(ename) > 1 order by sal;

-- 15.求部门名称为ACCOUNTING的员工信息（分别使用子查询和连接）
-- 子查询
-- select deptno from dept where dname = 'ACCOUNTING';
select * from emp where deptno = (select deptno from dept where dname = 'ACCOUNTING');
-- 连接
select * from emp e join dept d on e.deptno = d.deptno where d.dname = 'ACCOUNTING'; 

-- 16.求工资高于平均工资的人员的工资和姓名
-- select AVG(sal) from emp ;
select sal '工资',ename '姓名' from emp where sal > (select AVG(sal) from emp);

-- 17.通过emp表查询部门编号有哪些
select distinct deptno '部门编号' from emp;

-- 18.查询所有领导的信息
select * from emp where empno in (select mgr from emp);

-- select empno,ename,mgr from emp;

-- 查询所有员工的领导
select e.ename '员工',m.ename '领导' from emp m right join emp e on m.empno = e.mgr;

-- 19.查询各个部门里工资最高的个人信息
-- select * from emp order by deptno;
select * from emp where sal in (select max(sal) from emp group by deptno) order by deptno;

-- 20.显示员工的编号，姓名和薪水等级（位于salgrade表）
-- select * from salgrade;
select empno '员工编号',ename '员工姓名',sal '薪水',losal '最低工资水平',hisal '最高工资水平',grade '薪水等级' from emp,salgrade where sal between losal and hisal order by grade;

-- 21.查询部门薪水等级的平均值
select grade,deptno from salgrade,emp where sal between losal and hisal order by deptno; 
select 11/3;
select deptno '部门编号',AVG(grade) '薪水等级平均值' from emp,salgrade where sal between losal and hisal group by deptno;

-- 22.查询部门薪水平均值的等级
select a.salary '部门薪水平均值',s.grade '部门薪平均值等级',a.dp '部门编号' from salgrade s, (select AVG(sal) salary,deptno dp from emp,salgrade where sal between losal and hisal group by deptno) a where a.salary between s.losal and s.hisal; 


-- 23.求各个部门的人数，要求没有人的也要显示
select d.deptno '部门编号',count(e.ename) '部门人数',dname '部门名称' from emp e right join dept d on e.deptno = d.deptno group by d.deptno;


/*24.表内容如下
			2015-05-09 胜
			2015-05-09 胜
			2015-05-09 负
			2015-05-09 负
			2015-05-10 胜
			2015-05-10 负
			2015-05-10 负

		要生成的结果如下
				  	     胜	    负
			2015-05-09	 2    	2
			2015-05-10	 1    	2
*/
-- 建表
create table tb_score(
		s_id int primary key auto_increment not null,
		s_date datetime not null,
		s_score varchar(20) not null
);
-- 插入数据
insert into tb_score(s_date,s_score) values('2015-05-09','胜');
insert into tb_score(s_date,s_score) values('2015-05-09','胜');
insert into tb_score(s_date,s_score) values('2015-05-09','负');
insert into tb_score(s_date,s_score) values('2015-05-10','胜');
insert into tb_score(s_date,s_score) values('2015-05-10','胜');
insert into tb_score(s_date,s_score) values('2015-05-10','负');
insert into tb_score(s_date,s_score) values('2015-05-10','负');

alter table tb_score modify s_date date not null;
delete from tb_score where s_id = 5;

/*select * from tb_score;
select s_date,COUNT(s_score) from tb_score where s_score = '负' group by s_date;
select s_date,COUNT(s_score) from tb_score where s_score = '胜' group by s_date;
*/
-- select * from tb_score;

select s.sdate '日期',s.scount '胜',f.fcount '负' 
from 
(select s_date sdate,COUNT(s_score) scount from tb_score where s_score = '胜' group by s_date) s,
(select s_date fdate,COUNT(s_score) fcount from tb_score where s_score = '负' group by s_date) f
 where s.sdate = f.fdate;


select s.sdate '日期',s.scount '胜',f.fcount '负' 
from 
(select s_date sdate,COUNT(s_score) scount from tb_score where s_score = '胜' group by s_date) s join
(select s_date fdate,COUNT(s_score) fcount from tb_score where s_score = '负' group by s_date) f
 on s.sdate = f.fdate;

/*25.有两张表
			月份mon  部门dept    业绩yj
			一月份		1	  		10
			一月份		2			10
			一月份		3			5
			二月份		2			8
			二月份		4			9
			三月份		3			8
		
			部门dept	部门名称dname
			1				部门1
			2				部门2
			3				部门3
			4				部门4
		要得到结果：
			部门dept	一月份	二月份	三月份
			1				10
			2				10		8
			3				5				8
			4						9
*/
drop table tb_manager;

-- 建表
create table tb_manager(
	tb_id int primary key auto_increment not null,
	tb_month varchar(20),
	tb_dept int,
	tb_ach int
);
-- 建表
create table tb_department(
	d_no int primary key,
	d_name varchar(10)
);

select * from tb_manager;

insert into tb_manager(tb_month,tb_dept,tb_ach) values('一月份',1,10);
insert into tb_manager(tb_month,tb_dept,tb_ach) values('一月份',2,10);
insert into tb_manager(tb_month,tb_dept,tb_ach) values('一月份',3,5);
insert into tb_manager(tb_month,tb_dept,tb_ach) values('二月份',2,8);
insert into tb_manager(tb_month,tb_dept,tb_ach) values('二月份',4,9);
insert into tb_manager(tb_month,tb_dept,tb_ach) values('三月份',3,8);

insert into tb_department values(1,'部门1');
insert into tb_department values(2,'部门2');
insert into tb_department values(3,'部门3');
insert into tb_department values(4,'部门4');

select * from tb_department;

/*select tb_dept,tb_ach from tb_manager where tb_month = '一月份';
select tb_dept,tb_ach from tb_manager where tb_month = '二月份';
select tb_dept,tb_ach from tb_manager where tb_month = '三月份';

select tb_dept,tb_ach from tb_manager;

select tb_dept,tb_ach from tb_manager m join tb_department d on m.tb_dept = d.d_no where tb_month = '一月份';
select d.d_no,tb_dept from (select tb_dept,tb_ach from tb_manager where tb_month = '二月份') t  join tb_department d on t.tb_dept = d.d_no;
select d.d_no,tb_dept from (select tb_dept,tb_ach from tb_manager where tb_month = '三月份') s  join tb_department d on s.tb_dept = d.d_no;
select tb_dept,tb_ach from tb_manager where tb_month = '二月份';
select tb_dept,tb_ach from tb_manager where tb_month = '三月份';

select tb_dept,tb_ach from tb_manager group by tb_dept;
select * from tb_manager where tb_dept in (select tb_dept from tb_manager group by tb_dept);

select d.d_no,o.tb_ach, t.tb_ach,s.tb_ach from 
(select tb_dept,tb_ach from tb_manager where tb_month = '一月份') o,
(select tb_dept,tb_ach from tb_manager where tb_month = '二月份') t,
(select tb_dept,tb_ach from tb_manager where tb_month = '三月份') s,
tb_department d
where  o.tb_dept = d.d_no or t.tb_dept = d.d_no or s.tb_dept = d.d_no;
;
*/
select tb_dept,tb_ach from tb_manager m join tb_department d on m.tb_dept = d.d_no where tb_month = '一月份';
select tb_dept,tb_ach from tb_manager m join tb_department d on m.tb_dept = d.d_no where tb_month = '二月份';
select tb_dept,tb_ach from tb_manager m join tb_department d on m.tb_dept = d.d_no where tb_month = '三月份';

select d.d_no '部门编号',oo.tb_ach '一月份', tt.tb_ach '二月份',ss.tb_ach  '三月份'from 
 tb_department d left join (select tb_dept,tb_ach from tb_manager m join tb_department d on m.tb_dept = d.d_no where tb_month = '一月份') oo on d.d_no = oo.tb_dept
left join (select tb_dept,tb_ach from tb_manager m join tb_department d on m.tb_dept = d.d_no where tb_month = '二月份') tt on d.d_no = tt.tb_dept left join (select tb_dept,tb_ach from tb_manager m join tb_department d on m.tb_dept = d.d_no where tb_month = '三月份') ss on d.d_no = ss.tb_dept;
;
















