/*Criando uma tabela de turma*/

 CREATE TABLE turma (
     id bigint NOT NULL AUTO_INCREMENT,
     num_sala int NOT NULL,
    turma varchar(255) DEFAULT NULL,
    PRIMARY KEY (id)
   );

/*inserindo dados na tabela de turma*/

INSERT INTO turma (id, num_sala, turma) VALUES (NULL,12,'Generation turma 1');
INSERT INTO turma (id, num_sala, turma) VALUES (NULL,16,'Generation turma 1');


/*criando tabela de aluno e definindo uma chave estrangeira*/

  CREATE TABLE aluno (
    id bigint NOT NULL AUTO_INCREMENT,
    idade int NOT NULL,
    pri_nome varchar(255) DEFAULT NULL,
    sobrenome varchar(255) DEFAULT NULL,
    turma_id bigint DEFAULT NULL,
    PRIMARY KEY (id),
   FOREIGN KEY (turma_id) REFERENCES turma (id)
);

/*inserindo dados na tabela de aluno e definindo uma chave estrangeira*/
 
INSERT INTO aluno (id, idade, pri_nome, sobrenome, turma_id ) VALUES (Null,29,'Marcelo','Barboza',2);
INSERT INTO aluno (id, idade, pri_nome, sobrenome, turma_id ) VALUES (Null,26,'Lucas','Capelloto',1);
INSERT INTO aluno (id, idade, pri_nome, sobrenome, turma_id ) VALUES (Null,19,'Geandro','Leite',1);
INSERT INTO aluno (id, idade, pri_nome, sobrenome, turma_id ) VALUES (Null,32,'Michelle','Souza',2);
INSERT INTO aluno (id, idade, pri_nome, sobrenome, turma_id ) VALUES (Null,34,'Cris','Fidelix',1);

/*Inner join de aluno para turma*/

SELECT     aluno.id, 
            aluno.idade, 
            aluno.pri_nome, 
            aluno.sobrenome,
            turma.turma,
            turma.num_sala 
    FROM aluno
    INNER JOIN turma ON aluno.turma_id = turma.id
    WHERE aluno.idade BETWEEN 19 AND 29
    -- WHERE aluno.sobrenome LIKE "%l%"
    ORDER BY idade, sobrenome desc