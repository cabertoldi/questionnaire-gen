use QUESTIONARIO;

drop table if exists TEMA;

create table TEMA (

 ID int not null auto_increment,
 DESCRICAO varchar(140) not null,
 
 primary key (ID),
 unique (DESCRICAO)
 
) engine=InnoDB default charset=utf8;