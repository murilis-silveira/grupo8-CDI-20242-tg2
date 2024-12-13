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
import model.bean.Filial;

/**
 *
 * @author franc
 */
public class FilialDAO {
    
    
    public void create(Filial f)
    {
         Connection con = ConnectionFactory.getConnection();
         PreparedStatement stmt = null;
    
      try {
            stmt = con.prepareStatement("INSERT INTO Filial (Endereco, Cidade) Values (?, ?)");           
            stmt.setString(1, f.getEndereco());
            stmt.setString(2, f.getCidade());
                        
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
