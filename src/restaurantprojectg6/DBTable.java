/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantprojectg6;

import edu.sit.cs.db.CSDbDelegate;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import static restaurantprojectg6.Table.db;

/**
 *
 * @author macbookpro
 */
public class DBTable {
    
    private CSDbDelegate db;
    
    public DBTable(){
        db = new CSDbDelegate("csprog-in.sit.kmutt.ac.th", "3306", "CSC105_G6", "csc105_2014", "csc105");
    }
    
    public void dbconnect(){
        System.out.println(db.connect());
    }
    
    public void dbdiscon(){
        db.disconnect();
    }
    
    public void upTable(String[] tableE, JToggleButton Table2, JToggleButton Table3, JToggleButton Table1,JToggleButton Table4, JToggleButton Table5, JToggleButton Table6, JToggleButton Table7, JToggleButton Table8, JToggleButton Table9, JToggleButton Table10, JToggleButton Table11, JToggleButton Table12) {
        dbconnect();
        String checkT = "SELECT isEmpty FROM RESTAURANT_Table";
        ArrayList<HashMap> table = db.queryRows(checkT);
        int i = 0;
        for(HashMap x: table){
            tableE[i] = (String)(x.get("isEmpty"));
            i++;
        }
        if(tableE[0].equals("1")){
            Table1.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table1.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        if(tableE[1].equals("1")){
            Table2.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table2.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        if(tableE[2].equals("1")){
            Table3.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table3.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        
        if(tableE[3].equals("1")){
            Table4.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table4.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        
        if(tableE[4].equals("1")){
            Table5.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table5.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        if(tableE[5].equals("1")){
            Table6.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table6.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        if(tableE[6].equals("1")){
            Table7.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table7.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        
        if(tableE[7].equals("1")){
            Table8.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table8.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        if(tableE[8].equals("1")){
            Table9.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table9.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        if(tableE[9].equals("1")){
            Table10.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table10.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        if(tableE[10].equals("1")){
            Table11.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table11.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        if(tableE[11].equals("1")){
            Table12.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table12.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        db.disconnect();
    }
   
    
    
    
    
}
