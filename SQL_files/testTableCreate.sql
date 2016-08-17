use test;
-- drop table dept;

-- 创建dept表
create table dept(
	deptno int(2) primary key,
	dname varchar(14),
	loc varchar(13)
);

-- 创建emp表
create table emp(
	empno int(4) primary key,
	ename varchar(10),
	job varchar(9),
	mgr int(4),
	hiredate date,
	sal int(7),
	comm int(7),
	deptno int(2),
	foreign key(deptno)
	references dept (deptno)

);


INSERT INTO DEPT VALUES
 (10,'ACCOUNTING','NEW YORK');
INSERT INTO DEPT VALUES (20,'RESEARCH','DALLAS');
INSERT INTO DEPT VALUES
 (30,'SALES','CHICAGO');
INSERT INTO DEPT VALUES
 (40,'OPERATIONS','BOSTON');
INSERT INTO EMP VALUES
(7369,'SMITH','CLERK',7902,'1980-12-17',800,NULL,20);
INSERT INTO EMP VALUES
(7499,'ALLEN','SALESMAN',7698,'1981-2-20',1600,300,30);
INSERT INTO EMP VALUES
(7521,'WARD','SALESMAN',7698,'1981-2-22',1250,500,30);
INSERT INTO EMP VALUES
(7566,'JONES','MANAGER',7839,'1981-4-2',2975,NULL,20);
INSERT INTO EMP VALUES
(7654,'MARTIN','SALESMAN',7698,'1981-9-28',1250,1400,30);
INSERT INTO EMP VALUES
(7698,'BLAKE','MANAGER',7839,'1981-5-1',2850,NULL,30);
INSERT INTO EMP VALUES
(7782,'CLARK','MANAGER',7839,'1981-6-9',2450,NULL,10);
INSERT INTO EMP VALUES
(7788,'SCOTT','ANALYST',7566,'87-7-13',3000,NULL,20);
INSERT INTO EMP VALUES
(7839,'KING','PRESIDENT',NULL,'1981-11-17',5000,NULL,10);
INSERT INTO EMP VALUES
(7844,'TURNER','SALESMAN',7698,'1981-9-8',1500,0,30);
INSERT INTO EMP VALUES
(7876,'ADAMS','CLERK',7788,'87-7-13',1100,NULL,20);
INSERT INTO EMP VALUES
(7900,'JAMES','CLERK',7698,'1981-12-3',950,NULL,30);
INSERT INTO EMP VALUES
(7902,'FORD','ANALYST',7566,'1981-12-3',3000,NULL,20);
INSERT INTO EMP VALUES
(7934,'MILLER','CLERK',7782,'1982-1-23',1300,NULL,10);

CREATE TABLE BONUS (
    ENAME VARCHAR(10),
    JOB VARCHAR(9),
    SAL int,
    COMM int
);

CREATE TABLE SALGRADE (
    GRADE int,
    LOSAL int,
    HISAL int
);

INSERT INTO SALGRADE VALUES (1,700,1200);
INSERT INTO SALGRADE VALUES (2,1201,1400);
INSERT INTO SALGRADE VALUES (3,1401,2000);
INSERT INTO SALGRADE VALUES (4,2001,3000);
INSERT INTO SALGRADE VALUES (5,3001,9999);
COMMIT;

select * from emp;
select * from dept;
select * from SALGRADE;
select * from BONUS;

use test;

create table t_emp like emp;
select * from t_emp;
insert into t_emp select * from emp;
select * from t_emp;

create table t_dept select * from dept;

select * from t_dept;
desc t_dept;
desc t_emp;

truncate table t_dept;

alter table t_dept add constraint t_dept foreign key(deptno) references t_emp(deptno);





































































