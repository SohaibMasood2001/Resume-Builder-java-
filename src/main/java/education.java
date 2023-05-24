
import java.sql.SQLException;

public class education extends user{
String Degree_name;
int marks;
String duration;
String institute;

        @Override
        public void userinfo(String name, String date_of_birth, String nationality, String country, String city, String gander, String martial_status, 
                String about_you, String company, String address, String phone, String email, String twitter, String linkedin, String website, String fax,
                String job_title, String about_job, String matric, String matric_marks, String matric_date, String intermidiate, String inter_marks, String 
                        inter_date, String bachelor, String bs_cgpa, String bs_date, String master, String msc_cgpa, String msc_date, String phd, String phd_marks,
                        String phd_date) throws ClassNotFoundException, SQLException {
            this.Degree_name = matric;
            this.duration = matric_date;
            Integer.toString(this.marks);
            
            super.userinfo(name, date_of_birth, nationality, country, city, gander, martial_status, about_you, company, address, phone, email, 
                    twitter, linkedin, website, fax, job_title, about_job, matric, matric_marks, matric_date, intermidiate, inter_marks, inter_date, 
                    bachelor, bs_cgpa, bs_date, master, msc_cgpa, msc_date, phd, phd_marks, phd_date); 
        }

       
   
}
