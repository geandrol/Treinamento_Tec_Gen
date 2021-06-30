create database Bd_quitanda;

use bd_quitanda;

create table tb_produtos(
id bigint  auto_increment,
nome varchar (30) not null,
preco float not null,
descricao varchar (255),
primary key (id)
);

select * from tb_produtos;

insert into tb_produtos (nome,preco,descricao) values ("maca","2.50","melhor maca da região");
insert into tb_produtos (nome,preco,descricao) values ("banana","1.50","melhor banana da região");

alter table tb_produtos add descricao varchar(255);
alter table tb_produtos drop descricao;

delete from tb_produtos where id = 2;

update tb_produtos set preco = 10 where id = 2;

