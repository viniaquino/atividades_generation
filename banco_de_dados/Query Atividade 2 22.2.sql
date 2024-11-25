CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categorias (
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome_categoria VARCHAR(255) NOT NULL,
    descricao VARCHAR(255)
);

CREATE TABLE tb_pizzas (
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome_pizza VARCHAR(255) NOT NULL UNIQUE,
    preco DECIMAL(8,2) NOT NULL,
    ingredientes TEXT,
    tamanho VARCHAR(50),
    categoriaid BIGINT,
    FOREIGN KEY (categoriaid) REFERENCES tb_categorias(id)
);

INSERT INTO tb_categorias(nome_categoria,descricao)
VALUES
("Tradicional","Sabores clássicos feitos com ingredientes tradicionais"),
("Especial","Sabores especiais com diferentes ingredientes"),
("Doce","Pizzas doces"),
("Vegetariana","Sabores vegetarianos");

INSERT INTO tb_pizzas(nome_pizza,preco,ingredientes,tamanho,categoriaid)
VALUES
("Marguerita",25.50,"mussarela,tomate,manjericão,azeite","Média",1),
("Pepperoni",32.90,"mussarela,pepperoni,orégano","Grande",2),
("Frango com Catupiry",29.90,"frango,catupiry,orégano","Pequena",1),
("Calabresa",27.00,"mussarela,calabresa,cebola,orégano","Média",2),
("Quatro Queijos",35.00,"mussarela,tomate,manjericão,azeite","Média",1),
("Vegetariana",28.50,"tomate,pimentão,cebola,milho,ervilha","Média",3),
("Portuguesa",31.00,"mussarela,presunto,ovo,cebola,azeitona","Grande",2),
("Chocolate",22.50,"chocolate,granulado","Pequena",4),
("Deluxe Suprema",50.00,"mussarela,presunto parma,gorgonzola,rucula","Grande",2),
("Trufada",55.00,"chocolate trufado,morango","Grande",4),
("Premium Gold", 65.00, "mussarela, presunto parma, trufas negras, azeite", "Grande", 2),
("Especial Gourmet", 100.00, "mussarela, camarão, alho poró, cream cheese", "Grande", 2);

SELECT * FROM tb_pizzas WHERE preco > 45.00;

SELECT * FROM tb_pizzas WHERE preco BETWEEN 50.00 AND 100.00;

SELECT * FROM tb_pizzas WHERE nome_pizza LIKE "%M%";

SELECT * FROM tb_pizzas INNER JOIN tb_categorias 
ON tb_pizzas.categoriaid = tb_categorias.id;

SELECT * FROM tb_pizzas INNER JOIN tb_categorias
ON tb_pizzas.categoriaid = tb_categorias.id
WHERE tb_categorias.id = 4;