
import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.TextAlignment;


import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class ResumeQualification extends javax.swing.JFrame {

    /**
     * Creates new form ResumeQualification
     */
    public ResumeQualification() {
        initComponents();
    }

String URL = "jdbc:mysql://localhost:3306/resume_info";
String user = "root";
String password = "";
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        feed_btn = new javax.swing.JButton();
        search_tf = new javax.swing.JTextField();
        search_b = new javax.swing.JButton();
        search_l = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        generate_b = new javax.swing.JButton();
        save_b = new javax.swing.JButton();
        reset_b = new javax.swing.JButton();
        logout_b = new javax.swing.JButton();
        exit_b1 = new javax.swing.JButton();
        visit_b = new javax.swing.JButton();
        delb = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cs_l = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        matric_marks_tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        name_tf = new javax.swing.JTextField();
        date_of_birth_tf = new javax.swing.JTextField();
        nationality_tf = new javax.swing.JTextField();
        country_tf = new javax.swing.JTextField();
        city_tf = new javax.swing.JTextField();
        gender_tf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        per_info_l = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        address_tf = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        phone_tf = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        email_tf = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        twitter_tf = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        linkedin_tf = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        website_tf = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        fax_tf = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        con_info_l = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        matric_tf = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        martial_tf = new javax.swing.JTextField();
        matric_date_tf = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        bachelor_tf = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        bs_cgpa_tf = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        bs_date_tf = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        intermidiate_tf = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        inter_marks_tf = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        inter_date_tf = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        master_tf = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        msc_cgpa_tf = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        msc_date_tf = new javax.swing.JTextField();
        education_l = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        cs1_tf = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        cs2_tf = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        cs3_tf = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        s5_tf = new javax.swing.JTextField();
        skills_l = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        s1_tf = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        s2_tf = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        s3_tf = new javax.swing.JTextField();
        certificate_l = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        organization1_tf = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        organization1_work_tf = new javax.swing.JTextField();
        organization1_date_tf = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        organization2_tf = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        organization2_work_tf = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        organization2_date_tf = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        organization3_tf = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        organization3_work_tf = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        organization3_date_tf = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        organization4_tf = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        organization4_work_tf = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        organization4_date_tf = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        phd_tf = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        phd_marks_tf = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        phd_date_tf = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        s4_tf = new javax.swing.JTextField();
        work_exp_l = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        a1_tf = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        a2_tf = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        a3_tf = new javax.swing.JTextField();
        award_l = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        c1_tf = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        c2_tf = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        c3_tf = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        interest_l = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        i1_tf = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        i2_tf = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        i3_tf = new javax.swing.JTextField();
        r1_tf = new javax.swing.JTextField();
        reference_tf = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        r2_tf = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        r3_tf = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        software_l = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        soft1_tf = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        soft2_tf = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        soft3_tf = new javax.swing.JTextField();
        lang1_tf = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        language_l = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        lang2_tf = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        lang3_tf = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        photo_b = new javax.swing.JButton();
        txt_filename = new javax.swing.JLabel();
        preview_img = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        job_title_tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        about_job_ta = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        company_tf = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        about_you_ta = new javax.swing.JTextArea();
        jLabel100 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        temp3_rb = new javax.swing.JRadioButton();
        temp1_rb = new javax.swing.JRadioButton();
        temp2_rb = new javax.swing.JRadioButton();
        temp3_l = new javax.swing.JLabel();
        temp1_l = new javax.swing.JLabel();
        temp2_l = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        footer_c = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        feed_btn.setBackground(new java.awt.Color(0, 102, 102));
        feed_btn.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        feed_btn.setForeground(new java.awt.Color(255, 255, 255));
        feed_btn.setText("FeedBack");
        feed_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                feed_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                feed_btnMouseExited(evt);
            }
        });
        feed_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feed_btnActionPerformed(evt);
            }
        });
        getContentPane().add(feed_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, 110, 40));
        getContentPane().add(search_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 540, 40));

        search_b.setBackground(new java.awt.Color(0, 102, 102));
        search_b.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        search_b.setForeground(new java.awt.Color(255, 255, 255));
        search_b.setText("Search");
        search_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                search_bMouseExited(evt);
            }
        });
        search_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_bActionPerformed(evt);
            }
        });
        getContentPane().add(search_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 110, 40));

        search_l.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        search_l.setForeground(new java.awt.Color(0, 102, 102));
        search_l.setText("Search CV");
        getContentPane().add(search_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\RL-modified.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\LP4.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 80));

        generate_b.setBackground(new java.awt.Color(0, 102, 102));
        generate_b.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        generate_b.setForeground(new java.awt.Color(255, 255, 255));
        generate_b.setText("Generate Resume");
        generate_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generate_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generate_bMouseExited(evt);
            }
        });
        generate_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_bActionPerformed(evt);
            }
        });
        getContentPane().add(generate_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 630, 170, 40));

        save_b.setBackground(new java.awt.Color(0, 102, 102));
        save_b.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        save_b.setForeground(new java.awt.Color(255, 255, 255));
        save_b.setText("Save Resume");
        save_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                save_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                save_bMouseExited(evt);
            }
        });
        save_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_bActionPerformed(evt);
            }
        });
        getContentPane().add(save_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 630, 130, 40));

        reset_b.setBackground(new java.awt.Color(0, 102, 102));
        reset_b.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        reset_b.setForeground(new java.awt.Color(255, 255, 255));
        reset_b.setText("Reset");
        reset_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reset_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reset_bMouseExited(evt);
            }
        });
        reset_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_bActionPerformed(evt);
            }
        });
        getContentPane().add(reset_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 630, 80, 40));

        logout_b.setBackground(new java.awt.Color(0, 102, 102));
        logout_b.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        logout_b.setForeground(new java.awt.Color(255, 255, 255));
        logout_b.setText("Logout");
        logout_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logout_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logout_bMouseExited(evt);
            }
        });
        logout_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_bActionPerformed(evt);
            }
        });
        getContentPane().add(logout_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 630, 90, 40));

        exit_b1.setBackground(new java.awt.Color(0, 102, 102));
        exit_b1.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        exit_b1.setForeground(new java.awt.Color(255, 255, 255));
        exit_b1.setText("Exit");
        exit_b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exit_b1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exit_b1MouseExited(evt);
            }
        });
        exit_b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_b1ActionPerformed(evt);
            }
        });
        getContentPane().add(exit_b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 630, 80, 40));

        visit_b.setBackground(new java.awt.Color(0, 102, 102));
        visit_b.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        visit_b.setForeground(new java.awt.Color(255, 255, 255));
        visit_b.setText("Vist Website");
        visit_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                visit_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                visit_bMouseExited(evt);
            }
        });
        visit_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visit_bActionPerformed(evt);
            }
        });
        getContentPane().add(visit_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 630, 140, 40));

        delb.setBackground(new java.awt.Color(0, 102, 102));
        delb.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        delb.setForeground(new java.awt.Color(255, 255, 255));
        delb.setText("Delete");
        delb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delbMouseExited(evt);
            }
        });
        delb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbActionPerformed(evt);
            }
        });
        getContentPane().add(delb, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 630, 90, 40));

        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1128, 5, -1, -1));

        cs_l.setFont(new java.awt.Font("Constantia", 1, 27)); // NOI18N
        cs_l.setText("Computer Skills");
        jPanel1.add(cs_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1440, 303, 37));

        jLabel5.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel5.setText("Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 1120, -1, -1));

        matric_marks_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matric_marks_tfActionPerformed(evt);
            }
        });
        jPanel1.add(matric_marks_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 1110, 100, 40));

        jLabel7.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel7.setText("Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel8.setText("Date of Birth");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel9.setText("Nationality");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel10.setText("CNIC");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        jLabel11.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel11.setText("City");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, -1, -1));

        jLabel12.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel12.setText("Gender");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, -1, -1));

        name_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_tfActionPerformed(evt);
            }
        });
        jPanel1.add(name_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 320, 40));

        date_of_birth_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_of_birth_tfActionPerformed(evt);
            }
        });
        jPanel1.add(date_of_birth_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 320, 40));

        nationality_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nationality_tfActionPerformed(evt);
            }
        });
        jPanel1.add(nationality_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 320, 40));

        country_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                country_tfActionPerformed(evt);
            }
        });
        jPanel1.add(country_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 320, 40));

        city_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                city_tfActionPerformed(evt);
            }
        });
        jPanel1.add(city_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 320, 40));

        gender_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gender_tfActionPerformed(evt);
            }
        });
        jPanel1.add(gender_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 320, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\LP4.jpg")); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 3210, 880, 10));

        per_info_l.setFont(new java.awt.Font("Constantia", 1, 27)); // NOI18N
        per_info_l.setText("Personal Informations");
        jPanel1.add(per_info_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 303, 37));

        jLabel15.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel15.setText("Address");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, -1, -1));

        address_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_tfActionPerformed(evt);
            }
        });
        jPanel1.add(address_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 380, 40));

        jLabel16.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel16.setText("Phone# No");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, -1, -1));

        phone_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_tfActionPerformed(evt);
            }
        });
        jPanel1.add(phone_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 380, 40));

        jLabel17.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel17.setText("Email");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, -1, -1));

        email_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_tfActionPerformed(evt);
            }
        });
        jPanel1.add(email_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 380, 40));

        jLabel18.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel18.setText("Twitter");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, -1, -1));

        twitter_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twitter_tfActionPerformed(evt);
            }
        });
        jPanel1.add(twitter_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, 380, 40));

        jLabel19.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel19.setText("Linkedin");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 370, -1, -1));

        linkedin_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkedin_tfActionPerformed(evt);
            }
        });
        jPanel1.add(linkedin_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, 380, 40));

        jLabel20.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel20.setText("Website");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 450, -1, 30));

        website_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                website_tfActionPerformed(evt);
            }
        });
        jPanel1.add(website_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, 380, 40));

        jLabel21.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel21.setText("Fax# No");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, -1, -1));

        fax_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fax_tfActionPerformed(evt);
            }
        });
        jPanel1.add(fax_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, 380, 40));

        jLabel22.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\LP4.jpg")); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 2860, 10, 350));

        con_info_l.setFont(new java.awt.Font("Constantia", 1, 27)); // NOI18N
        con_info_l.setText("Contact Informations");
        jPanel1.add(con_info_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 303, 37));

        jLabel24.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel24.setText("Matric Degree");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1010, -1, -1));

        matric_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matric_tfActionPerformed(evt);
            }
        });
        jPanel1.add(matric_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1040, 340, 40));

        jLabel25.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel25.setText("Martial Status");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, -1, -1));

        martial_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                martial_tfActionPerformed(evt);
            }
        });
        jPanel1.add(martial_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, 320, 40));

        matric_date_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matric_date_tfActionPerformed(evt);
            }
        });
        jPanel1.add(matric_date_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 1110, 120, 40));

        jLabel27.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel27.setText("Marks");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1120, -1, -1));

        jLabel29.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel29.setText("Bachelor Degree");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1330, -1, -1));

        bachelor_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bachelor_tfActionPerformed(evt);
            }
        });
        jPanel1.add(bachelor_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1360, 330, 40));

        jLabel32.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel32.setText("CGPA");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1440, -1, -1));

        bs_cgpa_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bs_cgpa_tfActionPerformed(evt);
            }
        });
        jPanel1.add(bs_cgpa_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 1430, 100, 40));

        jLabel33.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel33.setText("Date");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 1440, -1, -1));

        bs_date_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bs_date_tfActionPerformed(evt);
            }
        });
        jPanel1.add(bs_date_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 1430, 110, 40));

        jLabel34.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel34.setText("Intermidiate Degree");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1170, -1, -1));

        intermidiate_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intermidiate_tfActionPerformed(evt);
            }
        });
        jPanel1.add(intermidiate_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1200, 340, 40));

        jLabel37.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel37.setText("Marks");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1280, -1, -1));

        inter_marks_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inter_marks_tfActionPerformed(evt);
            }
        });
        jPanel1.add(inter_marks_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 1270, 100, 40));

        jLabel38.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel38.setText("Date");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 1280, -1, -1));

        inter_date_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inter_date_tfActionPerformed(evt);
            }
        });
        jPanel1.add(inter_date_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 1270, 120, 40));

        jLabel30.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel30.setText("Masters Degree");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1490, -1, -1));

        master_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                master_tfActionPerformed(evt);
            }
        });
        jPanel1.add(master_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1520, 330, 40));

        jLabel39.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel39.setText("CGPA");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1600, -1, -1));

        msc_cgpa_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msc_cgpa_tfActionPerformed(evt);
            }
        });
        jPanel1.add(msc_cgpa_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 1590, 100, 40));

        jLabel40.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel40.setText("Date");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 1600, -1, -1));

        msc_date_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msc_date_tfActionPerformed(evt);
            }
        });
        jPanel1.add(msc_date_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 1590, 110, 40));

        education_l.setFont(new java.awt.Font("Constantia", 1, 27)); // NOI18N
        education_l.setText("Education");
        jPanel1.add(education_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 970, 303, 37));

        jLabel41.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel41.setText("CS1");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1490, -1, -1));

        cs1_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cs1_tfActionPerformed(evt);
            }
        });
        jPanel1.add(cs1_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1510, 380, 40));

        jLabel42.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel42.setText("CS2");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1560, -1, -1));

        cs2_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cs2_tfActionPerformed(evt);
            }
        });
        jPanel1.add(cs2_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1590, 380, 40));

        jLabel43.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel43.setText("CS3");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1640, -1, -1));

        cs3_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cs3_tfActionPerformed(evt);
            }
        });
        jPanel1.add(cs3_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1670, 380, 40));

        jLabel44.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel44.setText("S5");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1330, -1, -1));

        s5_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s5_tfActionPerformed(evt);
            }
        });
        jPanel1.add(s5_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1360, 380, 40));

        skills_l.setFont(new java.awt.Font("Constantia", 1, 27)); // NOI18N
        skills_l.setText("Skills");
        jPanel1.add(skills_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 970, 303, 37));

        jLabel46.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel46.setText("S1");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1010, -1, -1));

        s1_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1_tfActionPerformed(evt);
            }
        });
        jPanel1.add(s1_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1030, 380, 40));

        jLabel47.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel47.setText("S2");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1080, -1, -1));

        s2_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2_tfActionPerformed(evt);
            }
        });
        jPanel1.add(s2_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1110, 380, 40));

        jLabel48.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel48.setText("S3");
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1160, -1, -1));

        s3_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3_tfActionPerformed(evt);
            }
        });
        jPanel1.add(s3_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1190, 380, 40));

        certificate_l.setFont(new java.awt.Font("Constantia", 1, 27)); // NOI18N
        certificate_l.setText("Certificate");
        jPanel1.add(certificate_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 2120, 303, 37));

        jLabel52.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel52.setText("Organization 1");
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1870, -1, -1));

        organization1_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organization1_tfActionPerformed(evt);
            }
        });
        jPanel1.add(organization1_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1900, 320, 40));

        jLabel54.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel54.setText("Work");
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1980, -1, -1));

        organization1_work_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organization1_work_tfActionPerformed(evt);
            }
        });
        jPanel1.add(organization1_work_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 1970, 110, 40));

        organization1_date_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organization1_date_tfActionPerformed(evt);
            }
        });
        jPanel1.add(organization1_date_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 1970, 100, 40));

        jLabel55.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel55.setText("Date");
        jPanel1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 1980, -1, -1));

        jLabel56.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel56.setText("Organization 2");
        jPanel1.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 2030, -1, -1));

        organization2_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organization2_tfActionPerformed(evt);
            }
        });
        jPanel1.add(organization2_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 2060, 320, 40));

        jLabel58.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel58.setText("Work");
        jPanel1.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 2140, -1, -1));

        organization2_work_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organization2_work_tfActionPerformed(evt);
            }
        });
        jPanel1.add(organization2_work_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 2130, 110, 40));

        jLabel59.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel59.setText("Date");
        jPanel1.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 2140, -1, -1));

        organization2_date_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organization2_date_tfActionPerformed(evt);
            }
        });
        jPanel1.add(organization2_date_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 2130, 100, 40));

        jLabel60.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel60.setText("Organization 3");
        jPanel1.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 2190, -1, -1));

        organization3_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organization3_tfActionPerformed(evt);
            }
        });
        jPanel1.add(organization3_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 2220, 320, 40));

        jLabel62.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel62.setText("Work");
        jPanel1.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 2300, -1, -1));

        organization3_work_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organization3_work_tfActionPerformed(evt);
            }
        });
        jPanel1.add(organization3_work_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 2290, 100, 40));

        jLabel63.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel63.setText("Date");
        jPanel1.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 2300, -1, -1));

        organization3_date_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organization3_date_tfActionPerformed(evt);
            }
        });
        jPanel1.add(organization3_date_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 2290, 100, 40));

        jLabel64.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel64.setText("Organization 4");
        jPanel1.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 2350, -1, -1));

        organization4_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organization4_tfActionPerformed(evt);
            }
        });
        jPanel1.add(organization4_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 2380, 320, 40));

        jLabel66.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel66.setText("Work");
        jPanel1.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 2460, -1, -1));

        organization4_work_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organization4_work_tfActionPerformed(evt);
            }
        });
        jPanel1.add(organization4_work_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 2450, 110, 40));

        jLabel67.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel67.setText("Date");
        jPanel1.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 2460, -1, -1));

        organization4_date_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organization4_date_tfActionPerformed(evt);
            }
        });
        jPanel1.add(organization4_date_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 2450, 100, 40));

        jLabel68.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel68.setText("Phd/Other Degrees");
        jPanel1.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1650, -1, -1));

        phd_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phd_tfActionPerformed(evt);
            }
        });
        jPanel1.add(phd_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1680, 330, 40));

        jLabel70.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel70.setText("Marks");
        jPanel1.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1760, -1, -1));

        phd_marks_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phd_marks_tfActionPerformed(evt);
            }
        });
        jPanel1.add(phd_marks_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 1750, 100, 40));

        jLabel71.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel71.setText("Date");
        jPanel1.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 1760, -1, -1));

        phd_date_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phd_date_tfActionPerformed(evt);
            }
        });
        jPanel1.add(phd_date_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 1750, 110, 40));

        jLabel72.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel72.setText("S4");
        jPanel1.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1240, -1, -1));

        s4_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4_tfActionPerformed(evt);
            }
        });
        jPanel1.add(s4_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1270, 380, 40));

        work_exp_l.setFont(new java.awt.Font("Constantia", 1, 27)); // NOI18N
        work_exp_l.setText("Work Experience");
        jPanel1.add(work_exp_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1830, 303, 37));

        jLabel74.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel74.setText("A1");
        jPanel1.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 1870, -1, -1));

        a1_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1_tfActionPerformed(evt);
            }
        });
        jPanel1.add(a1_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 1890, 380, 40));

        jLabel75.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel75.setText("A2");
        jPanel1.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 1940, -1, -1));

        a2_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2_tfActionPerformed(evt);
            }
        });
        jPanel1.add(a2_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 1970, 380, 40));

        jLabel76.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel76.setText("A3");
        jPanel1.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 2020, -1, -1));

        a3_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3_tfActionPerformed(evt);
            }
        });
        jPanel1.add(a3_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 2050, 380, 40));

        award_l.setFont(new java.awt.Font("Constantia", 1, 27)); // NOI18N
        award_l.setText("Awards");
        jPanel1.add(award_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 1830, 303, 37));

        jLabel78.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel78.setText("C1");
        jPanel1.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 2160, -1, -1));

        c1_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1_tfActionPerformed(evt);
            }
        });
        jPanel1.add(c1_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 2180, 380, 40));

        jLabel79.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel79.setText("C2");
        jPanel1.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 2230, -1, -1));

        c2_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2_tfActionPerformed(evt);
            }
        });
        jPanel1.add(c2_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 2260, 380, 40));

        jLabel80.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel80.setText("C3");
        jPanel1.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 2310, -1, -1));

        c3_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3_tfActionPerformed(evt);
            }
        });
        jPanel1.add(c3_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 2340, 380, 40));

        jLabel81.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\LP4.jpg")); // NOI18N
        jPanel1.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 1800, 880, 10));

        interest_l.setFont(new java.awt.Font("Constantia", 1, 27)); // NOI18N
        interest_l.setText("Interest");
        jPanel1.add(interest_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 2910, 303, 37));

        jLabel83.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel83.setText("I1");
        jPanel1.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 2940, -1, -1));

        i1_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i1_tfActionPerformed(evt);
            }
        });
        jPanel1.add(i1_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 2970, 350, 40));

        jLabel84.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel84.setText("I2");
        jPanel1.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 3020, -1, -1));

        i2_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i2_tfActionPerformed(evt);
            }
        });
        jPanel1.add(i2_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 3050, 350, 40));

        jLabel85.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel85.setText("I3");
        jPanel1.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 3100, -1, -1));

        i3_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i3_tfActionPerformed(evt);
            }
        });
        jPanel1.add(i3_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 3130, 350, 40));

        r1_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1_tfActionPerformed(evt);
            }
        });
        jPanel1.add(r1_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 2970, 380, 40));

        reference_tf.setFont(new java.awt.Font("Constantia", 1, 27)); // NOI18N
        reference_tf.setText("References");
        jPanel1.add(reference_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 2910, 303, 37));

        jLabel87.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel87.setText("R1");
        jPanel1.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 2950, -1, -1));

        jLabel88.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel88.setText("R2");
        jPanel1.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 3020, -1, -1));

        r2_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2_tfActionPerformed(evt);
            }
        });
        jPanel1.add(r2_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 3050, 380, 40));

        jLabel89.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel89.setText("R3");
        jPanel1.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 3100, -1, -1));

        r3_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3_tfActionPerformed(evt);
            }
        });
        jPanel1.add(r3_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 3130, 380, 40));

        jLabel90.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\LP4.jpg")); // NOI18N
        jPanel1.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 1280, 10, 980));

        jLabel91.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\LP4.jpg")); // NOI18N
        jPanel1.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 2520, 880, 10));

        jLabel94.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\LP4.jpg")); // NOI18N
        jPanel1.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 970, 300, 950));

        software_l.setFont(new java.awt.Font("Constantia", 1, 27)); // NOI18N
        software_l.setText("Softwares");
        jPanel1.add(software_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 2570, 303, 37));

        jLabel86.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel86.setText("s1");
        jPanel1.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 2610, -1, -1));

        soft1_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soft1_tfActionPerformed(evt);
            }
        });
        jPanel1.add(soft1_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 2630, 350, 40));

        jLabel93.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel93.setText("s2");
        jPanel1.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 2680, -1, -1));

        soft2_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soft2_tfActionPerformed(evt);
            }
        });
        jPanel1.add(soft2_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 2710, 350, 40));

        jLabel95.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel95.setText("s3");
        jPanel1.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 2760, -1, -1));

        soft3_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soft3_tfActionPerformed(evt);
            }
        });
        jPanel1.add(soft3_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 2790, 350, 40));

        lang1_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lang1_tfActionPerformed(evt);
            }
        });
        jPanel1.add(lang1_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 2630, 380, 40));

        jLabel96.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel96.setText("l1");
        jPanel1.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 2610, -1, -1));

        language_l.setFont(new java.awt.Font("Constantia", 1, 27)); // NOI18N
        language_l.setText("Languages");
        jPanel1.add(language_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 2570, 303, 37));

        jLabel97.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel97.setText("l2");
        jPanel1.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 2680, -1, -1));

        lang2_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lang2_tfActionPerformed(evt);
            }
        });
        jPanel1.add(lang2_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 2710, 380, 40));

        jLabel98.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel98.setText("l3");
        jPanel1.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 2760, -1, -1));

        lang3_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lang3_tfActionPerformed(evt);
            }
        });
        jPanel1.add(lang3_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 2790, 380, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\LP4.jpg")); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 2870, 880, 10));

        jLabel51.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\LP4.jpg")); // NOI18N
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1920, 300, 610));

        jLabel23.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\LP4.jpg")); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 2260, 10, 610));

        photo_b.setBackground(new java.awt.Color(0, 102, 102));
        photo_b.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        photo_b.setForeground(new java.awt.Color(255, 255, 255));
        photo_b.setText("Attach Photo");
        photo_b.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        photo_b.setName(""); // NOI18N
        photo_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                photo_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                photo_bMouseExited(evt);
            }
        });
        photo_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photo_bActionPerformed(evt);
            }
        });
        jPanel1.add(photo_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 120, 40));

        txt_filename.setBackground(new java.awt.Color(255, 255, 255));
        txt_filename.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(txt_filename, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 220, 40));

        preview_img.setText("                      no file upload");
        preview_img.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        preview_img.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(preview_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 220, 200));

        jLabel4.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Job Title");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 630, 130, -1));

        job_title_tf.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jPanel1.add(job_title_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 660, 380, 40));

        jLabel6.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel6.setText("About job");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 710, -1, -1));

        about_job_ta.setColumns(20);
        about_job_ta.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        about_job_ta.setRows(5);
        jScrollPane3.setViewportView(about_job_ta);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 740, 380, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\LP4.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 970));

        jLabel73.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\LP4.jpg")); // NOI18N
        jPanel1.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2520, 300, 970));

        company_tf.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jPanel1.add(company_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 660, 320, 40));

        jLabel45.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(51, 51, 51));
        jLabel45.setText("Company");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 630, 130, -1));

        jLabel77.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\LP4.jpg")); // NOI18N
        jPanel1.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 930, 880, 10));

        jLabel99.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\LP4.jpg")); // NOI18N
        jPanel1.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 940, 10, 380));

        jLabel26.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel26.setText("About You");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 710, -1, -1));

        about_you_ta.setColumns(20);
        about_you_ta.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        about_you_ta.setRows(5);
        jScrollPane4.setViewportView(about_you_ta);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 320, 170));

        jLabel100.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\LP4.jpg")); // NOI18N
        jPanel1.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 10, 980));

        jLabel49.setFont(new java.awt.Font("Constantia", 1, 27)); // NOI18N
        jLabel49.setText("Select Resume Template");
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 3240, -1, -1));

        buttonGroup1.add(temp3_rb);
        temp3_rb.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        temp3_rb.setText("Template 3");
        jPanel1.add(temp3_rb, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 3440, -1, -1));

        buttonGroup1.add(temp1_rb);
        temp1_rb.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        temp1_rb.setText("Template 1");
        temp1_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temp1_rbActionPerformed(evt);
            }
        });
        jPanel1.add(temp1_rb, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 3440, -1, -1));

        buttonGroup1.add(temp2_rb);
        temp2_rb.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        temp2_rb.setText("Template 2");
        jPanel1.add(temp2_rb, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 3440, -1, -1));

        temp3_l.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\cv_temp1.png")); // NOI18N
        jPanel1.add(temp3_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 3270, 120, 160));

        temp1_l.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\cv_temp3.jpg")); // NOI18N
        jPanel1.add(temp1_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 3270, 130, 160));

        temp2_l.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\cv_temp2.jpg")); // NOI18N
        jPanel1.add(temp2_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 3280, 120, 150));
        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1200, 540));

        footer_c.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\LP4.jpg")); // NOI18N
        getContentPane().add(footer_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 1200, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void search_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_bMouseEntered
        Color sb1 = new Color(0,153,153);
        search_b.setBackground(sb1);
        search_b.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_search_bMouseEntered

    private void search_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_bMouseExited
        Color sb2 = new Color(0,102,102);
        search_b.setBackground(sb2);
    }//GEN-LAST:event_search_bMouseExited

    private void search_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_bActionPerformed
      resume rm = new resume();
      String r_name = search_tf.getText();
      rm.search_resume(r_name);

    }//GEN-LAST:event_search_bActionPerformed

    private void generate_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generate_bMouseEntered
        Color gb1 = new Color(0,153,153);
        generate_b.setBackground(gb1);
        generate_b.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_generate_bMouseEntered

    private void generate_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generate_bMouseExited
        Color gb2 = new Color(0,102,102);
        generate_b.setBackground(gb2);
    }//GEN-LAST:event_generate_bMouseExited

    private void generate_bActionPerformed(java.awt.event.ActionEvent evt) {

        String name = name_tf.getText();String date_of_birth = date_of_birth_tf.getText();String nationality = nationality_tf.getText();
        String country = country_tf.getText();String city = city_tf.getText(); String gander = gender_tf.getText();String martial_status = martial_tf.getText();
        String about_you_r = about_you_ta.getText();String company = company_tf.getText();
        //        contact informations
        String address = address_tf.getText();String phone = phone_tf.getText();String email = email_tf.getText();
        String job_title = job_title_tf.getText();
        String about_job=about_job_ta.getText();

        //        education

        String matric = matric_tf.getText();String matric_marks = matric_marks_tf.getText();String matric_date = matric_date_tf.getText();
        String intermidiate = intermidiate_tf.getText();String inter_marks = inter_marks_tf.getText();String inter_date = inter_date_tf.getText();
        String bachelor = bachelor_tf.getText();String bs_cgpa = bs_cgpa_tf.getText();String bs_date = bs_date_tf.getText();



if(temp2_rb.isSelected()){
    JOptionPane.showMessageDialog(this, "Template 2 is not" +
            " available on Free Version","Alert", JOptionPane.WARNING_MESSAGE );
    }
else if(temp3_rb.isSelected()){
            JOptionPane.showMessageDialog(this, "Template 3 is not" +
                    " available on Free Version","Alert", JOptionPane.WARNING_MESSAGE );
        }
else if (temp1_rb.isSelected()==false && temp1_rb.isSelected()==false && temp1_rb.isSelected()==false){
    JOptionPane.showMessageDialog(this, "Please Select One Template of CV", "Alert", JOptionPane.WARNING_MESSAGE);
        }
else if (name.isEmpty() || date_of_birth.isEmpty() || nationality.isEmpty() || country.isEmpty() || city.isEmpty() ||
                gander.isEmpty() || martial_status.isEmpty() || address.isEmpty() || phone.isEmpty() || email.isEmpty()
                || matric.isEmpty() || matric_marks.isEmpty() || matric_date.isEmpty() || intermidiate.isEmpty() ||
                inter_marks.isEmpty() || inter_date.isEmpty() || bachelor.isEmpty() || bs_cgpa.isEmpty() || bs_date.isEmpty()  || company.isEmpty()
                || job_title.isEmpty() || about_you_r.isEmpty() || about_job.isEmpty()){

            JOptionPane.showMessageDialog(this, "Please Fill Necessary informations in\n"
                    + "Personal informations, Contact Informations, Education or Photo", "Alert", JOptionPane.WARNING_MESSAGE);
        }
// --------------------------- all code for cv in pdf generation write here ---------------------------------
else  {
            try {
                PdfWriter w1 = new PdfWriter("D:\\Documents\\cv_generated\\Template1.pdf");
                PdfDocument pdf1 = new PdfDocument(w1);
                pdf1.addNewPage();
                Document d1 = new Document(pdf1);
                pdf1.setDefaultPageSize(PageSize.A4);
                float[] col_width1 = {520f};
                Table tb1 = new Table(col_width1);
                Border b1 = new SolidBorder(new DeviceRgb(102, 204, 255), 2);
                PdfFont f1 = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
                // Name of person at the top
                tb1.addCell(new Cell().add(name_tf.getText() + " (" + job_title_tf.getText() + ")")
                        .setTextAlignment(TextAlignment.CENTER)
                        .setFontSize(28f).setFontColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk
                                (new DeviceRgb(102, 204, 255)))
                        .setBorder(Border.NO_BORDER).setFont(f1).setBorderBottom(b1));
                Paragraph intro = new Paragraph();
                intro.add("Introduction").setFontSize(14f)
                        .setFont(f1).setFontColor(com.itextpdf.kernel.color.DeviceRgb.convertRgbToCmyk(new DeviceRgb(102, 204, 255)));
                Paragraph about_you = new Paragraph();
                Paragraph per_info = new Paragraph();
                //--------------------------------introduction ended ------------------------------------
                String url = txt_filename.getText();
                if (url.isEmpty()==false){
                    ImageData imgdata = ImageDataFactory.create(url);
                    com.itextpdf.layout.element.Image img = new com.itextpdf.layout.element.Image(imgdata);
                    com.itextpdf.layout.element.Image imgScale = img.scaleAbsolute(110f, 120f)
                            .setFixedPosition(1, 390f, 555f );
                    d1.add(imgScale);
                }

                // --------------------------- image code ended here ------------------------------------
                per_info.add("Personal Informations").setFontSize(27f)
                        .setFont(f1).setFontColor(com.itextpdf.kernel.color.DeviceRgb.convertRgbToCmyk(new DeviceRgb(102, 204, 255)));
                float[] col_width2 = {90f, 210f};
                Table tb2 = new Table(col_width2).setFont(f1);

                tb2.addCell(new Cell().add("Nationality:").setBorder(Border.NO_BORDER)
                        .setFontColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255))));
                tb2.addCell(new Cell().add(nationality_tf.getText()).setBorder(Border.NO_BORDER));


                tb2.addCell(new Cell().add("City:").setBorder(Border.NO_BORDER)
                        .setFontColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255))));
                tb2.addCell(new Cell().add(city_tf.getText()).setBorder(Border.NO_BORDER));

                tb2.addCell(new Cell().add("Gander:").setBorder(Border.NO_BORDER)
                        .setFontColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255))));
                tb2.addCell(new Cell().add(gender_tf.getText()).setBorder(Border.NO_BORDER));

                tb2.addCell(new Cell().add("Martial Status:").setBorder(Border.NO_BORDER)
                        .setFontColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255))));
                tb2.addCell(new Cell().add(martial_tf.getText()).setBorder(Border.NO_BORDER));

                tb2.addCell(new Cell().add("Born On:").setBorder(Border.NO_BORDER)
                        .setFontColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255))));
                tb2.addCell(new Cell().add(date_of_birth_tf.getText()).setBorder(Border.NO_BORDER));

                tb2.addCell(new Cell().add("CNIC:").setBorder(Border.NO_BORDER)
                        .setFontColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255))));
                tb2.addCell(new Cell().add(country_tf.getText()).setBorder(Border.NO_BORDER));

                float[] col_width22 = {520f};
                Table tb22 = new Table(col_width22).setFont(f1);
                tb22.addCell(new Cell().add("").setBorder(Border.NO_BORDER).setBorderBottom(b1));
                Paragraph p2 = new Paragraph();

                p2.add("Contact Informations").setFontSize(27f)
                        .setFont(f1).setFontColor(com.itextpdf.kernel.color.DeviceRgb.convertRgbToCmyk(new DeviceRgb(102, 204, 255)));
                float[] col_width3 = {90f, 470f};
                Table tb3 = new Table(col_width3).setFont(f1);

                tb3.addCell(new Cell().add("Address:").setBorder(Border.NO_BORDER)
                        .setFontColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255))));
                tb3.addCell(new Cell().add(address_tf.getText()).setBorder(Border.NO_BORDER));

                tb3.addCell(new Cell().add("Phone# NO:").setBorder(Border.NO_BORDER)
                        .setFontColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255))));
                tb3.addCell(new Cell().add(phone_tf.getText()).setBorder(Border.NO_BORDER));

                tb3.addCell(new Cell().add("Email:").setBorder(Border.NO_BORDER)
                        .setFontColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255))));
                tb3.addCell(new Cell().add(email_tf.getText()).setBorder(Border.NO_BORDER));
                String twitter = twitter_tf.getText();
                String linkedin = linkedin_tf.getText();
                String website = website_tf.getText();
                String fax = fax_tf.getText();
                if (twitter.isEmpty() == false) {
                    tb3.addCell(new Cell().add("Twitter:").setBorder(Border.NO_BORDER)
                            .setFontColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255))));
                    tb3.addCell(new Cell().add(twitter_tf.getText()).setBorder(Border.NO_BORDER));
                }
                if (linkedin.isEmpty() == false) {
                    tb3.addCell(new Cell().add("LinkedIn:").setBorder(Border.NO_BORDER)
                            .setFontColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255))));
                    tb3.addCell(new Cell().add(linkedin_tf.getText()).setBorder(Border.NO_BORDER));
                }
                if (website.isEmpty() == false) {
                    tb3.addCell(new Cell().add("Website:").setBorder(Border.NO_BORDER)
                            .setFontColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255))));
                    tb3.addCell(new Cell().add(website_tf.getText()).setBorder(Border.NO_BORDER));
                }
                if (fax.isEmpty() == false) {
                    tb3.addCell(new Cell().add("Fax No:").setBorder(Border.NO_BORDER)
                            .setFontColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255))));
                    tb3.addCell(new Cell().add(fax_tf.getText()).setBorder(Border.NO_BORDER));
                }

