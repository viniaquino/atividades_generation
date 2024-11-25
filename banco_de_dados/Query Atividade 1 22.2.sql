CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome_classe VARCHAR(255) NOT NULL,
    habilidade_especial VARCHAR(100) NOT NULL,
    vida_base INT,
    defesa_base INT,
    dano_base INT
);

CREATE TABLE tb_personagens (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome_personagem VARCHAR(255) NOT NULL,
    nivel INT NOT NULL,
    vida INT,
    experiencia INT,
    classeid BIGINT,
    FOREIGN KEY (classeid) REFERENCES tb_classes(id)
);

INSERT INTO tb_classes(nome_classe, habilidade_especial, vida_base, defesa_base, dano_base)
VALUES 
("Arqueiro", "Flecha Mágica", 1500, 1000, 2000),
("Guerreiro", "Ataque Forte e Resistencia Aumentada", 2000, 1500, 1800),
("Mago", "Feitiço Encantador", 1000, 500, 2500),
("Curandeiro", "Cura Avançada", 900, 2000, 500),
("Assassino", "Velocidade e Ataque Crítico", 1600, 1100, 2000);

INSERT INTO tb_personagens(nome_personagem, nivel, vida, experiencia, classeid)
VALUES
("Legolas", 12, 1400, 2000, 1),
("Artorias", 10, 2000, 1200, 2),
("Gandalf", 15, 1200, 2500, 3),
("Tsunade", 13, 900, 2200, 4),
("Ezio", 8, 1300, 800, 5),
("Kratos", 20, 2500, 3000, 2),
("Harry Potter", 9, 900, 950, 3),
("Ashe", 18, 1650, 2100, 1);

SELECT p.nome_personagem, p.nivel,(p.experiencia + c.dano_base) AS poder_ataque FROM tb_personagens p
INNER JOIN tb_classes c ON p.classeid = c.id WHERE (p.experiencia + c.dano_base) > 2000;

SELECT p.nome_personagem,c.defesa_base FROM tb_personagens p INNER JOIN tb_classes c ON p.classeid = c.id
WHERE c.defesa_base BETWEEN 1000 AND 2000;

SELECT * FROM tb_personagens WHERE nome_personagem LIKE '%C%';

SELECT p.id AS id_personagem,p.nome_personagem,c.id AS id_classe,c.nome_classe FROM tb_personagens p
INNER JOIN tb_classes c ON p.classeid = c.id;

SELECT p.nome_personagem,c.nome_classe FROM tb_personagens p
INNER JOIN tb_classes c ON p.classeid = c.id WHERE c.nome_classe = 'Arqueiro';
