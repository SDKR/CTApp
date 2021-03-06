/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.InfoMenu;

import java.awt.event.ActionListener;
import javax.swing.JTextPane;

/**
 *
 * @author Emil Laptop
 */
public class OperaInformation extends javax.swing.JPanel {

    /**
     * Creates new form OperaInformation
     */
    public OperaInformation() {
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

        Titel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        ShowOnMapBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextPane = new javax.swing.JTextPane();

        Titel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Titel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titel.setText("The Royal Danish Opera");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OperaBig.png"))); // NOI18N

        BackBtn.setText("Back");
        BackBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        ShowOnMapBtn.setText("Show on map");
        ShowOnMapBtn.setMaximumSize(new java.awt.Dimension(185, 23));
        ShowOnMapBtn.setMinimumSize(new java.awt.Dimension(185, 23));
        ShowOnMapBtn.setPreferredSize(new java.awt.Dimension(185, 23));
        ShowOnMapBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowOnMapBtnActionPerformed(evt);
            }
        });

        TextPane.setEditable(false);
        jScrollPane1.setViewportView(TextPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ShowOnMapBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BackBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(ShowOnMapBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackBtnActionPerformed

    private void ShowOnMapBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowOnMapBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShowOnMapBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton ShowOnMapBtn;
    private javax.swing.JTextPane TextPane;
    private javax.swing.JLabel Titel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void addActionListenerMenu(ActionListener l) {
        BackBtn.addActionListener(l);
    }
    
    public void addActionListenerShowOnMap(ActionListener l) {
        ShowOnMapBtn.addActionListener(l);
    }

    public void setTextPaneOI(String text) {
        TextPane.setText(text);
    }
    
        public void getBackBtn(String text) {
        BackBtn.setText(text);
    }

    public void getShowOnMapBtn(String text) {
        ShowOnMapBtn.setText(text);
    }

    public void getjLabel1(String text) {
        Titel.setText(text);
    }

}
