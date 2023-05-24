
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class job extends user{
    String jobName;
    String jobType;
    ResumeQualification rq = new ResumeQualification();
    public void userjob(String s1,String s2, String s3,
        String s4,String s5,String cs1,String cs2,String cs3,String organization1,String o1_work,String o1_date,
     String organization2,  String o2_work,String o2_date,String organization3,String o3_work,String o3_date,
        String organization4,String o4_work,String o4_date,String a1, String a2, String a3,
        String c1, String c2, String c3) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con  = DriverManager.getConnection(rq.URL, rq.user, rq.password);
                if(con!=null){
                    System.out.println("Success full");

                }
                else{
                    System.out.println("Failed");
                }
        String sql2 = "Insert into cvinfo22 values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"', '"+cs1+"', '"+cs2+"','"+cs3+"', '"+organization1+"',"
                        + " '"+o1_work+"','"+o1_date+"', '"+organization2+"', '"+o2_work+"','"+o2_date+"', '"+organization3+"','"+o3_work+"', '"+o3_date+"', "
                        + "'"+organization4+"','"+o4_work+"', '"+o4_date+"', '"+a1+"','"+a2+"','"+a3+"', '"+c1+"','"+c2+"','"+c3+"' )";
                        Statement smt2 = con.createStatement();
                        smt2.executeUpdate(sql2);
    }
    }
