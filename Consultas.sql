
 
 INSERT INTO Venda (DataVenda, Hora, Valor) VALUES ('2024-12-31', '15:30:', 100.50);
 INSERT INTO Venda (DataVenda, Hora, Valor) VALUES ('2024-11-30', '12:15:', 250);
 INSERT INTO Venda (DataVenda, Hora, Valor) VALUES ('2024-10-31', '10,39:', 100);
 INSERT INTO Venda (DataVenda, Hora, Valor) VALUES ('2024-09-30', '18:35:', 300);
 INSERT INTO Venda (DataVenda,Hora, Valor) VALUES ('2024-08-31', '21:00:', 500);
 INSERT INTO Venda (DataVenda, Hora, Valor) VALUES ('2024-07-31', '08:00', 50);
 INSERT INTO Venda (DataVenda, Hora, Valor) VALUES ('2024-06-30', '14:25', 150);
 INSERT INTO Venda (DataVenda, Hora, Valor) VALUES ('2024-05-31', '17:00', 400);

 SELECT 
    COUNT(CodNF) AS Total_Numero_Vendas,
    SUM(Valor) AS Total_Vendas_Realizadas,
    AVG(Valor) AS Media_Valor_Venda
FROM Venda;



