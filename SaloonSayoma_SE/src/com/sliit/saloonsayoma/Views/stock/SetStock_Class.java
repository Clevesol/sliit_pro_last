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
import javax.swing.JTable;
import net.proteanit.sql.*;

/**
 *
 * @author Ashan
 */
public class SetStock_Class {

    private String catergory;
    private String cid;
    private String idproducts;
    private String pname;
    private String stockid;
    private String stocklevel;
    private String quantity;
    private String cost;
 // private String rlevel;
    private String note;
    private String sprice;

    public SetStock_Class(String catergory, String cid, String idproducts, String pname, String stockid, String stocklevel, String quantity, String cost, String note, String sprice) {
        this.catergory = catergory;
        this.cid = cid;
        this.idproducts = idproducts;
        this.pname = pname;
        this.stockid = stockid;
        this.stocklevel = stocklevel;
        this.quantity = quantity;
        this.cost = cost;
        this.note = note;
        this.sprice = sprice;
    }

    public SetStock_Class(String idproducts, String pname, String stockid, String stocklevel, String quantity, String cost, String note, String sprice) {
        this.idproducts=idproducts;
        this.pname = pname;
        this.stockid = stockid;
        this.stocklevel = stocklevel;
        this.quantity = quantity;
        this.cost = cost;
        this.note = note;
        this.sprice = sprice;
    }

    public SetStock_Class(String idproducts) {
        this.idproducts = idproducts;
    }
    
 
    
    //db connect
 Connection con=null;
 PreparedStatement pst=null;
 ResultSet re=null;

    SetStock_Class() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  /*  SetStock_Class(String catergory, String cid, String idproducts, String pname, String stockid,String quantity,String stocklevel,String sprice,String cost,String note) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

 public void addItems(){
     
        con=DB.getConnection(); 
         try {
          
              DB.executeUpdate("INSERT INTO products(catergory,cid,idproducts,pname,stockid,quantity,stocklevel,sprice,cost,note) values('"+this.catergory+"','"+this.cid+"','"+this.idproducts+"','"+this.pname+"','"+this.stockid+"','"+this.quantity+"','"+this.stocklevel+"','"+this.sprice+"','"+this.cost+"','"+this.note+"')");
              JOptionPane.showMessageDialog(null,"Data Saved Success");
              
        } 
        catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Data Not Saved");
        
         }
      
        
    }
 
 
public void updateProducts(){
 
             con=DB.getConnection(); 
 
             try {
         
                  DB.executeUpdate("UPDATE products SET pname='"+this.pname+"',stockid='"+this.stockid+"',quantity='"+this.quantity+"',stocklevel='"+this.stocklevel+"',sprice='"+this.sprice+"',cost='"+this.cost+"',note='"+this.note+"' where idproducts='"+this.idproducts+"'");
                  JOptionPane.showMessageDialog(null,"Data has been updated");
                 
     } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"Update Is Not Successfull");
     }
 
 }
 
     //Delete Product Method
 public void deleteProducts(){
 
         con=DB.getConnection();
         
         try {
         DB.executeUpdate("DELETE from products where  idproducts='"+this.idproducts+"'");
         JOptionPane.showMessageDialog(null,"Data has been successfully deleted");    
             
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null,"Cannot be deleted");
     }
    
 }
 
 public void searchProdcuts(){
 
       con=DB.getConnection();
       
       try {
         
           DB.getResultSet("SELECT * FROM products where idproducts  LIKE  %'"+this.idproducts+"'");
             JOptionPane.showMessageDialog(null,"Data has been successfully founded"); 
     } catch (Exception e) {
     }
     
  
 }

 public void setCatid(){
 
    con=DB.getConnection();
    
     try {
         
         DB.getResultSet("SELECT idcatergory FROM catergory where catergoryname='"+this.catergory+"'");
         
     } catch (Exception e) {
     }
 
 
 }
 
 
    
}
