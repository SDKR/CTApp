/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.InfoMenu;

import java.awt.event.ActionListener;

/**
 *
 * @author ejer
 */
public class TheOldStockExchangeInformation extends javax.swing.JPanel {

    /**
     * Creates new form TheOldStockExchange
     */
    public TheOldStockExchangeInformation() {
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

        ShowOnMapBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        Titel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        setTextPaneTOSEI = new javax.swing.JTextPane();

        ShowOnMapBtn.setText("Show on map");
        ShowOnMapBtn.setMaximumSize(new java.awt.Dimension(185, 23));
        ShowOnMapBtn.setMinimumSize(new java.awt.Dimension(185, 23));
        ShowOnMapBtn.setPreferredSize(new java.awt.Dimension(185, 23));
        ShowOnMapBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowOnMapBtnActionPerformed(evt);
            }
        });

        BackBtn.setText("Back");
        BackBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        Titel.setText("The Old Stock Exchange");

        jLabel2.setText("Picture");

        jScrollPane1.setViewportView(setTextPaneTOSEI);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Titel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ShowOnMapBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(195, 195, 195)
                                    .addComponent(jLabel2))))
                        .addGap(0, 150, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titel)
                .addGap(87, 87, 87)
                .addComponent(jLabel2)
                .addGap(139, 139, 139)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowOnMapBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ShowOnMapBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowOnMapBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShowOnMapBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackBtnActionPerformed

    public void addActionListenerMenu(ActionListener l) {
        BackBtn.addActionListener(l);
    }

    public void addActionListenerShowOnMap(ActionListener l) {
        ShowOnMapBtn.addActionListener(l);
    }

    public void setTextPaneTOSEI(String text) {
        setTextPaneTOSEI.setText(text);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton ShowOnMapBtn;
    private javax.swing.JLabel Titel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane setTextPaneTOSEI;
    // End of variables declaration//GEN-END:variables
}