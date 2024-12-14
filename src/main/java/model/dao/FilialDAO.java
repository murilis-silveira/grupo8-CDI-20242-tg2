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
            
            //JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }finally
        {
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    
    }   
    
    public List<Filial> read()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Filial> filiais = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM filial");
            rs  = stmt.executeQuery();
            
            while(rs.next())
            {
                Filial filial = new Filial();
               
                filial.setCodFilial(rs.getInt("CodFilial"));
                filial.setEndereco(rs.getString("Endereco"));
                filial.setCidade(rs.getString("Cidade"));
                
                
                filiais.add(filial);
                                                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Filial.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return filiais;
    }   
    
    
    public void  update(Filial f)
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
                
        try {
            stmt = con.prepareStatement("UPDATE filial SET Endereco = ?, Cidade = ? WHERE CodFilial = ?");           
            
            stmt.setString(1, f.getEndereco());
            stmt.setString(2, f.getCidade());
                        
            stmt.setInt(3, f.getCodFilial());
           
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        }finally
            {
            ConnectionFactory.closeConnection(con, stmt);
            
            }
    }
    
     public void  delete(Filial f)
        {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
                
        try {
            stmt = con.prepareStatement("DELETE FROM filial WHERE CodFilial = ?");         
            stmt.setInt(1, f.getCodFilial());
           
            
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
