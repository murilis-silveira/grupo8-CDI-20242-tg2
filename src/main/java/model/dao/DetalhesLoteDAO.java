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
public class DetalhesLoteDAO {
    
    
     public List<Detalhes> count()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Detalhes> frs = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT COUNT(*) as count FROM Lote");
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
    
     
     
     
     public List<Detalhes> LoteMaisRecenteFab()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Detalhes> frs = new ArrayList<>();
        
        
        try {
            
            stmt = con.prepareStatement("SELECT MAX(DataFab) as result FROM Lote");
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
           
     public List<Detalhes> LoteMaisAntigoFab()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Detalhes> frs = new ArrayList<>();
        
        
        try {
            
            stmt = con.prepareStatement("SELECT MIN(DataFab) as result FROM Lote");
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
    
      public List<Detalhes> MaiorValidade()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Detalhes> frs = new ArrayList<>();
        
        
        try {
            
            stmt = con.prepareStatement("SELECT MAX(DataVal) as result FROM Lote");
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
