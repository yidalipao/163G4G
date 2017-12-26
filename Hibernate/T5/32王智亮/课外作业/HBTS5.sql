create database HBTS41;
use HBTS41;
create table  t_user(
uid int primary key identity(1,1),
name varchar(20) not null,
password varchar(20) not null,
birthday date not null,
sex varchar(4) not null,
isable varchar(20) not null 

)