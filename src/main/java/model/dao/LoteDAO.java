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
import javax.swing.JOptionPane;
import model.bean.Lote;
 

/**
 *
 * @author franc
 */
public class LoteDAO {
    
    
    public void create(Lote f)
    {
         Connection con = ConnectionFactory.getConnection();
         PreparedStatement stmt = null;
    
      try {
            stmt = con.prepareStatement("INSERT INTO Lote (DataFab, DataVal, CodForn) Values (?, ?, ?)");           
            
            stmt.setString(1, f.getDataFab());
            stmt.setString(2, f.getDataVal());
            stmt.setInt(3, f.getCodForn());
                                                                                   
            stmt.executeUpdate();
            
            //JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }finally
        {
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    
    }   
    
    public List<Lote> read()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Lote> frs = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM Lote");
            rs  = stmt.executeQuery();
            
            while(rs.next())
            {
                Lote f = new Lote();
              
                f.setCodLT(rs.getInt("CodLT"));
                f.setDataFab(rs.getString("DataFab"));
                f.setDataVal(rs.getString("DataVal"));
                f.setCodForn(rs.getInt("CodForn"));
                
                frs.add(f);
                                                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Lote.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return frs;
    }   
    
    public void  update(Lote f)
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
                
        try {
            stmt = con.prepareStatement("UPDATE Lote SET DataFab = ?, DataVal = ?, CodForn = ? WHERE CodLT = ?");           
            
             stmt.setString(1, f.getDataFab());
            stmt.setString(2, f.getDataVal());
            stmt.setInt(3, f.getCodForn());
            
            stmt.setInt(4, f.getCodLT());
                     
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        }finally
            {
            ConnectionFactory.closeConnection(con, stmt);
            
            }
    }
    
    public void  delete(Lote f)
        {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
                
        try {
            stmt = con.prepareStatement("DELETE FROM Lote WHERE CodLT = ?");         
            stmt.setInt(1, f.getCodLT());
                       
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        }finally
        {
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }
    
}
