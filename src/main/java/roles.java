
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class roles extends user{
  String role_name;
  String role_exp;
  String institute;
  ResumeQualification rq = new ResumeQualification();
  public void userRoles(String soft1, String soft2, String soft3 , 
        String lang1, String lang2, String lang3, 
        String interest1, String interest2, String interest3, 
       String ref1, String ref2, String ref3, 
        String image) throws ClassNotFoundException, SQLException{
      
    Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con  = DriverManager.getConnection(rq.URL, rq.user, rq.password);
                if(con!=null){
                    System.out.println("Success full");

                }
                else{
                    System.out.println("Failed");
                }
      String sql3 = "Insert into cvinfo33 values('"+soft1+"','"+soft2+"','"+soft3+"','"+lang1+"','"+lang2+"','"+lang3+"','"+interest1+"',"
                        + "'"+interest2+"','"+interest3+"','"+ref1+"','"+ref2+"','"+ref3+"', '"+image+"')";
                        Statement smt3 = con.createStatement();
                        smt3.executeUpdate(sql3);

                        JOptionPane.showMessageDialog(null, "Your CV Saved Successfully", "Alert", JOptionPane.INFORMATION_MESSAGE);
  }

}
