package GUI;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Emil
 */
public class WelcomeScreen extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    public WelcomeScreen() {

        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Menu = new javax.swing.JLabel();
        engBtn = new javax.swing.JButton();
        english = new javax.swing.JLabel();
        dkBtn = new javax.swing.JButton();
        danish = new javax.swing.JLabel();
        TwitterBtn = new javax.swing.JButton();
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        FacebookBtn = new javax.swing.JButton();
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        GoogleBtn = new javax.swing.JButton();
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        InstagramBtn = new javax.swing.JButton();
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        google = new javax.swing.JLabel();
        facebook = new javax.swing.JLabel();
        instagram = new javax.swing.JLabel();
        twitter = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        White = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(450, 700));
        setLayout(null);

        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setMaximumSize(new java.awt.Dimension(180, 70));
        jButton2.setMinimumSize(new java.awt.Dimension(180, 70));
        jButton2.setPreferredSize(new java.awt.Dimension(180, 70));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(20, 10, 180, 70);

        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setMaximumSize(new java.awt.Dimension(180, 70));
        jButton1.setMinimumSize(new java.awt.Dimension(180, 70));
        jButton1.setPreferredSize(new java.awt.Dimension(180, 70));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(20, 10, 180, 70);

        Menu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Emil Laptop\\Documents\\GitHub\\CTApp\\src\\Menu.png")); // NOI18N
        add(Menu);
        Menu.setBounds(16, 10, 180, 70);

        engBtn.setBorder(null);
        engBtn.setBorderPainted(false);
        engBtn.setContentAreaFilled(false);
        engBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        engBtn.setDefaultCapable(false);
        add(engBtn);
        engBtn.setBounds(270, 30, 70, 40);

        english.setIcon(new javax.swing.ImageIcon("C:\\Users\\Emil Laptop\\Documents\\GitHub\\CTApp\\src\\miniENG.png")); // NOI18N
        add(english);
        english.setBounds(270, 30, 70, 40);

        dkBtn.setBorderPainted(false);
        dkBtn.setContentAreaFilled(false);
        dkBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dkBtn.setDefaultCapable(false);
        add(dkBtn);
        dkBtn.setBounds(353, 30, 70, 40);

        danish.setIcon(new javax.swing.ImageIcon("C:\\Users\\Emil Laptop\\Documents\\GitHub\\CTApp\\src\\smallDK.png")); // NOI18N
        add(danish);
        danish.setBounds(354, 30, 70, 40);

        TwitterBtn.setBorder(null);
        TwitterBtn.setBorderPainted(false);
        TwitterBtn.setContentAreaFilled(false);
        TwitterBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(TwitterBtn);
        TwitterBtn.setBounds(130, 593, 70, 60);

        FacebookBtn.setBorder(null);
        FacebookBtn.setBorderPainted(false);
        FacebookBtn.setContentAreaFilled(false);
        FacebookBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FacebookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacebookBtnActionPerformed(evt);
            }
        });
        add(FacebookBtn);
        FacebookBtn.setBounds(30, 603, 60, 50);

        GoogleBtn.setBorder(null);
        GoogleBtn.setBorderPainted(false);
        GoogleBtn.setContentAreaFilled(false);
        GoogleBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GoogleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoogleBtnActionPerformed(evt);
            }
        });
        add(GoogleBtn);
        GoogleBtn.setBounds(242, 603, 70, 50);

        InstagramBtn.setBorder(null);
        InstagramBtn.setBorderPainted(false);
        InstagramBtn.setContentAreaFilled(false);
        InstagramBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(InstagramBtn);
        InstagramBtn.setBounds(340, 600, 92, 50);

        google.setIcon(new javax.swing.ImageIcon("C:\\Users\\Emil Laptop\\Documents\\GitHub\\CTApp\\src\\googleplus.png")); // NOI18N
        add(google);
        google.setBounds(250, 600, 60, 50);

        facebook.setIcon(new javax.swing.ImageIcon("C:\\Users\\Emil Laptop\\Documents\\GitHub\\CTApp\\src\\Facebook.PNG")); // NOI18N
        add(facebook);
        facebook.setBounds(30, 600, 70, 50);

        instagram.setIcon(new javax.swing.ImageIcon("C:\\Users\\Emil Laptop\\Documents\\GitHub\\CTApp\\src\\instagram.png")); // NOI18N
        add(instagram);
        instagram.setBounds(360, 600, 50, 50);

        twitter.setIcon(new javax.swing.ImageIcon("C:\\Users\\Emil Laptop\\Documents\\GitHub\\CTApp\\src\\Twitter.png")); // NOI18N
        add(twitter);
        twitter.setBounds(140, 600, 50, 50);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Emil Laptop\\Documents\\GitHub\\CTApp\\src\\Wunderground shadow.png")); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel2);
        jLabel2.setBounds(0, 130, 440, 260);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Emil Laptop\\Documents\\GitHub\\CTApp\\src\\Logo.png")); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 430, 440, 110);

        White.setIcon(new javax.swing.ImageIcon("C:\\Users\\Emil Laptop\\Documents\\GitHub\\CTApp\\src\\WhiteBGWS.png")); // NOI18N
        add(White);
        White.setBounds(16, 100, 440, 470);

        Background.setIcon(new javax.swing.ImageIcon("C:\\Users\\Emil Laptop\\Documents\\GitHub\\CTApp\\src\\Background.png")); // NOI18N
        add(Background);
        Background.setBounds(0, -10, 450, 710);
    }// </editor-fold>//GEN-END:initComponents

    private void GoogleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoogleBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GoogleBtnActionPerformed


    private void FacebookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacebookBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FacebookBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton FacebookBtn;
    private javax.swing.JButton GoogleBtn;
    private javax.swing.JButton InstagramBtn;
    private javax.swing.JLabel Menu;
    private javax.swing.JButton TwitterBtn;
    private javax.swing.JLabel White;
    private javax.swing.JLabel danish;
    private javax.swing.JButton dkBtn;
    private javax.swing.JButton engBtn;
    private javax.swing.JLabel english;
    private javax.swing.JLabel facebook;
    private javax.swing.JLabel google;
    private javax.swing.JLabel instagram;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel twitter;
    // End of variables declaration//GEN-END:variables

    public void addActionListenerMenu(ActionListener l) {
        jButton2.addActionListener(l);
    }

    public void ChangeLanguageDanish(ActionListener l) {
        dkBtn.addActionListener(l);
    }

    public void ChangeLanguageEnglish(ActionListener l) {
        engBtn.addActionListener(l);
    }
//hej
}
