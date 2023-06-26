CREATE DATABASE produtos; /*Comando que inicia a criação de um banco de dados*/

USE produtos; /*Comando que dá a permissão para criação da tabela que receberá os dados informados pelo usuário*/

/*Comando para criação da tabela incluindo a declaração das variáveis*/

CREATE TABLE dados_produto(

nome_produto VARCHAR (50),
unid_medida VARCHAR (5),
valor_unitario DOUBLE,
quantidade INT

);
/*Comando que insere dados na tabela criada*/

CREATE TABLE prod_info (
nome_produto Varchar(50),
Quantidade int,
valor_unitário DOUBLE
);

INSERT INTO prod_info VALUES("Pendrive", 4, 32.25);

INSERT INTO dados_produto VALUES("Cerveja Haineken", "600ml", 8.50, 12), ("Cerveja Budweiser", "600ml", 7.50, 12), ("Cerveja Skol", "600ml", 5.50, 12), 
("Cerveja Antartica", "600ml", 5.50, 12), ("Porção de carne de sol", "500gr", 25.0, 12);
insert into dados_produto values ("Pendrive", "Und", 32.25, 4);

SELECT * FROM dados_produto; /*Comando que informa todos os dados da tabela*/
 
alter table dados_produto drop COLUMN valor_total; /*Comando que exclui uma coluna da tabela*/

ALTER TABLE dados_produto modify column unid_medida varchar(5); /*Comanddo que modifica o tipo do dado de entrada no campo específico*/

SELECT * FROM prod_info;

SELECT concat("Temos ainda a quantidade de ", quantidade, " - ", nome_produto, " com valor unitário de ", valor_unitário) AS informacao FROM prod_info;
