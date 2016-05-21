/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantprojectg6;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author macbookpro
 */
public class FoodOrder {
    public FoodOrder(){
    
    }
    
    public int price;
    
    public void orderCoke(String foodName, int foodPrice, JTable jTable1 , int countCoke, JLabel priceLabel, JLabel total ) {
        foodName = "Coke";
        foodPrice = 15;
        
        Object[] row = { foodName, foodPrice };
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.addRow(row);
        price += foodPrice;
        countCoke++;
        priceLabel.setText("Total price: ");
        total.setText(price+"");
    }


     public void orderPep(String foodName, int foodPrice, JTable jTable1 , int countPepsi, JLabel priceLabel, JLabel total ) {
        foodName = "Pepsi";
        foodPrice = 15;

        Object[] row = { foodName, foodPrice };
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.addRow(row);
        price += foodPrice;
        countPepsi++;
        priceLabel.setText("Total price: ");
        total.setText(price+"");
    }
     
     public void orderCup(String foodName, int foodPrice, JTable jTable1 , int countCupcake, JLabel priceLabel, JLabel total ) {
        foodName = "Cupcake";
        foodPrice = 40;
        
        Object[] row = { foodName, foodPrice };
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.addRow(row);
        price += foodPrice;
        countCupcake++;
        priceLabel.setText("Total price: ");
        total.setText(price+"");
    }
     
     public void orderCake(String foodName, int foodPrice, JTable jTable1, int countCake, JLabel priceLabel, JLabel total) {
        foodName = "Cake";
        foodPrice = 70;
        
        Object[] row = { foodName, foodPrice };
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.addRow(row);
        price += foodPrice;
        countCake++;
        priceLabel.setText("Total price: ");
        total.setText(price+"");
    }
     
     public void orderSpa(String foodName, int foodPrice, JTable jTable1 , int countSpa, JLabel priceLabel, JLabel total) {
        foodName = "Spaghetti";
        foodPrice = 120;
        
        Object[] row = { foodName, foodPrice };
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.addRow(row);
        price += foodPrice;
        countSpa++;
        priceLabel.setText("Total price: ");
        total.setText(price+"");
    }

     public void orderRa(String foodName, int foodPrice, JTable jTable1, int countRamen, JLabel priceLabel, JLabel total) {
        foodName = "Ramen";
        foodPrice = 100;
        
        Object[] row = { foodName, foodPrice };
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.addRow(row);
        price += foodPrice;
        countRamen++;
        priceLabel.setText("Total price: ");
        total.setText(price+"");
    }
     
     
     
     
}