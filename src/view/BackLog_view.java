/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import restaurantprojectg6.Function1;

/**
 *
 * @author minto
 */
public class BackLog_view extends javax.swing.JFrame {

    /**
     * Creates new form BackLog_view
     */
    public BackLog_view() {
        initComponent();
        setSize(800, 600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   private void initComponent() {

        popFood = new javax.swing.JLabel();
        noCustomer = new javax.swing.JLabel();
        NumCustxt2 = new javax.swing.JTextField();
        DoneButtom2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        NumCusTxt1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        popFood.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        popFood.setForeground(new java.awt.Color(224, 224, 55));
        popFood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/golden_star.png"))); // NOI18N
        popFood.setText("Popular Food");
        popFood.setToolTipText("");
        getContentPane().add(popFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 290, 70));

        noCustomer.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        noCustomer.setForeground(new java.awt.Color(224, 224, 55));
        noCustomer.setText("Number of Customer");
        getContentPane().add(noCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 290, 80));

        NumCustxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumCustxt2ActionPerformed(evt);
            }
        });
        getContentPane().add(NumCustxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 300, 40));

        DoneButtom2.setBackground(new java.awt.Color(255, 255, 255));
        DoneButtom2.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        DoneButtom2.setText("BACK");
        DoneButtom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneButtom2ActionPerformed(evt);
            }
        });
        getContentPane().add(DoneButtom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/cakey.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, 390));

        NumCusTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumCusTxt1ActionPerformed(evt);
            }
        });
        getContentPane().add(NumCusTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 200, 40));

        jLabel4.setFont(new java.awt.Font("#TS  Malee Normal", 0, 55)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Backlog");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 200, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/head1.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 650, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/bg2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>        

    /**
     * @param args the command line arguments
     */
   
   
    private void DoneButtom2ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        Function1 f = new Function1();
        f.setVisible(true);
    }

    private void NumCustxt2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void NumCusTxt1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

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
            java.util.logging.Logger.getLogger(BackLog_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BackLog_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BackLog_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BackLog_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BackLog_view().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    
    private javax.swing.JButton DoneButtom2;
    private javax.swing.JTextField NumCusTxt1;
    private javax.swing.JTextField NumCustxt2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel noCustomer;
    private javax.swing.JLabel popFood;

}
