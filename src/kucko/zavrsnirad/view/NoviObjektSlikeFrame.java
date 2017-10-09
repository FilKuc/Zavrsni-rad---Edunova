/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucko.zavrsnirad.view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import kucko.zavrsnirad.pomocno.Slike;
import kucko.zavrsnirad.model.Objekt;
import kucko.zavrsnirad.pomocno.HibUtil;

/**
 *
 * @author Filip
 */
public class NoviObjektSlikeFrame extends Forma<Objekt> {

     private List<Objekt> rezultati;
     
    public NoviObjektSlikeFrame() {
        initComponents();
    }

    @Override
    protected void ucitaj() {
        rezultati = HibUtil.getSession().createQuery("from Polaznik a where a.obrisan=false").list();
       
    }
    
    @Override
   protected void spremi(){
       
       super.spremi();
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnZavrsi = new javax.swing.JButton();
        lblSlike = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Unesite slike objekta");

        btnZavrsi.setText("Zavrsi");
        btnZavrsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZavrsiActionPerformed(evt);
            }
        });

        lblSlike.setText("UPLOAD");
        lblSlike.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSlikeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnZavrsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblSlike, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(lblSlike, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnZavrsi)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnZavrsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZavrsiActionPerformed
      JOptionPane.showConfirmDialog(null,
                "Uspješno ste dodali objekt",
                "Potvrda",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE);
        new PostojeciObjektFrame().setVisible(true);
       super.dispose();
    }//GEN-LAST:event_btnZavrsiActionPerformed

    private void lblSlikeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSlikeMouseClicked
        BufferedImage slika = Slike.dohvatiSliku();
        if (slika == null) {
            return;
        }

        File outputfile = new File("slike" + File.separator + "objekt" + File.separator
                + entitet.getSifra() + ".png");
        try {
            ImageIO.write(slika, "png", outputfile);
             postaviSLiku();
        } catch (IOException ex) {

        }
    }//GEN-LAST:event_lblSlikeMouseClicked

    private void postaviSLiku() {
       String putanjaSLika = "slike" + File.separator + "polaznici" + File.separator
                    + entitet.getSifra() + ".png";
            File slika = new File(putanjaSLika);
            BufferedImage img = null;
            if (slika.exists()) {

                try {
                    img = ImageIO.read(slika);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else {
                try {
                    img = ImageIO.read(new File("slike" + File.separator + "nepoznato.png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            Image dimg = img.getScaledInstance(lblSlike.getWidth(), lblSlike.getHeight(),
                    Image.SCALE_SMOOTH);

            lblSlike.setIcon(new ImageIcon(dimg));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnZavrsi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblSlike;
    // End of variables declaration//GEN-END:variables
}