//-------------------------------------------personal info and contact info ended here---------------------------------------
                tb3.addCell(new Cell().add("").setBorder(Border.NO_BORDER).setBorderBottom(b1));
                tb3.addCell(new Cell().add("").setBorder(Border.NO_BORDER).setBorderBottom(b1));
                Paragraph edu = new Paragraph();
                edu.add("Education").setFontSize(27f)
                        .setFont(f1).setFontColor(com.itextpdf.kernel.color.DeviceRgb.convertRgbToCmyk(new DeviceRgb(102, 204, 255)));
                float[] col_width4 = {520f};
                Table tb4 = new Table(col_width4);
                Paragraph space4 = new Paragraph();
                space4.add("\n");
                String phd = phd_tf.getText();
                String masters = master_tf.getText();
                if (phd.isEmpty() == false) {
                    tb4.addCell(new Cell().add("Phd Degree").setFontSize(14f).setTextAlignment(TextAlignment.CENTER)
                            .setBackgroundColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255)))
                            .setFontColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(255, 253, 196))));
                    tb4.addCell(new Cell().add(phd_tf.getText() + "\n"
                                    + phd_date_tf.getText() + "\nI got " + phd_marks_tf.getText() + "% Marks in Phd level").setTextAlignment(TextAlignment.CENTER)
                            .setBackgroundColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(255, 253, 196))));
                }
                if (masters.isEmpty() == false) {
                    tb4.addCell(new Cell().add("Masters Degree").setFontSize(14f).setTextAlignment(TextAlignment.CENTER)
                            .setBackgroundColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255)))
                            .setFontColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(255, 253, 196))));
                    tb4.addCell(new Cell().add(master_tf.getText() + "\n"
                                    + msc_date_tf.getText() + "\nI got " + msc_cgpa_tf.getText() + " CGPA in masters level").setTextAlignment(TextAlignment.CENTER)
                            .setBackgroundColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(255, 253, 196))));
                }


                tb4.addCell(new Cell().add("Bachelors Degree").setFontSize(14f).setTextAlignment(TextAlignment.CENTER)
                        .setBackgroundColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255)))
                        .setFontColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(255, 253, 196))));
                tb4.addCell(new Cell().add(bachelor_tf.getText() + "\n"
                                + bs_date_tf.getText() + "\nI got " + bs_cgpa_tf.getText() + " CGPA in bachelors level").setTextAlignment(TextAlignment.CENTER)
                        .setBackgroundColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(255, 253, 196))));

                tb4.addCell(new Cell().add("Intermediate Degree").setFontSize(14f).setTextAlignment(TextAlignment.CENTER)
                        .setBackgroundColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255)))
                        .setFontColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(255, 253, 196))));
                tb4.addCell(new Cell().add(intermidiate_tf.getText() + "\n"
                                + inter_date_tf.getText() + "\nI got " + inter_marks_tf.getText() + "% in intermediate level").setTextAlignment(TextAlignment.CENTER)
                        .setBackgroundColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(255, 253, 196))));

                tb4.addCell(new Cell().add("Matric Degree").setFontSize(14f).setTextAlignment(TextAlignment.CENTER)
                        .setBackgroundColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255)))
                        .setFontColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(255, 253, 196))));
                tb4.addCell(new Cell().add(matric_tf.getText() + "\n"
                                + matric_date_tf.getText() + "\nI got " + matric_marks_tf.getText() + "% in matric level").setTextAlignment(TextAlignment.CENTER)
                        .setBackgroundColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(255, 253, 196))));


