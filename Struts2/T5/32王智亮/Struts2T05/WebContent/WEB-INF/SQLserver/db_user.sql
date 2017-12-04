create database db_users;
use db_users;
go
--用户表（tb_user）
create table tb_user(
id int primary key identity(1001,1),--用户Id号
uname nvarchar(20) not null,--用户名称
upwd nvarchar(20) not null,--用户密码
brithday nvarchar(20) not null, --用户生日
sex char(2) check(userSex in('男','女')) default '男',--用户性别
address	nvarchar(50) not null--用户地址
)
+select * from tb_user 