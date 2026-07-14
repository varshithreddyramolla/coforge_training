create database tbl_employee;
use tbl_employee;

CREATE TABLE tbl_emp (
eid INTEGER,
ename VARCHAR(25),
esalary INTEGER
);
desc tbl_emp;

INSERT INTO tbl_emp VALUES (
103,
'Saud',
140000);
insert into tbl_emp (eid,esalary) values (104,130000);
select * from tbl_emp;
select eid,ename from tbl_emp;
select * from tbl_emp where esalary<=130000;
select * from tbl_emp where ename is null;
select * from tbl_emp where ename is not null;
select * from tbl_emp where eid in (101,103);
select * from tbl_emp where eid not in (101,103);
select * from tbl_emp where eid in (101,105);
select * from tbl_emp where esalary between 120000 and 140000;
select * from tbl_emp where esalary not between 140000 and 120000;
select * from tbl_emp where ename like '_u%';
update tbl_emp set esalary = 0 where eid =101;
SET SQL_SAFE_UPDATES = 0;

rollback;

delete from tbl_emp where ename is null;
select * from tbl_emp;
select 'Pranay' from tbl_emp;
select 'Pranay',1+2 from tbl_emp;
select esalary,'Pranay',1+2 from tbl_emp;
select esalary,sysdate(),'Pranay',1+2 from tbl_emp;
select eid as "employee_id",'Pranay',1+2 from tbl_emp;
select sysdate() as "current_date",'Pranay',1+2 from tbl_emp;
select esalary,'Pranay',1+2 as sum from tbl_emp;
alter table tbl_emp add column dno integer;

update tbl_emp set dno=1 where eid=103;

alter table tbl_emp drop column dno;

alter table tbl_emp rename column eid to emp_id;
select * from tbl_emp;
select * from tbl_emp where eid=101;
rename table tbl_emp to tbl_emp1;
