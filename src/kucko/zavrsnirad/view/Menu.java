/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucko.zavrsnirad.view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Filip
 */
public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKorisnik = new javax.swing.JButton();
        btnIznajmljivac = new javax.swing.JButton();
        btnObjekt = new javax.swing.JButton();
        lblGitHub = new javax.swing.JLabel();
        btnRezervacija = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnKorisnik.setText("Korisnik");
        btnKorisnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKorisnikActionPerformed(evt);
            }
        });

        btnIznajmljivac.setText("Iznajmljivac");
        btnIznajmljivac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIznajmljivacActionPerformed(evt);
            }
        });

        btnObjekt.setText("Objekt");
        btnObjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObjektActionPerformed(evt);
            }
        });

        lblGitHub.setText("GitHub");
        lblGitHub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGitHubMouseClicked(evt);
            }
        });

        btnRezervacija.setText("Rezervacija");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGitHub)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnKorisnik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIznajmljivac, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(btnObjekt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRezervacija, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnKorisnik)
                .addGap(27, 27, 27)
                .addComponent(btnIznajmljivac)
                .addGap(31, 31, 31)
                .addComponent(btnObjekt)
                .addGap(30, 30, 30)
                .addComponent(btnRezervacija)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(lblGitHub)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKorisnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKorisnikActionPerformed
        new KorisnikFrame().setVisible(true);
        super.dispose();
    }//GEN-LAST:event_btnKorisnikActionPerformed

    private void lblGitHubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGitHubMouseClicked
        try {
            Runtime.getRuntime().exec("cmd /c start https://github.com/FilKuc ");
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblGitHubMouseClicked

    private void btnIznajmljivacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIznajmljivacActionPerformed
       new IznjmljivacFrame().setVisible(true);
       super.dispose();
    }//GEN-LAST:event_btnIznajmljivacActionPerformed

    private void btnObjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObjektActionPerformed
       new ObjektFrame().setVisible(true);
       super.dispose();
    }//GEN-LAST:event_btnObjektActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIznajmljivac;
    private javax.swing.JButton btnKorisnik;
    private javax.swing.JButton btnObjekt;
    private javax.swing.JButton btnRezervacija;
    private javax.swing.JLabel lblGitHub;
    // End of variables declaration//GEN-END:variables
}
