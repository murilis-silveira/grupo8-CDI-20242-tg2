/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Consultas;

/**
 *
 * @author franc
 */
public class ConsultasDAO {
    
    public List<Consultas> read()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Consultas> frs = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT Cliente.Nome, SUM(Preco) as Total_Gasto FROM Venda JOIN Cliente JOIN Produto WHERE Venda.CodCliente = Cliente.CodCliente AND Produto.CodNF = Venda.CodNF GROUP BY Cliente.Nome");
            rs  = stmt.executeQuery();
                                              
            
            while(rs.next())
            {
                Consultas f = new Consultas();
                
                f.setCliente(rs.getString("Cliente.Nome"));
                f.setTotalGasto(rs.getString("Total_Gasto"));
                                                                                                                     
                frs.add(f);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return frs;
    }   
    
    public List<Consultas> readVendaDataCliente()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Consultas> frs = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT Venda.CodNF, Venda.DataVenda, Cliente.Nome FROM Cliente JOIN Venda ON Cliente.CodCliente = Venda.CodCliente");
            rs  = stmt.executeQuery();
                                              
            
            while(rs.next())
            {
                Consultas f = new Consultas();
                
                f.setVenda(rs.getString("Venda.CodNF"));
                f.setData(rs.getString("Venda.DataVenda"));
                f.setCliente(rs.getString("Cliente.Nome"));
                                                                                                                                    
                frs.add(f);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return frs;
    }   
    
    
    public List<Consultas> readQtdCompras()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Consultas> frs = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT Cliente.Nome, COUNT(*) AS total_compras FROM Venda JOIN Cliente WHERE Venda.CodCliente = Cliente.CodCliente GROUP BY Cliente.CodCliente");
            rs  = stmt.executeQuery();
                                              
            
            while(rs.next())
            {
                Consultas f = new Consultas();
                
                f.setCliente(rs.getString("Cliente.Nome"));
                f.setVenda(rs.getString("total_compras"));
                                                                                                                                                 
                frs.add(f);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return frs;
    }   
    
    public List<Consultas> readFiliaisCidade()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Consultas> frs = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT Cidade.Nome, Count(*) as total_filiais FROM Cidade JOIN Filial Where Cidade.Nome = Filial.Cidade GROUP BY Cidade.Nome");
            rs  = stmt.executeQuery();
                                              
            
            while(rs.next())
            {
                Consultas f = new Consultas();
                
                
                
                f.setCidade(rs.getString("Cidade.Nome"));
                f.setFilial(rs.getString("total_filiais"));
                                                                                                                                                 
                frs.add(f);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return frs;
    }   
}
