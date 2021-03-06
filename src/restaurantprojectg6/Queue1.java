/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantprojectg6;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import edu.sit.cs.db.CSDbDelegate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
/**
 *
 * @author JamesP
 */
public class Queue1 extends javax.swing.JFrame {
    
    
    /**
     * Creates new form StartMenu
     */
    public Table t = new Table();
    
    public Queue1() {
        initComponents();
        setSize(800,600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        customerName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        queueTime = new javax.swing.JTextField();
        BackButton = new javax.swing.JButton();
        chooseTable = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("#TS  Malee Normal", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Restaurant Management System");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 440, 80));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/head1.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 560, 90));

        customerName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameActionPerformed(evt);
            }
        });
        jPanel1.add(customerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 230, 30));

        jLabel2.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Customer's name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Phone Number");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));

        phoneNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(phoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 230, 30));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 331, -1, -1));

        jLabel8.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Queuing Time");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        queueTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        queueTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queueTimeActionPerformed(evt);
            }
        });
        jPanel1.add(queueTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 230, 30));
        DateFormat df = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
        Date d = new Date();
        queueTime.setText(df.format(d) + "");

        BackButton.setText("Back");
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, -1));

        chooseTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/chtable.png"))); // NOI18N
        chooseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chooseTableMouseClicked(evt);
            }
        });
        jPanel1.add(chooseTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 310, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/bg2.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        Function1 f = new Function1();
        f.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonMouseClicked

    private void customerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameActionPerformed

    private void queueTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queueTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_queueTimeActionPerformed

    private void chooseTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseTableMouseClicked
        // TODO add your handling code here:
        checkNull();
  
        CSDbDelegate db = new CSDbDelegate("csprog-in.sit.kmutt.ac.th", "3306", "CSC105_G6", "csc105_2014", "csc105");
        System.out.println(db.connect());
        //Create variable to get the data from text fields
        String name = customerName.getText();
        String phone = phoneNumber.getText();
        String date = queueTime.getText();
        int table = t.getCurrentTable();

        
        String sql = "INSERT INTO RESTAURANT_CustomerInfo(CustomerName, PhoneNumber, TableNo, Date)"
        + "VALUES ('"
        + name + "','"
        + phone + "','"
        + table + "','"         //Get the data from class table
        + date + "') ";         //YYYY-MM-DD HH:MI:SS
        db.executeQuery(sql);
        
        System.out.println(sql);
        
        customerName.setText("");
        phoneNumber.setText("");
        queueTime.setText("");
        
        JOptionPane.showMessageDialog(null,"Customer Add successfully");
        
        
      
                
     this.setVisible(false);
       new Table().setVisible(true);
       
        System.out.println(db.disconnect());
    }//GEN-LAST:event_chooseTableMouseClicked
    
    
    public void checkNull(){
        if(customerName.getText().length()== 0 || queueTime.getText().length() == 0 || phoneNumber.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Please fill data");
        }else{
           
        
        }
        
    }
    
    
    public Table getTable(){
        return t;
    }
    
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
            java.util.logging.Logger.getLogger(Queue1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Queue1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Queue1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Queue1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Queue1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton chooseTable;
    private javax.swing.JTextField customerName;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JTextField queueTime;
    // End of variables declaration//GEN-END:variables
}
