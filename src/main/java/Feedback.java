
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author SOHAIB MASOOD
 */
public class Feedback extends javax.swing.JFrame {

    /**
     * Creates new form Feedback
     */
    public Feedback() {
        initComponents();
    }
    String rating;
String URL = "jdbc:mysql://localhost:3306/signup";
String user = "root";
String db_password = "";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        fb_user = new javax.swing.JTextField();
        rs5 = new javax.swing.JRadioButton();
        rs3 = new javax.swing.JRadioButton();
        rs4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rs2 = new javax.swing.JRadioButton();
        rs1 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        feed_area = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Rating");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 70, 30));
        getContentPane().add(fb_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 210, 30));

        buttonGroup1.add(rs5);
        rs5.setForeground(new java.awt.Color(255, 255, 255));
        rs5.setText("5");
        rs5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs5ActionPerformed(evt);
            }
        });
        getContentPane().add(rs5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        buttonGroup1.add(rs3);
        rs3.setForeground(new java.awt.Color(255, 255, 255));
        rs3.setText("3");
        getContentPane().add(rs3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        buttonGroup1.add(rs4);
        rs4.setForeground(new java.awt.Color(255, 255, 255));
        rs4.setText("4");
        rs4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs4ActionPerformed(evt);
            }
        });
        getContentPane().add(rs4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter Your Name");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        buttonGroup1.add(rs2);
        rs2.setForeground(new java.awt.Color(255, 255, 255));
        rs2.setText("2");
        rs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs2ActionPerformed(evt);
            }
        });
        getContentPane().add(rs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        buttonGroup1.add(rs1);
        rs1.setForeground(new java.awt.Color(255, 255, 255));
        rs1.setText("1");
        rs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs1ActionPerformed(evt);
            }
        });
        getContentPane().add(rs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 100, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 100, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FeedBack");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        feed_area.setColumns(20);
        feed_area.setRows(5);
        feed_area.setText("Feedback Enter here");
        jScrollPane1.setViewportView(feed_area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 4\\Object Oriented Software Engneering\\Lab\\CV Building Application\\adminbg.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con  = DriverManager.getConnection(URL, user, db_password);
             if(feed_area.getText().isEmpty() || fb_user.getText().isEmpty() || rating == null){
                 JOptionPane.showMessageDialog(this, "Please Fill All Fields in Panel", "Alert", JOptionPane.INFORMATION_MESSAGE);
             }
             else{
                 String sql = "Insert into feedback (feedback, User_Name, rating) values(?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, feed_area.getText());
                ps.setString(2, fb_user.getText());
                 ps.setString(3, rating);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Your feedback sent succssfully\nThanks", "Alert", JOptionPane.INFORMATION_MESSAGE);
             }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Feedback.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rs4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs4ActionPerformed
       rating = "4";
    }//GEN-LAST:event_rs4ActionPerformed

    private void rs5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs5ActionPerformed
        rating = "5";
    }//GEN-LAST:event_rs5ActionPerformed

    private void rs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs1ActionPerformed
        rating = "1";
    }//GEN-LAST:event_rs1ActionPerformed

    private void rs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs2ActionPerformed
       rating = "2";
    }//GEN-LAST:event_rs2ActionPerformed

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
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField fb_user;
    private javax.swing.JTextArea feed_area;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rs1;
    private javax.swing.JRadioButton rs2;
    private javax.swing.JRadioButton rs3;
    private javax.swing.JRadioButton rs4;
    private javax.swing.JRadioButton rs5;
    // End of variables declaration//GEN-END:variables
}