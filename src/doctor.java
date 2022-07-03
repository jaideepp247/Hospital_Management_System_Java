
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


/**
 *
 * @author lenovo
 */

public class doctor extends javax.swing.JFrame {

     Connection conn = null ;
    PreparedStatement pst;
    ResultSet rs;
    public doctor() {
        initComponents();
        conn = userslogin.ConnecrDB();
        autodid();
        doctable();
    }
    
    int id;
    int newid;
    String usrtype;
    public doctor(int id, String utype)
    {
        initComponents();
        
        this.id = id;
        this.usrtype = utype;
        
        newid = id;
              
    }
    
    public void autodid()
    {
         try {
             Statement s = conn.createStatement();
             rs = s.executeQuery("select MAX(DOCTORID) from doctor");
             rs.next();
             rs.getString("MAX(DOCTORID)");
             
             if(rs.getString("MAX(DOCTORID)") == null)
             {
                 did.setText("D001");
             }
             else
             {
                 long dno = Long.parseLong(rs.getString("MAX(DOCTORID)").substring(2, rs.getString("MAX(DOCTORID)").length()));
                 dno++;
                 did.setText("D"+ String.format("%03d", dno));
             }   
             
         } catch (SQLException ex) {
             Logger.getLogger(doctor.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    public void doctable()
    {
         try {
             pst = conn.prepareStatement("select * from doctor where LOGID=?");
             pst.setInt(1, newid);
             rs = pst.executeQuery();
             ResultSetMetaData rsmd = rs.getMetaData();
             int d;
             d = rsmd.getColumnCount();
             
             DefaultTableModel dtab = (DefaultTableModel) dtable.getModel();
             dtab.setRowCount(0);
             
             while(rs.next())
             {
                 Vector v = new Vector();
                 
                 for(int i=1 ; i<=d ; i++)
                 {
                 v.add(rs.getString("DOCTORID"));
                 v.add(rs.getString("DOCTORNAME"));
                 v.add(rs.getString("SPECIALIZATION"));
                 v.add(rs.getString("QUALIFICATION"));
                 v.add(rs.getString("CHANNELFEE"));
                 v.add(rs.getString("PHONE"));
                 v.add(rs.getString("ROOM"));

                 }
                 
                 dtab.addRow(v);
                 
             }
 
         } catch (SQLException ex) {
             Logger.getLogger(doctor.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dname = new javax.swing.JTextField();
        dspecial = new javax.swing.JTextField();
        dqualify = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dchannelf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dphone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        droom = new javax.swing.JSpinner();
        did = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dtable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DOCTOR REGISTRATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 20), new java.awt.Color(51, 0, 51))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("DOCTOR ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("DOCTOR NAME");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("SPECIALIZATION");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("QUALIFICATION");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("CHANNEL FEE");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("PHONE");

        dphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dphoneActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("ROOM NO.");

        did.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        did.setForeground(new java.awt.Color(102, 0, 102));
        did.setText("D001");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dphone)
                    .addComponent(dchannelf)
                    .addComponent(dqualify)
                    .addComponent(dspecial, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(dname, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(droom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(did, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(did))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dqualify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dchannelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(droom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 51));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 51));
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 0, 51));
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 0, 51));
        jButton4.setText("EXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        dtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DOCTOR ID", "DOCTOR NAME", "SPECIALIZATION", "QUALIFICATION", "CHANNEL FEE", "PHONE NO.", "ROOM NO."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        dtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(dtable);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DOCTOR  REGISTRATION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(402, 402, 402))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String dno = did.getText();
        String docname = dname.getText();
        String docspecial = dspecial.getText();
        String docqualify = dqualify.getText();
        String docfee = dchannelf.getText();
        String docphone = dphone.getText();
        String docroom = droom.getValue().toString();
        
