/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sliit.saloonsayoma.Views.lasith;

import com.sliit.saloonsayoma.utils.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author LasithD
 */
public class Cclient {
            private String CID;
            private String CNAME;
            private String EMAIL;
            private String PNO;
            private String NIC;
            private String ADDRES;
            private String CRELIM;  
            private String CredtLim;
                
            Connection con =null;
            PreparedStatement pst=null;
            ResultSet rs=null;          

    public Cclient() {
    }

    public Cclient(String CID, String CNAME, String EMAIL, String PNO, String NIC, String ADDRES, String CRELIM, String CredtLim) {
        this.CID = CID;
        this.CNAME = CNAME;
        this.EMAIL = EMAIL;
        this.PNO = PNO;
        this.NIC = NIC;
        this.ADDRES = ADDRES;
        this.CRELIM = CRELIM;
        this.CredtLim = CredtLim;
    }

    public Cclient(String CID, String NIC) {
        this.CID = CID;
        this.NIC = NIC;
    }

     {
        this.CNAME = CNAME;
        this.EMAIL = EMAIL;
        this.PNO = PNO;
        this.NIC = NIC;
        this.ADDRES = ADDRES;
        this.CRELIM = CRELIM;
        this.CredtLim = CredtLim;
    }


     public void AddCclient() {
        con =DB.getConnection();
        
         try{
                //add
                DB.executeUpdate("INSERT INTO creditclient(CName,CEmail,CPhone,CNic,CAddress,creditlimit,curcreditlim)Values('"+this.CNAME+"','"+this.EMAIL+"','"+this.PNO+"','"+this.NIC+"','"+this.ADDRES+"','"+this.CRELIM+"','"+this.CredtLim+"')");  
                String st="SUCCESSFULLY ADDED";
                JOptionPane.showMessageDialog(null,st);
            } 
         
        catch (Exception e) 
            {
               
                JOptionPane.showMessageDialog(null,"Not Added", "Error", JOptionPane.ERROR_MESSAGE);
            }
         
     }
     
     public void UpdatePatient(){
       con =DB.getConnection();
         try {
                
                String st="SUCCESSFULLY UPDATED";
                JOptionPane.showMessageDialog(null,st);
            } 
         
        catch (Exception e)  
            {
                JOptionPane.showMessageDialog(null,e, "Error", JOptionPane.ERROR_MESSAGE);
            }   
     }
     public void DeletePatient(){
         try {
                DB.executeUpdate("DELETE FROM creditclient WHERE idCreditClient ='"+this.CID+"' and CNic='"+this.NIC+"'");
                String st="SUCCESSFULLY DELETED";
                JOptionPane.showMessageDialog(null,st);
            } 
         
        catch (Exception e)  
            {
                JOptionPane.showMessageDialog(null,e, "Error", JOptionPane.ERROR_MESSAGE);
            }
         
         
     }
     
