INSERT INTO Cidade (Nome, SiglaUF) 
VALUES ('Curitiba', 'PR'),
('Chapecó', 'SC'),
('Santa Maria', 'RS');

INSERT INTO Filial (Endereco, Cidade) 
VALUES ('R do Cerrado, 17', 'Curitiba'),
('Av Presidente Vargas, 589', 'Santa Maria'),
('R das Araucárias, 23', 'Curitiba'),
('Av Pinheiros, 44', 'Curitiba'),
('R Barão do Rio Branco,523', 'Chapecó'),
('R do Acampamento, 154', 'Santa Maria'),
('R Uruguai, 102', 'Chapecó'),
('Av Getúlio Dorneles Vargas, 1053', 'Chapecó'),
('Av Nossa Senhora das Dores, 235', 'Santa Maria');

INSERT INTO Fornecedor (CNPJ, Endereco, Contato)
VALUES ('48926456000187', 'Rua das Flores, 123, Bairro Primavera, São Paulo', '11912345678'),
('12874321000156','Avenida Brasil, 4567, Centro, Rio de Janeiro', '21987654321'),
('98213654000122','Praça das Palmeiras, 89, Bairro Jardim, Belo Horizonte,', '3199991111');

INSERT INTO Lote (DataFab, DataVal, CodForn) 
Values(20240101, 20260101, 1),
(20240501, 20250201, 1),
(20240101, 20250401, 2),
(20240101, 20260101, 2),
(20230701, 20240701, 3),
(20230701, 20250701, 3);

INSERT INTO Cliente (Nome, Contato, CPF)
VALUES ('Jorge Guedes', '55984561234', '45158947566'),
('Pedro Ortaça', '51978941254', '47851249735');

INSERT INTO Cliente (Nome, Contato, CPNJ) 
VALUES ('Bar da Rose', '55935467844', '08445789000187'),
('Cachorrão do Crioulo', '55487641126', '58467952000147');

INSERT INTO Venda (DataVenda, Hora, Valor, NrItens, CodCliente, CodFilial)
VALUES (20240908, 170000, 15.98, 3, 4, 2),
(20240603, 153300, 10.99, 2, 1, 1),
(20240607, 145100, 52.97,1, 2, 3);


INSERT INTO Produto (CodBarras, Preco, CodLT, CodNF)
VALUES (51485621, 7.99, 1, 1),
(51485622, 7.99, 1, 1),
(48516879, 10.99, 2, 2),
(89157459, 20.99, 4, 3),
(89157460, 20.99, 4, 3),
(12348754, 10.99, 6, 3);

INSERT INTO Produto (CodBarras, Preco, CodLT)
VALUES (47812548, 15.99, 3),
(15478264, 5.99, 5);