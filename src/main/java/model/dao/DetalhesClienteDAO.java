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
public class DetalhesClienteDAO {
    
     public List<Detalhes> count()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Detalhes> frs = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT COUNT(*) as count FROM Cliente");
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
     public List<Detalhes> countCPF()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Detalhes> frs = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT COUNT(CPF_CNPJ) as CPF FROM Cliente WHERE LENGTH(CPF_CNPJ) = 11");
            rs  = stmt.executeQuery();
                                              
            
            while(rs.next())
            {
                Detalhes f = new Detalhes();
                
                f.setCount(rs.getString("CPF"));                              
                
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
      public List<Detalhes> countCNPJ()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Detalhes> frs = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT COUNT(CPF_CNPJ) as CNPJ FROM Cliente WHERE LENGTH(CPF_CNPJ) = 14");
            rs  = stmt.executeQuery();
                                              
            
            while(rs.next())
            {
                Detalhes f = new Detalhes();
                
                f.setCount(rs.getString("CNPJ"));                              
                
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
