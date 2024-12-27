create database mundo;

use mundo;

create table continente(
    id int primary key auto_increment not null,
    nome varchar(50)
);

create table pais(
    id int primary key auto_increment not null,
    nome varchar(50),
    id_continente int,
    foreign key (id_continente) references continente(id) on delete cascade
);

