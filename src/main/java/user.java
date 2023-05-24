
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class user{
             String user_name;
             int user_id;
             String User_email;
             String DOB;
             String Address;
             ResumeQualification rq = new ResumeQualification();
             public void userinfo(String name, String date_of_birth, String nationality,
        String country, String city, String gander, String martial_status, 
        String about_you, String company, 
        String address, String phone, String email, String twitter, 
        String linkedin, String website, String fax, String job_title,
        String about_job,String matric, String matric_marks, String matric_date, 
        String intermidiate, String inter_marks, String inter_date, 
        String bachelor, String bs_cgpa, String bs_date, 
        String master, String msc_cgpa, String msc_date, 
        String phd, String phd_marks, String phd_date) throws ClassNotFoundException, SQLException{
                 this.user_name = name;
                 this.User_email = email;
                 this.DOB = date_of_birth;
                 this.Address = address;
                 int id = 0;
                 this.user_id = ++id;
                 Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con  = DriverManager.getConnection(rq.URL, rq.user, rq.password);
                if(con!=null){
                    System.out.println("Success full");

                }
                else{
                    System.out.println("Failed");
                }
                 String sql1 = "Insert into cvinfo11 values('"+name+"', '"+date_of_birth+"', '"+nationality+"', '"+country+"', '"+city+"', '"+gander+"', "
                        + "'"+martial_status+"','"+company+"','"+about_you+"', '"+address+"', '"+phone+"', '"+email+"', '"+twitter+"', '"+linkedin+"', '"+website+"',"
                        + " '"+fax+"','"+job_title+"','"+about_job+"', "
                        + "'"+matric+"', '"+matric_marks+"', '"+matric_date+"', '"+intermidiate+"', '"+inter_marks+"', '"+inter_date+"', '"+bachelor+"', "
                        + "'"+bs_cgpa+"','"+bs_date+"', '"+master+"','"+msc_cgpa+"', '"+msc_date+"', '"+phd+"', '"+phd_marks+"', '"+phd_date+"' ) ";
                        Statement smt1 = con.createStatement();
                        smt1.executeUpdate(sql1);
                 
             }
        
}
