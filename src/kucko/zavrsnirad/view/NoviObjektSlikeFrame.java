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
        lblSlike.setOpaque(true);
        setTitle("Novi Objekt");
    }

    @Override
    protected void ucitaj() {
        rezultati = HibUtil.getSession().createQuery("from Objekt a where a.obrisan=false").list();
       
    }
    
    @Override
   protected void spremi(){
       entitet.setNaziv(txtNaziv.getText());
       super.spremi();
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnZavrsi = new javax.swing.JButton();
        lblSlike = new javax.swing.JLabel();
        lblSlike2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Unesite slike objekta");

        btnZavrsi.setText("Zavrsi");
        btnZavrsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZavrsiActionPerformed(evt);
            }
        });

        lblSlike.setBackground(new java.awt.Color(255, 255, 255));
        lblSlike.setForeground(new java.awt.Color(153, 0, 0));
        lblSlike.setText("           UPLOAD");
        lblSlike.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSlikeMouseClicked(evt);
            }
        });

        jLabel2.setText("Naziv Objekta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(72, 72, 72)
                        .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSlike, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSlike2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnZavrsi, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lblSlike2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblSlike, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addComponent(btnZavrsi)
                .addGap(21, 21, 21))
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
                + entitet.getSifra() + ".jpg");
        try {
            ImageIO.write(slika, "jpg", outputfile);
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

            Image dimg = img.getScaledInstance(lblSlike2.getWidth(), lblSlike2.getHeight(),
                    Image.SCALE_SMOOTH);

            lblSlike2.setIcon(new ImageIcon(dimg));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnZavrsi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblSlike;
    private javax.swing.JLabel lblSlike2;
    private javax.swing.JTextField txtNaziv;
    // End of variables declaration//GEN-END:variables
}
