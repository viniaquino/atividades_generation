CREATE DATABASE db_farmacia_bem_estar;

USE db_farmacia_bem_estar;

CREATE TABLE tb_categorias (
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome_categoria VARCHAR(255) NOT NULL,
    descricao VARCHAR(255),
    status_categoria ENUM("ativa","inativa") DEFAULT "ativa"
);

CREATE TABLE tb_produtos (
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome_produto VARCHAR(255) NOT NULL UNIQUE,
    descricao TEXT,
    preco DECIMAL(10,2) NOT NULL,
    quantidade INT DEFAULT 0,
    categoriaid BIGINT,
    FOREIGN KEY (categoriaid) REFERENCES tb_categorias(id)
);

INSERT INTO tb_categorias(nome_categoria,descricao,status_categoria)
VALUES 
("Medicamentos","Produtos para tratamento de doenças","ativa"),
("Suplementos","Vitaminas, minerais e complementos alimentares","ativa"),
("Higiênicos","Produtos para cuidados a higiene","ativa"),
("Cosméticos","Produtos para cuidados estéticos","ativa"),
("Infantil","Produtos para crianças","ativa"),
("Descontinuados","Produtos indisponíveis no momento","inativa");

INSERT INTO tb_produtos(nome_produto,descricao,preco,quantidade,categoriaid)
VALUES
("Paracetamol","Dor e Febre",5.90,150,1),
("Vitamina C","Fortalecimento do sistema imunológico",12.50,80,2),
("Shampoo","Cuidados capilares",18.90,50,3),
("Creme Hidratante","Hidratação da pele",22.50,30,4),
("Fralda","Alta absorção",45.90,100,5),
("Dipirona","Dor e Febre",6.70,200,1),
("Sabonete Líquido","Higiene diária",14.50,120,3),
("Whey Protein","Suplemento alimentar",38.90,60,2),
("Creme Anti-Idade", "Produto cosmético para cuidados com a pele", 75.90, 20, 4),
("Fralda Premium", "Alta absorção para uso noturno", 52.90, 50, 5),
("Kit Vitamina D", "Fortalecimento ósseo", 60.50, 30, 2),
("Whey Isolado", "Suplemento de alta performance", 99.90, 15, 2);

SELECT * FROM tb_produtos WHERE preco > 50.00;

SELECT * FROM tb_produtos WHERE preco BETWEEN 5.00 AND 60.00;

SELECT * FROM tb_produtos WHERE nome_produto LIKE "%C%";

SELECT tb_produtos.*, tb_categorias.nome_categoria, tb_categorias.descricao 
AS descricao_categoria FROM tb_produtos INNER JOIN tb_categorias
ON tb_produtos.categoriaid = tb_categorias.id WHERE tb_categorias.id = 2;
