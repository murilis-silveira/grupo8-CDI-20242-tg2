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
import model.bean.Produto;


/**
 *
 * @author franc
 */
public class ProdutoDAO {
    
      
    public void create(Produto f)
    {
         Connection con = ConnectionFactory.getConnection();
         PreparedStatement stmt = null;
    
      try {
            stmt = con.prepareStatement("INSERT INTO Produto (CodBarras, Preco, CodLT, CodNF) Values (?, ?, ?, ?)");           
            
            stmt.setInt(1, f.getCodBarras());
            stmt.setFloat(2, f.getPreco());
            stmt.setInt(3, f.getCodLT());
            stmt.setInt(4, f.getCodNF());
            
            stmt.executeUpdate();
            
            //JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }finally
        {
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    
    }   
      public void createSemVenda(Produto f)
    {
         Connection con = ConnectionFactory.getConnection();
         PreparedStatement stmt = null;
    
      try {
            stmt = con.prepareStatement("INSERT INTO Produto (CodBarras, Preco, CodLT) Values (?, ?, ?)");           
            
            stmt.setInt(1, f.getCodBarras());
            stmt.setFloat(2, f.getPreco());
            stmt.setInt(3, f.getCodLT());
                                                                                   
            stmt.executeUpdate();
            
            //JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }finally
        {
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    
    }  
    
    
    public List<Produto> read()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Produto> frs = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM Produto");
            rs  = stmt.executeQuery();
            
            while(rs.next())
            {
                Produto f = new Produto();
                
                f.setCodProd(rs.getInt("CodProd"));
                f.setCodBarras(rs.getInt("CodBarras"));
                f.setPreco(rs.getFloat("Preco"));
                f.setCodLT(rs.getInt("CodLT"));
                f.setCodNF(rs.getInt("CodNF"));
                
                frs.add(f);
                                                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return frs;
    }   
    
   public void  update(Produto f)
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
                
        try {
            stmt = con.prepareStatement("UPDATE Produto SET CodBarras = ?, Preco = ?, CodLT = ?, CodNF = ? WHERE CodProd = ?");           
            
            stmt.setInt(1, f.getCodBarras());
            stmt.setFloat(2, f.getPreco());
            stmt.setInt(3, f.getCodLT());
            stmt.setInt(4, f.getCodNF());
            
            stmt.setInt(5, f.getCodProd());
                     
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        }finally
            {
            ConnectionFactory.closeConnection(con, stmt);
            
            }
    }
   
    
    
   
   
    
    public void  delete(Produto f)
        {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
                
        try {
            stmt = con.prepareStatement("DELETE FROM Produto WHERE CodProd = ?");         
            stmt.setInt(1, f.getCodProd());
                       
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
