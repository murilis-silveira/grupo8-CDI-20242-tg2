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
import model.bean.Detalhes;


/**
 *
 * @author franc
 */
public class DetalhesVendaDAO {
    
    
     public List<Detalhes> count()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Detalhes> frs = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT COUNT(*) as count FROM Venda");
            rs  = stmt.executeQuery();
                                              
            
            while(rs.next())
            {
                Detalhes f = new Detalhes();
                
                f.setCount(rs.getString("count"));                              
                
                frs.add(f);
                                                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Detalhes.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return frs;
    }   
    
     
     public List<Detalhes> TotalValor()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Detalhes> frs = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT SUM(Valor) as count FROM Venda");
            rs  = stmt.executeQuery();
                                              
            
            while(rs.next())
            {
                Detalhes f = new Detalhes();
                
                f.setSoma(rs.getString("count"));                              
                
                frs.add(f);
                                                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Detalhes.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return frs;
    }   
     
     public List<Detalhes> MedioValor()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Detalhes> frs = new ArrayList<>();
        
        
        try {
            
            stmt = con.prepareStatement("SELECT AVG(Valor) as result FROM venda");
            rs  = stmt.executeQuery();
                                              
            
            while(rs.next())
            {
                Detalhes f = new Detalhes();
                
                f.setMedia(rs.getString("result"));                              
                
                frs.add(f);
                                                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Detalhes.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return frs;
    }   
           
     public List<Detalhes> MenorValor()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Detalhes> frs = new ArrayList<>();
        
        
        try {
            
            stmt = con.prepareStatement("SELECT MIN(Valor) as result FROM Venda");
            rs  = stmt.executeQuery();
                                              
            
            while(rs.next())
            {
                Detalhes f = new Detalhes();
                
                f.setMinimo(rs.getString("result"));                              
                
                frs.add(f);
                                                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Detalhes.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return frs;
    }   
    
      public List<Detalhes> MaiorValor()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Detalhes> frs = new ArrayList<>();
        
        
        try {
            
            stmt = con.prepareStatement("SELECT MAX(Valor) as result FROM Venda");
            rs  = stmt.executeQuery();
                                              
            
            while(rs.next())
            {
                Detalhes f = new Detalhes();
                
                f.setMaximo(rs.getString("result"));                              
                
                frs.add(f);
                                                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Detalhes.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return frs;
    }   
      
          public List<Detalhes> UltimoRegistro()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Detalhes> frs = new ArrayList<>();
        
        
        try {
            
            stmt = con.prepareStatement("SELECT MAX(CodNF) as result FROM Venda");
            rs  = stmt.executeQuery();
                                              
            
            while(rs.next())
            {
                Detalhes f = new Detalhes();
                
                f.setMaximo(rs.getString("result"));                              
                
                frs.add(f);
                                                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Detalhes.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return frs;
    }     
    
}
