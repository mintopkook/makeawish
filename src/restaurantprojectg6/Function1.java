/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantprojectg6;

/**
 *
 * @author JamesP
 */
public class Function1 extends javax.swing.JFrame {

    /**
     * Creates new form Function1
     */
    public Function1() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        billing = new javax.swing.JButton();
        backlog = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jButton2.setBackground(new java.awt.Color(204, 150, 138));
        jButton2.setFont(new java.awt.Font("Bangna New", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("Queuing");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 70, 285, 50);

        billing.setBackground(new java.awt.Color(204, 150, 138));
        billing.setFont(new java.awt.Font("Bangna New", 1, 14)); // NOI18N
        billing.setForeground(new java.awt.Color(240, 240, 240));
        billing.setText("Billing");
        billing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingActionPerformed(evt);
            }
        });
        getContentPane().add(billing);
        billing.setBounds(330, 150, 285, 50);

        backlog.setBackground(new java.awt.Color(204, 150, 138));
        backlog.setFont(new java.awt.Font("Bangna New", 1, 14)); // NOI18N
        backlog.setForeground(new java.awt.Color(240, 240, 240));
        backlog.setText("Backlog");
        backlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backlogActionPerformed(evt);
            }
        });
        getContentPane().add(backlog);
        backlog.setBounds(330, 230, 285, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 150, 138));
        jLabel1.setText("Make a wish ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 90, 290, 80);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 150, 138));
        jLabel2.setText("Restaurant system management");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 130, 360, 80);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/pasta.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 190, 80, 80);

        setBounds(0, 0, 657, 411);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        Queue1 q = new Queue1();
        q.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void billingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingActionPerformed
        dispose();
        Billing1 b = new Billing1();
        b.setVisible(true);
    }//GEN-LAST:event_billingActionPerformed

    private void backlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backlogActionPerformed
        dispose();
        BackLog blg = new BackLog();
        blg.setVisible(true);
    }//GEN-LAST:event_backlogActionPerformed

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
            java.util.logging.Logger.getLogger(Function1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Function1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Function1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Function1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Function1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backlog;
    private javax.swing.JButton billing;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
