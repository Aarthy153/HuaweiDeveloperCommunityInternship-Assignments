/*@author Aarthy R @version 1 @date 12/03/2022 @time 12.05 pm*/
/*Creating a DB for a college with specified parameters*/

/*Creating a table for Students with name, age, mobileno, regno, batch as columns*/
CREATE TABLE Students (
	name text not NULL,
	age integer NOT NULL,
	mobileno integer NOT NULL,
    regno integer not NULL primary key,
    batch year not NULL
    /*Not Null Constraint is used to indicate that the column will not allow storing NULL values*/
 ); 
 
 /*Creating a table for Teachers with name, domain, department as columns*/
 CREATE TABLE Teachers (
	name text not NULL,
	domain text NOT NULL,
	department text NOT NULL
 );
 
 /*Query to insert 10 Students data into the 'Students' table*/
INSERT INTO Students (name,age,mobileno,regno,batch)
VALUES 
   ('Aarthy',18,6369930596,20011,2025),
   ('Janani',19,2345678901,20012,2024),
   ('Ramesh',20,3456789012,20013,2023),
   ('Aarav',21,6369934567,20014,2025),
   ('Pranav',24,2345623478,20015,2020),
   ('Aravind',24,3456721345,20016,2020),
   ('Sakthi',23,6369915678,20017,2020),
   ('Shravan',19,2345614325,20018,2024),
   ('Rahul',20,3456721467,20019,2023),
   ('Sameer',21,7379956796,20020,2022);

 /*Query to insert 10 Teachers data into the 'Teachers' table*/
INSERT INTO Teachers (name,domain,department)
VALUES 
   ('Aarui','Artificial Intelligence','AI&DS'),
   ('Vasanthy','Data Science','CS'),
   ('Sakthivel','Operating Systems','IT'),
   ('Karthik','Electrical Engineering','ECE'),
   ('Siva','Cyber Security','AI&DS'),
   ('Vanitha','Science','S&H'),
   ('Bhuvana','Literature','S&H'),
   ('Hari','Blockchain','CS'),
   ('Kavin','Digital Priciples','CS'),
   ('David','Research and Development','CS');
 
SELECT * FROM Students WHERE batch = 2020; /*Displaying Students from batch 2020*/
SELECT * FROM Teachers WHERE department = 'CSE'; /*Displaying Teachers from CS Department*/
 
/*Editing 3 rows in the Students table*/
UPDATE Students SET age = 19 WHERE name = 'Aarthy';   
UPDATE Students set age = 18 WHERE regno = 20014;
update Students set name ='Ravina' where regno = 20020;

/*Deleting 2 rows from Teachers table*/
DELETE FROM Teachers WHERE department = 'ECE';
DELETE FROM Teachers WHERE name = 'Siva';

SELECT * FROm Students /*Displaying Students Table*/
SELECT * FROm Teachers /*Displaying Teachers Table*/



  



   
 
 

   
   
 