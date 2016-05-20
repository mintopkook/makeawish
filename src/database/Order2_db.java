/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import edu.sit.cs.db.CSDbDelegate;
import java.util.HashMap;

/**
 *
 * @author minto
 */
public class Order2_db {
    
    
     public restaurantprojectg6.Queue1 q = new restaurantprojectg6.Queue1();
    int price = 0;
    String foodName;
    int foodPrice;
    int countCoke = 0, countCake = 0, countPepsi = 0, countSpa = 0, countRamen = 0, countCupcake = 0;
    static CSDbDelegate db = new CSDbDelegate("csprog-in.sit.kmutt.ac.th", "3306", "CSC105_G6", "csc105_2014", "csc105");
    
    
    public HashMap clickDone(String name){
        System.out.println(db.connect());
        
        String getCoke = "SELECT count FROM RESTAURANT_Food WHERE RESTAURANT_Food.foodName = '" + name + "'";
        System.out.println(getCoke);
        HashMap cCount = db.queryRow(getCoke);
        return cCount;
        //int cokeCount = Integer.parseInt((String)(cCount.get("count")));
        
//        String updateCoke = "UPDATE RESTAURANT_Food SET count = '" + (cokeCount+countCoke) + "' WHERE RESTAURANT_Food.foodName = 'Coke' ";
//        db.executeQuery(updateCoke);
        
    }
    
    public static void main (String [] args){
        
        Order2_db o = new Order2_db();
        o.clickDone("Coke");
    }
    
    
    
    
}
