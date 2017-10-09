/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucko.zavrsnirad.view;

import java.util.List;
import kucko.zavrsnirad.pomocno.HibUtil;
import kucko.zavrsnirad.model.Svojstva;

/**
 *
 * @author Filip
 */
public class NoviObjektSvojstvaFrame extends Forma<Svojstva> {

    private List<Svojstva> rezultati;
    
    public NoviObjektSvojstvaFrame() {
        initComponents();
    }
    
    @Override
   protected void ucitaj(){
       rezultati = HibUtil.getSession().createQuery("from Svojstva a where a.obrisan=false").list();
   }
   
   @Override
   protected void spremi(){
       entitet.setHotel(boxHotel.isSelected());
       entitet.setApartman(boxApartman.isSelected());
       entitet.setKlimaUredaj(boxKlima.isSelected());
       entitet.setTvUredaj(boxTV.isSelected());
       entitet.setBalkon(boxBalkon.isSelected());
       entitet.setWifi(boxWifi.isSelected());
       super.spremi();
   }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        boxHotel = new javax.swing.JCheckBox();
        boxApartman = new javax.swing.JCheckBox();
        boxKlima = new javax.swing.JCheckBox();
        boxTV = new javax.swing.JCheckBox();
        boxBalkon = new javax.swing.JCheckBox();
        boxWifi = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnNastavak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Unesite svojstva objekta");

        jLabel2.setText("Hotel");

        jLabel3.setText("Apartman");

        jLabel4.setText("Klima Uređaj");

        jLabel5.setText("TV Uređaj");

        jLabel6.setText("Balkon");

        jLabel7.setText("Wifi");

        btnNastavak.setText("Nastavak");
        btnNastavak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNastavakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNastavak)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boxApartman)
                            .addComponent(boxHotel)
                            .addComponent(boxKlima)
                            .addComponent(boxTV)
                            .addComponent(boxBalkon)
                            .addComponent(boxWifi))))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxHotel)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxApartman)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxKlima)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxTV)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxBalkon)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxWifi)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(btnNastavak)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        boxHotel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNastavakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNastavakActionPerformed
        new NoviObjektSlikeFrame().setVisible(true);
        super.dispose();
    }//GEN-LAST:event_btnNastavakActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxApartman;
    private javax.swing.JCheckBox boxBalkon;
    private javax.swing.JCheckBox boxHotel;
    private javax.swing.JCheckBox boxKlima;
    private javax.swing.JCheckBox boxTV;
    private javax.swing.JCheckBox boxWifi;
    private javax.swing.JButton btnNastavak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
