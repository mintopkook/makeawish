/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantprojectg6;

import edu.sit.cs.db.CSDbDelegate;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
/**
 *
 * @author JamesP
 */
public class Billing2 extends javax.swing.JFrame {

    /**
     * Creates new form Billing2
     */
    BillTable bt = new BillTable();
    CSDbDelegate db = new CSDbDelegate("csprog-in.sit.kmutt.ac.th", "3306", "CSC105_G6", "csc105_2014", "csc105");
    int tableNum = bt.getCurrentTable();
    public Billing2() {
        initComponents();
        setSize(800,600);
    }

    public void checkBill(){
        db.connect();
        String sqlN = "SELECT CustomerName FROM RESTAURANT_CustomerInfo WHERE RESTAURANT_CustomerInfo.TableNo = " + tableNum;
        HashMap cn = db.queryRow(sqlN);
        String cusName = (String)(cn.get("CustomerName"));
        customerName.setText(cusName);
        tableNo.setText(tableNum+"");
        String sqlCost = "SELECT cost FROM RESTAURANT_Table WHERE RESTAURANT_Table.No = " + tableNum;
        HashMap sc = db.queryRow(sqlCost);
        int cost = Integer.parseInt((String)(sc.get("cost")));
        db.disconnect();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        customerName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tableNo = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Billing");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 150, 50));

        jLabel3.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jLabel3.setText("Customer Name :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 130, 70));

        jLabel5.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jLabel5.setText("Total Price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 110, 108));

        jLabel4.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jLabel4.setText("Table No.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 140, 100));

        customerName.setBackground(new java.awt.Color(204, 255, 204));
        customerName.setText("cus");
        getContentPane().add(customerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 160, 60));

        jLabel6.setBackground(new java.awt.Color(204, 255, 204));
        jLabel6.setText("price");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/bg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tableNo.setBackground(new java.awt.Color(204, 255, 204));
        tableNo.setText("table");
        getContentPane().add(tableNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 200, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Billing2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing2().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel customerName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel tableNo;
    // End of variables declaration//GEN-END:variables
}
