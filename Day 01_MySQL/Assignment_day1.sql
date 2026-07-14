create database school;
use school;
create table students(
StudentID int primary key,
Name VARCHAR(50),
Age INT,
Gender VARCHAR(10),
City VARCHAR(50)
);
insert into students values(101,'Rahul',29,'Male','Hyderabad');
insert into students values(102,'Priya',19,'Female','Chennai');
insert into students values(103,'Arjun',21,'Male','Bengaluru');
insert into students values(104,'Sneha',20,'Female','Mumbai');
insert into students values(105,'Kiran',22,'Male','Pune');

select * from students;
select name,city from students;
select * from students where age>20;
select * from students where gender='female';
select * from students where city='Hyderabad';

select * from students
order by name asc;
select * from students
order by age desc;
select * from students
order by city asc,name asc;

select * from students where age between 19 and 21;
select * from students where name like 'r%';
select * from students where name like '%i';
select * from students where age in (20,22);


SET SQL_SAFE_UPDATES = 0;
update students
set city='Delhi'
where name='Rahul';
select * from students;
update students
set age=age+1
where name='arjun';
select * from students;
update students
set city='Kolkata'
where name='Sneha';
select * from students;

delete from students where StudentID=105;
select * from students;
delete from students where city='Chennai';
select * from students;
