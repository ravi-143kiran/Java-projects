/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gymmanagement;

import java.sql.*;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 *
 * @author ravik
 */
public class Trainer extends javax.swing.JFrame {


    public Trainer() {
        initComponents();
        Connect();
        table_load();
    }

       Connection con;
       PreparedStatement pst;
       DefaultTableModel df;
       
       public void Connect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/jymmanagement", "root", "India_143");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
       
       public void table_load()
       {
        try {
            pst = con.prepareStatement("select * from trainer");
            ResultSet rs = pst.executeQuery();
            
            ResultSetMetaData rd = rs.getMetaData();
            int c;
            c = rd.getColumnCount();
            df = (DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);
            
            while(rs.next())
            {
                Vector v2 = new Vector();
                
                for(int i=1; i<=c; i++)
                {
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("name"));
                    v2.add(rs.getString("age"));
                    v2.add(rs.getString("address"));
                    v2.add(rs.getString("mobile"));
                    v2.add(rs.getString("doj"));

                }
                    df.addRow(v2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
           
       }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtmobile = new javax.swing.JTextField();
        txttrainer = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtdoj = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Trainer");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 60));

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Trainer Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 49, -1, -1));

        jLabel3.setText("Age");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 37, -1));

        jLabel4.setText("Address");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 137, 50, 20));

        jLabel5.setText("Mobile");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 185, 50, -1));

        jLabel6.setText("Date of Join");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 228, 70, -1));

        txtmobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmobileActionPerformed(evt);
            }
        });
        jPanel2.add(txtmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 150, -1));
        jPanel2.add(txttrainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 150, -1));
        jPanel2.add(txtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 150, -1));

        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });
        jPanel2.add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 150, -1));
        jPanel2.add(txtdoj, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 150, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 390, 280));

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 100, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Trainner Name", "Age", "Address", "Mobile", "Date"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 430, 280));

        jButton4.setText("Edit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 90, 40));

        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 90, 40));

        jButton6.setText("Cancel");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 90, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtmobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmobileActionPerformed

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddressActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        String tname = txttrainer.getText();
        String age = txtage.getText();
        String address = txtaddress.getText();
        String mobile = txtmobile.getText();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String date = df.format(txtdoj.getDate());

        try {
            pst = con.prepareStatement("insert into trainer(name,age,address,mobile,doj)values(?,?,?,?,?)");
            pst.setString(1,tname);
            pst.setString(2,age);
            pst.setString(3,address);
            pst.setString(4,mobile);
            pst.setString(5,date);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Trainer Addeddddd");

            txttrainer.setText("");
            txtage.setText("");
            txtaddress.setText("");
            txtmobile.setText("");
            txttrainer.requestFocus();
            table_load();
        } catch (SQLException ex) {
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        df = (DefaultTableModel)jTable1.getModel();
        int selected = jTable1.getSelectedRow();
        
        int id = Integer.parseInt(df.getValueAt(selected, 0).toString());
        try {
            pst = con.prepareStatement("delete from trainer where id = ?");
          
            pst.setInt (1,id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Trainer Deleteddddd");

            txttrainer.setText("");
            txtage.setText("");
            txtaddress.setText("");
            txtmobile.setText("");
            txttrainer.requestFocus();
            jButton3.setEnabled(true);
            table_load();

        } catch (SQLException ex) {
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
       try {
        df = (DefaultTableModel)jTable1.getModel();
        int selected = jTable1.getSelectedRow();
        
        int id = Integer.parseInt(df.getValueAt(selected, 0).toString());
        
        txttrainer.setText(df.getValueAt(selected, 1).toString());
        txtage.setText(df.getValueAt(selected, 2).toString());
        txtaddress.setText(df.getValueAt(selected, 3).toString());
        txtmobile.setText(df.getValueAt(selected, 4).toString());
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)df.getValueAt(selected, 5));
        txtdoj.setDate(date);
        
        jButton3.setEnabled(false);
        } catch (ParseException ex) {
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here
        df = (DefaultTableModel)jTable1.getModel();
        int selected = jTable1.getSelectedRow();
        
        int id = Integer.parseInt(df.getValueAt(selected, 0).toString());
        
        String tname = txttrainer.getText();
        String age = txtage.getText();
        String address = txtaddress.getText();
        String mobile = txtmobile.getText();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String date = df.format(txtdoj.getDate());

        try {
            pst = con.prepareStatement("update trainer set name = ?, age=?, address=?,mobile=?, doj=? where id =?");
            pst.setString(1,tname);
            pst.setString(2,age);
            pst.setString(3,address);
            pst.setString(4,mobile);
            pst.setString(5,date);
            pst.setInt (6,id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Trainer Updated");

            txttrainer.setText("");
            txtage.setText("");
            txtaddress.setText("");
            txtmobile.setText("");
            txttrainer.requestFocus();
            jButton3.setEnabled(true);
            table_load();

        } catch (SQLException ex) {
            Logger.getLogger(Trainer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trainer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtage;
    private com.toedter.calendar.JDateChooser txtdoj;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txttrainer;
    // End of variables declaration//GEN-END:variables
}
