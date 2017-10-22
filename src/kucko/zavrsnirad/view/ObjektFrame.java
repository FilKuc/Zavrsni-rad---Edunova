/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucko.zavrsnirad.view;

import kucko.zavrsnirad.pomocno.Boje;

/**
 *
 * @author Filip
 */
public class ObjektFrame extends javax.swing.JFrame {

    /**
     * Creates new form ObjektFrame
     */
    public ObjektFrame() {
        initComponents();
        getContentPane().setBackground(Boje.farbe2);
        setTitle("Objekti");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNoviObjekt = new javax.swing.JToggleButton();
        btnPostojeciObjekt = new javax.swing.JToggleButton();
        btnPovratak = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNoviObjekt.setText("Novi Objekt");
        btnNoviObjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoviObjektActionPerformed(evt);
            }
        });

        btnPostojeciObjekt.setText("Postojeći objekti");
        btnPostojeciObjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostojeciObjektActionPerformed(evt);
            }
        });

        btnPovratak.setText("Povratak");
        btnPovratak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPovratakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnNoviObjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(btnPostojeciObjekt)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(btnPovratak, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNoviObjekt)
                    .addComponent(btnPostojeciObjekt))
                .addGap(35, 35, 35)
                .addComponent(btnPovratak)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPovratakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPovratakActionPerformed
        new Menu().setVisible(true);
        super.dispose();
    }//GEN-LAST:event_btnPovratakActionPerformed

    private void btnNoviObjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoviObjektActionPerformed
        new NoviObjektiFrame().setVisible(true);
        super.dispose();
    }//GEN-LAST:event_btnNoviObjektActionPerformed

    private void btnPostojeciObjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostojeciObjektActionPerformed
        new PostojeciObjektFrame().setVisible(true);
        super.dispose();
    }//GEN-LAST:event_btnPostojeciObjektActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnNoviObjekt;
    private javax.swing.JToggleButton btnPostojeciObjekt;
    private javax.swing.JToggleButton btnPovratak;
    // End of variables declaration//GEN-END:variables
}
