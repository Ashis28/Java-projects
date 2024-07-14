/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Login;

/**
 *
 * @author ashis
 */
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class CheckupDesign extends javax.swing.JFrame {

    /** Creates new form CheckupDesign */
    ArrayList<BillingInfo> record = new ArrayList<>();
    ArrayList<Medicine> allMedicines = new ArrayList<>();
    ArrayList<Patient> allPatients = new ArrayList<>();
    
    public CheckupDesign() {
        initComponents();
        readAllPData();
        readAllMData();
        LoadMed(); //load that new select down arrow box
        saveAllPData();
        saveAllMData();
    }
//    void writeAllData() //write in the box panel
//    {
//        allMData.setText("");
//        for(int i=0;i<allMedicines.size();i++)
//        {
//            allMData.append(allMedicines.get(i).getId()+" "+allMedicines.get(i).getName()+" "+allMedicines.get(i).getBuyingPrice()+" "+
//                    allMedicines.get(i).getSellingPrice()+" "+allMedicines.get(i).getQuantity()+" "+allMedicines.get(i).getDescription()+"\n");
//        }
//    }
    
    void saveAllPData()
    {
        try
        {
            FileWriter filewriter = new FileWriter("pdata.txt");
            for(int i=0;i<allPatients.size();i++)
            {
                filewriter.write(allPatients.get(i).getId()+";"+allPatients.get(i).getName()+";"+allPatients.get(i).getAge()+";"+
                        allPatients.get(i).getGender()+";"+allPatients.get(i).getContact()+"\n");
            }
            filewriter.close();
        }
        catch(Exception e)
        {
            System.out.println("Unable to save the data");
        }      
        
    }
    void saveAllMData()
    {
        try
        {
            FileWriter filewriter = new FileWriter("mdata.txt");
            for(int i=0;i<allMedicines.size();i++)
            {
                filewriter.write(allMedicines.get(i).getId()+";"+allMedicines.get(i).getName()+";"+allMedicines.get(i).getBuyingPrice()+";"+
                        allMedicines.get(i).getSellingPrice()+";"+allMedicines.get(i).getQuantity()+";"+allMedicines.get(i).getDescription()+"\n");
            }
            filewriter.close();
        }
        catch(Exception e)
        {
            System.out.println("Unable to save the data");
        }      
        
    }
    void LoadMed()
    {
        allM.removeAllItems();
        for(int i=0;i<allMedicines.size();i++)
        {           
            allM.addItem(allMedicines.get(i).getId()+" "+allMedicines.get(i).getName());
        }
    }
    void readAllPData()  //reading patient data
    {
       try
       {
            File pfile = new File("pdata.txt");
            Scanner scanner = new Scanner(pfile);
            while(scanner.hasNextLine())
            {
                String data = scanner.nextLine();
                String []arr = data.split(";");
                Patient patient = new Patient();
                patient.setId(Integer.parseInt(arr[0]));
                patient.setName(arr[1]);
                patient.setAge(Integer.parseInt(arr[2]));
                patient.setGender(arr[3]);
                patient.setContact(arr[4]);
                allPatients.add(patient);
                
            }
            
        scanner.close();    
       }
       catch(Exception e)
       {
           System.out.println("Exception occured at line 62");
       }
    }
    void readAllMData()   //reading all medicine data
    {
        try
        {
            File mfile = new File("mdata.txt");
            Scanner scanner = new Scanner(mfile);
            while(scanner.hasNextLine())
            {
                String data = scanner.nextLine();
                String []arr = data.split(";");
                Medicine medicine = new Medicine();
                medicine.setId(Integer.parseInt(arr[0]));
                medicine.setName(arr[1]);
                medicine.setBuyingPrice(Integer.parseInt(arr[2]));
                medicine.setSellingPrice(Integer.parseInt(arr[3]));
                medicine.setQuantity(Integer.parseInt(arr[4]));
                medicine.setDescription(arr[5]);
                allMedicines.add(medicine);
            }
            
        scanner.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occured at line 89");
        }
    }
    
    boolean checkForQuantity()
    {
        int currMId = 0;
      //  try {
//            System.out.println(allM.getSelectedItem());
//            String []a = allM.getSelectedItem().toString().split(" ");
//            System.out.println(a[0]);
            currMId = Integer.parseInt(allM.getSelectedItem().toString().split(" ")[0]);
        //} catch (NumberFormatException numberFormatException) {
            System.out.println(currMId);
        //}
        for(int i=0;i<allMedicines.size();i++)
        {
            if(currMId==allMedicines.get(i).getId())
            {
                if (Integer.parseInt(Quantity.getText()) > allMedicines.get(i).getQuantity()) {
                return true;
                }

            }
        }
        
        return false;
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        allM = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        mList = new javax.swing.JTextArea();
        AddMedicine = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fee = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        rec = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Quantity = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("CheckUp Menu");

        jButton1.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 255, 51));
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Patient ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Medicines");

        allM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        allM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        mList.setColumns(20);
        mList.setRows(5);
        jScrollPane1.setViewportView(mList);

        AddMedicine.setBackground(new java.awt.Color(0, 204, 204));
        AddMedicine.setForeground(new java.awt.Color(102, 102, 102));
        AddMedicine.setText("Add Medicine");
        AddMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMedicineActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Medicines List");

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 255));
        jLabel5.setText("Fee");

        rec.setColumns(20);
        rec.setRows(5);
        jScrollPane2.setViewportView(rec);

        jLabel6.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Recomendation");

        save.setFont(new java.awt.Font("Viner Hand ITC", 2, 14)); // NOI18N
        save.setForeground(new java.awt.Color(0, 255, 0));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("Quantity");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(id)
                    .addComponent(fee))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Quantity, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(allM, javax.swing.GroupLayout.Alignment.LEADING, 0, 182, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(AddMedicine))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(save)
                .addGap(278, 278, 278))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(allM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddMedicine)))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(save)
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AddMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMedicineActionPerformed
        // TODO add your handling code here:
        if(Quantity.getText().equals("") || allM.getSelectedItem().toString().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please select Medicine or Enter Quantity ");
        }
        else if(checkForQuantity())
        {
            
            JOptionPane.showMessageDialog(null, "curr Quantity is greater than the avilable quantity ");
        }
        else
        {
            mList.append(allM.getSelectedItem()+";"+Quantity.getText()+"\n");
            Quantity.setText("");
        }
        
    }//GEN-LAST:event_AddMedicineActionPerformed
    boolean PatientIdExist()
    {
        for(int i=0;i<allPatients.size();i++)
        {
            if(id.getText().equals(allPatients.get(i).getId()+""))
            {
                return false;
            }
        }
        return true;
    }
    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        if(id.getText().equals("")||fee.getText().equals("")||rec.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "ID, FEE, Recomendation all fields are mandatory ");
        }
        else if(PatientIdExist())
        {
            JOptionPane.showMessageDialog(null, "Patient id did not exist");
        }
        else
        {
            BillingInfo billingInfo = new BillingInfo();
            billingInfo.setPatientId(Integer.parseInt(id.getText()));
            billingInfo.setFee(Integer.parseInt(fee.getText()));
            String []Mdata = mList.getText().split("\n");
            for(int i=0;i<Mdata.length;i++)
            {
                billingInfo.setMedicineId(Integer.parseInt(Mdata[i].split(" ")[0]));
            }
            billingInfo.setRecomendation(rec.getText());
            DateFormat cDateFormat = new SimpleDateFormat("dd:MM:yyyy");
            Date cdate = new Date();
            billingInfo.setDate(cDateFormat.format(cdate));
            
            record.add(billingInfo);
        }
    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(CheckupDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckupDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckupDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckupDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckupDesign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddMedicine;
    private javax.swing.JTextField Quantity;
    private javax.swing.JComboBox<String> allM;
    private javax.swing.JTextField fee;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea mList;
    private javax.swing.JTextArea rec;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables

}
