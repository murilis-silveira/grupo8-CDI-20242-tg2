USE mercdb;

 INSERT INTO Cliente (Nome, Contato, CPF_CNPJ)
VALUES ('Jorge Guedes', '55984561234', '45158947566'),
('Pedro Ortaça', '51978941254', '47851249735');

 INSERT INTO Venda (DataVenda, Hora, Valor, CodCliente, CodFilial) VALUES ('2024-12-31', '15:30', 100.50, 5, 2);
 INSERT INTO Venda (DataVenda, Hora, Valor, CodCliente, CodFilial) VALUES ('2024-11-30', '12:15', 250, 2, 3);
 INSERT INTO Venda (DataVenda, Hora, Valor, CodCliente, CodFilial) VALUES ('2024-10-31', '10:39', 100, 3, 2);
 INSERT INTO Venda (DataVenda, Hora, Valor, CodCliente, CodFilial) VALUES ('2024-09-30', '18:35', 300, 7, 1);
 INSERT INTO Venda (DataVenda, Hora, Valor, CodCliente, CodFilial) VALUES ('2024-08-31', '21:00', 500, 4, 1);
 INSERT INTO Venda (DataVenda, Hora, Valor, CodCliente, CodFilial) VALUES ('2024-07-31', '08:00', 50, 1, 3);
 INSERT INTO Venda (DataVenda, Hora, Valor, CodCliente, CodFilial) VALUES ('2024-06-30', '14:25', 150, 6, 2);
 INSERT INTO Venda (DataVenda, Hora, Valor, CodCliente, CodFilial) VALUES ('2024-05-31', '17:00', 400, 8, 3);

 SELECT 
    COUNT(CodNF) AS Numero_Total_Vendas,
    SUM(Valor) AS Total_Vendas_Realizadas,
    AVG(Valor) AS Media_Valor_Venda
FROM Venda;


