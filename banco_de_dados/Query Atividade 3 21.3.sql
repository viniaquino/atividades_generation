-- CREATE DATABASE db_escola;

USE db_escola;

CREATE TABLE tb_estudantes (
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    data_nascimento DATE,
    turma INT(3),
    curso VARCHAR(100),
    matricula INT UNIQUE NOT NULL,
    nota DECIMAL(4,2),
    PRIMARY KEY(id)
);

INSERT INTO tb_estudantes(nome,data_nascimento,turma,curso,matricula,nota)
VALUES ("Vínicius","2000-04-10",78,"Java Fullstack",123456,7.75);
INSERT INTO tb_estudantes(nome,data_nascimento,turma,curso,matricula,nota)
VALUES ("Aline","1999-10-25",78,"Javascript Fullstack",321654,5.00);
INSERT INTO tb_estudantes(nome,data_nascimento,turma,curso,matricula,nota)
VALUES ("Bruno","2003-06-17",77,"Java Fullstack",789365,8.00);
INSERT INTO tb_estudantes(nome,data_nascimento,turma,curso,matricula,nota)
VALUES ("Catharina","1999-12-25",78,"Javascript Fullstack",159357,10.00);
INSERT INTO tb_estudantes(nome,data_nascimento,turma,curso,matricula,nota)
VALUES ("Douglas","1998-05-29",77,"Java Fullstack",145632,4.45);
INSERT INTO tb_estudantes(nome,data_nascimento,turma,curso,matricula,nota)
VALUES ("Eduardo","2008-11-01",78,"Javascript Fullstack",963741,6.50);
INSERT INTO tb_estudantes(nome,data_nascimento,turma,curso,matricula,nota)
VALUES ("Fabiana","1995-01-10",78,"Java Fullstack",456751,3.00);
INSERT INTO tb_estudantes(nome,data_nascimento,turma,curso,matricula,nota)
VALUES ("Gabriel","2006-02-11",77,"Ruby Fullstack",147852,9.99);

SELECT * FROM tb_estudantes WHERE nota > 7.00;

SELECT * FROM tb_estudantes WHERE nota < 7.00;

SET SQL_SAFE_UPDATES = 0;

UPDATE tb_estudantes SET nota = 10.00 WHERE id = 1;

SELECT * FROM tb_estudantes WHERE id = 1;
