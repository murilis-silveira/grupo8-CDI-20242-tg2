/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }finally
        {
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    
    }            
    
}
