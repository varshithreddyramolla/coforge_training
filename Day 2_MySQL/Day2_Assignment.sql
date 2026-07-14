create database employeeManagement;
use employeeManagement;

create table department(
DeptID int primary key,
DeptName varchar(50),
Location varchar(50));

insert into department values
(101,'HR','Hyderabad'),
(102,'Finance','Mumbai'),
(103,'IT','Bangalore'),
(104,'Sales','Chennai');

CREATE TABLE Employee (
   EmpID INT PRIMARY KEY,
   EmpName VARCHAR(50),
   Gender VARCHAR(10),
   Age INT,
   Salary DECIMAL(10,2),
   Designation VARCHAR(50),
   DeptID INT,
   HireDate DATE,
   FOREIGN KEY (DeptID) REFERENCES department(DeptID)
);

INSERT INTO Employee VALUES
(1,'Amit','Male',28,45000,'Software Engineer',103,'2022-05-10'),
(2,'Priya','Female',30,55000,'HR Manager',101,'2021-03-15'),
(3,'Rahul','Male',27,50000,'Accountant',102,'2023-01-20'),
(4,'Sneha','Female',25,42000,'Sales Executive',104,'2022-09-12'),
(5,'Kiran','Male',31,60000,'Team Lead',103,'2020-11-18');

CREATE TABLE Attendance (
   AttendanceID INT PRIMARY KEY,
   EmpID INT,
   AttendanceDate DATE,
   Status VARCHAR(10),
   FOREIGN KEY (EmpID) REFERENCES Employee(EmpID)
);

INSERT INTO Attendance VALUES
(1,1,'2026-07-01','Present'),
(2,2,'2026-07-01','Present'),
(3,3,'2026-07-01','Absent'),
(4,4,'2026-07-01','Present'),
(5,5,'2026-07-01','Present');


-- Basic Queries
select * from employee;
select EmpName, Salary from employee;
select * from employee where Salary>50000;
select * from employee where Age>30;

-- where clause
select * from employee where DeptID in (select DeptID from department where DeptName='IT');
select EmpName from employee where Gender='Female';
select EmpName from employee where HireDate>'2022-01-01';

-- order by
select EmpName, Salary from employee order by Salary desc;
select EmpName from employee order by EmpName;

-- Aggregate Functions
select count(*) from employee;
select max(Salary) from employee;
select min(salary) from employee;
select avg(salary) from employee;
select sum(salary) from employee;

-- Group by
select DeptID, count(*) from employee group by DeptID;
select DeptID, avg(Salary) from employee group by DeptID;
select DeptID, max(Salary) from employee group by DeptID;

-- Join Queries
select e.EmpName, d.DeptName from employee e join department d where e.DeptID=d.DeptID;
select e.EmpName, d.DeptName, Location from employee e join department d where e.DeptID=d.DeptID;



-- Update
UPDATE Employee SET Salary = Salary * 1.10 WHERE DeptID = 103;
UPDATE Employee SET Designation = 'Senior Software Engineer' WHERE EmpID = 1;
UPDATE Employee SET DeptID = 103 WHERE EmpID = 3;

-- Delete
DELETE FROM Employee WHERE Salary < 40000;
DELETE FROM Attendance WHERE AttendanceDate = '2026-07-01';

-- Views
CREATE VIEW EmployeeDetails AS
SELECT e.EmpName, d.DeptName
FROM Employee e
JOIN Department d
ON e.DeptID = d.DeptID;

-- Stored Procedure
DELIMITER //
CREATE PROCEDURE GetEmployees()
BEGIN
    SELECT * FROM Employee;
END //
DELIMITER ;

CALL GetEmployees();



