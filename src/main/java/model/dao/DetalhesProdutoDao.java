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
import model.bean.DetalhesProduto;

/**
 *
 * @author franc
 */
public class DetalhesProdutoDao {
    
    public List<DetalhesProduto> countProduto()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<DetalhesProduto> frs = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT COUNT(*) as countProduto FROM Produto");
            rs  = stmt.executeQuery();
                                              
            
            while(rs.next())
            {
                DetalhesProduto f = new DetalhesProduto();
                
                f.setCountProduto(rs.getString("countProduto"));                              
                
                frs.add(f);
                                                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DetalhesProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return frs;
    }   
    
     public List<DetalhesProduto> sumPrecoProduto()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<DetalhesProduto> frs = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT SUM(Preco) as result FROM Produto");
            rs  = stmt.executeQuery();
                                              
            
            while(rs.next())
            {
                DetalhesProduto f = new DetalhesProduto();
                
                f.setSomaPrecoProduto(rs.getString("result"));                              
                
                frs.add(f);
                                                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DetalhesProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return frs;
    }   
     public List<DetalhesProduto> mediaPrecoProduto()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<DetalhesProduto> frs = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT AVG(Preco) as result FROM Produto");
            rs  = stmt.executeQuery();
                                              
            
            while(rs.next())
            {
                DetalhesProduto f = new DetalhesProduto();
                
                f.setMediaPrecoProduto(rs.getString("result"));                              
                
                frs.add(f);
                                                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DetalhesProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return frs;
    } 
     
     public List<DetalhesProduto> maxPrecoProduto()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<DetalhesProduto> frs = new ArrayList<>();
        
        
        try {
            
            stmt = con.prepareStatement("SELECT MAX(Preco) as result FROM Produto");
            rs  = stmt.executeQuery();
                                              
            
            while(rs.next())
            {
                DetalhesProduto f = new DetalhesProduto();
                
                f.setMaximoPrecoProduto(rs.getString("result"));                              
                
                frs.add(f);
                                                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DetalhesProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return frs;
    }   
           
     public List<DetalhesProduto> minPrecoProduto()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<DetalhesProduto> frs = new ArrayList<>();
        
        
        try {
            
            stmt = con.prepareStatement("SELECT MIN(Preco) as result FROM Produto");
            rs  = stmt.executeQuery();
                                              
            
            while(rs.next())
            {
                DetalhesProduto f = new DetalhesProduto();
                
                f.setMinimoPrecoProduto(rs.getString("result"));                              
                
                frs.add(f);
                                                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DetalhesProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return frs;
    }   
    
}

