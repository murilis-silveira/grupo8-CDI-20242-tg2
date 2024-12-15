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
import model.bean.Cliente;
import model.bean.TotalCliente;

/**
 *
 * @author franc
 */
public class TotalClienteDAO {
    
     public List<TotalCliente> read()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<TotalCliente> frs = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT COUNT(*) as TotalClientes FROM cliente");
            rs  = stmt.executeQuery();
            
            while(rs.next())
            {
                TotalCliente f = new TotalCliente();
               
                f.setTotalCliente(rs.getString("TotalClientes"));
                
                frs.add(f);
                                                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TotalCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return frs;
    }   
    
    
    
    
    
}
