--sys登录
create user SSHTest identified by SSHTest;
grant connect,resource to SSHTest;

--SSHTest登录
create table testtable1
(
     pid number(10) not null primary key,
     personno varchar2(20),
     personname varchar2(20)  
);

insert into testtable1(pid,personno,personname) values (1,'1','张三');
insert into testtable1(pid,personno,personname) values (2,'2','李四');
insert into testtable1(pid,personno,personname) values (3,'3','王五');
