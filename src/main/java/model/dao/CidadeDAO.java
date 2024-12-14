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
import model.bean.Cidade;

/**
 *
 * @author franc
 */
public class CidadeDAO {
    
    public void create(Cidade c)
    {
         Connection con = ConnectionFactory.getConnection();
         PreparedStatement stmt = null;
    
      try {
            stmt = con.prepareStatement("INSERT INTO Cidade (Nome, SiglaUF) Values (?, ?)");           
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getSiglaUF());
            
            
            stmt.executeUpdate();
            
           // JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }finally
        {
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    
    }
    
    public List<Cidade> read()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Cidade> cidades = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM Cidade");
            rs  = stmt.executeQuery();
            
            while(rs.next())
            {
                Cidade cidade = new Cidade();
                cidade.setNome(rs.getString("Nome"));
                cidade.setSiglaUF(rs.getString("SiglaUF"));
                
                cidades.add(cidade);
                                                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return cidades;
    }
    
    public void  update(Cidade c, String nomeTemp)
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
                
        try {
            stmt = con.prepareStatement("UPDATE Cidade SET Nome = ?, SiglaUF = ? WHERE Nome = ?");           
            
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getSiglaUF());
            stmt.setString(3, nomeTemp); 
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        }finally
        {
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }
    
     public void  delete(Cidade c, String nomeTemp)
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
                
        try {
            stmt = con.prepareStatement("DELETE FROM Cidade WHERE Nome = ?");           
                        
            stmt.setString(1, nomeTemp); 
                        
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
