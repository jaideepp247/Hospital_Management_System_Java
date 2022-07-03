
import com.email.durgesh.Email;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class appointment extends javax.swing.JFrame {

    Connection conn = null ;
    PreparedStatement pst;
    ResultSet rs;
    String chno;
    public appointment() {
        
        initComponents();
        conn = userslogin.ConnecrDB();
        autochnlno();
        Loaddoctor();
        Loadpatient();
        channeltable();
        emailsender();
    }
    
    
    
    
    public class doctor{
    
        String id;
        String name;
    
        public doctor(String id,String name){
    
            this.id = id;
            this.name = name;
        
            }
    
         public String toString(){
                
             return name;
             
            }
        
    }
    
    public void Loaddoctor(){
    
        try {
            pst = conn.prepareStatement("select * from doctor");
            rs = pst.executeQuery();
            cdoctor.removeAll();
            
            while(rs.next())
            {
                cdoctor.addItem(new doctor(rs.getString(1),rs.getString(2)));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public class patient{
    
        String id;
        String name;
    
        public patient(String id,String name){
    
            this.id = id;
            this.name = name;
        
            }
    
         public String toString(){
                
             return name;
             
            }
        
    }
    public void emailsender(){
        String recep=pemail.getText();
        String doctor=demail.getText();
       
   try {  
        Email email=new Email("myhospitalmanagementsystem@gmail.com","vijvucfcpmymbouj");
        //from
        email.setFrom("myhospitalmanagementsystem@gmail.com", "My Hospital Management System");
        email.setSubject("APPOINTMENT DATE");
        email.setContent("Dear "+cpatient.getSelectedItem().toString()+",\n"+"Your Appointment with DR."+cdoctor.getSelectedItem().toString()+" is fixed on "+date.getDate().toString()+" in Room "+croom.getValue().toString()+"\n"+ "Please Ensure Your Presence."+ "\n\n "+"Hospital Management System", "text/html");
        email.addRecipient(recep);
        email.addRecipient(doctor);
        email.send();
        
    }catch(Exception e){
        e.printStackTrace();
    }
    }
    
    
   
     public void Loadpatient(){
    
        try {
            pst = conn.prepareStatement("select * from patient");
            rs = pst.executeQuery();
            cpatient.removeAll();
            
            while(rs.next())
            {
                cpatient.addItem(new patient(rs.getString(1),rs.getString(2)));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(appointment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     
     
    
    
    
    public void autochnlno()
    {
         try {
             Statement s = conn.createStatement();
             rs = s.executeQuery("select MAX(CHANNELNO) from channel");
             rs.next();
             rs.getString("MAX(CHANNELNO)");
             
             if(rs.getString("MAX(CHANNELNO)") == null)
             {
                 channelno.setText("CH001");
             }
             else
             {
                 long chnlno = Long.parseLong(rs.getString("MAX(CHANNELNO)").substring(2, rs.getString("MAX(CHANNELNO)").length()));
                 chnlno++;
                 channelno.setText("CH"+ String.format("%03d", chnlno));
             }   
             
         } catch (SQLException ex) {
             Logger.getLogger(appointment.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    public void channeltable()
    {
         try {
             pst = conn.prepareStatement("select * from channel");
             rs = pst.executeQuery();
             ResultSetMetaData rsmd = rs.getMetaData();
             int ch;
             ch = rsmd.getColumnCount();
             
             DefaultTableModel dtab = (DefaultTableModel) chtable.getModel();
             dtab.setRowCount(0);
             
             while(rs.next())
             {
                 Vector v = new Vector();
                 
                 for(int i=1 ; i<=ch ; i++)
                 {
                 v.add(rs.getString("CHANNELNO"));
                 v.add(rs.getString("DOCTORNAME"));
                 v.add(rs.getString("PATIENTNAME"));
                 v.add(rs.getString("ROOM"));
                 v.add(rs.getString("DATE"));
                 v.add(rs.getString("doc_email"));
                 v.add(rs.getString("p_email"));
                 
                 }
                 
                 dtab.addRow(v);
                 
             }
 
         } catch (SQLException ex) {
             Logger.getLogger(appointment.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel5 = new javax.swing.JLabel();
        channelno = new javax.swing.JLabel();
        cdoctor = new javax.swing.JComboBox();
        cpatient = new javax.swing.JComboBox();
        croom = new javax.swing.JSpinner();
        date = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        pemail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        demail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        chtable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        reminder = new javax.swing.JButton();
        l_d_date = new javax.swing.JLabel();
        L_d_email = new javax.swing.JLabel();
        l_d_name = new javax.swing.JLabel();
        fordelete = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Appointment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(51, 0, 51))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("CHANNEL NO.");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 85, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("DOCTOR NAME");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 161, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("DOCTOR EMAIL");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("ROOM NO.");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 324, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("CHANNEL DATE");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 391, -1, -1));

        channelno.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        channelno.setForeground(new java.awt.Color(102, 0, 102));
        channelno.setText("jLabel6");
        jPanel2.add(channelno, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 77, -1, -1));

        jPanel2.add(cdoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 250, -1));

        cpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpatientActionPerformed(evt);
            }
        });
        jPanel2.add(cpatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 250, -1));
        jPanel2.add(croom, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 322, 50, -1));

        date.setDateFormatString("dd-MM-yyyy");
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 387, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("PATIENT NAME");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 241, -1, -1));

        pemail.setText("@gmail.com");
        pemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pemailActionPerformed(evt);
            }
        });
        jPanel2.add(pemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 240, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("PATIENT EMAIL");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        demail.setText("@gmail.com");
        demail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demailActionPerformed(evt);
            }
        });
        jPanel2.add(demail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 199, 240, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 73, 491, 445));

        chtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CHANNEL NO.", "DOCTOR NAME", "PATIENT NAME", "ROOM NO.", "DATE", "Doctors Email", "Patient Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        chtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(chtable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 73, 760, 440));

        jButton1.setText("Appoint");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 90, 40));

        jButton2.setText("Cancel Appointment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 140, 40));

        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1209, 566, 80, 40));

        reminder.setText("Send Reminder");
        reminder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reminderActionPerformed(evt);
            }
        });
        jPanel1.add(reminder, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 530, 150, 40));

        l_d_date.setForeground(new java.awt.Color(0, 153, 153));
        l_d_date.setText("jLabel8");
        jPanel1.add(l_d_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 590, -1, -1));

        L_d_email.setForeground(new java.awt.Color(0, 153, 153));
        L_d_email.setText("jLabel8");
        jPanel1.add(L_d_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 600, -1, -1));

        l_d_name.setForeground(new java.awt.Color(0, 153, 153));
        l_d_name.setText("jLabel8");
        jPanel1.add(l_d_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 600, -1, -1));

        fordelete.setForeground(new java.awt.Color(0, 153, 153));
        fordelete.setText("jLabel8");
        jPanel1.add(fordelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1334, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String chnlno = channelno.getText();
        String d =cdoctor.getSelectedItem().toString();
        String p =cpatient.getSelectedItem().toString();
        
        String room = croom.getValue().toString();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dte= df.format(date.getDate());
        String d_email=demail.getText();
        String p_email= pemail.getText();
       
        
         try {
             pst = conn.prepareStatement("insert into channel (CHANNELNO,DOCTORNAME,PATIENTNAME,ROOM,DATE,doc_email,p_email) values (?,?,?,?,?,?,?) ");
             
             pst.setString(1, chnlno);
             pst.setString(2, d);
             pst.setString(3, p);
             pst.setString(4, room);
             pst.setString(5, dte);
             pst.setString(6, d_email);
             pst.setString(7, p_email);
            
             pst.executeUpdate();
             emailsender();
             
             JOptionPane.showMessageDialog(this, "CHANNEL REGISTERED SUCCESSFULY");
             
             autochnlno();
             cdoctor.setSelectedIndex(-1);
             cpatient.setSelectedIndex(-1);
             croom.setValue(0);
             
             channeltable();
             
             
         } catch (SQLException ex) {
             Logger.getLogger(appointment.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chtableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel chtab = (DefaultTableModel)chtable.getModel();
        int SelectIndex = chtable.getSelectedRow();
        
        L_d_email.setText(chtab.getValueAt(SelectIndex, 5).toString());
        l_d_name.setText(chtab.getValueAt(SelectIndex, 1).toString());
        l_d_date.setText(chtab.getValueAt(SelectIndex, 4).toString());
        fordelete.setText(chtab.getValueAt(SelectIndex, 0).toString());
        
       
        
        jButton1.setEnabled(false);
        //JOptionPane.showMessageDialog(this, chno);
    }//GEN-LAST:event_chtableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String sttt=fordelete.getText();
         try {
             pst = conn.prepareStatement("delete from channel where CHANNELNO=?");
             
             pst.setString(1, sttt);
            
             pst.executeUpdate();
             
             JOptionPane.showMessageDialog(this, "APPOINMENT DELETED SUCCESSFULY");
             
             autochnlno();
//             channelno.setText("");
//             cdoctor.setSelectedIndex(-1);
//             demail.setText("");
//             pemail.setText("");
//             cpatient.setSelectedIndex(-1);
//             croom.setValue(0);
             
             channeltable();
             
             
         } catch (Exception ex) {
             Logger.getLogger(appointment.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void reminderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reminderActionPerformed
        String email=L_d_email.getText();
        String name=l_d_name.getText();
        String datee=l_d_date.getText();
        
        try {  
        Email emaill=new Email("myhospitalmanagementsystem@gmail.com","vijvucfcpmymbouj");
        //from
        emaill.setFrom("myhospitalmanagementsystem@gmail.com", "My Hospital Management System");
        emaill.setSubject("APPOINTMENT REMINDER");
        emaill.setContent("Dear DR. "+name+", \n\n"+" You have an appointment on "+datee+" \n\n Regards, \n Receptionist. \n "+ "\n \n "+"Hospital Management System", "text/html");
        
        emaill.addRecipient(email);
       
        emaill.send();
        
    }catch(UnsupportedEncodingException | MessagingException e){
    }
    }//GEN-LAST:event_reminderActionPerformed

    private void demailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_demailActionPerformed

    private void pemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pemailActionPerformed

    private void cpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpatientActionPerformed

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
            java.util.logging.Logger.getLogger(appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new appointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L_d_email;
    private javax.swing.JComboBox cdoctor;
    private javax.swing.JLabel channelno;
    private javax.swing.JTable chtable;
    private javax.swing.JComboBox cpatient;
    private javax.swing.JSpinner croom;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField demail;
    private javax.swing.JLabel fordelete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_d_date;
    private javax.swing.JLabel l_d_name;
    private javax.swing.JTextField pemail;
    private javax.swing.JButton reminder;
    // End of variables declaration//GEN-END:variables
}