//--------------------------------------------------Education ended here---------------------------------------------
                String o1 = organization1_tf.getText();
                String o2 = organization2_tf.getText();
                String o3 = organization3_tf.getText();
                String o4 = organization4_tf.getText();

                Paragraph exp = new Paragraph();
                float[] col_width5 = {220, 150f, 150f};
                Table tb5 = new Table(col_width5);
                if (o1.isEmpty()==false || o2.isEmpty()==false || o3.isEmpty() ==false || o4.isEmpty() == false){
                    tb4.addCell(new Cell().add("\n").setBorder(Border.NO_BORDER).setBorderBottom(b1));
                    exp.add("Work Experience").setFontSize(27f)
                            .setFont(f1).setFontColor(com.itextpdf.kernel.color.DeviceRgb.convertRgbToCmyk(new DeviceRgb(102, 204, 255)));
                    if (o1.isEmpty() == false) {
                        tb5.addCell(new Cell().add("1. " + organization1_tf.getText()).setBold().setBorder(Border.NO_BORDER).setFontSize(13f));
                        tb5.addCell(new Cell().add(organization1_work_tf.getText()).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.CENTER));
                        tb5.addCell(new Cell().add(organization1_date_tf.getText()).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.CENTER));

                    }

                    if (o2.isEmpty() == false) {

                        tb5.addCell(new Cell().add("2. " + organization2_tf.getText()).setBold().setBorder(Border.NO_BORDER).setFontSize(13f));
                        tb5.addCell(new Cell().add(organization2_work_tf.getText()).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.CENTER));
                        tb5.addCell(new Cell().add(organization2_date_tf.getText()).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.CENTER));

                    }

                    if (o3.isEmpty() == false) {
                        tb5.addCell(new Cell().add("3. " + organization3_tf.getText()).setBold().setBorder(Border.NO_BORDER).setFontSize(13f));
                        tb5.addCell(new Cell().add(organization3_work_tf.getText()).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.CENTER));
                        tb5.addCell(new Cell().add(organization3_date_tf.getText()).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.CENTER));
                    }
                    if (o4.isEmpty() == false) {
                        tb5.addCell(new Cell().add("4. " + organization4_tf.getText()).setBold().setBorder(Border.NO_BORDER).setFontSize(13f));
                        tb5.addCell(new Cell().add(organization4_work_tf.getText()).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.CENTER));
                        tb5.addCell(new Cell().add(organization4_date_tf.getText()).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.CENTER));
                    }
                }






                tb5.addCell(new Cell().add("\n").setBorder(Border.NO_BORDER));
                tb5.addCell(new Cell().add("\n").setBorder(Border.NO_BORDER));
                tb5.addCell(new Cell().add("\n").setBorder(Border.NO_BORDER));


