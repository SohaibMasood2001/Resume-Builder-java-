
import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
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

// permission class that is controller of whole software
public class Permission {
       login l = new login();
    signup sp = new signup();
    ResumeQualification rq = new ResumeQualification();
    char [] Password;
    String Email;
    String user = "root";
    String db_password = "";
    String URL = "jdbc:mysql://localhost:3306/signup";
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
                l.setVisible(false);
                rq.setVisible(true);
                Thread.sleep(70);
                

            }
            else{
                JOptionPane.showMessageDialog(this.l, "Invalid Login, Please Try Again", "Error", JOptionPane.ERROR_MESSAGE);
                
                
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException | InterruptedException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void SignupUser(String fname, String lname, char [] pass, String email, String gender, boolean tac){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con  = DriverManager.getConnection(URL, user, db_password);
            if(con!=null){
                System.out.println("Success full");
            }
            else{
                System.out.println("Failed");
            }
            String check_db = "Select * from uinfo11 where email = '"+email+"'";
            PreparedStatement ps1 = con.prepareStatement(check_db);
            ResultSet rs2 =ps1.executeQuery();
            if(rs2.next()){
                JOptionPane.showMessageDialog(null, "Email already Exist Please Enter New Email","EXIST", JOptionPane.ERROR_MESSAGE);
            }
            else{
                if(fname.isEmpty() || lname.isEmpty() || email.isEmpty() || Arrays.toString(pass).isEmpty() || tac==false  ){
                JOptionPane.showMessageDialog(null, "Please Fill All Boxes", "Alert", JOptionPane.INFORMATION_MESSAGE);
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
                JOptionPane.showMessageDialog(null, "Your account created succssfully\nLogin to Continue", "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
            }
            
            

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void social(String url){
        try{
            Desktop.getDesktop().browse(new URL(url).toURI());
            
        }
        catch(IOException | URISyntaxException e){
            System.out.println(e.getMessage());
        }
    }
}
