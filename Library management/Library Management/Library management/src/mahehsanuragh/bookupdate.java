/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahehsanuragh;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sssssssssssssss
 */
public class bookupdate extends javax.swing.JFrame {
String isbn,authorname,bookname;
    /**
     * Creates new form bookupdate
     */
    public bookupdate() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        WWW = new javax.swing.JTextField();
        EEE = new javax.swing.JButton();
        WWW1 = new javax.swing.JTextField();
        WWW3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("BOOK UPDATE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));
        getContentPane().add(WWW, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 84, 283, -1));

        EEE.setBackground(new java.awt.Color(0, 153, 153));
        EEE.setForeground(new java.awt.Color(204, 255, 255));
        EEE.setText("UPDATE");
        EEE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EEEActionPerformed(evt);
            }
        });
        getContentPane().add(EEE, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 259, -1, -1));
        getContentPane().add(WWW1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 283, -1));
        getContentPane().add(WWW3, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 182, 283, -1));

        jLabel2.setText("ISBN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 87, -1, -1));

        jLabel3.setText("AUTHORNAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 127, -1, -1));

        jLabel4.setText("BOOK NAME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 185, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setText("ENTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 83, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 153, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 283, -1));

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 283, -1));

        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 730, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EEEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EEEActionPerformed
        // TODO add your handling code here:
        
        
         try {
        String isbn=WWW.getText();
        String authorname=t1.getText();
        String bookname=t2.getText();
         
           Connection conn=databaseconnection.getConnection();
         
             Statement up=conn.createStatement();
         
             
   
             
              String que="update book set authorname='"+authorname+"',bookname='"+bookname+"' where isbn='"+isbn+"'"; 
        
           up.executeUpdate(que);
           
           JOptionPane.showMessageDialog(rootPane, "success");
          
         } catch (SQLException ex) {
             Logger.getLogger(bookupdate.class.getName()).log(Level.SEVERE, null, ex);
         }
        
          
    }//GEN-LAST:event_EEEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
          try { 
        
        isbn=WWW.getText();
          
            Connection g=databaseconnection.getConnection();
       
            Statement pt=g.createStatement();
        
         String query="SELECT * FROM book WHERE isbn='"+isbn+"'";
            
        ResultSet rs=pt.executeQuery(query);
            
            if(rs.next())
            {
               authorname=rs.getString("authorname"); 
               WWW1.setText(authorname);
                bookname=rs.getString("bookname");
                WWW3.setText(bookname);
                
              
            } 
            else
            {
               authorname=rs.getString(null); 
              
              bookname=rs.getString(null);
            
            }
            
            
                  
             
            
            
            
            
            } catch (SQLException ex) {
            Logger.getLogger(bookupdate.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        homepage hp=new homepage();
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

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
            java.util.logging.Logger.getLogger(bookupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookupdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EEE;
    private javax.swing.JTextField WWW;
    private javax.swing.JTextField WWW1;
    private javax.swing.JTextField WWW3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
