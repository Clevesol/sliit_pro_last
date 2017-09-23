/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sliit.saloonsayoma.Views.Weddingcar;

/**
 *
 * @author Acer
 */

import java.sql.*;
import javax.swing.*;

public class DBconnect {
Connection conn = null;
public static Connection ConnectDb(){

    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://Localhost:3309/wedding_car_rental","root","1234");
    return conn;
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    return null;

    }
}
}