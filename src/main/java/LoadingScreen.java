/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
public class LoadingScreen extends javax.swing.JFrame {


    public LoadingScreen() {
        initComponents();
    }

  public static class load{
       LoadingScreen LS;
       Login_choice lc;
         public void perform_loading(LoadingScreen LS, Login_choice lc) throws InterruptedException{
             this.LS = LS;
             this.lc = lc;
         for(int i=0;i<=100;i++){
            Thread.sleep(50);
            
            if(i==10){
                LS.PB.setValue(i);
                LS.per.setText(Integer.toString(i)+"%");
                LS.load.setText("Connecting Server...");
                
                
            }
            else if(i==30){
                LS.PB.setValue(i);
                LS.per.setText(Integer.toString(i)+"%");
                LS.load.setText("Setting Modules...");
            }
            else if(i==50){
                LS.PB.setValue(i);
                LS.per.setText(Integer.toString(i)+"%");
                LS.load.setText("Connecting Databases...");
            }
            else if(i==70){
                LS.PB.setValue(i);
                LS.per.setText(Integer.toString(i)+"%");
                LS.load.setText("Opening...");
            }
            else if(i==100){
                LS.PB.setValue(i);
                LS.per.setText(Integer.toString(i)+"%");
                LS.setVisible(false);
                lc.setVisible(true);
                
            }
            
        }
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        PB = new javax.swing.JProgressBar();
        load = new javax.swing.JLabel();
        per = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\LS1.gif")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Constantia", 3, 34)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Resume Building Application");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        PB.setForeground(new java.awt.Color(204, 153, 0));
        getContentPane().add(PB, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 470, 20));

        load.setFont(new java.awt.Font("SansSerif", 0, 21)); // NOI18N
        load.setForeground(new java.awt.Color(204, 255, 255));
        load.setText("Loading...");
        getContentPane().add(load, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, -1, -1));

        per.setFont(new java.awt.Font("SansSerif", 0, 21)); // NOI18N
        per.setForeground(new java.awt.Color(204, 255, 255));
        per.setText("0%");
        getContentPane().add(per, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 60, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\BSSE Semester 3\\Object Oriented Programming\\Java Language\\CV Building Application\\LS1.gif")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
       
         LoadingScreen LS = new LoadingScreen();
         LS.setVisible(true);
         Login_choice lc = new Login_choice();
         
         
        try{
            load ld = new load();
           ld.perform_loading(LS, lc);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar PB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel load;
    private javax.swing.JLabel per;
    // End of variables declaration//GEN-END:variables
}
