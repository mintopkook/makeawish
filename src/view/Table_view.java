/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Image;
import javax.swing.ImageIcon;
import edu.sit.cs.db.CSDbDelegate;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import restaurantprojectg6.Function1;
import static restaurantprojectg6.Table.currentTable;

/**
 *
 * @author kunothiiz
 */
public class Table_view extends javax.swing.JFrame {

    /**
     * Creates new form Table_view
     */
    public static int currentTable;
    public Table_view() {
        initComponents();
        updateTable();
        setSize(800,600);
    }
    
    @SuppressWarnings("unchecked")
    boolean isEmpty;
    String[] tableE = new String[12];
    int tableNo;
    
    static CSDbDelegate db = new CSDbDelegate("csprog-in.sit.kmutt.ac.th", "3306", "CSC105_G6", "csc105_2014", "csc105");
    
    public void updateTable(){
        db.connect();
        String checkT = "SELECT isEmpty FROM RESTAURANT_Table";
        ArrayList<HashMap> table = db.queryRows(checkT);
        int i = 0;
        for(HashMap x: table){
            tableE[i] = (String)(x.get("isEmpty"));
            i++;
        }
        if(tableE[0].equals("true")){
            Table1.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table1.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        if(tableE[1].equals("true")){
            Table2.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table2.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        if(tableE[2].equals("true")){
            Table3.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table3.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        
        if(tableE[3].equals("true")){
            Table4.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table4.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        
        if(tableE[4].equals("true")){
            Table5.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table5.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        if(tableE[5].equals("true")){
            Table6.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table6.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        if(tableE[6].equals("true")){
            Table7.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table7.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        
        if(tableE[7].equals("true")){
            Table8.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table8.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        if(tableE[8].equals("true")){
            Table9.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table9.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        if(tableE[9].equals("true")){
            Table10.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table10.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        if(tableE[10].equals("true")){
            Table11.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table11.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        if(tableE[11].equals("true")){
            Table12.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table12.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        db.disconnect();
    }
    
    
    public int getCurrentTable(){
        return currentTable;
    }
// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponent() {

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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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
        jPanel1.add(Table3);
        Table3.setBounds(100, 360, 30, 30);

        Table2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table2MouseClicked(evt);
            }
        });
        jPanel1.add(Table2);
        Table2.setBounds(100, 300, 30, 30);

        Table5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table5MouseClicked(evt);
            }
        });
        jPanel1.add(Table5);
        Table5.setBounds(180, 340, 30, 30);

        Table1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Check.png"))); // NOI18N
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        jPanel1.add(Table1);
        Table1.setBounds(100, 230, 30, 30);

        Table12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table12MouseClicked(evt);
            }
        });
        jPanel1.add(Table12);
        Table12.setBounds(480, 320, 30, 30);

        Table4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table4MouseClicked(evt);
            }
        });
        jPanel1.add(Table4);
        Table4.setBounds(180, 270, 30, 30);

        Table6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table6MouseClicked(evt);
            }
        });
        jPanel1.add(Table6);
        Table6.setBounds(260, 270, 30, 30);

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
        Table7.setBounds(260, 330, 30, 30);

        Table8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table8MouseClicked(evt);
            }
        });
        jPanel1.add(Table8);
        Table8.setBounds(260, 430, 30, 30);

        Table9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table9MouseClicked(evt);
            }
        });
        jPanel1.add(Table9);
        Table9.setBounds(370, 270, 30, 30);

        Table10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table10MouseClicked(evt);
            }
        });
        jPanel1.add(Table10);
        Table10.setBounds(370, 330, 30, 30);

        Table11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table11MouseClicked(evt);
            }
        });
        jPanel1.add(Table11);
        Table11.setBounds(370, 400, 30, 30);

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Girl.png"))); // NOI18N
        jButton1.setText("DONE");
        jButton1.setToolTipText("");
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/R.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 20, 630, 570);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/bg2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

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
    }// </editor-fold>   
    
    private void Table3MouseClicked(java.awt.event.MouseEvent evt) {                                    
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
        System.out.println(db.connect());
    }                                   

    private void Table5MouseClicked(java.awt.event.MouseEvent evt) {                                    

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
    }                                   

    private void Table2MouseClicked(java.awt.event.MouseEvent evt) {                                    
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
    } 
    
     private void Table1MouseClicked(java.awt.event.MouseEvent evt) {                                    
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
    }                                   

    private void Table12MouseClicked(java.awt.event.MouseEvent evt) {                                     
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
    }                                    

    private void Table4MouseClicked(java.awt.event.MouseEvent evt) {                                    
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
    }                                   

    private void Table6MouseClicked(java.awt.event.MouseEvent evt) {                                    
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
    } 
    
    private void Table7MouseClicked(java.awt.event.MouseEvent evt) {                                    
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
    }                                   

    private void Table8MouseClicked(java.awt.event.MouseEvent evt) {                                    
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
    }                                   

    private void Table9MouseClicked(java.awt.event.MouseEvent evt) {                                    
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
    }                                   

    private void Table10MouseClicked(java.awt.event.MouseEvent evt) {                                     
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
    }                                    

    private void Table11MouseClicked(java.awt.event.MouseEvent evt) {                                     
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
    }                                    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.setVisible(false);
    }                                        

    private void Table7ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void DoneButtom1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        dispose();
        Function1 f = new Function1();
        f.setVisible(true);
        
        JOptionPane.showMessageDialog(this, "Welcome to Make a Wish system");
    }                                           

    /**
     * @param args the command line arguments
     */
    
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
            java.util.logging.Logger.getLogger(Table_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Table_view().setVisible(true);
            }
        });
    }
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
    private javax.swing.JPanel jPanel1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
