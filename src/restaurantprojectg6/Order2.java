/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantprojectg6;

import edu.sit.cs.db.CSDbDelegate;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JamesP
 */
public class Order2 extends javax.swing.JFrame {

    /**
     * Creates new form Order2
     */
    public Queue1 q = new Queue1();
    int price = 0;
    String foodName;
    int foodPrice;
    int countCoke = 0, countCake = 0, countPepsi = 0, countSpa = 0, countRamen = 0, countCupcake = 0;
    CSDbDelegate db = new CSDbDelegate("cs14sitkmutt.me", "3306", "CSC105_G6", "CSC105_G6", "CSC105_G6");
    
    public Order2() {
        initComponents();
        setSize(800,600);
        tableLabel.setText("Table " + q.getTable().getCurrentTable());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coke = new javax.swing.JButton();
        pepsi = new javax.swing.JButton();
        cake = new javax.swing.JButton();
        cupcake = new javax.swing.JButton();
        spaghetti = new javax.swing.JButton();
        ramen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        priceLabel = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        doneButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tableLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        coke.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        coke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/water.png"))); // NOI18N
        coke.setText("Coke");
        coke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeActionPerformed(evt);
            }
        });
        getContentPane().add(coke, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 150, 70));

        pepsi.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        pepsi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/water.png"))); // NOI18N
        pepsi.setText("Pepsi");
        pepsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepsiActionPerformed(evt);
            }
        });
        getContentPane().add(pepsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 150, -1));

        cake.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        cake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/cake_A-512.png"))); // NOI18N
        cake.setText("cake");
        cake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cakeActionPerformed(evt);
            }
        });
        getContentPane().add(cake, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 160, -1));

        cupcake.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        cupcake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/cupp.png"))); // NOI18N
        cupcake.setText("cupcake");
        cupcake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cupcakeActionPerformed(evt);
            }
        });
        getContentPane().add(cupcake, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 160, 70));

        spaghetti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/spa.png"))); // NOI18N
        spaghetti.setText(" Spaghetti");
        spaghetti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spaghettiActionPerformed(evt);
            }
        });
        getContentPane().add(spaghetti, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 140, 70));

        ramen.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        ramen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/noodle.png"))); // NOI18N
        ramen.setText("Ramen");
        ramen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ramenActionPerformed(evt);
            }
        });
        getContentPane().add(ramen, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 140, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Menu", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 400, 220));

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, -1, -1));

        priceLabel.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(255, 255, 204));
        priceLabel.setText("Total price: ");
        getContentPane().add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 153, -1));

        back.setText("Back");
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        doneButton.setText("Done");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });
        getContentPane().add(doneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 530, -1, -1));

        jLabel2.setFont(new java.awt.Font("#TS  Malee Normal", 0, 55)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ORDER");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 210, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/head1.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 560, 80));

        tableLabel.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        tableLabel.setForeground(new java.awt.Color(255, 255, 204));
        tableLabel.setText("Table: ");
        getContentPane().add(tableLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/bg2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 940, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokeActionPerformed
        foodName = "Coke";
        foodPrice = 15;
        
        Object[] row = { foodName, foodPrice };

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.addRow(row);
        price += foodPrice;
        countCoke++;
        priceLabel.setText("Total price: " + price);
    }//GEN-LAST:event_cokeActionPerformed

    private void pepsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pepsiActionPerformed
        foodName = "Pepsi";
        foodPrice = 15;
        
        Object[] row = { foodName, foodPrice };

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.addRow(row);
        price += foodPrice;
        countPepsi++;
        priceLabel.setText("Total price: " + price);
    }//GEN-LAST:event_pepsiActionPerformed

    private void cupcakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cupcakeActionPerformed
        foodName = "Cupcake";
        foodPrice = 40;
        
        Object[] row = { foodName, foodPrice };

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.addRow(row);
        price += foodPrice;
        countCupcake++;
        priceLabel.setText("Total price: " + price);
    }//GEN-LAST:event_cupcakeActionPerformed

    private void cakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cakeActionPerformed
        foodName = "Cake";
        foodPrice = 70;
        
        Object[] row = { foodName, foodPrice };

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.addRow(row);
        price += foodPrice;
        countCake++;
        priceLabel.setText("Total price: " + price);
    }//GEN-LAST:event_cakeActionPerformed

    private void spaghettiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spaghettiActionPerformed
        foodName = "Spaghetti";
        foodPrice = 120;
        
        Object[] row = { foodName, foodPrice };

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.addRow(row);
        price += foodPrice;
        countSpa++;
        priceLabel.setText("Total price: " + price);
    }//GEN-LAST:event_spaghettiActionPerformed

    private void ramenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ramenActionPerformed
        foodName = "Ramen";
        foodPrice = 100;
        
        Object[] row = { foodName, foodPrice };

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.addRow(row);
        price += foodPrice;
        countRamen++;
        priceLabel.setText("Total price: " + price);
    }//GEN-LAST:event_ramenActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        countCoke = 0; countCake = 0; countPepsi = 0; countSpa = 0; countRamen = 0; countCupcake = 0; price = 0;
        priceLabel.setText("Total price: " + price);
    }//GEN-LAST:event_clearActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        System.out.println(db.connect());
        String getCoke = "SELECT count FROM RESTAURANT_Food WHERE RESTAURANT_Food.foodName = 'Coke' ";
        HashMap cCount = db.queryRow(getCoke);
        int cokeCount = Integer.parseInt((String)(cCount.get("count")));
        
        String updateCoke = "UPDATE RESTAURANT_Food SET count = '" + (cokeCount+countCoke) + "' WHERE RESTAURANT_Food.foodName = 'Coke' ";
        db.executeQuery(updateCoke);
        
        String getCake = "SELECT count FROM RESTAURANT_Food WHERE RESTAURANT_Food.foodName = 'Cake' ";
        HashMap caCount = db.queryRow(getCake);
        int cakeCount = Integer.parseInt((String)(caCount.get("count")));
        
        String updateCake = "UPDATE RESTAURANT_Food SET count = '" + (cakeCount+countCake) + "' WHERE RESTAURANT_Food.foodName = 'Cake' ";
        db.executeQuery(updateCake);
        
        String getCup = "SELECT count FROM RESTAURANT_Food WHERE RESTAURANT_Food.foodName = 'Cupcake' ";
        HashMap cuCount = db.queryRow(getCup);
        int cupCount = Integer.parseInt((String)(cuCount.get("count")));
        
        String updateCup = "UPDATE RESTAURANT_Food SET count = '" + (cupCount+countCupcake) + "' WHERE RESTAURANT_Food.foodName = 'Cupcake' ";
        db.executeQuery(updateCup);
        
        String getPepsi = "SELECT count FROM RESTAURANT_Food WHERE RESTAURANT_Food.foodName = 'Pepsi' ";
        HashMap pCount = db.queryRow(getPepsi);
        int pepsiCount = Integer.parseInt((String)(pCount.get("count")));
        
        String updatePepsi = "UPDATE RESTAURANT_Food SET count = '" + (pepsiCount+countPepsi) + "' WHERE RESTAURANT_Food.foodName = 'Pepsi' ";
        db.executeQuery(updatePepsi);
        
        String getRamen = "SELECT count FROM RESTAURANT_Food WHERE RESTAURANT_Food.foodName = 'Ramen' ";
        HashMap rCount = db.queryRow(getRamen);
        int ramenCount = Integer.parseInt((String)(rCount.get("count")));
        
        String updateRamen = "UPDATE RESTAURANT_Food SET count = '" + (ramenCount+countRamen) + "' WHERE RESTAURANT_Food.foodName = 'Ramen' ";
        db.executeQuery(updateRamen);
        
        String getSpa = "SELECT count FROM RESTAURANT_Food WHERE RESTAURANT_Food.foodName = 'Spaghetti' ";
        HashMap sCount = db.queryRow(getSpa);
        int spaCount = Integer.parseInt((String)(sCount.get("count")));
        
        String updateSpa = "UPDATE RESTAURANT_Food SET count = '" + (spaCount+countSpa) + "' WHERE RESTAURANT_Food.foodName = 'Spaghetti' ";
        db.executeQuery(updateSpa);
        
        String updatePrice = "UPDATE RESTAURANT_Table SET cost = " + price + " WHERE RESTAURANT_Table.No = " + q.getTable().getCurrentTable();
        db.executeQuery(updatePrice);
        System.out.println(db.disconnect());
        dispose();
        new Function1().setVisible(true);
    }//GEN-LAST:event_doneButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Order2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton cake;
    private javax.swing.JButton clear;
    private javax.swing.JButton coke;
    private javax.swing.JButton cupcake;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton pepsi;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton ramen;
    private javax.swing.JButton spaghetti;
    private javax.swing.JLabel tableLabel;
    // End of variables declaration//GEN-END:variables
}
