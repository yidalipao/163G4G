create database HBT6;
create table roles(
rid int primary key identity(1,1),
rname varchar(20) not null,
rmemo varchar(20) not null
)


create table userinfo(
uid int primary key identity(1,1),
uname varchar(20) not null,
upwd  varchar(20)  not null
)

create table roles_userinfo(
rid int  ,
uid int 
)