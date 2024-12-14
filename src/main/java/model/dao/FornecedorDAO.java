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
import model.bean.Fornecedor;


/**
 *
 * @author franc
 */
public class FornecedorDAO {
    
 public void create(Fornecedor f)
    {
         Connection con = ConnectionFactory.getConnection();
         PreparedStatement stmt = null;
    
      try {
            stmt = con.prepareStatement("INSERT INTO Fornecedor (CNPJ, Endereco, Contato) Values (?, ?, ?)");           
            
            stmt.setString(1, f.getCNPJ());
            stmt.setString(2, f.getEndereco());
            stmt.setString(3, f.getContato());
                                                                                   
            stmt.executeUpdate();
            
            //JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }finally
        {
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    
    }   
    
     
    public List<Fornecedor> read()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Fornecedor> frs = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM Fornecedor");
            rs  = stmt.executeQuery();
            
            while(rs.next())
            {
                Fornecedor f = new Fornecedor();
               
                f.setCodForn(rs.getInt("CodForn"));
                f.setCNPJ(rs.getString("CNPJ"));
                f.setEndereco(rs.getString("Endereco"));
                f.setContato(rs.getString("Contato"));
                
                frs.add(f);
                                                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Fornecedor.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return frs;
    }   
    
     public void  update(Fornecedor f)
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
                
        try {
            stmt = con.prepareStatement("UPDATE Fornecedor SET CNPJ = ?, Endereco = ?, Contato = ? WHERE CodForn = ?");           
            
            stmt.setString(1, f.getCNPJ());
            stmt.setString(2, f.getEndereco());
            stmt.setString(3, f.getContato());
            
            stmt.setInt(4, f.getCodForn());            
                              
                     
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        }finally
            {
            ConnectionFactory.closeConnection(con, stmt);
            
            }
    }
     
     public void  delete(Fornecedor f)
        {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
                
        try {
            stmt = con.prepareStatement("DELETE FROM Fornecedor WHERE CodForn = ?");         
            stmt.setInt(1, f.getCodForn());
                       
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
