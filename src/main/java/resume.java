
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class resume extends ResumeQualification {
    String ResumeName;
    String GenerateResume;
    String UserName;
    
    public void search_resume(String r_name){
        this.ResumeName = r_name;
         try{

            File f  =  new File("D:\\Documents\\cv_generated\\"+this.ResumeName+".pdf");

                if(f.exists()== true){
                    int a =JOptionPane.showConfirmDialog(null, "Your CV exists\n Do you wants to open your CV","Open CV"
                        , JOptionPane.YES_NO_OPTION);
                    if(a==0){
                        
                        Desktop.getDesktop().open(new File("D:\\Documents\\cv_generated\\"+ResumeName+".pdf"));
                        }

                    }
                    else if(f.exists() == false){
                        JOptionPane.showMessageDialog(null, "Your CV does not exists");
                    }

                }
                catch (Exception e){
                    System.out.println(e);
                }
    }
    
    public void delete(String r_name) throws IOException{
        
        File f  =  new File("D:\\Documents\\cv_generated\\"+r_name+".pdf");

                if(f.exists()== true){
                    int a =JOptionPane.showConfirmDialog(null, "Your Resume exists\n Do you wants to delete your CV","Delete CV"
                        , JOptionPane.YES_NO_OPTION);
                    if(a==0){
                        if(f.delete()){
                           JOptionPane.showMessageDialog(null, "Your Resume Deleted successfully");
                           
                           
                        
                        }
                        else if(f.delete()==false){
                            JOptionPane.showMessageDialog(null, "Your Resume failed to Delete ");
                            
                        }
                        
                        
                        }

                    }
                
                    else if(f.exists() == false){
                        JOptionPane.showMessageDialog(null, "Your Resume does not exists \nPlease enter Correct name in Deletion field");
                        
                    }
                    
    }
    
    public void resume_site(){
        try {
            
            Desktop.getDesktop().open(new File("D:\\BSSE Semester 1\\Intro To ICT\\Web Development\\my work\\Bootstrap website\\index.html"));
        } catch (IOException ex) {
            Logger.getLogger(ResumeQualification.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
