
import java.awt.Color;
import java.awt.Desktop;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }
    
//database connection establishment information required:
    
    String user = "root";
    String db_password = "trterts3";
    String URL = "jdbc:mysql://localhost:3306/signup";

    
// permission class that is controller of whole software
    
public class permission{
    login l = new login();
    signup sp = new signup();
    ResumeQualification rq = new ResumeQualification();
    char [] Password;
    String Email;
    public void LoginUser(char [] p, String em){
        this.Password = p;
        this.Email = em;
    
        
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con  = DriverManager.getConnection(URL, user, db_password);
            String sql = "Select * from uinfo11 where email = '"+Email+"' and password = '"+Arrays.toString(this.Password)+"'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(this.l, "Login Successfull", "Success", JOptionPane.INFORMATION_MESSAGE);
                
                Thread.sleep(70);
                setVisible(false);
                
                rq.setVisible(true);

            }
            else{
                JOptionPane.showMessageDialog(this.l, "Invalid Login, Please Try Again", "Error", JOptionPane.ERROR_MESSAGE);
                l.em.setText("");
                l.psd.setText("");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException | InterruptedException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void social(String url){
        try{
            Desktop.getDesktop().browse(new URL(url).toURI());
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}

//constructor for sigunup permission

public login(String fname, String lname, char [] pass, String email, String gender, boolean tac){
    
    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con  = DriverManager.getConnection(URL, user, db_password);
            if(con!=null){
                System.out.println("Success full");
            }
            else{
                System.out.println("Failed");
            }
            if(fname.isEmpty() || lname.isEmpty() || email.isEmpty() || Arrays.toString(pass).isEmpty() || tac==false  ){
                JOptionPane.showMessageDialog(this, "Please Fill All Boxes", "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                String sql = "Insert into uinfo11 (first_name, last_name, gender, email, password) values(?, ?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, gender);
                ps.setString(4, email);
                ps.setString(5, Arrays.toString(pass));
                ps.execute();
                JOptionPane.showMessageDialog(this, "Your account created succssfully\nLogin to Continue", "Alert", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        }
}

//constructor for exit signup

public login(int a){
    if(a==0){
            System.exit(0);
        }
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        psd = new javax.swing.JPasswordField();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Constantia", 0, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 204));
        jLabel5.setText("Login Account");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 50));

        jLabel6.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 204));
        jLabel6.setText("Login using social networks");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\fb.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 30, 30));

        jButton4.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\ln.png")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 30, 30));

        jButton3.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\g.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 30, 30));

        jLabel7.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 204));
        jLabel7.setText("OR");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 30, -1));

        jLabel10.setFont(new java.awt.Font("Constantia", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 204));
        jLabel10.setText("Email");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 30));
        getContentPane().add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 290, 40));

        jLabel11.setFont(new java.awt.Font("Constantia", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 204));
        jLabel11.setText("Password");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 30));
        getContentPane().add(psd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 290, 40));

        jButton5.setBackground(new java.awt.Color(153, 0, 204));
        jButton5.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Login");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, 40));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Sign Up");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 100, 40));

        jLabel2.setFont(new java.awt.Font("Constantia", 2, 37)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("New Here?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Constantia", 2, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sign up and discover great ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Constantia", 2, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("amount of opportunities");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 190, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\LP2.JPEG")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 310, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String fb = "http://www.facebook.com";
        permission pm = new permission();
        pm.social(fb);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String lin = "http://www.linkedin.com";
        permission pm = new permission();
        pm.social(lin);
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String g = "http://www.google.com";
       permission pm = new permission();
        pm.social(g);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        Color jb51 = new Color(204,0,255);
        jButton5.setBackground(jb51);
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        Color jb52 = new Color(153,0,204);
        jButton5.setBackground(jb52);
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        String email = em.getText();
        char [] pass = psd.getPassword();
        permission pm = new permission();
        pm.LoginUser(pass, email);
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        Color jb11 = new Color(255, 153, 153);
        jButton1.setBackground(jb11);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        Color jb12 = new Color(255,204,204);
        jButton1.setBackground(jb12);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        permission pm = new permission();
        setVisible(false);
        pm.sp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField em;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField psd;
    // End of variables declaration//GEN-END:variables
}
