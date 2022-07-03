
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class prescription extends javax.swing.JFrame {

  private JFrame frame;

    /**
     * Creates new form doctor_main
     */
  
   
    Connection conn = null ;
    PreparedStatement pst;
    ResultSet rs;
    public prescription() {
        
 initComponents();
    conn = userslogin.ConnecrDB();
    }

      
  
    
   
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        printscreen = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        P_name = new javax.swing.JLabel();
        name_tablet = new javax.swing.JLabel();
        no_of_tab = new javax.swing.JLabel();
        L_med_type = new javax.swing.JLabel();
        dosage_L = new javax.swing.JLabel();
        Combo_type = new javax.swing.JComboBox<>();
        Combo_tablets = new javax.swing.JComboBox<>();
        no_of_tab_spinner = new javax.swing.JSpinner();
        Combo_dosage = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        printButton = new javax.swing.JButton();
        update = new javax.swing.JButton();
        presc = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRESCRIPTION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        printscreen.setBackground(new java.awt.Color(0, 0, 0));
        printscreen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        Area.setColumns(20);
        Area.setRows(5);
        jScrollPane1.setViewportView(Area);

        javax.swing.GroupLayout printscreenLayout = new javax.swing.GroupLayout(printscreen);
        printscreen.setLayout(printscreenLayout);
        printscreenLayout.setHorizontalGroup(
            printscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
        );
        printscreenLayout.setVerticalGroup(
            printscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
        );

        jPanel1.add(printscreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 340, 330));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel1.setText("Remarks:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        P_name.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        P_name.setText("Patient Name:");
        jPanel1.add(P_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        name_tablet.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        name_tablet.setText("Name of Med:");
        jPanel1.add(name_tablet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        no_of_tab.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        no_of_tab.setText("Quantity");
        jPanel1.add(no_of_tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        L_med_type.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        L_med_type.setText("Type:");
        jPanel1.add(L_med_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        dosage_L.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        dosage_L.setText("Dosage:");
        jPanel1.add(dosage_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        Combo_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Syrup", "Injection", "Tablet" }));
        jPanel1.add(Combo_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 100, -1));

        Combo_tablets.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Abacavir", "Acyclovir", "Alemtuzumab", "Alendronate", "Allopurinol", "Amifostine", "Amikacin", "Aminocaproic Acid", "Amitriptyline", "Amlodipine", "Amoxicillin", "Amoxicillin / clavulanic acid", "Amphotericin B", "Ampicillin", "Anti-thymocyte globulin", "Aprepitant", "Asparaginase", "Atazanavir (Reyataz®)", "Atenolol", "Atovaquone", "Azithromycin", "Baclofen", "Bleomycin", "Bortezomib", "Bosentan", "Busulfan", "Calcium", "Captopril", "Carbamazepine", "Carboplatin", "Carmustine", "Cefaclor", "Cefepime", "Cefixime", "Ceftazidime", "Cefuroxime", "Celecoxib", "Cephalexin", "Cidofovir", "Cisplatin", "Cladribine", "Clarithromycin", "Clindamycin", "Clobazam", "Clofarabine", "Codeine", "Crizanlizumab", "Crizotinib", "Cyclobenzaprine", "Cyclophosphamide", "Cyclosporine", "Cyproheptadine", "Cytarabine", "Dacarbazine", "Dactinomycin", "Dapsone", "Darunavir (Prezista®)", "Dasatinib", "Daunorubicin", "Deferasirox (Exjade®)", "Desmopressin (Stimate®)", "Dexamethasone", "Diclofenac", "Didanosine", "Dinutuximab", "Dobutamine", "Dopamine", "Dornase alfa", "Doxorubicin", "Dronabinol", "Efavirenz", "Enalapril", "Enoxaparin", "Erlotinib", "Erythromycin", "Erythropoietin", "Etonogestrel (Nexplanon®)", "Etoposide", "Etravirine (Intelence®)", "Factor IX complex", "Factor IX concentrate", "Factor VIIa (Recombinant)", "Factor VIII (Human) and von Willebrand Factor", "Factor VIII (Recombinant)", "Famciclovir", "Famotidine", "Fidaxomicin", "Fluconazole", "Fludarabine", "Fluorouracil", "Foscarnet", "Furosemide", "G-CSF (Filgrastim)", "Gabapentin", "Ganciclovir", "Gefitinib", "Gemcitabine", "Gemtuzumab ozogamicin", "GM-CSF (Sargramostim)", "Granisetron", "Heparin Lock Flush for children and young adults", "Heparin Lock Flush for infants", "Hydralazine", "Hydrocodone with acetaminophen", "Hydrocortisone", "Hydromorphone", "Hydroxyurea", "Hydroxyurea for sickle cell disease", "Ifosfamide", "Imatinib", "Imipenem / cilastatin", "Immune globulin", "Interferon alfa-2a and alfa-2b", "Interferon alfa-2b for melanoma", "Interleukin-2 (Aldesleukin)", "Irinotecan", "Isotretinoin", "Itraconazole", "Ketoconazole", "L-glutamine", "Labetalol", "Lamivudine", "Leucovorin with high dose methotrexate (HDMTX)", "Levothyroxine", "Linezolid", "Lomustine", "Lopinavir / Ritonavir (Kaletra®)", "Lorazepam", "Lorlatinib", "Magnesium", "Maraviroc (Selzentry®)", "Mechlorethamine", "Megestrol acetate", "Meloxicam", "Melphalan", "Meperidine", "Mercaptopurine", "Meropenem", "Mesna", "Methadone", "Methotrexate", "Methylphenidate", "Metronidazole", "Micafungin", "Mitotane", "Mitoxantrone", "Modafinil", "Morphine", "Muromonab – CD3", "Mycophenolate mofetil", "Nelarabine", "Nelfinavir", "Neuromuscular blockers", "Nevirapine", "Norepinephrine", "Omeprazole", "Ondansetron", "Oxycodone", "Paclitaxel", "PEGaspargase", "Pegfilgrastim", "Pemetrexed", "Penicillin VK", "Pentamidine (inhaled by mouth)", "Phenobarbital", "Phenytoin", "Phosphorus", "Posaconazole", "Potassium", "Prednisone", "Probenecid", "Procarbazine", "Promethazine", "Promethazine topical gel", "Propoxyphene", "Raltegravir (Isentress®)", "Ranitidine", "Rasburicase", "Regorafenib", "Ritonavir", "Rituximab", "Rivaroxaban", "Ruxolitinib", "Saquinavir", "Sirolimus", "Sorafenib", "Stavudine", "Sucralfate", "Sugammadex", "Sunitinib", "Tacrolimus", "Temozolomide", "Teniposide", "Tenofovir", "Thioguanine", "Thiotepa", "Tobramycin", "Topotecan", "Tretinoin – applied to the skin", "Tretinoin – by mouth", "Trimethoprim / sulfamethoxazole", "Valproic acid", "Vancomycin", "Vinblastine", "Vincristine", "Voriconazole", "Vorinostat", "Voxelotor", "Warfarin", "Zidovudine" }));
        jPanel1.add(Combo_tablets, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 100, -1));
        jPanel1.add(no_of_tab_spinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 100, -1));

        Combo_dosage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "0+0+1", "1+0+0", "1+0+1", "1+1+1", "0+1+0", "" }));
        jPanel1.add(Combo_dosage, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 100, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 470, 60));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        printButton.setText("Print");
        printButton.setBorder(null);
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        jPanel3.add(printButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 80, 30));

        update.setText("Add");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel3.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 60, 30));

        presc.setText("Prescribe");
        presc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescActionPerformed(evt);
            }
        });
        jPanel3.add(presc, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, -1, 30));

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 0, -1, 30));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 70, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 850, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine", "Dosage", "Quantity", "Type"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 850, 170));
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE))
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

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRow()==-1){
            if(jTable1.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"No Data To Delete", "Note",JOptionPane.OK_OPTION);

            }else{
                JOptionPane.showMessageDialog(null,"Select a row to Delete", "Note",JOptionPane.OK_OPTION);
            }

        }else{
            model.removeRow(jTable1.getSelectedRow());
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void prescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescActionPerformed
        // TODO add your handling code here:

        Area.setText(Area.getText()+"Patient Name: "+Name.getText()+"\n");
        Area.setText(Area.getText()+"========================================"+"\n");
        Area.setText(Area.getText()+"\t"+"Prescription"+"\n");
        Area.setText(Area.getText()+"==========================================="+"\n");
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        Area.setText(Area.getText()+"Medicine"+"\t"+"Dosage"+"\t"+"Quantiy"+"\t"+"Type"+"\n");
        for(int i=0; i<jTable1.getRowCount();i++){
            String medicine=jTable1.getValueAt(i,0).toString();
            String dosage=jTable1.getValueAt(i,1).toString();
            String quantity=jTable1.getValueAt(i,2).toString();
            String type=jTable1.getValueAt(i,3).toString();
            Area.setText(Area.getText()+medicine+"\t"+dosage+"\t"+quantity+"\t"+type+"\n");
        }
        Area.setText(Area.getText()+"===========================================");
        Area.setText(Area.getText()+"\n"+"Remarks:"+"\n"+jTextArea2.getText()+"\n");
    }//GEN-LAST:event_prescActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{Combo_tablets.getSelectedItem().toString(),Combo_dosage.getSelectedItem().toString(),no_of_tab_spinner.getValue(),Combo_type.getSelectedItem().toString()});
    }//GEN-LAST:event_updateActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        try{
            Area.print();
        }
        catch(PrinterException ex){
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE,null, ex);
        }
    }//GEN-LAST:event_printButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new prescription().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area;
    private javax.swing.JComboBox<String> Combo_dosage;
    private javax.swing.JComboBox<String> Combo_tablets;
    private javax.swing.JComboBox<String> Combo_type;
    private javax.swing.JLabel L_med_type;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel P_name;
    private javax.swing.JButton delete;
    private javax.swing.JLabel dosage_L;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel name_tablet;
    private javax.swing.JLabel no_of_tab;
    private javax.swing.JSpinner no_of_tab_spinner;
    private javax.swing.JButton presc;
    private javax.swing.JButton printButton;
    private javax.swing.JPanel printscreen;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
