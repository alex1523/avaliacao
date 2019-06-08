create database conta
use conta

create table registro
(id int primary key auto_increment not null,
 dsconta varchar (20) not null,
 tpconta varchar (20) not null, 
 dtvencimento varchar (8) not null,
 situacao varchar (20) not null,
 dtcriacao datetime not null);
 
 drop database conta
 desc registro
 select * from registro