     /*
     public String SearchPatient(String psby,String pkey){
       con =dbconnect.connect();
       
        String sby=psby;
        String key=pkey;
        
        if(sby.equals("NIC"))
        {
                try 
                {
                   String sql="SELECT patientNic AS NIC,pname AS NAME,address AS ADDRESS,contaactNo AS CONTACT_NUMBER,gender AS GENDER,blodg AS BLOOD_TYPE,dob AS DOB FROM patient WHERE patientNic LIKE '%"+key+"%'";  
                   return sql; 
                } 
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(null,"Unable to Retrieve Data", "Error", JOptionPane.ERROR_MESSAGE);
                }
        }
        
        else if(sby.equals("NAME"))
        {
                try 
                {
                   String sql="SELECT patientNic AS NIC,pname AS NAME,address AS ADDRESS,contaactNo AS CONTACT_NUMBER,gender AS GENDER,blodg AS BLOOD_TYPE,dob AS DOB FROM patient WHERE pname LIKE '%"+key+"%'";  
                   return sql; 
                } 
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(null,"Unable to Retrieve Data", "Error", JOptionPane.ERROR_MESSAGE);
                }
        }
        
     
        else if(sby.equals("ADDRESS"))
        {
                try 
                {
                   String sql="SELECT patientNic AS NIC,pname AS NAME,address AS ADDRESS,contaactNo AS CONTACT_NUMBER,gender AS GENDER,blodg AS BLOOD_TYPE,dob AS DOB FROM patient WHERE address LIKE '%"+key+"%'";  
                   return sql; 
                } 
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(null,"Unable to Retrieve Data", "Error", JOptionPane.ERROR_MESSAGE);
                }
        }
        
        
        else if(sby.equals("GENDER"))
        {
                try 
                {
                   String sql="SELECT patientNic AS NIC,pname AS NAME,address AS ADDRESS,contaactNo AS CONTACT_NUMBER,gender AS GENDER,blodg AS BLOOD_TYPE,dob AS DOB FROM patient WHERE gender='"+key+"'";  
                   return sql; 
                } 
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(null,"Unable to Retrieve Data", "Error", JOptionPane.ERROR_MESSAGE);
                }
        }
        
        
        
        else if(sby.equals("CONTACT_NUMBER"))
        {
                try 
                {
                   String sql="SELECT patientNic AS NIC,pname AS NAME,address AS ADDRESS,contaactNo AS CONTACT_NUMBER,gender AS GENDER,blodg AS BLOOD_TYPE,dob AS DOB FROM patient WHERE contaactNo LIKE '%"+key+"%'";  
                   return sql; 
                } 
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(null,"Unable to Retrieve Data", "Error", JOptionPane.ERROR_MESSAGE);
                }
        }
        
        
        
         else if(sby.equals("BLOOD_TYPE"))
        {
                 try 
                {
                   String sql="SELECT patientNic AS NIC,pname AS NAME,address AS ADDRESS,contaactNo AS CONTACT_NUMBER,gender AS GENDER,blodg AS BLOOD_TYPE,dob AS DOB FROM patient WHERE blodg LIKE '%"+key+"'%";  
                   return sql; 
                } 
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(null,"Unable to Retrieve Data", "Error", JOptionPane.ERROR_MESSAGE);
                }
        }
  
         else
        {
                try 
                {
                   String sql="SELECT patientNic AS NIC,pname AS NAME,address AS ADDRESS,contaactNo AS CONTACT_NUMBER,gender AS GENDER,blodg AS BLOOD_TYPE,dob AS DOB FROM patient WHERE dob LIKE '%"+key+"%'";  
                   return sql; 
                } 
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(null,"Unable to Retrieve Data", "Error", JOptionPane.ERROR_MESSAGE);
                }
        }

        return "";
     }
     public void Padmit() {
        con =dbconnect.connect();
        
         try{
                String pq="INSERT INTO padmitdis(pnic,pname)Values('"+this.nic+"','"+this.name+"')";
                pst=con.prepareStatement(pq);
                pst.execute();
                String st="SUCCESSFULLY PATIENT ADMITTED";
                JOptionPane.showMessageDialog(null,st);
            } 
         
        catch (Exception e) 
            {
               
                JOptionPane.showMessageDialog(null,e, "Error", JOptionPane.ERROR_MESSAGE);
            }
         
     }
       
    public String GetAdmitPatientDetail(){
       
       con =dbconnect.connect();
     
        try 
                {
                   String sql="SELECT pnic AS NIC,pname AS NAME,admitdate AS DATE_OF_ADMIT from padmitdis where discharged ='n'";  
                   return sql; 
                } 
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(null,"Unable to Retrieve Data", "Error", JOptionPane.ERROR_MESSAGE);
                }
       
                return "";
    }
    
    
    public String SetDischarge(){
       
       con =dbconnect.connect();
     
        try 
                {
                   String sql="UPDATE padmitdis SET discharged ='y',dischargedate=now() where pnic ='"+this.nic+"'";  
                   pst=con.prepareStatement(sql);
                    pst.execute();
                    String st="SUCCESSFULLY PATIENT DISCHARGED";
                    JOptionPane.showMessageDialog(null,st);
                } 
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(null,"Unable to Retrieve Data", "Error", JOptionPane.ERROR_MESSAGE);
                }
       
                return "";
    }
     
    public String GetDishargePatientDetail(){
       
       con =dbconnect.connect();
     
        try 
                {
                   String sql="SELECT pnic AS NIC,pname AS NAME,admitdate AS DATE_OF_ADMIT,dischargedate AS DATE_OF_DISCHARGE from padmitdis where discharged ='y'";  
                   return sql; 
                } 
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(null,"Unable to Retrieve Data", "Error", JOptionPane.ERROR_MESSAGE);
                }
       
                return "";
    }
    
   */
}
