--sys��¼
create user SSHTest identified by SSHTest;
grant connect,resource to SSHTest;

--SSHTest��¼
create table testtable1
(
     pid number(10) not null primary key,
     personno varchar2(20),
     personname varchar2(20)  
);

insert into testtable1(pid,personno,personname) values (1,'1','����');
insert into testtable1(pid,personno,personname) values (2,'2','����');
insert into testtable1(pid,personno,personname) values (3,'3','����');
