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
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.*;

/**
 *
 * @author Ashan
 */
public class ReturnItems extends javax.swing.JPanel {

   Connection con=null;
    PreparedStatement pst=null;
    ResultSet re =null;
    Statement stmt = null;
    int a,b;
    
    public ReturnItems() {
        initComponents();
        
         con=DB.getConnection(); 
    ////////////////////////////////// Caterogry table /////////////////////////////////////////    
        try {
            re = DB.getResultSet("select * from catergory");
             cattable.setModel(DbUtils.resultSetToTableModel(re));

        } catch (Exception e) {
        }
       
     ////////////////////////////// Return Items /////////////////////////////////////////////////    
         try {
                 re = DB.getResultSet("select * from reoreder");
             reordertable.setModel(DbUtils.resultSetToTableModel(re));
        } catch (Exception e) {
        }
        
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        reordertable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        cmbreason = new javax.swing.JComboBox<>();
        orderidbox = new javax.swing.JTextField();
        countbox = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reasontxt = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        pidcom = new javax.swing.JComboBox<>();
        pidcom1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cidbox = new javax.swing.JTextField();
        usagebox = new javax.swing.JTextField();
        catnamebox = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        cattable = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jComboBox6 = new javax.swing.JComboBox<>();
        pnamebox2 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Return Items/Catergory", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Set Catergory");

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Return Prodcut Details");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        reordertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "orderid", "suppiler", "NoOfitems", "reason", "note"
            }
        ));
        reordertable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reordertableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(reordertable);

        jLabel12.setText("Aditional Reason");

        cmbreason.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Damaged", "Diffrent Product", "Expired " }));

        orderidbox.setBackground(new java.awt.Color(240, 240, 240));
        orderidbox.setPreferredSize(new java.awt.Dimension(6, 24));
        orderidbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderidboxActionPerformed(evt);
            }
        });

        countbox.setBackground(new java.awt.Color(240, 240, 240));
        countbox.setPreferredSize(new java.awt.Dimension(6, 24));
        countbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countboxActionPerformed(evt);
            }
        });

        jLabel9.setText("Suppiler");

        jLabel10.setText("No Of Items");

        jLabel8.setText("Product ID");

        jLabel13.setText("Order ID");

        reasontxt.setBackground(new java.awt.Color(240, 240, 240));
        reasontxt.setColumns(20);
        reasontxt.setRows(5);
        jScrollPane1.setViewportView(reasontxt);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Send");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel19.setText("Reason");

        pidcom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", " 2", " 3", " 4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", " " }));
        pidcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidcomActionPerformed(evt);
            }
        });

        pidcom1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pidcom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidcom1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel13)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orderidbox, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(pidcom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbreason, 0, 158, Short.MAX_VALUE)
                            .addComponent(countbox, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(pidcom1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pidcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderidbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(pidcom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(countbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cmbreason, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(30, 30, 30))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setText("Catergory Name");

        jLabel14.setText("Catergory ID");

        jLabel16.setText("Usage");

        cidbox.setBackground(new java.awt.Color(240, 240, 240));
        cidbox.setPreferredSize(new java.awt.Dimension(6, 24));
        cidbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidboxActionPerformed(evt);
            }
        });

        usagebox.setBackground(new java.awt.Color(240, 240, 240));
        usagebox.setPreferredSize(new java.awt.Dimension(6, 24));
        usagebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usageboxActionPerformed(evt);
            }
        });

        catnamebox.setBackground(new java.awt.Color(240, 240, 240));
        catnamebox.setPreferredSize(new java.awt.Dimension(6, 24));
        catnamebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catnameboxActionPerformed(evt);
            }
        });

        cattable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        cattable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cattableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(cattable);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setText("Update");
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Add");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setText("Delete");
        jButton8.setBorderPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(101, 101, 101)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(catnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cidbox, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usagebox, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(28, 28, 28)
                        .addComponent(jButton8)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING))
                    .addContainerGap(388, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cidbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(catnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usagebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton8)
                    .addComponent(jButton7))
                .addGap(29, 29, 29))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel14)
                    .addGap(42, 42, 42)
                    .addComponent(jLabel15)
                    .addContainerGap(431, Short.MAX_VALUE)))
        );

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Product ID", "Product Name", "Catergory ", "Stock ID", " " }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        pnamebox2.setBackground(new java.awt.Color(240, 240, 240));
        pnamebox2.setPreferredSize(new java.awt.Dimension(6, 24));
        pnamebox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnamebox2ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton10.setText("Search");

        jLabel20.setText("Search by");

        jButton2.setText("Main");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnamebox2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jButton10)
                .addGap(70, 70, 70))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jButton10)
                    .addComponent(pnamebox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        //Send Button
        int x=  JOptionPane.showConfirmDialog(null, "Do you want to Sned?");

        if(x==0)
        {
        String pid=pidcom.getSelectedItem().toString();
        String orderid= orderidbox.getText();
        String supplier= pidcom1.getSelectedItem().toString();
        String count= countbox.getText();
        String reason= cmbreason.getSelectedItem().toString();
        String note= reasontxt.getText();
 
        
            ReturnItems_Class w1 = new ReturnItems_Class(pid,orderid,supplier,count,reason,note);
            w1.insert_reorder_Items();
            
        }
          //Table load
        try {
            re = DB.getResultSet("select * from reoreder");
             reordertable.setModel(DbUtils.resultSetToTableModel(re));
        } 
          catch (Exception e) {
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Clear txt area
        //pidbox.setSelecetedItems("");
        orderidbox.setText("");
       // sappilerbox.setText("");
        countbox.setText("");
        reasontxt.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void orderidboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderidboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderidboxActionPerformed

    private void countboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countboxActionPerformed

    private void cidboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidboxActionPerformed

    private void usageboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usageboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usageboxActionPerformed

    private void catnameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catnameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catnameboxActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         // Update Product Table
        //update
        //yes=0
        int x=  JOptionPane.showConfirmDialog(null, "Do you want to update?");

        if(x==0)
        {
        String cid=cidbox.getText();
        String catname=catnamebox.getText();
        String usage=usagebox.getText();
        

            try {
            ReturnItems_Class w1 = new ReturnItems_Class(cid,catname,usage);
            w1.updateCatergory();
            
            
            } catch (Exception e) {
                System.out.println(e);
            }
           
        }
        
            try {
                     re = DB.getResultSet("select * from catergory");
                      cattable.setModel(DbUtils.resultSetToTableModel(re));
                 } 
                   catch (Exception e) {
                 }
   
    
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //Add details
    
        String cid= cidbox.getText();
        String pid=catnamebox.getText();
        String usage=usagebox.getText();
        
        ReturnItems_Class r =new ReturnItems_Class(cid,pid,usage);
        r.insertCatergory();
           
        //Table load
        try {
            re = DB.getResultSet("select * from catergory");
             cattable.setModel(DbUtils.resultSetToTableModel(re));
        } 
          catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
           // Delete produts table
        int x=JOptionPane.showConfirmDialog(null,"Do you want to delete?");

        if(x==0)
        {
            String catid=cidbox.getText();
            ReturnItems_Class w2=new ReturnItems_Class(catid);
            w2.deleteCatergory();
         }    
        
        try {
            re = DB.getResultSet("select * from catergory");
             cattable.setModel(DbUtils.resultSetToTableModel(re));
        } 
          catch (Exception e) {
        }  

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void pnamebox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnamebox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnamebox2ActionPerformed

    private void cattableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cattableMouseClicked
        // Tabale component click event
        int raw=cattable.getSelectedRow();
        String cid=cattable.getValueAt(raw, 0).toString();
        String catname=cattable.getValueAt(raw, 1).toString();
        String usage=cattable.getValueAt(raw, 2).toString();
        
        cidbox.setText(cid);
        catnamebox.setText(catname);
        usagebox.setText(usage);
    }//GEN-LAST:event_cattableMouseClicked

    private void reordertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reordertableMouseClicked
        //Table Click For Return Items
        int raw=reordertable.getSelectedRow();
        String pid=reordertable.getValueAt(raw, 0).toString();
        String orderid=reordertable.getValueAt(raw, 1).toString();
        String suppiler=reordertable.getValueAt(raw, 2).toString();
        String count=reordertable.getValueAt(raw, 3).toString();
       // String reason=reordertable.getValueAt(raw, 4).toString();
        String res=reordertable.getValueAt(raw, 5).toString();
        
        pidcom.setSelectedItem(pid);
        orderidbox.setText(orderid);
      //  sappilerbox.setText(suppiler);
        countbox.setText(count);
       // cmbreason.setText(reason);
        reasontxt.setText(res);
        
        
        
    }//GEN-LAST:event_reordertableMouseClicked

    private void pidcom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidcom1ActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
    }//GEN-LAST:event_pidcom1ActionPerformed

    private void pidcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidcomActionPerformed
        // Reload Products
        
      /* try {
               
             con=DB.getConnection(); 
           String sql = "select  from   where  idproducts =  '" + pidcom.getSelectedItem() +  "'" ;
            
            
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            
              while(rs.next()){
        
            String first1 = rs.getString("Price");
            String first2 = rs.getString("Package_Details");
            String first3 = rs.getString("Driver_name");
            String first4 = rs.getString("Vehicle_type");
        
         pidcom.setText(first1);
         pidcom.setText(first2);
         pidcom.setText(first3);
         pidcom.setText(first4);
      }
              
      
              
      //STEP 6: Clean-up environment
      rs.close();
      
      stmt.close();
      conn.close();
            
            
        } catch (Exception e) {
        }
        
        */
        
        
    }//GEN-LAST:event_pidcomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField catnamebox;
    private javax.swing.JTable cattable;
    private javax.swing.JTextField cidbox;
    private javax.swing.JComboBox<String> cmbreason;
    private javax.swing.JTextField countbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField orderidbox;
    private javax.swing.JComboBox<String> pidcom;
    private javax.swing.JComboBox<String> pidcom1;
    private javax.swing.JTextField pnamebox2;
    private javax.swing.JTextArea reasontxt;
    private javax.swing.JTable reordertable;
    private javax.swing.JTextField usagebox;
    // End of variables declaration//GEN-END:variables

}