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
import model.bean.Cliente;


/**
 *
 * @author franc
 */
public class ClienteDAO {
     public void create(Cliente f)
    {
         Connection con = ConnectionFactory.getConnection();
         PreparedStatement stmt = null;
    
      try {
            stmt = con.prepareStatement("INSERT INTO Cliente (Nome, Contato, CPF_CNPJ) Values (?, ?, ?)");           
            
            stmt.setString(1, f.getNome());
            stmt.setString(3, f.getCPF_CNPJ());                
            stmt.setString(2, f.getContato());
                                                                                   
            stmt.executeUpdate();
            
            //JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }finally
        {
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    
    }   
    
     
    public List<Cliente> read()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Cliente> frs = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente");
            rs  = stmt.executeQuery();
            
            while(rs.next())
            {
                Cliente f = new Cliente();
               
                f.setCodCliente(rs.getInt("CodCliente"));
                f.setNome(rs.getString("Nome"));
                f.setCPF_CNPJ(rs.getString("CPF_CNPJ"));
                f.setContato(rs.getString("Contato"));
                                                             
                
                frs.add(f);
                                                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return frs;
    }   
    
     public void  update(Cliente f)
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
                
        try {
            stmt = con.prepareStatement("UPDATE Cliente SET Nome = ?, Contato = ?, CPF_CNPJ = ? WHERE CodCliente = ?");           
            
            stmt.setString(1, f.getNome());
            stmt.setString(3, f.getCPF_CNPJ());
            stmt.setString(2, f.getContato());

            stmt.setInt(4, f.getCodCliente());          
                     
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        }finally
            {
            ConnectionFactory.closeConnection(con, stmt);
            
            }
    }
     
     public void  delete(Cliente f)
        {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
                
        try {
            stmt = con.prepareStatement("DELETE FROM Cliente WHERE CodCliente = ?");         
            stmt.setInt(1, f.getCodCliente());
                       
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