         try {
             pst = conn.prepareStatement("insert into doctor (DOCTORID,DOCTORNAME,SPECIALIZATION,QUALIFICATION,CHANNELFEE,PHONE,ROOM,LOGID) values (?,?,?,?,?,?,?,?) ");
             
             pst.setString(1, dno);
             pst.setString(2, docname);
             pst.setString(3, docspecial);
             pst.setString(4, docqualify);
             pst.setString(5, docfee);
             pst.setString(6, docphone);
             pst.setString(7, docroom);
             pst.setInt(8, newid);
             
             pst.executeUpdate();
             
             JOptionPane.showMessageDialog(this, "DOCTOR INSERTED SUCCESSFULY");
             
             autodid();
             dname.setText("");
             dspecial.setText("");
             dqualify.setText("");
             dchannelf.setText("");
             dphone.setText("");
             droom.setValue(0);
             
             dname.requestFocus();
             
             doctable();
             
         } catch (SQLException ex) {
             Logger.getLogger(doctor.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String dno = did.getText();
        
         try {
             pst = conn.prepareStatement("delete from doctor where DOCTORID=?");
                  
             pst.setString(1, dno);
             
             pst.executeUpdate();
             
             JOptionPane.showMessageDialog(this, "DOCTOR DELETED SUCCESSFULY");
             
             autodid();
             dname.setText("");
             dspecial.setText("");
             dqualify.setText("");
             dchannelf.setText("");
             dphone.setText("");
             droom.setValue(0);
             
             dname.requestFocus();
             
             doctable();
             
             jButton1.setEnabled(true);
             
         } catch (SQLException ex) {
             Logger.getLogger(doctor.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void dtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dtableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtab = (DefaultTableModel)dtable.getModel();
        int SelectIndex = dtable.getSelectedRow();
        
        did.setText(dtab.getValueAt(SelectIndex, 0).toString());
        dname.setText(dtab.getValueAt(SelectIndex, 1).toString());
        dspecial.setText(dtab.getValueAt(SelectIndex, 2).toString());
        dqualify.setText(dtab.getValueAt(SelectIndex, 3).toString());
        dchannelf.setText(dtab.getValueAt(SelectIndex, 4).toString());
        dphone.setText(dtab.getValueAt(SelectIndex, 5).toString());
        droom.setValue(Integer.parseInt(dtab.getValueAt(SelectIndex, 6).toString()));
        
        jButton1.setEnabled(false);
    }//GEN-LAST:event_dtableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String docname = dname.getText();
        String docspecial = dspecial.getText();
        String docqualify = dqualify.getText();
        String docfee = dchannelf.getText();
        String docphone = dphone.getText();
        String docroom = droom.getValue().toString();
        String dno = did.getText();
        
         try {
             pst = conn.prepareStatement("update doctor set DOCTORNAME=?,SPECIALIZATION=?,QUALIFICATION=?,CHANNELFEE=?,PHONE=?,ROOM=? where DOCTORID=?");
         
             pst.setString(1, docname);
             pst.setString(2, docspecial);
             pst.setString(3, docqualify);
             pst.setString(4, docfee);
             pst.setString(5, docphone);
             pst.setString(6, docroom);
             pst.setString(7, dno);
             
             pst.executeUpdate();
             
             JOptionPane.showMessageDialog(this, "DOCTOR UPDATED SUCCESSFULY");
             
             autodid();
             dname.setText("");
             dspecial.setText("");
             dqualify.setText("");
             dchannelf.setText("");
             dphone.setText("");
             droom.setValue(0);
             
             dname.requestFocus();
             
             doctable();
             
             jButton1.setEnabled(true);
             
         } catch (SQLException ex) {
             Logger.getLogger(doctor.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void dphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dphoneActionPerformed

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
                new doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dchannelf;
    private javax.swing.JLabel did;
    private javax.swing.JTextField dname;
    private javax.swing.JTextField dphone;
    private javax.swing.JTextField dqualify;
    private javax.swing.JSpinner droom;
    private javax.swing.JTextField dspecial;
    private javax.swing.JTable dtable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

   

   
}
