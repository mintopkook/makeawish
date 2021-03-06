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
import java.awt.Image;
import javax.swing.ImageIcon;
import edu.sit.cs.db.CSDbDelegate;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

public class BillTable extends javax.swing.JFrame {

    /**
     * Creates new form BillTable
     */
    public static int currentTable;
    String[] tableE = new String[12];
    int tableNo;
    static CSDbDelegate db = new CSDbDelegate("csprog-in.sit.kmutt.ac.th", "3306", "CSC105_G6", "csc105_2014", "csc105");
    
    public BillTable() {
        initComponents();
        updateTable();
        setSize(800,600);
    }
    
    DBTable dt = new DBTable();
    
    public void updateTable(){
        dt.upTable(tableE, Table2, Table3, Table1, Table4, Table5, Table6, Table7, Table8, Table9, Table10, Table11, Table12);
    }

    public int getCurrentTable(){
        return currentTable;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        Table3 = new javax.swing.JToggleButton();
        Table2 = new javax.swing.JToggleButton();
        Table5 = new javax.swing.JToggleButton();
        Table1 = new javax.swing.JToggleButton();
        Table12 = new javax.swing.JToggleButton();
        Table4 = new javax.swing.JToggleButton();
        Table6 = new javax.swing.JToggleButton();
        Table7 = new javax.swing.JToggleButton();
        Table8 = new javax.swing.JToggleButton();
        Table9 = new javax.swing.JToggleButton();
        Table10 = new javax.swing.JToggleButton();
        Table11 = new javax.swing.JToggleButton();
        doneButton = new javax.swing.JButton();
        DoneButtom1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        Table3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table3.setName("3"); // NOI18N
        Table3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table3MouseClicked(evt);
            }
        });
        getContentPane().add(Table3);
        Table3.setBounds(230, 160, 30, 30);

        Table2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table2.setName("2"); // NOI18N
        Table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table2MouseClicked(evt);
            }
        });
        getContentPane().add(Table2);
        Table2.setBounds(100, 120, 30, 30);

        Table5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table5.setName("5"); // NOI18N
        Table5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table5MouseClicked(evt);
            }
        });
        getContentPane().add(Table5);
        Table5.setBounds(440, 80, 30, 30);

        Table1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table1.setName("1"); // NOI18N
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        Table1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table1ActionPerformed(evt);
            }
        });
        getContentPane().add(Table1);
        Table1.setBounds(70, 240, 30, 30);

        Table12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table12.setName("12"); // NOI18N
        Table12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table12MouseClicked(evt);
            }
        });
        getContentPane().add(Table12);
        Table12.setBounds(480, 170, 30, 30);

        Table4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table4.setName("4"); // NOI18N
        Table4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table4MouseClicked(evt);
            }
        });
        getContentPane().add(Table4);
        Table4.setBounds(340, 80, 30, 30);

        Table6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table6.setName("6"); // NOI18N
        Table6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table6MouseClicked(evt);
            }
        });
        getContentPane().add(Table6);
        Table6.setBounds(540, 80, 30, 30);

        Table7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table7.setName("7"); // NOI18N
        Table7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table7MouseClicked(evt);
            }
        });
        getContentPane().add(Table7);
        Table7.setBounds(570, 150, 30, 30);

        Table8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table8.setName("8"); // NOI18N
        Table8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table8MouseClicked(evt);
            }
        });
        getContentPane().add(Table8);
        Table8.setBounds(570, 260, 30, 30);

        Table9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table9.setName("9"); // NOI18N
        Table9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table9MouseClicked(evt);
            }
        });
        Table9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table9ActionPerformed(evt);
            }
        });
        getContentPane().add(Table9);
        Table9.setBounds(470, 260, 30, 30);

        Table10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table10.setName("10"); // NOI18N
        Table10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table10MouseClicked(evt);
            }
        });
        getContentPane().add(Table10);
        Table10.setBounds(370, 260, 30, 30);

        Table11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table11.setName("11"); // NOI18N
        Table11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table11MouseClicked(evt);
            }
        });
        getContentPane().add(Table11);
        Table11.setBounds(370, 170, 30, 30);

        doneButton.setBackground(new java.awt.Color(255, 204, 204));
        doneButton.setForeground(new java.awt.Color(51, 51, 51));
        doneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/girl.png"))); // NOI18N
        doneButton.setToolTipText("");
        doneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doneButtonMouseClicked(evt);
            }
        });
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });
        getContentPane().add(doneButton);
        doneButton.setBounds(600, 500, 169, 75);

        DoneButtom1.setBackground(new java.awt.Color(255, 255, 255));
        DoneButtom1.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        DoneButtom1.setText("BACK");
        DoneButtom1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoneButtom1MouseClicked(evt);
            }
        });
        getContentPane().add(DoneButtom1);
        DoneButtom1.setBounds(20, 540, 90, 29);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/12.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 30, 610, 550);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/bg2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Table3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table3MouseClicked
        System.out.println(db.connect());
        currentTable = tableNo = 3;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + 0 + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + 1 + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();

        if(Table3.isSelected()){
            Table3.setIcon(new ImageIcon(imgoff));
            db.executeQuery(setFalse);
            
        }else{
            Table3.setIcon(new ImageIcon(imgon));
            db.executeQuery(setTrue);
            
        }
        System.out.println(db.connect());
    }//GEN-LAST:event_Table3MouseClicked

    private void Table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table2MouseClicked
        // TODO add your handling code here:
        System.out.println(db.connect());
        currentTable = tableNo = 2;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();

        if(Table2.isSelected()){
            Table2.setIcon(new ImageIcon(imgoff));
            db.executeQuery(setFalse);
            
        }else{
            Table2.setIcon(new ImageIcon(imgon));
            db.executeQuery(setTrue);
           
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table2MouseClicked

    private void Table5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table5MouseClicked
        System.out.println(db.connect());
        currentTable = tableNo = 5;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();

        if(Table5.isSelected()){
            Table5.setIcon(new ImageIcon(imgoff));
            db.executeQuery(setFalse);
          
        }else{
            Table5.setIcon(new ImageIcon(imgon));
            db.executeQuery(setTrue);
            
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table5MouseClicked

    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
        // TODO add your handling code here:
        System.out.println(db.connect());
        currentTable = tableNo = 1;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();

        if(Table1.isSelected()){
            Table1.setIcon(new ImageIcon(imgoff));
            db.executeQuery(setFalse);
           
        }else{
            Table1.setIcon(new ImageIcon(imgon));
            db.executeQuery(setTrue);
           
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table1MouseClicked

    private void Table12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table12MouseClicked
        // TODO add your handling code here:
        System.out.println(db.connect());
        currentTable = tableNo = 12;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();

        if(Table12.isSelected()){
            Table12.setIcon(new ImageIcon(imgoff));
            db.executeQuery(setFalse);
             
        }else{
            Table12.setIcon(new ImageIcon(imgon));
            db.executeQuery(setTrue);
            
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table12MouseClicked

    private void Table4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table4MouseClicked
        // TODO add your handling code here:
        System.out.println(db.connect());
        currentTable = tableNo = 4;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();

        if(Table4.isSelected()){
            Table4.setIcon(new ImageIcon(imgoff));
            db.executeQuery(setFalse);
          
        }else{
            Table4.setIcon(new ImageIcon(imgon));
            db.executeQuery(setTrue);
        
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table4MouseClicked

    private void Table6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table6MouseClicked
        // TODO add your handling code here:
        System.out.println(db.connect());
        currentTable = tableNo = 6;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();

        if(Table6.isSelected()){
            Table6.setIcon(new ImageIcon(imgoff));
            db.executeQuery(setFalse);
           
        }else{
            Table6.setIcon(new ImageIcon(imgon));
            db.executeQuery(setTrue);
            
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table6MouseClicked

    private void Table7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table7MouseClicked
        // TODO add your handling code here:
        System.out.println(db.connect());
        currentTable = tableNo = 7;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();

        if(Table7.isSelected()){
            Table7.setIcon(new ImageIcon(imgoff));
            db.executeQuery(setFalse);
            
        }else{
            Table7.setIcon(new ImageIcon(imgon));
            db.executeQuery(setTrue);
          
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table7MouseClicked

    private void Table8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table8MouseClicked
        // TODO add your handling code here:
        System.out.println(db.connect());
        currentTable = tableNo = 8;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();

        if(Table8.isSelected()){
            Table8.setIcon(new ImageIcon(imgoff));
            db.executeQuery(setFalse);
          
        }else{
            Table8.setIcon(new ImageIcon(imgon));
            db.executeQuery(setTrue);
            
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table8MouseClicked

    private void Table9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table9MouseClicked
        // TODO add your handling code here:
        System.out.println(db.connect());
        currentTable = tableNo = 9;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();

        if(Table9.isSelected()){
            Table9.setIcon(new ImageIcon(imgoff));
            db.executeQuery(setFalse);
           
        }else{
            Table9.setIcon(new ImageIcon(imgon));
            db.executeQuery(setTrue);
           
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table9MouseClicked

    private void Table10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table10MouseClicked
        // TODO add your handling code here:
        System.out.println(db.connect());
        currentTable = tableNo = 10;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();

        if(Table10.isSelected()){
            Table10.setIcon(new ImageIcon(imgoff));
            db.executeQuery(setFalse);
         
        }else{
            Table10.setIcon(new ImageIcon(imgon));
            db.executeQuery(setTrue);
          
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table10MouseClicked

    private void Table11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table11MouseClicked
        // TODO add your handling code here:
        System.out.println(db.connect());
        currentTable = tableNo = 11;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();

        if(Table11.isSelected()){
            Table11.setIcon(new ImageIcon(imgoff));
            db.executeQuery(setFalse);
            
        }else{
            Table11.setIcon(new ImageIcon(imgon));
            db.executeQuery(setTrue);
           
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table11MouseClicked

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        
    }//GEN-LAST:event_doneButtonActionPerformed

    private void Table1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Table1ActionPerformed

    private void Table9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Table9ActionPerformed

    private void doneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneButtonMouseClicked
        // TODO add your handling code here:
//        System.out.println(db.connect());
//        String sql = "UPDATE RESTAURANT_Table SET isEmpty=" + 1 + ",cost=" + 0 + " WHERE No= " + currentTable;
//        db.executeQuery(sql);
        dispose();
//        Function1  qq = new Function1();
//        qq.setVisible(true);
//        JOptionPane.showMessageDialog(this, "Thank You" ,"Make a wish",JOptionPane.INFORMATION_MESSAGE);
           
//        this.setVisible(false);
//        new Billing2().setVisible(true);
  
      Billing2 f = new Billing2();
        f.setVisible(true);
        
        
    }//GEN-LAST:event_doneButtonMouseClicked

    private void DoneButtom1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneButtom1MouseClicked
        // TODO add your handling code here:
     
        this.setVisible(false);
        new Billing1().setVisible(true);
    }//GEN-LAST:event_DoneButtom1MouseClicked

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
            java.util.logging.Logger.getLogger(BillTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DoneButtom1;
    private javax.swing.JToggleButton Table1;
    private javax.swing.JToggleButton Table10;
    private javax.swing.JToggleButton Table11;
    private javax.swing.JToggleButton Table12;
    private javax.swing.JToggleButton Table2;
    private javax.swing.JToggleButton Table3;
    private javax.swing.JToggleButton Table4;
    private javax.swing.JToggleButton Table5;
    private javax.swing.JToggleButton Table6;
    private javax.swing.JToggleButton Table7;
    private javax.swing.JToggleButton Table8;
    private javax.swing.JToggleButton Table9;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}


//class Bill12 extends JToggleButton{
//    public Bill12(int table){
//        this.table = tableNo;
//    }
//}