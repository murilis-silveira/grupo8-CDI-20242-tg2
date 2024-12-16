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
import model.bean.ViewValidadeProduto;

/**
 *
 * @author franc
 */
public class ViewValidadeProdutoDAO {
    
    public List<ViewValidadeProduto> read()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<ViewValidadeProduto> frs = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM ValidadeProduto");
            rs  = stmt.executeQuery();
                                              
            
            while(rs.next())
            {
                ViewValidadeProduto f = new ViewValidadeProduto();
                
                f.setCodProd(rs.getString("CodProd"));
                f.setCodBarras(rs.getString("CodBarras"));
                f.setDataVal(rs.getString("DataVal"));
                f.setCodForn(rs.getString("CodForn"));
                f.setCNPJ(rs.getString("CNPJ"));
                f.setContato(rs.getString("Contato"));
                                                                 
                frs.add(f);
                                                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ViewValidadeProduto.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        return frs;
    }   
    
    
}
