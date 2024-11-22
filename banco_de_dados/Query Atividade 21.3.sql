CREATE DATABASE db_rhgeneration;

USE db_rhgeneration;

CREATE TABLE tb_colaboradores (
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255),
    email VARCHAR(255) UNIQUE,
	cargo VARCHAR(55),
    data_admissao DATE,
    salario DECIMAL NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO tb_colaboradores(nome,email,cargo,data_admissao,salario)
VALUES ("Geandro","geandro@generation.com","Instrutor","2020-06-1",10000.00);
INSERT INTO tb_colaboradores(nome,email,cargo,data_admissao,salario)
VALUES ("Lorena","lorena@generation.com","Instrutor","2024-06-1",10000.00);
INSERT INTO tb_colaboradores(nome,email,cargo,data_admissao,salario)
VALUES ("Vinicius","vinicius@generation.com","Dev Fullstack","2024-10-17",1000.00);
INSERT INTO tb_colaboradores(nome,email,cargo,data_admissao,salario)
VALUES ("Aimee","aimee@generation.com","Instrutor","2021-03-1",10000.00);
INSERT INTO tb_colaboradores(nome,email,cargo,data_admissao,salario)
VALUES ("Felipe","felipe@generation.com","Instrutor","2024-10-01",10000.00);

SELECT * FROM tb_colaboradores WHERE salario > 2000;

SELECT * FROM tb_colaboradores WHERE salario < 2000;

UPDATE tb_colaboradores SET salario = 5000.00 WHERE nome = "Vinicius";