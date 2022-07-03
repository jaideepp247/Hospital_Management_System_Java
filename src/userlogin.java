
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class userlogin extends javax.swing.JFrame {

    
    Connection conn = null ;
    PreparedStatement pst;
    ResultSet rs;
    public userlogin() {
        initComponents();
        
        conn = userslogin.ConnecrDB();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ulname = new javax.swing.JTextField();
        ultype = new javax.swing.JComboBox<>();
        ulpass = new javax.swing.JPasswordField();
        ulogin = new javax.swing.JButton();
        uexit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USERNAME");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USERTYPE");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD");

        ulname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ulnameActionPerformed(evt);
            }
        });

        ultype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RECEPTIONIST", "DOCTOR", "LABORTIST" }));
        ultype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultypeActionPerformed(evt);
            }
        });

        ulogin.setBackground(new java.awt.Color(0, 204, 204));
        ulogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ulogin.setForeground(new java.awt.Color(255, 255, 255));
        ulogin.setText("LOGIN");
        ulogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uloginActionPerformed(evt);
            }
        });

        uexit.setBackground(new java.awt.Color(255, 51, 51));
        uexit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        uexit.setForeground(new java.awt.Color(255, 255, 255));
        uexit.setText("EXIT");
        uexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uexitActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("USER LOGIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2)
                        .addGap(46, 46, 46)
                        .addComponent(ultype, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38)
                        .addComponent(ulpass, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(ulogin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(uexit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(40, 40, 40)
                                .addComponent(ulname, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(ulname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(ultype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addComponent(ulpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ulogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uexit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, -1, 502, 400));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\jaiki\\Desktop\\New folder\\istockphoto-1214423422-612x612.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 20, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ulnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ulnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ulnameActionPerformed

    private void uloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uloginActionPerformed
       
     String Username = ulname.getText();
     String Usertype = ultype.getSelectedItem().toString();
     String Password = ulpass.getText();
     
        //userslogin.ConnecrDB();
        try {
            pst = conn.prepareStatement("select * from users where USERNAME = ? and USERTYPE = ? and PASSWORD = ?");
            pst.setString(1, Username);
            pst.setString(2, Usertype);
            pst.setString(3, Password);
            
            rs = pst.executeQuery();
            
            if(rs.next())
            {
                if(Usertype=="DOCTOR"){
                    
               doctor_main p=new doctor_main();
                p.setVisible(true);
                    
                    
                } else if(Usertype=="LABORTIST"){
                    lab_main p=new lab_main();
                p.setVisible(true);
                }else if(Usertype=="RECEPTIONIST"){
                    recep_main p=new recep_main();
                p.setVisible(true);
                }
                
//                int Userid = rs.getInt("ID");
//                this.setVisible(false);
//                new MainForm(Userid,Username,Usertype).setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "USERNAME OR PASSWORD DOESNOT MATCH!!!");
                ulname.setText("");
                ulpass.setText("");
                ultype.setSelectedIndex(-1);
                
                ulname.requestFocus();
                
            }    
            
        } catch (SQLException ex) {
            Logger.getLogger(userlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
    }//GEN-LAST:event_uloginActionPerformed

    private void uexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uexitActionPerformed
        // TODO add your handling code here:
         JFrame frame = new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want Exit", "EXIT",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_uexitActionPerformed

    private void ultypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ultypeActionPerformed

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
            java.util.logging.Logger.getLogger(userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton uexit;
    private javax.swing.JTextField ulname;
    private javax.swing.JButton ulogin;
    private javax.swing.JPasswordField ulpass;
    private javax.swing.JComboBox<String> ultype;
    // End of variables declaration//GEN-END:variables

   

   
}
