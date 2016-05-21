/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantprojectg6;

import java.awt.Image;
import javax.swing.ImageIcon;
import edu.sit.cs.db.CSDbDelegate;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author pim
 */
public class Table extends javax.swing.JFrame {

    /**
     * Creates new form Table
     */
    public static int currentTable;
    
    public Table() {
        initComponents();
        updateTable();
       showCusno();
        setSize(800,600);
    }
    
    DBTable dt = new DBTable();
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    boolean isEmpty;
    String[] tableE = new String[12];
    int tableNo;
    
    static CSDbDelegate db = new CSDbDelegate("csprog-in.sit.kmutt.ac.th", "3306", "CSC105_G6", "csc105_2014", "csc105");
    
    public void updateTable(){
        dt.upTable(tableE, Table2, Table3, Table1, Table4, Table5, Table6, Table7, Table8, Table9, Table10, Table11, Table12);
    }

    
    
    public int getCurrentTable(){
        return currentTable;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        jButton1 = new javax.swing.JButton();
        DoneButtom1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(null);

        Table3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table3MouseClicked(evt);
            }
        });
        Table3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table3ActionPerformed(evt);
            }
        });
        jPanel1.add(Table3);
        Table3.setBounds(220, 160, 30, 30);

        Table2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table2MouseClicked(evt);
            }
        });
        jPanel1.add(Table2);
        Table2.setBounds(90, 120, 30, 30);

        Table5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table5MouseClicked(evt);
            }
        });
        jPanel1.add(Table5);
        Table5.setBounds(430, 80, 30, 30);

        Table1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Check.png"))); // NOI18N
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
        jPanel1.add(Table1);
        Table1.setBounds(60, 240, 30, 30);

        Table12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table12MouseClicked(evt);
            }
        });
        Table12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table12ActionPerformed(evt);
            }
        });
        jPanel1.add(Table12);
        Table12.setBounds(460, 170, 30, 30);

        Table4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table4MouseClicked(evt);
            }
        });
        Table4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table4ActionPerformed(evt);
            }
        });
        jPanel1.add(Table4);
        Table4.setBounds(330, 80, 30, 30);

        Table6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table6MouseClicked(evt);
            }
        });
        jPanel1.add(Table6);
        Table6.setBounds(540, 80, 30, 30);

        Table7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table7MouseClicked(evt);
            }
        });
        Table7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table7ActionPerformed(evt);
            }
        });
        jPanel1.add(Table7);
        Table7.setBounds(560, 150, 30, 30);

        Table8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table8MouseClicked(evt);
            }
        });
        jPanel1.add(Table8);
        Table8.setBounds(570, 260, 30, 30);

        Table9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table9MouseClicked(evt);
            }
        });
        jPanel1.add(Table9);
        Table9.setBounds(460, 260, 30, 30);

        Table10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table10MouseClicked(evt);
            }
        });
        Table10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Table10ActionPerformed(evt);
            }
        });
        jPanel1.add(Table10);
        Table10.setBounds(360, 260, 30, 30);

        Table11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table11MouseClicked(evt);
            }
        });
        jPanel1.add(Table11);
        Table11.setBounds(350, 170, 30, 30);

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Girl.png"))); // NOI18N
        jButton1.setText("DONE");
        jButton1.setToolTipText("");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(610, 490, 150, 70);

        DoneButtom1.setBackground(new java.awt.Color(255, 255, 255));
        DoneButtom1.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        DoneButtom1.setText("BACK");
        DoneButtom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneButtom1ActionPerformed(evt);
            }
        });
        jPanel1.add(DoneButtom1);
        DoneButtom1.setBounds(20, 550, 90, 29);

        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel3);
        jLabel3.setBounds(635, 110, 140, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/12.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 20, 630, 570);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/bg2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(980, 410, 43, 140);

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
    
    
    private void Table3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table3MouseClicked
        System.out.println(db.connect());
        currentTable = tableNo = 3;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();
        
        if(Table3.isSelected()){
            Table3.setIcon(new ImageIcon(imgoff));
            isEmpty = false;
            db.executeQuery(setFalse);
            JOptionPane.showMessageDialog(null, "Table selected");
            
        }else{
            Table3.setIcon(new ImageIcon(imgon));
            isEmpty = true;
            db.executeQuery(setTrue);
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table3MouseClicked

    private void Table5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table5MouseClicked

        System.out.println(db.connect());
        currentTable = tableNo = 5;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();
        
        if(Table5.isSelected()){
            Table5.setIcon(new ImageIcon(imgoff));
            isEmpty = false;
            db.executeQuery(setFalse);
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            Table5.setIcon(new ImageIcon(imgon));
            isEmpty = true;
            db.executeQuery(setTrue);
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table5MouseClicked

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
            isEmpty = false;
            db.executeQuery(setFalse);
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            Table2.setIcon(new ImageIcon(imgon));
            isEmpty = true;
            db.executeQuery(setTrue);
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table2MouseClicked

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
            isEmpty = false;
            db.executeQuery(setFalse);
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            Table1.setIcon(new ImageIcon(imgon));
            isEmpty = true;
            db.executeQuery(setTrue);
            JOptionPane.showMessageDialog(null, "Table deselected");
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
            isEmpty = false;
            db.executeQuery(setFalse);
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            Table12.setIcon(new ImageIcon(imgon));
            isEmpty = true;
            db.executeQuery(setTrue);
            JOptionPane.showMessageDialog(null, "Table deselected");
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
            isEmpty = false;
            db.executeQuery(setFalse);
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            Table4.setIcon(new ImageIcon(imgon));
            isEmpty = true;
            db.executeQuery(setTrue);
            JOptionPane.showMessageDialog(null, "Table deselected");
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
            isEmpty = false;
            db.executeQuery(setFalse);
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            Table6.setIcon(new ImageIcon(imgon));
            isEmpty = true;
            db.executeQuery(setTrue);
            JOptionPane.showMessageDialog(null, "Table deselected");
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
            isEmpty = false;
            db.executeQuery(setFalse);
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            Table7.setIcon(new ImageIcon(imgon));
            isEmpty = true;
            db.executeQuery(setTrue);
            JOptionPane.showMessageDialog(null, "Table deselected");
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
            isEmpty = false;
            db.executeQuery(setFalse);
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            Table8.setIcon(new ImageIcon(imgon));
            isEmpty = true;
            db.executeQuery(setTrue);
            JOptionPane.showMessageDialog(null, "Table deselected");
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
            isEmpty = false;
            db.executeQuery(setFalse);
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            Table9.setIcon(new ImageIcon(imgon));
            isEmpty = true;
            db.executeQuery(setTrue);
            JOptionPane.showMessageDialog(null, "Table deselected");
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
            isEmpty = false;
            db.executeQuery(setFalse);
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            Table10.setIcon(new ImageIcon(imgon));
            isEmpty = true;
            db.executeQuery(setTrue);
            JOptionPane.showMessageDialog(null, "Table deselected");
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
            isEmpty = false;
            db.executeQuery(setFalse);
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            Table11.setIcon(new ImageIcon(imgon));
            isEmpty = true;
            db.executeQuery(setTrue);
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table11MouseClicked

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Table7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Table7ActionPerformed

    private void DoneButtom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButtom1ActionPerformed
        dispose();
        Function1 f = new Function1();
        this.setVisible(false);
        f.setVisible(true);
        
//        JOptionPane.showMessageDialog(this, "Welcome to Make a Wish system");
    }//GEN-LAST:event_DoneButtom1ActionPerformed

    private void Table4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Table4ActionPerformed

    private void Table12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Table12ActionPerformed

    private void Table10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Table10ActionPerformed

    private void Table3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Table3ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        addDb();
        
        this.setVisible(false);
        new Order2().setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void Table1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Table1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Table1ActionPerformed
    
   
     public void addDb(){
        System.out.println(db.connect());
        String maxNo = "SELECT MAX(No) AS no FROM RESTAURANT_CustomerInfo";
        HashMap no = db.queryRow(maxNo);
        
        String updateTable = "UPDATE RESTAURANT_CustomerInfo SET TableNo = " + currentTable + "  WHERE No = " + Integer.parseInt(String.valueOf(no.get("no")));
        db.executeQuery(updateTable);
            System.out.println(updateTable);
         System.out.println(db.disconnect());
        dispose();
    
    }
        
          
    
    
    public void showCusno(){
        CSDbDelegate db = new CSDbDelegate("csprog-in.sit.kmutt.ac.th", "3306", "CSC105_G6", "csc105_2014", "csc105");
        System.out.println(db.connect());
        String sql = "select MAX(no) from RESTAURANT_CustomerInfo";

        ArrayList<HashMap> pop = db.queryRows(sql);

        for (HashMap p : pop) {
            jLabel3.setText((String)p.get("MAX(no)"));
        }
        
        db.disconnect();
       
        System.out.println(sql);
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
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Table().setVisible(true);
                
            
                
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
