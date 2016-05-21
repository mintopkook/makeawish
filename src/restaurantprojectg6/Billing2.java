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
import static restaurantprojectg6.BillTable.db;
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
        checkBill();
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
        totalprice.setText(cost+"");
        db.disconnect();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton1 = new javax.swing.JButton();
        BackButtom1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        customerName = new javax.swing.JLabel();
        totalprice = new javax.swing.JLabel();
        tableNo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/checkbb.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 350, 90));

        BackButtom1.setBackground(new java.awt.Color(255, 255, 255));
        BackButtom1.setFont(new java.awt.Font("Perpetua", 1, 12)); // NOI18N
        BackButtom1.setText("BACK");
        BackButtom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtom1ActionPerformed(evt);
            }
        });
        getContentPane().add(BackButtom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 70, 30));

        jLabel8.setFont(new java.awt.Font("#TS  Malee Normal", 0, 55)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Billing");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 210, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/head1.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 580, 90));

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Customer Name :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 280, 70));

        jLabel5.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Total Price :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 180, 70));

        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Table No. :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 180, 80));

        customerName.setBackground(new java.awt.Color(204, 255, 204));
        customerName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0)));
        getContentPane().add(customerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 260, 40));

        totalprice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0)));
        getContentPane().add(totalprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 260, 40));

        tableNo.setBackground(new java.awt.Color(204, 255, 204));
        tableNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0)));
        getContentPane().add(tableNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 260, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/bg2.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0)));
        jLabel7.setMaximumSize(new java.awt.Dimension(800, 600));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtom1ActionPerformed
        dispose();
        Function1 f = new Function1();
        f.setVisible(true);

        JOptionPane.showMessageDialog(this, "Welcome to Make a Wish system");
    }//GEN-LAST:event_BackButtom1ActionPerformed
    BillTable bil = new BillTable();
    
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        System.out.println(db.connect());
        String sql = "UPDATE RESTAURANT_Table SET isEmpty=" + 1 + ",cost=" + 0 + " WHERE No= " + bil.currentTable;
        db.executeQuery(sql);
        dispose();
        Function1  qq = new Function1();
        qq.setVisible(true);
        JOptionPane.showMessageDialog(this, "Thank You" ,"Make a wish",JOptionPane.INFORMATION_MESSAGE);
           
       System.out.println(db.disconnect());
    }//GEN-LAST:event_jButton1MouseClicked

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
    private javax.swing.JButton BackButtom1;
    private javax.swing.JLabel customerName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel tableNo;
    private javax.swing.JLabel totalprice;
    // End of variables declaration//GEN-END:variables
}
