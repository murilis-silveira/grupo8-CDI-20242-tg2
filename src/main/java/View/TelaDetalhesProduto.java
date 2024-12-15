/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import model.bean.DetalhesProduto;
import model.dao.DetalhesProdutoDao;
/**
 *
 * @author franc
 */
public class TelaDetalhesProduto extends javax.swing.JFrame {

    /**
     * Creates new form TelaDetalhesProduto
     */
    public TelaDetalhesProduto() {
        initComponents();
        countProduto();
        somaProduto();
        mediaProduto();
        maximoProduto();
        minimoProduto();
    }

   
      public void countProduto()
   {
         DetalhesProdutoDao pdao = new DetalhesProdutoDao();
            
            for(DetalhesProduto p: pdao.countProduto())
         {
             txtCountProduto.setText(p.getCountProduto());                        
                                      
          }      
         
    }
      
      public void somaProduto()
   {
         DetalhesProdutoDao pdao = new DetalhesProdutoDao();
            
            for(DetalhesProduto p: pdao.sumPrecoProduto())
         {
             txtSomaProduto.setText(p.getSomaPrecoProduto());                        
                                      
          }      
         
    }
      
     public void mediaProduto()
   {
         DetalhesProdutoDao pdao = new DetalhesProdutoDao();
            
            for(DetalhesProduto p: pdao.mediaPrecoProduto())
         {
             txtMediaProduto.setText(p.getMediaPrecoProduto());                        
                                      
          }      
         
    }
     
     public void maximoProduto()
   {
         DetalhesProdutoDao pdao = new DetalhesProdutoDao();
            
            for(DetalhesProduto p: pdao.maxPrecoProduto())
         {
             txtMaximoPrecoProduto.setText(p.getMaximoPrecoProduto());                        
                                      
          }      
         
    }
     
     public void minimoProduto()
   {
         DetalhesProdutoDao pdao = new DetalhesProdutoDao();
            
            for(DetalhesProduto p: pdao.minPrecoProduto())
         {
             txtMinimoPrecoProduto.setText(p.getMinimoPrecoProduto());                        
                                      
          }      
         
    }
         
      
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCountProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSomaProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMediaProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMaximoPrecoProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMinimoPrecoProduto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Total de Produtos");

        txtCountProduto.setEditable(false);
        txtCountProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCountProdutoActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor Total em Produtos");

        txtSomaProduto.setEditable(false);
        txtSomaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSomaProdutoActionPerformed(evt);
            }
        });

        jLabel3.setText("Preço médio");

        txtMediaProduto.setEditable(false);
        txtMediaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMediaProdutoActionPerformed(evt);
            }
        });

        jLabel4.setText("Maior Preço");

        txtMaximoPrecoProduto.setEditable(false);
        txtMaximoPrecoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaximoPrecoProdutoActionPerformed(evt);
            }
        });

        jLabel5.setText("Menor Preço");

        txtMinimoPrecoProduto.setEditable(false);
        txtMinimoPrecoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinimoPrecoProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMediaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSomaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCountProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMinimoPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaximoPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCountProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSomaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaximoPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMinimoPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMediaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCountProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCountProdutoActionPerformed



    }//GEN-LAST:event_txtCountProdutoActionPerformed

    private void txtSomaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSomaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSomaProdutoActionPerformed

    private void txtMediaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMediaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMediaProdutoActionPerformed

    private void txtMaximoPrecoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaximoPrecoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaximoPrecoProdutoActionPerformed

    private void txtMinimoPrecoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinimoPrecoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinimoPrecoProdutoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDetalhesProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDetalhesProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDetalhesProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDetalhesProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDetalhesProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCountProduto;
    private javax.swing.JTextField txtMaximoPrecoProduto;
    private javax.swing.JTextField txtMediaProduto;
    private javax.swing.JTextField txtMinimoPrecoProduto;
    private javax.swing.JTextField txtSomaProduto;
    // End of variables declaration//GEN-END:variables
}
