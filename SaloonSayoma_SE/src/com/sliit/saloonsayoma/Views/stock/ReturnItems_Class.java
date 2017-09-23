/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sliit.saloonsayoma.Views.stock;

import com.sliit.saloonsayoma.utils.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author Ashan
 */
public class ReturnItems_Class {

   
    
    private String idproducts;
    private String pname;
    private String quantity;
    private String orderid;
    private String suppiler;
    private String reason;
    private String note;
    private String catid;
    private String catname;
    private String usage; 

   
    
    public ReturnItems_Class(String catid, String catname, String usage) {
        this.catid = catid;
        this.catname = catname;
        this.usage = usage;
    }
            
    public ReturnItems_Class(String catid) {
        this.catid = catid;
    }
    
     public ReturnItems_Class(String idproducts, String quantity) {
        this.idproducts = idproducts;
        this.quantity = quantity;
    }
 
  //db connect
 Connection con=null;
 PreparedStatement pst=null;
 ResultSet re=null;

 

 
 //////////////////////////////////////////////////////// ReOrderItems ///////////////////////////////////////////////////////////////////////////////////
 
  public void send(){
 
      try {
      con=DB.getConnection(); 
  
      DB.executeUpdate("INSERT INTO displayreorder(product ID,productName,quantity) values ('"+this.idproducts+"','"+this.pname+"','"+this.quantity+"') ");
     JOptionPane.showMessageDialog(null,"Data Sent Success");
      }
      
      catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Data Not Sent","Error",JOptionPane.ERROR_MESSAGE);
        
         }
  
  
  
  }
  
   public void insert_reorder_Items(){
 
      con=DB.getConnection(); 
         try {
          
              DB.executeUpdate("INSERT INTO reoreder(productId,orderId,suppiler,count,reason,notes) values('"+this.idproducts+"','"+this.orderid+"','"+this.suppiler+"','"+this.quantity+"','"+this.reason+"','"+this.note+"')");
              JOptionPane.showMessageDialog(null,"Data Saved Success");
              
        } 
        catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Data Not Saved","Error",JOptionPane.ERROR_MESSAGE);
        
         }
 }

    public ReturnItems_Class(String idproducts, String quantity, String orderid, String suppiler, String reason, String note) {
        this.idproducts = idproducts;
        this.quantity = quantity;
        this.orderid = orderid;
        this.suppiler = suppiler;
        this.reason = reason;
        this.note = note;
    }

   
 /*public void getID(){
 
     con=DB.getConnection(); 
     
     try {
         
         String sql="SELECT idproducts FROM products where ";
         DB.executeUpdate("INSERT INTO reorder(productId) where idproducts='"+this.idproducts+"'");
     } catch (Exception e) {
     }
 }
 */
 //////////////////////////////////////////////////////////// SET CATERGORY ////////////////////////////////////////////////////////////////////////
 
 public void insertCatergory(){
 
      con=DB.getConnection(); 
         try {
          
              DB.executeUpdate("INSERT INTO catergory(idcatergory,catergoryname,usage) values('"+this.catid+"','"+this.catname+"','"+this.usage+"')");
              JOptionPane.showMessageDialog(null,"Data Saved Success");
              
        } 
        catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Data Not Saved","Error",JOptionPane.ERROR_MESSAGE);
        
         }
 }
 
 public void updateCatergory(){
 
             con=DB.getConnection(); 
 
             try {
         
                  DB.executeUpdate("UPDATE catergory SET catergoryname='"+this.catname+"',usage='"+this.usage+"' where idcatergory='"+this.catid+"'");
                  JOptionPane.showMessageDialog(null,"Data has been updated");
                 
     } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"Update Is Not Successfull");
     }
 
 }
 
 public void deleteCatergory(){
 
         con=DB.getConnection();
         
         try {
         DB.executeUpdate("DELETE  from catergory where  idcatergory='"+this.catid+"'");
         JOptionPane.showMessageDialog(null,"Data has been successfully deleted");    
             
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null,"Cannot be deleted");
     }
    
}


}
