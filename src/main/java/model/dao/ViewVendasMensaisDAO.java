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
import model.bean.ViewVendasMensais;

/**
 *
 * @author franc
 */
public class ViewVendasMensaisDAO {
    
    public List<ViewVendasMensais> read()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<ViewVendasMensais> frs = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM VendasMensais");
            rs  = stmt.executeQuery();
                                              
            
            while(rs.next())
            {
                ViewVendasMensais f = new ViewVendasMensais();
                
                f.setCodFilial(rs.getString("CodFilial"));
                f.setTotalVenda(rs.getString("Total_Vendas"));
                f.setTotalValor(rs.getString("Total_Valor"));
                                                                 
                frs.add(f);
                                                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ViewVendasMensais.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return frs;
    }   
    
    
}
