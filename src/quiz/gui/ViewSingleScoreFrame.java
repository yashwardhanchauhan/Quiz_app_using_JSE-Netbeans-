/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import quiz.dao.PerformanceDao;
import quiz.pojo.StudentScore;
import quiz.pojo.UserPojo;
import quiz.pojo.UserProfile;

/**
 *
 * @author admin
 */
public class ViewSingleScoreFrame extends javax.swing.JFrame {

    /**
     * Creates new form ViewSingleScoreFrame
     */
   
    
    public ViewSingleScoreFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblUsername.setText("Hello "+UserProfile.getUsername());
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcStudentId = new javax.swing.JComboBox<>();
        jcExamId = new javax.swing.JComboBox<>();
        txtLanguage = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPercentage = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblUsername.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 153, 51));

        lblLogout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 153, 51));
        lblLogout.setText("LOGOUT");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("SINGLE STUDENT SCORE PANEL");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\TECH-QUIZ-APP\\TECH QUIZ APP\\onlineexam\\examicon.png")); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 51));
        jLabel4.setText("Student Scores Details");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Select Student");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Select Exam Id");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Language");

        jcStudentId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jcStudentId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcStudentIdItemStateChanged(evt);
            }
        });

        jcExamId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcExamIdItemStateChanged(evt);
            }
        });
        jcExamId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcExamIdActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Percentage");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(99, 99, 99)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcStudentId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcExamId, 0, 100, Short.MAX_VALUE)
                                    .addComponent(txtLanguage)
                                    .addComponent(txtPercentage)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(201, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcExamId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(82, 82, 82)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcExamIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcExamIdItemStateChanged
      if(evt.getStateChange()==ItemEvent.DESELECTED)
          return;
      String studentid=jcStudentId.getSelectedItem().toString();
      String examid=jcExamId.getSelectedItem().toString();
      try
      {
          StudentScore scoreObj=PerformanceDao.getScore(studentid, examid);
          txtLanguage.setText(scoreObj.getLanguage());
          txtPercentage.setText(String.valueOf(scoreObj.getPer()));
      }
      catch(SQLException e)
      {
          e.printStackTrace();
          JOptionPane.showMessageDialog(null,"Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE);
          
      }


    }//GEN-LAST:event_jcExamIdItemStateChanged

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        LoginFrame opFrame=new LoginFrame();
       opFrame.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        // TODO add your handling code here:
        lblLogout.setForeground(Color.WHITE);
        Font f=new Font("Tahoma",Font.ITALIC,12);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        // TODO add your handling code here:
         lblLogout.setForeground(new Color(255,153,0));
        Font f=new Font("Tahoma",Font.BOLD,12);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void jcExamIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcExamIdActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_jcExamIdActionPerformed

    private void jcStudentIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcStudentIdItemStateChanged
        if(evt.getStateChange()==ItemEvent.DESELECTED)
        return;
        String studentid=jcStudentId.getSelectedItem().toString();
        try
        {
            ArrayList<String> examidlist=PerformanceDao.getAllExamId(studentid);
            jcExamId.removeAllItems();
            for(String exid:examidlist)
            jcExamId.addItem(exid);
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Error while  connnecting to  DataBase! ","Exception!",JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jcStudentIdItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        ViewScoresFrame v=new ViewScoresFrame();
        v.setVisible(true);
        this.dispose();
        
        
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
            java.util.logging.Logger.getLogger(ViewSingleScoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSingleScoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSingleScoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSingleScoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSingleScoreFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcExamId;
    private javax.swing.JComboBox<String> jcStudentId;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtLanguage;
    private javax.swing.JTextField txtPercentage;
    // End of variables declaration//GEN-END:variables
    public void loadStudentId() throws SQLException
    {
       try
     {
           
       
        ArrayList<String> studentlist=PerformanceDao.getAllStudentId();
       if(studentlist.isEmpty()==true)
       {
           JOptionPane.showMessageDialog(null, "NO Student has yet appeared for the exam","ERROR!", JOptionPane.ERROR_MESSAGE);
           return;
       }
        else
       {
           jcStudentId.removeAllItems();
           for(String sid:studentlist)
               jcStudentId.addItem(sid);
       }
        
           
        
     }
      catch(SQLException ex)
        {
             ex.printStackTrace();
             JOptionPane.showMessageDialog(null,"Error while  connnecting to  DataBase! ","Exception!",JOptionPane.ERROR_MESSAGE);
        }
    }





}