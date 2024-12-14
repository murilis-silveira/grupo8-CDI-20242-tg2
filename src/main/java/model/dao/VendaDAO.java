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
import model.bean.Venda;


/**
 *
 * @author franc
 */
public class VendaDAO {
    
     public void create(Venda f)
    {
         Connection con = ConnectionFactory.getConnection();
         PreparedStatement stmt = null;
    
      try {
            stmt = con.prepareStatement("INSERT INTO Venda (DataVenda, Hora, Valor, NrItens, CodCliente, CodFilial) Values (?, ?, ?, ?, ?, ?)");           
            
            stmt.setString(1, f.getDataVenda());
            stmt.setString(2, f.getHora());                
            stmt.setFloat(3, f.getValor());
            stmt.setInt(4, f.getNrItens());
            stmt.setInt(5, f.getCodCliente());
            stmt.setInt(6, f.getCodFilial());
            
                                                                                   
            stmt.executeUpdate();
            
            //JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }finally
        {
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    
    }   
    
    public List<Venda> read()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Venda> frs = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM Venda");
            rs  = stmt.executeQuery();
            
            while(rs.next())
            {
                Venda f = new Venda();
               
                f.setCodNF(rs.getInt("CodNF"));
                f.setDataVenda(rs.getString("DataVenda"));
                f.setHora(rs.getString("Hora"));
                f.setValor(rs.getFloat("Valor"));
                f.setNrItens(rs.getInt("NrItens"));
                f.setCodCliente(rs.getInt("CodCliente"));
                f.setCodFilial(rs.getInt("CodFilial"));
                                                             
                
                frs.add(f);
                                                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Venda.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return frs;
    }   
    
    public void  update(Venda f)
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
                
        try {
            stmt = con.prepareStatement("UPDATE Venda SET DataVenda = ?, Hora = ?, Valor = ?, NrItens = ?, CodCliente = ?, CodFilial = ? WHERE CodNF = ?");           
            
            stmt.setString(1, f.getDataVenda());
            stmt.setString(2, f.getHora());
            stmt.setFloat(3, f.getValor());
            stmt.setInt(4, f.getNrItens());
            stmt.setInt(5, f.getCodCliente());
            stmt.setInt(6, f.getCodFilial());
            
            stmt.setInt(7, f.getCodNF());                      
               
                     
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        }finally
            {
            ConnectionFactory.closeConnection(con, stmt);
            
            }
    }
    
    public void  delete(Venda f)
        {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
                
        try {
            stmt = con.prepareStatement("DELETE FROM Venda WHERE CodNF = ?");         
            stmt.setInt(1, f.getCodNF());
                       
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
