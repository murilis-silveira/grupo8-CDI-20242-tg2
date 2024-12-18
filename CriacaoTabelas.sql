create database MercDB;

use MercDB;

CREATE TABLE Fornecedor (
  CodForn INT PRIMARY KEY AUTO_INCREMENT,
  CNPJ VARCHAR(14) NOT NULL,
  Endereco VARCHAR (100),
  Contato VARCHAR(11)
);

CREATE TABLE Lote (
  CodLT INT PRIMARY KEY AUTO_INCREMENT,
  DataFab DATE NOT NULL,
  DataVal DATE NOT NULL,
  CodForn INT NOT NULL, 
  FOREIGN KEY (CodForn) REFERENCES Fornecedor(CodForn)
);

CREATE TABLE Cidade (
  Nome VARCHAR (30) PRIMARY KEY,
  SiglaUF VARCHAR (2) NOT NULL
);

CREATE TABLE Filial (
  CodFilial INT PRIMARY KEY AUTO_INCREMENT,
  Endereco VARCHAR(100) NOT NULL,
  Cidade VARCHAR(30) NOT NULL, 
  FOREIGN KEY (Cidade) REFERENCES Cidade(Nome)
);

CREATE TABLE Empregado (
  CodEmp INT PRIMARY KEY AUTO_INCREMENT,
  Nome VARCHAR(50) NOT NULL,
  CPF VARCHAR(11) NOT NULL,
  Endereco VARCHAR (100) NOT NULL,
  Idade INT CHECK (idade >=18),
  Contato VARCHAR(11) NOT NULL,
  CodFilial INT NOT NULL, FOREIGN KEY (CodFilial) REFERENCES Filial(CodFilial)
);

CREATE TABLE Cliente(
  CodCliente INT PRIMARY KEY AUTO_INCREMENT,
  Nome VARCHAR(50) NOT NULL,
  Contato VARCHAR(11) NOT NULL,
  CPF_CNPJ VARCHAR(14) NOT NULL  
); 

CREATE TABLE Venda (
  CodNF INT PRIMARY KEY AUTO_INCREMENT,
  DataVenda DATE NOT NULL,
  Hora TIME NOT NULL,
  Valor DECIMAL(10, 2) CHECK (Valor>=0),
  NrItens INT CHECK (NrItens >=1), 
  CodCliente INT NOT NULL, FOREIGN KEY (CodCliente) REFERENCES Cliente(CodCLiente),
  CodFilial INT NOT NULL, FOREIGN KEY (CodFilial) REFERENCES Filial(CodFilial)
);

CREATE TABLE Produto (
  CodProd INT PRIMARY KEY AUTO_INCREMENT, 
  CodBarras INT NOT NULL,
  Preco DECIMAL(10, 2) NOT NULL,
  CodLT INT NOT NULL, FOREIGN KEY (CodLT) REFERENCES Lote(CodLT),
  CodNF INT, FOREIGN KEY (CodNF) REFERENCES Venda(CodNF)
);

CREATE VIEW ValidadeProduto AS
SELECT Produto.CodProd, Produto.CodBarras, Lote.DataVal, Fornecedor.CodForn, Fornecedor.CNPJ, fornecedor.Contato 
FROM Produto JOIN Lote JOIN Fornecedor
WHERE Produto.CodNF IS NULL AND Produto.CodLT = Lote.CodLT 
AND Lote.CodForn = Fornecedor.CodForn AND DataVal < current_date();

CREATE VIEW VendasMensais AS
SELECT Filial.CodFilial, 
    COUNT(Venda.CodNF) AS Total_Vendas, 
    SUM(Venda.Valor) AS Total_Valor
FROM Filial
LEFT JOIN Venda
ON Venda.CodFilial = Filial.CodFilial 
   AND YEAR(Venda.DataVenda) = YEAR(CURDATE()) 
   AND MONTH(Venda.DataVenda) = MONTH(CURDATE())
GROUP BY Filial.CodFilial;