//------------------------------------work experience ended here -------------------------------------------
                String s1 = s1_tf.getText();
                String s2 = s2_tf.getText();
                String s3 = s3_tf.getText();
                String s4 = s4_tf.getText();
                String s5 = s5_tf.getText();
                String cs1 = cs1_tf.getText();
                String cs2 = cs2_tf.getText();
                String cs3 = cs3_tf.getText();

                Paragraph cskill = new Paragraph();
                com.itextpdf.layout.element.List l7 = new com.itextpdf.layout.element.List();
                Text t8 = new Text(".").setBold().setFontSize(27f);
                l7.setMarginLeft(16f);

                float[] col_width7 = {260f, 260f};
                Table tb7 = new Table(col_width7);
                com.itextpdf.layout.element.List l6 = new com.itextpdf.layout.element.List();
                Text t6 = new Text(".").setBold().setFontSize(27f);
                l6.setMarginLeft(16f);
                Paragraph skill = new Paragraph();
                if (s1.isEmpty() == false || s2.isEmpty() == false || s3.isEmpty() == false || s4.isEmpty()==false
                        || s5.isEmpty() == false || cs1.isEmpty() == false || cs2.isEmpty() == false || cs2.isEmpty() == false){

                    skill.add("Skills").setFontSize(27f)
                            .setFont(f1).setFontColor(com.itextpdf.kernel.color.DeviceRgb.convertRgbToCmyk(new DeviceRgb(255, 253, 196)));
                    if (s1.isEmpty() == false) {
                        l6.setListSymbol(t6).add(s1_tf.getText());
                    }
                    if (s2.isEmpty() == false) {
                        l6.setListSymbol(t6).add(s2_tf.getText());
                    }
                    if (s3.isEmpty() == false) {
                        l6.setListSymbol(t6).add(s3_tf.getText());
                    }
                    if (s4.isEmpty() == false) {
                        l6.setListSymbol(t6).add(s4_tf.getText());
                    }
                    if (s5.isEmpty() == false) {
                        l6.setListSymbol(t6).add(s5_tf.getText());
                    }
                    cskill.add("Computer Skills").setFontSize(27f)
                            .setFont(f1).setFontColor(com.itextpdf.kernel.color.DeviceRgb.convertRgbToCmyk(new DeviceRgb(255, 253, 196)));

                    if (cs1.isEmpty() == false) {
                        l7.setListSymbol(t8).add(cs1_tf.getText());
                    }
                    if (cs2.isEmpty() == false) {
                        l7.setListSymbol(t8).add(cs2_tf.getText());
                    }
                    if (cs3.isEmpty() == false) {
                        l7.setListSymbol(t8).add(cs3_tf.getText());
                    }
                    tb7.addCell(new Cell().add(skill).setBackgroundColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255))));
                    tb7.addCell(new Cell().add(cskill).setBackgroundColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255))));
                    tb7.addCell(new Cell().add(l6).setBackgroundColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(255, 253, 196))));
                    tb7.addCell(new Cell().add(l7).setBackgroundColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(255, 253, 196))));
                }


