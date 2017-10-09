/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucko.zavrsnirad.view;

import java.util.List;
import javax.swing.DefaultListModel;
import kucko.zavrsnirad.controller.HibObrada;
import kucko.zavrsnirad.model.Objekt;
import kucko.zavrsnirad.pomocno.HibUtil;

/**
 *
 * @author Filip
 */
public class PostojeciObjektFrame extends Forma<Objekt> {

    private List<Objekt> rezultati;
    
    public PostojeciObjektFrame() {
        initComponents();
        obrada = new HibObrada();
        ucitaj();
    }

    @Override
    protected void ucitaj() {
        rezultati = HibUtil.getSession().createQuery("from Objekt a where a.obrisan=false").list();
        ucitavanje();
    }
    
    private void ucitavanje(){
       DefaultListModel<Objekt> f = new DefaultListModel<>();
       lstObjekt.setModel(f);
       rezultati.forEach((s) -> {
            f.addElement(s);
        });
       
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstObjekt = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lstObjekt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Objekt> lstObjekt;
    // End of variables declaration//GEN-END:variables
}
