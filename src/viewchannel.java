
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class viewchannel extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst;
    ResultSet rs;
    public viewchannel() {
        initComponents();
        conn = userslogin.ConnecrDB();
   pattable();
   CurrentDateTime();
   distable();
   recordstable();
    }
    
    int id; 
    int newid2;
    public viewchannel(int id) {
        initComponents();
        this.id = id;
       newid2 = id;
        
    }
public void CurrentDateTime() {    
  
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
   LocalDateTime now = LocalDateTime.now();  
   date.setText(dtf.format(now));
   DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
   LocalDateTime no = LocalDateTime.now();  
   d_dat.setText(d.format(no));
   DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");  
   LocalDateTime noww = LocalDateTime.now();  
   time.setText(df.format(noww));
     
  }    
    
 public void pattable()
    {
         try {
             pst = conn.prepareStatement("select * from patient");
             rs = pst.executeQuery();
             ResultSetMetaData rsmd = rs.getMetaData();
             int p;
             p = rsmd.getColumnCount();
             
             DefaultTableModel ptab = (DefaultTableModel) ptable.getModel();
             ptab.setRowCount(0);
             
             while(rs.next())
             {
                 Vector v = new Vector();
                 
                 for(int i=1 ; i<=p ; i++)
                 {
                 v.add(rs.getString("PATIENTID"));
                 v.add(rs.getString("PATIENTNAME"));
                 v.add(rs.getString("PHONE"));
                 v.add(rs.getString("ADDRESS"));
                 }
                 
                 ptab.addRow(v);
                 
             }
 
         } catch (SQLException ex) {
             Logger.getLogger(OPD.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    }
 public void distable()
    {
         try {
             pst = conn.prepareStatement("select * from admitted");
             rs = pst.executeQuery();
             ResultSetMetaData rsmd = rs.getMetaData();
             int p;
             p = rsmd.getColumnCount();
             
             DefaultTableModel ptab = (DefaultTableModel) discharge_table.getModel();
             ptab.setRowCount(0);
             
             while(rs.next())
             {
                 Vector v = new Vector();
                 
                 for(int i=1 ; i<=p ; i++)
                 {
                 v.add(rs.getString("id"));
                 v.add(rs.getString("name"));
                 v.add(rs.getString("number"));
                 v.add(rs.getString("address"));
                 v.add(rs.getString("date"));
                 v.add(rs.getString("time"));
                 v.add(rs.getString("room"));
                 v.add(rs.getString("reason"));
                 }
                 
                 ptab.addRow(v);
                 
             }
 
         } catch (SQLException ex) {
             Logger.getLogger(OPD.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    }
 public void recordstable()
    {
         try {
             pst = conn.prepareStatement("select * from discharged");
             rs = pst.executeQuery();
             ResultSetMetaData rsmd = rs.getMetaData();
             int p;
             p = rsmd.getColumnCount();
             
             DefaultTableModel ptab = (DefaultTableModel) recordsT.getModel();
             ptab.setRowCount(0);
             
             while(rs.next())
             {
                 Vector v = new Vector();
                 
                 for(int i=1 ; i<=p ; i++)
                 {
                 v.add(rs.getString("id"));
                 v.add(rs.getString("name"));
                 v.add(rs.getString("number"));
                 v.add(rs.getString("address"));
                 v.add(rs.getString("room"));
                 v.add(rs.getString("reason"));
                 v.add(rs.getString("time"));
                 v.add(rs.getString("date"));
                 v.add(rs.getString("d_date"));
                 }
                 
                 ptab.addRow(v);
                 
             }
 
         } catch (SQLException ex) {
             Logger.getLogger(OPD.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    }
    
     

    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        discharge_table = new javax.swing.JTable();
        dischargeB = new javax.swing.JToggleButton();
        d_dat = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        recordsT = new javax.swing.JTable();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ptable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        padd = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pid = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        patient_no = new javax.swing.JLabel();
        room = new javax.swing.JComboBox<>();
        reason = new javax.swing.JTextField();
        admit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        pname = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(0, 153, 153));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        discharge_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PATIENT ID", "PATIENT NAME", "PHONE NUMBER", "ADDRESS", "DATE ADMITTED", "TIME ADMITTED", "ROOM", "REASON"
            }
        ));
        discharge_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                discharge_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(discharge_table);

        panel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 920, -1));

        dischargeB.setBackground(new java.awt.Color(255, 51, 51));
        dischargeB.setForeground(new java.awt.Color(255, 255, 255));
        dischargeB.setText("Discharge");
        dischargeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dischargeBActionPerformed(evt);
            }
        });
        panel1.add(dischargeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, 30));

        d_dat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d_dat.setForeground(new java.awt.Color(255, 255, 255));
        d_dat.setText("jLabel10");
        panel1.add(d_dat, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DATE:");
        panel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1003, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1003, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("ADMITTED", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        recordsT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Patient Name", "Patient Contact", "Address", "Room", "Reason", "Time Admitted", "Date Admitted", "Date Discharged"
            }
        ));
        jScrollPane3.setViewportView(recordsT);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 980, 504));

        jTabbedPane1.addTab("RECORDS", jPanel2);

        panel.setBackground(new java.awt.Color(0, 153, 153));
        panel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMIT PATIENT");

        ptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PATIENT ID", "PATIENT NAME", "PHONE NO:", "ADDRESS"
            }
        ));
        ptable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ptableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ptable);

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        padd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        padd.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("Phone No:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("Reason:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("Patient ID:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("Address:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("Room No:");

        pid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pid.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("DATE: ");

        patient_no.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        patient_no.setForeground(new java.awt.Color(255, 255, 255));

        room.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "201", "202", "203", "204", "205", "301", "302", "303", "304", "305", "401", "402", "403", "404", "405" }));

        reason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reasonActionPerformed(evt);
            }
        });

        admit.setText("Admit");
        admit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admitActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 51));
        jLabel9.setText("Patient Name:");

        pname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pname.setForeground(new java.awt.Color(255, 255, 255));

        date.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));

        time.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Time:");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(patient_no, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 20, Short.MAX_VALUE))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(padd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(time, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(room, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(reason)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel1))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(821, 821, 821)
                        .addComponent(admit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(patient_no, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(padd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(reason, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))))
                .addGap(15, 15, 15)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(admit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("ADMIT", panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dischargeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dischargeBActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tmodel=(DefaultTableModel) discharge_table.getModel();
        int SelectIndex = discharge_table.getSelectedRow();
        String a_date=tmodel.getValueAt(SelectIndex, 4).toString();
        String a_time=tmodel.getValueAt(SelectIndex, 5).toString();
        String pno = tmodel.getValueAt(SelectIndex, 0).toString();
        String patname = tmodel.getValueAt(SelectIndex, 1).toString();
        String patphone = tmodel.getValueAt(SelectIndex, 2).toString();
        String pataddress = tmodel.getValueAt(SelectIndex, 3).toString();
        String rooms=tmodel.getValueAt(SelectIndex, 6).toString();
        String reasons=tmodel.getValueAt(SelectIndex, 7).toString();
        String dis_date=d_dat.getText();

        try {
            pst = conn.prepareStatement("insert into discharged (id,name,number,address,room,reason,date,time,d_date) values (?,?,?,?,?,?,?,?,?) ");

            pst.setString(9, dis_date);
            pst.setString(1, pno);
            pst.setString(2, patname);
            pst.setString(3, patphone);
            pst.setString(4, pataddress);
            pst.setString(5,rooms);
            pst.setString(6, reasons);
            pst.setString(7,  a_date);
            pst.setString(8, a_time);
            pst.setString(9, dis_date);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "PATIENT DISCHARGED IN RECORDS");
            
            
            
            
             try {
             pst = conn.prepareStatement(" delete from admitted where id = ? ");
             pst.setString(1, pno);           
             pst.executeUpdate();
             
             
             
            
            
             
            distable();
             jButton1.setEnabled(true);
             
         } catch (SQLException ex) {
             Logger.getLogger(OPD.class.getName()).log(Level.SEVERE, null, ex);
         }

            //             pname.setText("");
            //             patient_no.setText("");
            //             padd.setText("");
            //             room.setSelectedItem(0);
            //             reason.setText("");
            //             panel.requestFocus();

        } catch (SQLException ex) {
            Logger.getLogger(OPD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_dischargeBActionPerformed

    private void discharge_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_discharge_tableMouseClicked
        // TODO add your handling code here:
        //        DefaultTableModel ptab = (DefaultTableModel)discharge_table.getModel();
        //        int SelectIndex = discharge_table.getSelectedRow();
        //
        //        pid.setText(ptab.getValueAt(SelectIndex, 0).toString());
        //        pname.setText(ptab.getValueAt(SelectIndex, 1).toString());
        //        patient_no.setText(ptab.getValueAt(SelectIndex, 2).toString());
        //        padd.setText(ptab.getValueAt(SelectIndex, 3).toString());
    }//GEN-LAST:event_discharge_tableMouseClicked

    private void admitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admitActionPerformed
        // TODO add your handling code here:
        String a_date=date.getText();
        String a_time=time.getText();
        String pno = pid.getText();
        String patname = pname.getText();
        String patphone = patient_no.getText();
        String pataddress = padd.getText();
        String rooms=room.getSelectedItem().toString();
        String reasons=reason.getText();

        try {
            pst = conn.prepareStatement("insert into admitted (id,name,number,address,room,reason,date,time) values (?,?,?,?,?,?,?,?) ");

            pst.setString(7, a_date);
            pst.setString(8, a_time);
            pst.setString(1, pno);
            pst.setString(2, patname);
            pst.setString(3, patphone);
            pst.setString(4, pataddress);
            pst.setString(5, rooms);
            pst.setString(6, reasons);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "PATIENT ADMITTED IN RECORDS");

            pname.setText("");
            patient_no.setText("");
            padd.setText("");
            room.setSelectedItem(0);
            reason.setText("");
            panel.requestFocus();
            distable();

        } catch (SQLException ex) {
            Logger.getLogger(OPD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_admitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ptableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ptableMouseClicked
        DefaultTableModel ptab = (DefaultTableModel)ptable.getModel();
        int SelectIndex = ptable.getSelectedRow();

        pid.setText(ptab.getValueAt(SelectIndex, 0).toString());
        pname.setText(ptab.getValueAt(SelectIndex, 1).toString());
        patient_no.setText(ptab.getValueAt(SelectIndex, 2).toString());
        padd.setText(ptab.getValueAt(SelectIndex, 3).toString());

    }//GEN-LAST:event_ptableMouseClicked

    private void reasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reasonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reasonActionPerformed

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
            java.util.logging.Logger.getLogger(viewchannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewchannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewchannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewchannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewchannel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admit;
    private javax.swing.JLabel d_dat;
    private javax.swing.JLabel date;
    private javax.swing.JToggleButton dischargeB;
    private javax.swing.JTable discharge_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel padd;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel1;
    private javax.swing.JLabel patient_no;
    private javax.swing.JLabel pid;
    private javax.swing.JLabel pname;
    public javax.swing.JTable ptable;
    private javax.swing.JTextField reason;
    private javax.swing.JTable recordsT;
    private javax.swing.JComboBox<String> room;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
