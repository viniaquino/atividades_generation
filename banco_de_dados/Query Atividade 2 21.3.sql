CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_produtos (
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    quantidade INT,
    descricao VARCHAR(255),
    categoria VARCHAR(100),
    preco DECIMAL NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO tb_produtos(nome,quantidade,descricao,categoria,preco)
VALUES ("Playstation 5",10,"Console nova geração","Eletrônicos",3000.00);
INSERT INTO tb_produtos(nome,quantidade,descricao,categoria,preco)
VALUES ("Xbox Series S",50,"Console nova geração","Eletrônicos",2500.00);
INSERT INTO tb_produtos(nome,quantidade,descricao,categoria,preco)
VALUES ("Mouse Gamer",30,"Mouse indicado para jogos","Periféricos",100.00);
INSERT INTO tb_produtos(nome,quantidade,descricao,categoria,preco)
VALUES ("Cadeira Gamer",10,"Cadeira com ajuste","Móveis",500.00);
INSERT INTO tb_produtos(nome,quantidade,descricao,categoria,preco)
VALUES ("IPhone 15",5,"Celular de ultima geração","Smartphones",17000.00);
INSERT INTO tb_produtos(nome,quantidade,descricao,categoria,preco)
VALUES ("Plastificadora",2,"Plastificadora 270W","Escritório",200.00);
INSERT INTO tb_produtos(nome,quantidade,descricao,categoria,preco)
VALUES ("SmarTV TCL",25,"SmarTV 40 polegadas","TV",1500.00);
INSERT INTO tb_produtos(nome,quantidade,descricao,categoria,preco)
VALUES ("Red Dead Redemption 2",6,"Game para PS5","Games",200.00);

SELECT * FROM tb_produtos WHERE preco > 500;

SELECT * FROM tb_produtos WHERE preco < 500;

SET SQL_SAFE_UPDATES = 0;

UPDATE tb_produtos SET preco = 2700.00 WHERE nome = "Playstation 5";

SET SQL_SAFE_UPDATES = 1;