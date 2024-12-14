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
import model.bean.Empregado;


/**
 *
 * @author franc
 */
public class EmpregadoDAO {
    
    
    public void create(Empregado f)
    {
         Connection con = ConnectionFactory.getConnection();
         PreparedStatement stmt = null;
    
      try {
            stmt = con.prepareStatement("INSERT INTO Empregado (Nome, CPF, Endereco, Idade, Contato, CodFilial) Values (?, ?, ?, ?, ?, ?)");           
            
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getCPF());
            stmt.setString(3, f.getEndereco());
            stmt.setInt(4, f.getIdade());
            stmt.setString(5, f.getContato());
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
    
    public List<Empregado> read()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Empregado> empregados = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM empregado");
            rs  = stmt.executeQuery();
            
            while(rs.next())
            {
                Empregado f = new Empregado();
               
                f.setCodEmp(rs.getInt("CodEmp"));
                f.setNome(rs.getString("Nome"));
                f.setCPF(rs.getString("CPF"));
                f.setEndereco(rs.getString("Endereco"));
                f.setIdade(rs.getInt("Idade"));
                f.setContato(rs.getString("Contato"));
                f.setCodFilial(rs.getInt("CodFilial"));             
                                                             
                
                empregados.add(f);
                                                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Empregado.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return empregados;
    }   
    
    
    public void  update(Empregado f)
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
                
        try {
            stmt = con.prepareStatement("UPDATE Empregado SET Nome = ?, CPF = ?, Endereco = ?, Idade = ?, Contato = ?, CodFilial = ? WHERE CodEmp = ?");           
            
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getCPF());
            stmt.setString(3, f.getEndereco());
            stmt.setInt(4, f.getIdade());
            stmt.setString(5, f.getContato());
            stmt.setInt(6, f.getCodFilial());
            stmt.setInt(7, f.getCodEmp());          
                     
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        }finally
            {
            ConnectionFactory.closeConnection(con, stmt);
            
            }
    }
    
     public void  delete(Empregado f)
        {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
                
        try {
            stmt = con.prepareStatement("DELETE FROM Empregado WHERE CodEmp = ?");         
            stmt.setInt(1, f.getCodEmp());
           
            
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
