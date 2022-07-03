
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class lab_tests extends javax.swing.JFrame {

    Connection conn = null ;
    PreparedStatement pst;
    ResultSet rs;
    public lab_tests() {
        initComponents();
        conn = userslogin.ConnecrDB();
        
        itemtable();
    }
    
    
    
    public void itemtable()
    {
         try {
             pst = conn.prepareStatement("select * from lablist");
             rs = pst.executeQuery();
             ResultSetMetaData rsmd = rs.getMetaData();
             int it;
             it = rsmd.getColumnCount();
             
             DefaultTableModel itab = (DefaultTableModel) itable.getModel();
             itab.setRowCount(0);
             
             while(rs.next())
             {
                 Vector v = new Vector();
                 
                 for(int i=1 ; i<=it ; i++)
                 {
                 v.add(rs.getString("Test"));
                 v.add(rs.getString("Rates"));
                 v.add(rs.getString("ReportEx"));
              
                 }
                 
                 itab.addRow(v);
                 
             }
 
         } catch (SQLException ex) {
             Logger.getLogger(lab_tests.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        iname = new javax.swing.JTextField();
        idis = new javax.swing.JTextField();
        isellp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        itable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CREATE ITEM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(51, 0, 51))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("TEST NAME: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("CHARGES");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 139, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("EXCPECTED TIME:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 209, -1, -1));
        jPanel2.add(iname, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 68, 250, -1));
        jPanel2.add(idis, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 137, 250, -1));
        jPanel2.add(isellp, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 207, 250, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 89, 412, 310));
        jPanel2.getAccessibleContext().setAccessibleName("ADD LAB TEST");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 51));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 90, 35));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 51));
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 90, 35));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 0, 51));
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 90, 35));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 0, 51));
        jButton4.setText("EXIT");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 90, 35));

        itable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TEST NAME", "CHARGES", "REPORT TIME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        itable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(itable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 530, 424));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ADD LAB TEST");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String itname = iname.getText();
        String itdis = idis.getText();
        String itsp = isellp.getText();
     
        
        
        
         try {
             pst = conn.prepareStatement("insert into lablist (Test,Rates,ReportEX) values (?,?,?) ");
             
           
             pst.setString(1, itname);
             pst.setString(2, itdis);
             pst.setString(3, itsp);
           
            
             
             pst.executeUpdate();
             
             JOptionPane.showMessageDialog(this, "TEST ADDED SUCCESSFULY");
             
             
             iname.setText("");
             idis.setText("");
             isellp.setText("");
             
             
             iname.requestFocus();
             
             itemtable();
             
         } catch (SQLException ex) {
             Logger.getLogger(lab_tests.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String itno = iname.getText();
        
         try {
             pst = conn.prepareStatement(" delete from lablist where Test = ? ");
             pst.setString(1, itno);           
             pst.executeUpdate();
             
             JOptionPane.showMessageDialog(this, "TEST DELETED SUCCESSFULY");
             
            
             iname.setText("");
             idis.setText("");
             isellp.setText("");
            
             
             itemtable();
             jButton1.setEnabled(true);
             
         } catch (SQLException ex) {
             Logger.getLogger(lab_tests.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void itableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel itab = (DefaultTableModel)itable.getModel();
        int SelectIndex = itable.getSelectedRow();
        
      
        iname.setText(itab.getValueAt(SelectIndex, 0).toString());
        idis.setText(itab.getValueAt(SelectIndex, 1).toString());
        isellp.setText(itab.getValueAt(SelectIndex, 2).toString());
       
        
        jButton1.setEnabled(false);
    }//GEN-LAST:event_itableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String itname = iname.getText();
        String itdis = idis.getText();
        String itsp = isellp.getText();
      
        
         try {
             pst = conn.prepareStatement(" update lablist set Test = ? , Rates = ? , ReportEX = ? where Test = ? ");
             
             pst.setString(1, itname);
             pst.setString(2, itdis);
             pst.setString(3, itsp);
            
             
             pst.executeUpdate();
             
             JOptionPane.showMessageDialog(this, "TEST UPDATED SUCCESSFULY");
             
            
             iname.setText("");
             idis.setText("");
             isellp.setText("");
            
             
             itemtable();
             jButton1.setEnabled(true);
             
         } catch (SQLException ex) {
             Logger.getLogger(lab_tests.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

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
            java.util.logging.Logger.getLogger(OPD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OPD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OPD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OPD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lab_tests().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idis;
    private javax.swing.JTextField iname;
    private javax.swing.JTextField isellp;
    private javax.swing.JTable itable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
