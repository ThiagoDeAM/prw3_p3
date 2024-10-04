create table consertos(
    id BIGINT NOT NULL auto_increment PRIMARY KEY,
    entrada DATE NOT NULL,
    saida DATE NOT NULL,
    nome VARCHAR(100) NOT NULL,
    experiencia INT NOT NULL,
    marca VARCHAR(50) NOT NULL,
    modelo VARCHAR(50) NOT NULL,
    ano INT NOT NULL
);