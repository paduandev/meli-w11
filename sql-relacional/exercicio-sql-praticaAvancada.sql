create database meli_ex_sql;

create table departamento (
	depto_nro int, 
    nome_depto varchar(30), 
    localidade varchar(40));

alter table departamento add constraint primary key(depto_nro);

create table funcionario (
	cod_emp int, nome varchar(40), sobrenome varchar(40), 
    posto varchar(30), data_alta date, salario float, comissao float, depto_nro int, 
    constraint pk primary key(cod_emp), 
    constraint fk foreign key (depto_nro) references departamento(depto_nro)
);
    
insert into departamento values( 1, "Software", "Los Tigres");
insert into departamento values( 2, "Sistemas", "Guadalupe");
insert into departamento values( 3, "Contabilidade", "La Roca");
insert into departamento values( 4, "Vendas", "Plata");

insert into funcionario values ( 
	  1, "César", "Piñero", "Vendedor", STR_TO_DATE('12/05/2018','%d/%m/%Y'), 80000, 15000, 4),
	( 2, "Yosep", "Kowaleski", "Analista", STR_TO_DATE('14/07/2015','%d/%m/%Y'), 14000, 0, 2),
	( 3, "Mariela", "Barrios", "Diretor", STR_TO_DATE('05/06/2014','%d/%m/%Y'), 185000, 0, 3),
	( 4, "Jonathan", "Aguilera", "Vendedor", STR_TO_DATE('03/06/2015','%d/%m/%Y'), 85000, 10000, 4),
	( 5, "Daniel", "Brezezicki", "Vendedor", STR_TO_DATE('03/03/2018','%d/%m/%Y'), 83000, 10000, 4),
	( 6, "Mito", "Barchuk", "Presidente", STR_TO_DATE('05/06/2014','%d/%m/%Y'), 19000, 0, 3),
	( 7, "Emilio", "Galarza", "Desenvolvedor", STR_TO_DATE('02/08/2014','%d/%m/%Y'), 60000, 0, 1);
