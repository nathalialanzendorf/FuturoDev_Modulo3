DROP DATABASE pokedex;
CREATE DATABASE pokedex;

DROP TABLE IF EXISTS pokemon;

CREATE TABLE pokemon (
    id uuid PRIMARY KEY,
    numero integer not null,
    nome varchar(255) not null, 
    descricao varchar(255),
    imagem varchar(255), 
    tipo varchar(255),
    categoria varchar(255), 
    peso float(53), 
    area varchar(255), 
    altura float(53), 
    capturado boolean not null
);


INSERT INTO pokemon (id, numero, nome, descricao, imagem, area, capturado) VALUES (
	'0b581629-3c80-4af9-9bcd-b6f79a095736',
    '132',
	'Ditto',
    'Pikachu',
    'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/132.png',
    'Area de floresta',
    'false'
);


INSERT INTO pokemon (id, numero, nome, descricao,imagem, tipo, categoria, area, altura, peso, capturado) VALUES (
	'c30a90d2-83d8-4905-8db7-c5862eb3e43d',
    '25',
	'Pikachu',
    'Pikachu',
    'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/25.png',
    'ELETRICO',
    'RATO',
    'Area de floresta',
    '4',
    '6.0',
    true
);

SELECT * FROM pokemon;