// ---

                Paragraph space8 = new Paragraph();
                space8.add("\n").setFontSize(20);
//-------------------------------------------skill and computer skills ended-------------------------------------------
                String a1 = a1_tf.getText();
                String a2 = a2_tf.getText();
                String a3 = a3_tf.getText();
                String c1 = c1_tf.getText();
                String c2 = c2_tf.getText();
                String c3 = c3_tf.getText();

                float[] col_width8 = {260f, 260f};
                Table tb8 = new Table(col_width7);
                com.itextpdf.layout.element.List l8 = new com.itextpdf.layout.element.List();
                l8.setMarginLeft(16f);
                Paragraph award = new Paragraph();
                Paragraph cerft = new Paragraph();
                com.itextpdf.layout.element.List l9 = new com.itextpdf.layout.element.List();
                Text t10 = new Text(".").setBold().setFontSize(27f);
                l9.setMarginLeft(16f);
                if (a1.isEmpty() == false ||a2.isEmpty() == false ||  a3.isEmpty() == false ||
                        c1.isEmpty() == false || c2.isEmpty() == false ||  c3.isEmpty() == false){
                    award.add("Awards").setFontSize(27f)
                            .setFont(f1).setFontColor(com.itextpdf.kernel.color.DeviceRgb.convertRgbToCmyk(new DeviceRgb(255, 253, 196)));
                    if (a1.isEmpty() == false) {
                        l8.setListSymbol(". ").add(a1_tf.getText());
                    }
                    if (a2.isEmpty() == false) {
                        l8.setListSymbol(". ").add(a2_tf.getText());
                    }
                    if (a3.isEmpty() == false) {
                        l8.setListSymbol(". ").add(a3_tf.getText());
                    }
                    cerft.add("Certificate").setFontSize(27f)
                            .setFont(f1).setFontColor(com.itextpdf.kernel.color.DeviceRgb.convertRgbToCmyk(new DeviceRgb(255, 253, 196)));
                    if (c1.isEmpty() == false) {
                        l9.setListSymbol("* ").add(c1_tf.getText());
                    }
                    if (c2.isEmpty() == false) {
                        l9.setListSymbol("* ").add(c2_tf.getText());
                    }
                    if (c3.isEmpty() == false) {
                        l9.setListSymbol("* ").add(c3_tf.getText());
                    }
                    tb8.addCell(new Cell().add(award).setBackgroundColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255))));
                    tb8.addCell(new Cell().add(cerft).setBackgroundColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255))));
                    tb8.addCell(new Cell().add(l8).setBackgroundColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(255, 253, 196))));
                    tb8.addCell(new Cell().add(l9).setBackgroundColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(255, 253, 196))));
                }

                Paragraph space9 = new Paragraph();
                space9.add("\n").setFontSize(20);
