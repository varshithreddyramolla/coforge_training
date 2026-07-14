create table emp_table(
eid INT,
ename VARCHAR(30),
esalary INT,
dno INT);
use employeemanagement;
desc employee_table;

insert into emp_table values(101,'Varshith',20000,10);
insert into emp_table values(102,'Srakshin',15000,20);
insert into emp_table values(103,'Avinash',10000,10);
insert into emp_table values(104,'Bunny',12000,20);

select * from emp_table;

select dno, count(*) as "total no. of employees" from employee_table group by dno;

select dno, sum(esalary), avg(esalary), min(esalary), max(esalary) from employee_table group by dno;

select dno, sum(esalary), avg(esalary), min(esalary), max(esalary) from employee_table group by dno
having min(esalary)>10000;

select dno, sum(esalary), avg(esalary), min(esalary), max(esalary) from employee_table group by dno
order by dno;

select dno, sum(esalary), avg(esalary), min(esalary), max(esalary) from employee_table group by dno
order by dno desc;

select * from employee_table order by eid desc;

create table dept_table(
dno int, dname varchar(50));

insert into dept_table values(10,'Development');
insert into dept_table values(20,'Testing');

select * from dept_table;

select dname from dept_table where dno= (select dno from employee_table where eid=101);

select * from employee_table where dno= (select dno from dept_table where dname='Testing');

select dname from dept_table where dno= (select dno from employee_table where ename='Varshith');

select dname from dept_table where dno in (select dno from employee_table where eid=101 or eid=102);

drop table employee_table;

create table employee_table(
eid int primary key,
ename varchar(50) not null,
esalary int check(esalary>0),
email varchar(50) unique,
dno int);

-- constraints voilated
insert into employee_table values(101,'NarrativeNaresh',0,'narrative@naresh',10);
insert into employee_table values(102,'Naresh',1000,'narrative@naresh',20);

drop table employee_table;
drop table dept_table;

create table tbl_dept(
dno int primary key,
dname varchar(20));

create table tbl_emplo(
eid int primary key,
ename varchar(50),
esalary int, 
dno int);


-- Procedure

DELIMITER //

CREATE PROCEDURE insertEmplo (
    IN eid INT,
    IN ename VARCHAR(20),
    IN esalary INT,
    IN dno INT
)
BEGIN
    INSERT INTO tbl_emplo (eid, ename, esalary, dno)
    VALUES (eid, ename, esalary, dno);
END //
DELIMITER ;

call insertEmplo(102,'Varx',3000,10);

select * from tbl_emplo;

DELIMITER //
create procedure getEmpName(
in empid int,
out empname varchar(20))
begin
	select ename into empname from tbl_emplo where eid=empid;
end //

call getEmpName(102, @empname);
select @empname;

call insertEmplo(103,'Varshith',10000,20);
call insertEmplo(104,'akshaj',5000,10);

call getEmpName(103, @empname);
select @empname;



-- Function 

DELIMITER //
create function getEMPname(empid int) returns varchar(20) DETERMINISTIC
begin
	declare empname varchar(20);
    select ename into empname from tbl_emplo where eid=empid;
    return empname;
end//

select getEMPname(102);


create table agents(
agent_id int,
agent_name varchar(50),
agent_working_area varchar(20));

insert into agents values(101,'Varshith','Hyd');
insert into agents values(102,'Srakshin','Hyd');
insert into agents values(103,'Charith','Chennai');
insert into agents values(104,'Avinash','Chennai');
insert into agents values(105,'Saaud','Saudi');

create table customers(
customer_id int,
customer_name varchar(50),
customer_working_area varchar(20));

insert into customers values(201,'Alex','Hyd');
insert into customers values(202,'Anish','Chennai');
insert into customers values(203,'Banky','Chennai');
insert into customers values(204,'Crancky','Hyd');
insert into customers values(205,'Kick','Pune');
insert into customers values(206,'Butosky','Hyd');
-- Joins

-- Inner join
-- 1. Equi Join
select a.agent_id,a.agent_name,c.customer_name,a.agent_working_area
from agents a join customers c 
on a.agent_working_area=c.customer_working_area;

-- 2.Non-equi join
select a.agent_id,a.agent_name,c.customer_name,a.agent_working_area
from agents a join customers c 
on a.agent_working_area<>c.customer_working_area;

-- Outer join
-- 1.Left outer join
select * from agents a left outer join customers c on a.agent_working_area=c.customer_working_area;
	
-- 2. Right outer join
select * from agents a right outer join customers c on a.agent_working_area=c.customer_working_area;

-- 3. Full outer join
select * from agents a left outer join customers c on a.agent_working_area=c.customer_working_area;
UNION
select * from agents a right outer join customers c on a.agent_working_area=c.customer_working_area;

-- Cross join
select * from agents cross join customers;

show databases;
select user();

use employeemanagement;



	