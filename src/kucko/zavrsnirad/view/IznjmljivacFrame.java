/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucko.zavrsnirad.view;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import kucko.zavrsnirad.controller.HibObrada;
import kucko.zavrsnirad.model.Iznajmljivac;
import kucko.zavrsnirad.pomocno.HibUtil;

/**
 *
 * @author Filip
 */
public class IznjmljivacFrame extends Forma<Iznajmljivac> {

    private List<Iznajmljivac> rezultati;
    
    public IznjmljivacFrame() {
        initComponents();
        obrada = new HibObrada();
        ucitaj();
    }
    
    @Override
   protected void ucitaj(){
       rezultati = HibUtil.getSession().createQuery("from Iznajmljivac a where a.obrisan=false").list();
       ucitavanje();
   }
   
   private void ucitavanje(){
       DefaultListModel<Iznajmljivac> f = new DefaultListModel<>();
       lstIznajmljivac.setModel(f);
       rezultati.forEach((s) -> {
            f.addElement(s);
        });
       
   }
   
   @Override
   protected void spremi(){
       entitet.setIme(txtIme.getText());
       entitet.setPrezime(txtPrezime.getText());
       entitet.setOib(txtOIB.getText());
       entitet.setEmail(txtEMail.getText());
       super.spremi();
   }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIme = new javax.swing.JTextField();
        txtPrezime = new javax.swing.JTextField();
        txtOIB = new javax.swing.JTextField();
        txtEMail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstIznajmljivac = new javax.swing.JList<>();
        btnUnos = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObisi = new javax.swing.JButton();
        btnPovratak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ime");

        jLabel2.setText("Prezime");

        jLabel3.setText("OIB");

        jLabel4.setText("E-Mail");

        lstIznajmljivac.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstIznajmljivacValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstIznajmljivac);

        btnUnos.setText("Unos");
        btnUnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnosActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObisi.setText("Obrisi");
        btnObisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObisiActionPerformed(evt);
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
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(btnUnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnObisi, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEMail)
                    .addComponent(txtOIB)
                    .addComponent(txtPrezime)
                    .addComponent(txtIme)
                    .addComponent(btnPromjeni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPovratak, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtOIB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUnos)
                            .addComponent(btnPromjeni))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnObisi)
                            .addComponent(btnPovratak))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstIznajmljivacValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstIznajmljivacValueChanged
        
        if (evt.getValueIsAdjusting()) {
            return;
        }
        
        try{
            this.entitet = lstIznajmljivac.getSelectedValue();
            this.txtIme.setText(entitet.getIme());
            this.txtPrezime.setText(entitet.getPrezime());
            this.txtEMail.setText(entitet.getEmail());
            this.txtOIB.setText(entitet.getOib());
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_lstIznajmljivacValueChanged

    private void btnPovratakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPovratakActionPerformed
        new Menu().setVisible(true);
        super.dispose();
    }//GEN-LAST:event_btnPovratakActionPerformed

    private void btnUnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnosActionPerformed
        entitet = new Iznajmljivac();
        spremi();
    }//GEN-LAST:event_btnUnosActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        if(lstIznajmljivac.getSelectedValue() == null){
            JOptionPane.showConfirmDialog(rootPane, "Molimo vas da prvo odaberete iznajmljivaca");
            spremi();
        }
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObisiActionPerformed
        if(lstIznajmljivac.getSelectedValue() == null){
            JOptionPane.showConfirmDialog(rootPane, "Molimo vas da prvo odaberete iznajmljivaca");
            obrisi();
        }
    }//GEN-LAST:event_btnObisiActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnObisi;
    private javax.swing.JButton btnPovratak;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JButton btnUnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Iznajmljivac> lstIznajmljivac;
    private javax.swing.JTextField txtEMail;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtOIB;
    private javax.swing.JTextField txtPrezime;
    // End of variables declaration//GEN-END:variables
}