//-------------------------------------awards and certficate ended here ---------------------------------------------

                String soft1 = soft1_tf.getText();
                String soft2 = soft2_tf.getText();
                String soft3 = soft3_tf.getText();
                String lang1 = lang1_tf.getText();
                String lang2 = lang2_tf.getText();
                String lang3 = lang3_tf.getText();

                float[] col_width9 = {260f, 260f};
                Table tb9 = new Table(col_width9);
                com.itextpdf.layout.element.List l10 = new com.itextpdf.layout.element.List();
                Text t11 = new Text(".").setBold().setFontSize(27f);
                l10.setMarginLeft(12f);
                Paragraph soft = new Paragraph();
                Paragraph lang = new Paragraph();
                com.itextpdf.layout.element.List l11 = new com.itextpdf.layout.element.List();
                Text t12 = new Text(".").setBold().setFontSize(27f);
                l11.setMarginLeft(16f);
                if (soft1.isEmpty() == false || soft2.isEmpty() == false || soft3.isEmpty() == false ||
                        lang1.isEmpty() == false || lang2.isEmpty() == false || lang3.isEmpty() == false){
                    soft.add("Software").setFontSize(27f)
                            .setFont(f1).setFontColor(com.itextpdf.kernel.color.DeviceRgb.convertRgbToCmyk(new DeviceRgb(255, 253, 196)));
                    if (soft1.isEmpty() == false) {
                        l10.setListSymbol(">. ").add(soft1_tf.getText());
                    }
                    if (soft2.isEmpty() == false) {
                        l10.setListSymbol(">. ").add(soft2_tf.getText());
                    }
                    if (soft3.isEmpty() == false) {
                        l10.setListSymbol(">. ").add(soft3_tf.getText());
                    }
                    lang.add("Languages").setFontSize(27f)
                            .setFont(f1).setFontColor(com.itextpdf.kernel.color.DeviceRgb.convertRgbToCmyk(new DeviceRgb(255, 253, 196)));
                    if (lang1.isEmpty() == false) {
                        l11.setListSymbol("> ").add(lang1_tf.getText());
                    }
                    if (lang2.isEmpty() == false) {
                        l11.setListSymbol("> ").add(lang2_tf.getText());
                    }
                    if (lang3.isEmpty() == false) {
                        l11.setListSymbol("> ").add(lang3_tf.getText());
                    }
                    tb9.addCell(new Cell().add(soft).setBackgroundColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255))));
                    tb9.addCell(new Cell().add(lang).setBackgroundColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255))));
                    tb9.addCell(new Cell().add(l10).setBackgroundColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(255, 253, 196))));
                    tb9.addCell(new Cell().add(l11).setBackgroundColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(255, 253, 196))));
                }







// -----------------------------------------software and languages ended here ------------------------------------------
                String inter1 = i1_tf.getText();
                String inter2 = i2_tf.getText();
                String inter3 = i3_tf.getText();

                Paragraph interest = new Paragraph();
                com.itextpdf.layout.element.List l12 = new com.itextpdf.layout.element.List();
                l12.setMarginLeft(16f);
                float[] col_width10 = {520f};
                Table tb10 = new Table(col_width10);
                if (inter1.isEmpty() == false || inter2.isEmpty() == false || inter3.isEmpty() == false) {
                    interest.add("Interests").setFontSize(27f)
                            .setFont(f1).setFontColor(com.itextpdf.kernel.color.DeviceRgb.convertRgbToCmyk(new DeviceRgb(102, 204, 255)));
                    if (inter1.isEmpty() == false) {
                        l12.setListSymbol("* ").add(i1_tf.getText());
                    }
                    if (inter2.isEmpty() == false) {
                        l12.setListSymbol("* ").add(i2_tf.getText());
                    }
                    if (inter3.isEmpty() == false) {
                        l12.setListSymbol("* ").add(i3_tf.getText());
                    }

                    tb10.addCell(new Cell().add("").setBorder(Border.NO_BORDER));
                    tb10.addCell(new Cell().add("").setBorder(Border.NO_BORDER));
                    tb10.addCell(new Cell().add("").setBorder(Border.NO_BORDER));
                    tb10.addCell(new Cell().add("").setBorder(Border.NO_BORDER).setBorderBottom(b1));
                }





//---------------------------------------interest ended here ----------------------------------------------

                float[] col_width11 = {520f};
                Table tb11 = new Table(col_width11);


                String ref1 = r1_tf.getText();
                String ref2 = r2_tf.getText();
                String ref3 = r3_tf.getText();

                Paragraph ref = new Paragraph();
                com.itextpdf.layout.element.List l13 = new com.itextpdf.layout.element.List();
                Text t14 = new Text("> ").setBold().setFontSize(15f);
                l13.setMarginLeft(16f);
                if (ref1.isEmpty() == false || ref2.isEmpty() == false || ref3.isEmpty() == false) {
                    ref.add("References").setFontSize(27f)
                            .setFont(f1).setFontColor(com.itextpdf.kernel.color.DeviceRgb.convertRgbToCmyk(new DeviceRgb(102, 204, 255)));
                    if (ref1.isEmpty() == false) {
                        l13.setListSymbol(t14).add(r1_tf.getText()).setUnderline();
                    }
                    if (ref2.isEmpty() == false) {
                        l13.setListSymbol(t14).add(r2_tf.getText()).setUnderline();
                    }
                    if (ref3.isEmpty() == false) {
                        l13.setListSymbol(t14).add(r3_tf.getText()).setUnderline();
                    }
                    tb11.addCell(new Cell().add("").setBorder(Border.NO_BORDER));
                    tb11.addCell(new Cell().add("").setBorder(Border.NO_BORDER));
                    tb11.addCell(new Cell().add("").setBorder(Border.NO_BORDER));
                    tb11.addCell(new Cell().add("").setBorder(Border.NO_BORDER).setBorderBottom(b1));
                }





