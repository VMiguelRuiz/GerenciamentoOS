create database GerenciamentoOS;

use GerenciamentoOS;

create table Clientes(
	idCliente int primary key auto_increment,
    nomeCliente varchar(50) not null,
    endCliente varchar(100) not null,
    foneCliente varchar(12) not null,
    emailCliente varchar(50) 
);

create table OrdemServico(
	idOS int primary key auto_increment,
    dataOS date not null,
    equipamento varchar(150) not null,
    defeito varchar(150) not null,
	servico varchar(150),
    valor decimal(10,2),
    idCliente int not null,
    foreign key (idCliente) references Clientes (idCliente)
);

commit;