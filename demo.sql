use dp;
show tables;
select * from tables_in_dp;

create table demo_1(
Id int primary key  auto_increment, 
Name varchar(30),
Address varchar(40)
);
insert into demo_1(Id,Name,Address) values (1,"Dp","PPM");

SELECT * FROM demo_1;