// --------------------------------------- references ended here ------------------------------------------
                Paragraph endline = new Paragraph();
                endline.add("\n_______________ THE END _______________")
                        .setBold().setTextAlignment(TextAlignment.CENTER)
                        .setFontColor(com.itextpdf.kernel.color.Color.convertRgbToCmyk(new DeviceRgb(102, 204, 255)))
                        .setFontSize(18f);
                d1.add(tb1);
                d1.add(intro);
                d1.add(about_you);
                d1.add(per_info);
                d1.add(tb2);
                d1.add(tb22);
                d1.add(p2);
                d1.add(tb3);
                d1.add(edu);
                d1.add(space4);
                d1.add(tb4);
                d1.add(exp);
                d1.add(tb5);
                d1.add(tb7);
                d1.add(space8);
                d1.add(tb8);
                d1.add(space9);
                d1.add(tb9);
                d1.add(tb10);
                d1.add(interest);
                d1.add(l12);
                d1.add(tb11);
                d1.add(ref);
                d1.add(l13);
                d1.add(endline);
                d1.close();
                if(temp1_rb.isSelected()==true){
            int a = JOptionPane.showConfirmDialog(null, "Your CV Generated Successfully\nDo you want to open your CV", "CV", JOptionPane.YES_NO_OPTION);
                if(a==0){
                    Desktop.getDesktop().open(new File("D:\\Documents\\cv_generated\\Template1.pdf"));
                }
                System.out.println("Pdf Created");
        }
                
            }
            catch (FileNotFoundException ex) {
                Logger.getLogger(ResumeQualification.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
      }



    private void save_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_bMouseEntered
        Color sb1 = new Color(0,153,153);
        save_b.setBackground(sb1);
        save_b.setCursor(new Cursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_save_bMouseEntered

    private void save_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_bMouseExited
        Color sb2 = new Color(0,102,102);
        save_b.setBackground(sb2);
    }//GEN-LAST:event_save_bMouseExited

    private void save_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_bActionPerformed
        //        personal informations
        String name = name_tf.getText();String date_of_birth = date_of_birth_tf.getText();String nationality = nationality_tf.getText();
        String country = country_tf.getText();String city = city_tf.getText(); String gander = gender_tf.getText();String martial_status = martial_tf.getText();
        String about_you = about_you_ta.getText();String company = company_tf.getText();
        //        contact informations
        String address = address_tf.getText();String phone = phone_tf.getText();String email = email_tf.getText();String twitter = twitter_tf.getText();
        String linkedin = linkedin_tf.getText();String website = website_tf.getText();String fax = fax_tf.getText();String job_title = job_title_tf.getText();
        String about_job=about_job_ta.getText();

        //        education

        String matric = matric_tf.getText();String matric_marks = matric_marks_tf.getText();String matric_date = matric_date_tf.getText();
        String intermidiate = intermidiate_tf.getText();String inter_marks = inter_marks_tf.getText();String inter_date = inter_date_tf.getText();
        String bachelor = bachelor_tf.getText();String bs_cgpa = bs_cgpa_tf.getText();String bs_date = bs_date_tf.getText();
        String master = master_tf.getText();String msc_cgpa = msc_cgpa_tf.getText();String msc_date  = msc_date_tf.getText();
        String phd = phd_tf.getText();String phd_marks = phd_marks_tf.getText();String phd_date = phd_date_tf.getText();
        //        skills

        String s1 = s1_tf.getText();String s2 = s2_tf.getText(); String s3 = s3_tf.getText();
        String s4 = s4_tf.getText(); String s5 = s5_tf.getText();
        //        computer skills
        String cs1 = cs1_tf.getText();String cs2 = cs2_tf.getText();String cs3 = cs3_tf.getText();
        //        work experience

        String organization1 = organization1_tf.getText();String o1_work = organization1_work_tf.getText();String o1_date = organization1_date_tf.getText();
        String organization2 =organization2_tf.getText(); String o2_work = organization2_work_tf.getText();String o2_date =  organization2_date_tf.getText();
        String organization3 = organization3_tf.getText();String o3_work= organization3_work_tf.getText();String o3_date=organization2_date_tf.getText();
        String organization4 = organization4_tf.getText();String o4_work=organization4_work_tf.getText();String o4_date=organization4_date_tf.getText();
        //        awards

        String a1 = a1_tf.getText(); String a2 = a2_tf.getText(); String a3= a3_tf.getText();
        //        certificates
        String c1 = c1_tf.getText(); String c2 = c2_tf.getText(); String c3 = c3_tf.getText();

        //        softwares

        String soft1 = soft1_tf.getText();String soft2 = soft2_tf.getText();String soft3 = soft3_tf.getText();
        //       languages

        String lang1 = lang1_tf.getText();String lang2 = lang2_tf.getText();String lang3 = lang3_tf.getText();
        //       interest

        String interest1 = i1_tf.getText();String interest2=i2_tf.getText();String interest3 = i3_tf.getText();
        //       references

        String ref1 = r1_tf.getText();String ref2 = r2_tf.getText();String ref3 = r3_tf.getText();
        String image = txt_filename.getText();
        image = image.replace("\\","\\\\");

            

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con  = DriverManager.getConnection(URL, user, password);
                if(con!=null){
                    System.out.println("Success full");

                }
                else{
                    System.out.println("Failed");
                }

                if(name.isEmpty() || date_of_birth.isEmpty() || nationality.isEmpty() || country.isEmpty() || city.isEmpty() ||
                    gander.isEmpty() || martial_status.isEmpty() || address.isEmpty() || phone.isEmpty() || email.isEmpty()
                    || matric.isEmpty() || matric_marks.isEmpty() || matric_date.isEmpty() || intermidiate.isEmpty() ||
                    inter_marks.isEmpty() || inter_date.isEmpty() || bachelor.isEmpty() || bs_cgpa.isEmpty() || bs_date.isEmpty() || image.isEmpty() || company.isEmpty()
                    || job_title.isEmpty() || about_you.isEmpty() || about_job.isEmpty()){

                    JOptionPane.showMessageDialog(this, "Please Fill Necessary informations in"
                            + "Personal informations, Contact Informations, Education or Photo", "Alert", JOptionPane.WARNING_MESSAGE);

                    }
                    else{

                          education edu = new education();
                          edu.userinfo(name, date_of_birth, nationality, country, city, gander, martial_status, about_you, company, address,
                                  phone, email, twitter, linkedin, website, fax, job_title, about_job, matric, matric_marks, matric_date, intermidiate,
                                  inter_marks, inter_date, bachelor, bs_cgpa, bs_date, master, msc_cgpa, msc_date, phd, phd_marks, phd_date);
                          job jb = new job();
                          jb.userjob(s1, s2, s3, s4, s5, cs1, cs2, cs3, organization1, o1_work, o1_date, organization2, o2_work, o2_date, 
                                  organization3, o3_work, o3_date, organization4, o4_work, o4_date, a1, a2, a3, c1, c2, c3);
                          roles r = new roles();
                          r.userRoles(soft1, soft2, soft3, lang1, lang2, lang3, interest1, interest2, interest3, ref1, ref2, ref3, image);
                          
                    }

                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
                }

    }//GEN-LAST:event_save_bActionPerformed

    private void reset_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset_bMouseEntered
        Color rb1 = new Color(0,153,153);
        reset_b.setBackground(rb1);
        reset_b.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_reset_bMouseEntered

    private void reset_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset_bMouseExited
        Color rb2 = new Color(0,102,102);
        reset_b.setBackground(rb2);
    }//GEN-LAST:event_reset_bMouseExited

    private void reset_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_bActionPerformed
        a1_tf.setText("");a2_tf.setText("");a3_tf.setText("");
        address_tf.setText("");name_tf.setText("");nationality_tf.setText("");
        bachelor_tf.setText("");bs_cgpa_tf.setText("");bs_date_tf.setText("");
        c1_tf.setText("");c2_tf.setText("");c3_tf.setText("");
        city_tf.setText("");country_tf.setText("");
        cs1_tf.setText(""); cs2_tf.setText("");cs3_tf.setText("");
        date_of_birth_tf.setText("");email_tf.setText("");
        fax_tf.setText("");gender_tf.setText("");
        i1_tf.setText("");i2_tf.setText("");i3_tf.setText("");
        inter_marks_tf.setText("");inter_date_tf.setText("");intermidiate_tf.setText("");
        linkedin_tf.setText("");martial_tf.setText("");
        master_tf.setText("");msc_cgpa_tf.setText("");msc_date_tf.setText("");
        matric_tf.setText("");matric_marks_tf.setText("");matric_date_tf.setText("");
        organization1_tf.setText("");organization1_work_tf.setText("");organization1_date_tf.setText("");
        organization2_tf.setText("");organization2_work_tf.setText("");organization2_date_tf.setText("");
        organization3_tf.setText("");organization3_work_tf.setText("");organization2_date_tf.setText("");
        organization4_tf.setText("");organization4_work_tf.setText("");organization4_date_tf.setText("");
        phd_tf.setText("");phd_marks_tf.setText("");phd_date_tf.setText("");
        phone_tf.setText("");
        r1_tf.setText("");r2_tf.setText("");r3_tf.setText("");
        s1_tf.setText("");s2_tf.setText("");s3_tf.setText("");s4_tf.setText("");s5_tf.setText("");
        search_tf.setText("");twitter_tf.setText("");website_tf.setText("");
        soft1_tf.setText("");soft2_tf.setText("");soft3_tf.setText("");
        lang1_tf.setText("");lang2_tf.setText("");lang3_tf.setText("");

        txt_filename.setText("");preview_img.setIcon(null);
        company_tf.setText("");job_title_tf.setText("");
        about_you_ta.setText("");about_job_ta.setText("");

    }//GEN-LAST:event_reset_bActionPerformed

    private void logout_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_bMouseEntered
        Color lb1 = new Color(0,153,153);
        logout_b.setBackground(lb1);
        logout_b.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_logout_bMouseEntered

    private void logout_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_bMouseExited
        Color lb2 = new Color(0,102,102);
        logout_b.setBackground(lb2);
    }//GEN-LAST:event_logout_bMouseExited

    private void logout_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_bActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Are you sure to Logout ", "Logout", JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            login l = new login();
            l.setVisible(true);
        }
    }//GEN-LAST:event_logout_bActionPerformed

    private void exit_b1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_b1MouseEntered
        Color eb1 = new Color(0,153,153);
        exit_b1.setBackground(eb1);
        exit_b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_exit_b1MouseEntered

    private void exit_b1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_b1MouseExited
        Color eb2 = new Color(0,102,102);
        exit_b1.setBackground(eb2);
    }//GEN-LAST:event_exit_b1MouseExited

    private void exit_b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_b1ActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Are you sure to exit ", "Quit", JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_exit_b1ActionPerformed

    private void visit_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visit_bMouseEntered
        Color vb1 = new Color(0,153,153);
        visit_b.setBackground(vb1);
        visit_b.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_visit_bMouseEntered

    private void visit_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visit_bMouseExited
        Color vb2 = new Color(0,102,102);
        visit_b.setBackground(vb2);
    }//GEN-LAST:event_visit_bMouseExited

    private void visit_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visit_bActionPerformed
       resume rm = new resume();
        rm.resume_site();
       
    }//GEN-LAST:event_visit_bActionPerformed

    private void matric_marks_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matric_marks_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matric_marks_tfActionPerformed

    private void name_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_tfActionPerformed

    private void date_of_birth_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_of_birth_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date_of_birth_tfActionPerformed

    private void nationality_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationality_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nationality_tfActionPerformed

    private void country_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_country_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_country_tfActionPerformed

    private void city_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_city_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_city_tfActionPerformed

    private void gender_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gender_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gender_tfActionPerformed

    private void address_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address_tfActionPerformed

    private void phone_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone_tfActionPerformed

    private void email_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_tfActionPerformed

    private void twitter_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twitter_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twitter_tfActionPerformed

    private void linkedin_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkedin_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_linkedin_tfActionPerformed

    private void website_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_website_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_website_tfActionPerformed

    private void fax_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fax_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fax_tfActionPerformed

    private void matric_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matric_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matric_tfActionPerformed

    private void martial_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_martial_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_martial_tfActionPerformed

    private void matric_date_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matric_date_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matric_date_tfActionPerformed

    private void bachelor_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bachelor_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bachelor_tfActionPerformed

    private void bs_cgpa_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bs_cgpa_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bs_cgpa_tfActionPerformed

    private void bs_date_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bs_date_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bs_date_tfActionPerformed

    private void intermidiate_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intermidiate_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_intermidiate_tfActionPerformed

    private void inter_marks_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inter_marks_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inter_marks_tfActionPerformed

    private void inter_date_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inter_date_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inter_date_tfActionPerformed

    private void master_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_master_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_master_tfActionPerformed

    private void msc_cgpa_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msc_cgpa_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msc_cgpa_tfActionPerformed

    private void msc_date_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msc_date_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msc_date_tfActionPerformed

    private void cs1_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cs1_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cs1_tfActionPerformed

    private void cs2_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cs2_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cs2_tfActionPerformed

    private void cs3_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cs3_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cs3_tfActionPerformed

    private void s5_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s5_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s5_tfActionPerformed

    private void s1_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1_tfActionPerformed

    private void s2_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s2_tfActionPerformed

    private void s3_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s3_tfActionPerformed

    private void organization1_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organization1_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organization1_tfActionPerformed

    private void organization1_work_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organization1_work_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organization1_work_tfActionPerformed

    private void organization1_date_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organization1_date_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organization1_date_tfActionPerformed

    private void organization2_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organization2_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organization2_tfActionPerformed

    private void organization2_work_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organization2_work_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organization2_work_tfActionPerformed

    private void organization2_date_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organization2_date_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organization2_date_tfActionPerformed

    private void organization3_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organization3_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organization3_tfActionPerformed

    private void organization3_work_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organization3_work_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organization3_work_tfActionPerformed

    private void organization3_date_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organization3_date_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organization3_date_tfActionPerformed

    private void organization4_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organization4_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organization4_tfActionPerformed

    private void organization4_work_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organization4_work_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organization4_work_tfActionPerformed

    private void organization4_date_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organization4_date_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organization4_date_tfActionPerformed

    private void phd_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phd_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phd_tfActionPerformed

    private void phd_marks_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phd_marks_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phd_marks_tfActionPerformed

    private void phd_date_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phd_date_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phd_date_tfActionPerformed

    private void s4_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s4_tfActionPerformed

    private void a1_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a1_tfActionPerformed

    private void a2_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a2_tfActionPerformed

    private void a3_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a3_tfActionPerformed

    private void c1_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1_tfActionPerformed

    private void c2_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c2_tfActionPerformed

    private void c3_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c3_tfActionPerformed

    private void i1_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i1_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i1_tfActionPerformed

    private void i2_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i2_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i2_tfActionPerformed

    private void i3_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i3_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i3_tfActionPerformed

    private void r1_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1_tfActionPerformed

    private void r2_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2_tfActionPerformed

    private void r3_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r3_tfActionPerformed

    private void soft1_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soft1_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soft1_tfActionPerformed

    private void soft2_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soft2_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soft2_tfActionPerformed

    private void soft3_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soft3_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soft3_tfActionPerformed

    private void lang1_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lang1_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lang1_tfActionPerformed

    private void lang2_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lang2_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lang2_tfActionPerformed

    private void lang3_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lang3_tfActionPerformed

    }//GEN-LAST:event_lang3_tfActionPerformed

    private void photo_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photo_bMouseEntered
        Color pb1 = new Color(0,153,153);
        photo_b.setBackground(pb1);
        photo_b.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_photo_bMouseEntered

    private void photo_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photo_bMouseExited
        Color pb2 = new Color(0,102,102);
        photo_b.setBackground(pb2);
    }//GEN-LAST:event_photo_bMouseExited

    private void photo_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photo_bActionPerformed
        JFileChooser chooser = new JFileChooser();
        try{
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            String filename = f.getAbsolutePath();
            txt_filename.setText(filename);
            Image getAbsolutePath=null;
            ImageIcon icon = new ImageIcon(filename);
            Image img = icon.getImage();
            Image imgScale = img.getScaledInstance(preview_img.getWidth(), preview_img.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon Scaledicon = new ImageIcon(imgScale);

            preview_img.setIcon(Scaledicon);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }//GEN-LAST:event_photo_bActionPerformed

    private void temp1_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temp1_rbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temp1_rbActionPerformed

    private void delbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbActionPerformed
       Delete dl = new Delete();
       dl.setVisible(true);
    }//GEN-LAST:event_delbActionPerformed

    private void feed_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feed_btnActionPerformed
        Feedback fb = new Feedback();
        fb.setVisible(true);
    }//GEN-LAST:event_feed_btnActionPerformed

    private void delbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delbMouseEntered
        Color rb1 = new Color(0,153,153);
        delb.setBackground(rb1);
        delb.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_delbMouseEntered

    private void delbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delbMouseExited
       Color rb2 = new Color(0,102,102);
        delb.setBackground(rb2);
    }//GEN-LAST:event_delbMouseExited

    private void feed_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feed_btnMouseExited
       Color rb2 = new Color(0,102,102);
        feed_btn.setBackground(rb2);
    }//GEN-LAST:event_feed_btnMouseExited

    private void feed_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feed_btnMouseEntered
        Color rb1 = new Color(0,153,153);
        feed_btn.setBackground(rb1);
        feed_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_feed_btnMouseEntered

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
            java.util.logging.Logger.getLogger(ResumeQualification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResumeQualification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResumeQualification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResumeQualification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResumeQualification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a1_tf;
    private javax.swing.JTextField a2_tf;
    private javax.swing.JTextField a3_tf;
    private javax.swing.JTextArea about_job_ta;
    private javax.swing.JTextArea about_you_ta;
    private javax.swing.JTextField address_tf;
    private javax.swing.JLabel award_l;
    private javax.swing.JTextField bachelor_tf;
    private javax.swing.JTextField bs_cgpa_tf;
    private javax.swing.JTextField bs_date_tf;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField c1_tf;
    private javax.swing.JTextField c2_tf;
    private javax.swing.JTextField c3_tf;
    private javax.swing.JLabel certificate_l;
    private javax.swing.JTextField city_tf;
    private javax.swing.JTextField company_tf;
    private javax.swing.JLabel con_info_l;
    private javax.swing.JTextField country_tf;
    private javax.swing.JTextField cs1_tf;
    private javax.swing.JTextField cs2_tf;
    private javax.swing.JTextField cs3_tf;
    private javax.swing.JLabel cs_l;
    private javax.swing.JTextField date_of_birth_tf;
    private javax.swing.JButton delb;
    private javax.swing.JLabel education_l;
    private javax.swing.JTextField email_tf;
    private javax.swing.JButton exit_b1;
    private javax.swing.JTextField fax_tf;
    private javax.swing.JButton feed_btn;
    private javax.swing.JLabel footer_c;
    private javax.swing.JTextField gender_tf;
    private javax.swing.JButton generate_b;
    private javax.swing.JTextField i1_tf;
    private javax.swing.JTextField i2_tf;
    private javax.swing.JTextField i3_tf;
    private javax.swing.JTextField inter_date_tf;
    private javax.swing.JTextField inter_marks_tf;
    private javax.swing.JLabel interest_l;
    private javax.swing.JTextField intermidiate_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField job_title_tf;
    private javax.swing.JTextField lang1_tf;
    private javax.swing.JTextField lang2_tf;
    private javax.swing.JTextField lang3_tf;
    private javax.swing.JLabel language_l;
    private javax.swing.JTextField linkedin_tf;
    private javax.swing.JButton logout_b;
    private javax.swing.JTextField martial_tf;
    private javax.swing.JTextField master_tf;
    private javax.swing.JTextField matric_date_tf;
    private javax.swing.JTextField matric_marks_tf;
    private javax.swing.JTextField matric_tf;
    private javax.swing.JTextField msc_cgpa_tf;
    private javax.swing.JTextField msc_date_tf;
    private javax.swing.JTextField name_tf;
    private javax.swing.JTextField nationality_tf;
    private javax.swing.JTextField organization1_date_tf;
    private javax.swing.JTextField organization1_tf;
    private javax.swing.JTextField organization1_work_tf;
    private javax.swing.JTextField organization2_date_tf;
    private javax.swing.JTextField organization2_tf;
    private javax.swing.JTextField organization2_work_tf;
    private javax.swing.JTextField organization3_date_tf;
    private javax.swing.JTextField organization3_tf;
    private javax.swing.JTextField organization3_work_tf;
    private javax.swing.JTextField organization4_date_tf;
    private javax.swing.JTextField organization4_tf;
    private javax.swing.JTextField organization4_work_tf;
    private javax.swing.JLabel per_info_l;
    private javax.swing.JTextField phd_date_tf;
    private javax.swing.JTextField phd_marks_tf;
    private javax.swing.JTextField phd_tf;
    private javax.swing.JTextField phone_tf;
    private javax.swing.JButton photo_b;
    private javax.swing.JLabel preview_img;
    private javax.swing.JTextField r1_tf;
    private javax.swing.JTextField r2_tf;
    private javax.swing.JTextField r3_tf;
    private javax.swing.JLabel reference_tf;
    private javax.swing.JButton reset_b;
    private javax.swing.JTextField s1_tf;
    private javax.swing.JTextField s2_tf;
    private javax.swing.JTextField s3_tf;
    private javax.swing.JTextField s4_tf;
    private javax.swing.JTextField s5_tf;
    private javax.swing.JButton save_b;
    private javax.swing.JButton search_b;
    private javax.swing.JLabel search_l;
    private javax.swing.JTextField search_tf;
    private javax.swing.JLabel skills_l;
    private javax.swing.JTextField soft1_tf;
    private javax.swing.JTextField soft2_tf;
    private javax.swing.JTextField soft3_tf;
    private javax.swing.JLabel software_l;
    private javax.swing.JLabel temp1_l;
    private javax.swing.JRadioButton temp1_rb;
    private javax.swing.JLabel temp2_l;
    private javax.swing.JRadioButton temp2_rb;
    private javax.swing.JLabel temp3_l;
    private javax.swing.JRadioButton temp3_rb;
    private javax.swing.JTextField twitter_tf;
    private javax.swing.JLabel txt_filename;
    private javax.swing.JButton visit_b;
    private javax.swing.JTextField website_tf;
    private javax.swing.JLabel work_exp_l;
    // End of variables declaration//GEN-END:variables
}
