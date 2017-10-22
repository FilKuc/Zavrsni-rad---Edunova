/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucko.zavrsnirad.view;

import com.github.lgooddatepicker.components.CalendarPanel;
import com.github.lgooddatepicker.components.DatePicker;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.Month;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.YearMonth;
import java.util.List;
import java.util.Locale;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import kucko.zavrsnirad.controller.HibObrada;
import kucko.zavrsnirad.model.Objekt;
import kucko.zavrsnirad.pomocno.HibUtil;
import kucko.zavrsnirad.model.Mjesto;
import org.apache.poi.ss.formula.functions.Today;

/**
 *
 * @author Filip
 */
public class PostojeciObjektFrame extends Forma<Objekt> {

    private List<Objekt> rezultati;
    private DatePicker biraj;
    private CalendarPanel panel;
    
    public PostojeciObjektFrame() {
        initComponents();
        obrada = new HibObrada();
        ucitaj();
        rezervacija();
        setTitle("Objekti");
       
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
        txtZupanija = new javax.swing.JTextField();
        txtMjesto = new javax.swing.JTextField();
        txtAdresa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblHotelDa = new javax.swing.JLabel();
        lblKlimaDa = new javax.swing.JLabel();
        lblKlimaNe = new javax.swing.JLabel();
        lblApartmanDa = new javax.swing.JLabel();
        lblApartmanNe = new javax.swing.JLabel();
        lblHotelNe = new javax.swing.JLabel();
        lblTvDa = new javax.swing.JLabel();
        lblTvNe = new javax.swing.JLabel();
        lblBalkonDa = new javax.swing.JLabel();
        lblBalkonNe = new javax.swing.JLabel();
        lblWifiDa = new javax.swing.JLabel();
        lblWifiNe = new javax.swing.JLabel();
        pnlRezervacija = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblSlika = new javax.swing.JLabel();
        btnPovratak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstObjekt.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstObjektValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstObjekt);

        jLabel1.setText("Zupanija");

        jLabel2.setText("Mjesto");

        jLabel3.setText("Adresa");

        jLabel4.setText("Apartman");

        jLabel5.setText("Hotel");

        jLabel6.setText("Klima Uređaj");

        jLabel7.setText("TV Uređaj");

        jLabel8.setText("Balkon");

        jLabel9.setText("Wifi");

        lblHotelDa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHotelDa.setText("DA");

        lblKlimaDa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblKlimaDa.setText("Ima");

        lblKlimaNe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblKlimaNe.setText("Nema");

        lblApartmanDa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblApartmanDa.setText("DA");

        lblApartmanNe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblApartmanNe.setText("NE");

        lblHotelNe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHotelNe.setText("NE");

        lblTvDa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTvDa.setText("Ima");

        lblTvNe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTvNe.setText("Nema");

        lblBalkonDa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBalkonDa.setText("Ima");

        lblBalkonNe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBalkonNe.setText("Nema");

        lblWifiDa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblWifiDa.setText("Ima");

        lblWifiNe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblWifiNe.setText("Nema");

        javax.swing.GroupLayout pnlRezervacijaLayout = new javax.swing.GroupLayout(pnlRezervacija);
        pnlRezervacija.setLayout(pnlRezervacijaLayout);
        pnlRezervacijaLayout.setHorizontalGroup(
            pnlRezervacijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );
        pnlRezervacijaLayout.setVerticalGroup(
            pnlRezervacijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
        );

        jLabel10.setText("Objekti");

        jLabel11.setText("Lokacija");

        jLabel12.setText("Svojstva");

        lblSlika.setBackground(new java.awt.Color(255, 255, 255));

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
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(btnPovratak))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(txtZupanija, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAdresa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMjesto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(lblSlika, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblHotelDa, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblApartmanDa, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(lblKlimaDa)
                                    .addComponent(lblTvDa)
                                    .addComponent(lblBalkonDa)
                                    .addComponent(lblWifiDa))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblWifiNe)
                                    .addComponent(lblBalkonNe)
                                    .addComponent(lblTvNe)
                                    .addComponent(lblKlimaNe)
                                    .addComponent(lblApartmanNe)
                                    .addComponent(lblHotelNe))
                                .addContainerGap(43, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(pnlRezervacija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblHotelDa)
                            .addComponent(lblHotelNe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApartmanDa)
                            .addComponent(lblApartmanNe)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblKlimaDa)
                            .addComponent(lblKlimaNe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblTvDa)
                            .addComponent(lblTvNe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblBalkonDa)
                            .addComponent(lblBalkonNe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblWifiDa)
                                .addComponent(lblWifiNe))
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel12)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtZupanija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMjesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(15, 15, 15)
                                .addComponent(lblSlika, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addComponent(pnlRezervacija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(btnPovratak)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstObjektValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstObjektValueChanged
        
         if (evt.getValueIsAdjusting()) {
            return;
        }
        
        try{
           this.entitet = lstObjekt.getSelectedValue();
           this.txtZupanija.setText(entitet.getMjesto().getZupanija());
            this.txtMjesto.setText(entitet.getMjesto().getMjesto());
            this.txtAdresa.setText(entitet.getMjesto().getAdresa());
 
            this.lblHotelDa.setVisible(entitet.getSvojstva().isHotel());
            this.lblHotelNe.setVisible(entitet.getSvojstva().isHotel() == false);
            this.lblApartmanDa.setVisible(entitet.getSvojstva().isApartman());
            this.lblApartmanNe.setVisible(entitet.getSvojstva().isApartman() == false);
            this.lblKlimaDa.setVisible(entitet.getSvojstva().isKlimaUredaj());
            this.lblKlimaNe.setVisible(entitet.getSvojstva().isKlimaUredaj() == false);
            this.lblTvDa.setVisible(entitet.getSvojstva().isTvUredaj());
            this.lblTvNe.setVisible(entitet.getSvojstva().isTvUredaj() == false);
            this.lblBalkonDa.setVisible(entitet.getSvojstva().isBalkon());
            this.lblBalkonNe.setVisible(entitet.getSvojstva().isBalkon() == false);
            this.lblWifiDa.setVisible(entitet.getSvojstva().isWifi());
            this.lblWifiNe.setVisible(entitet.getSvojstva().isWifi() == false);
           
            LocalDate datum = entitet.getRezervacija().getDatumPocetka().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); 
            panel.setSelectedDate(datum);
            biraj.setDate(datum);
            
       }catch (Exception e){
           e.printStackTrace();
       }
        
        postaviSLiku();
    }//GEN-LAST:event_lstObjektValueChanged

    private void btnPovratakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPovratakActionPerformed
        new ObjektFrame().setVisible(true);
        super.dispose();
    }//GEN-LAST:event_btnPovratakActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPovratak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApartmanDa;
    private javax.swing.JLabel lblApartmanNe;
    private javax.swing.JLabel lblBalkonDa;
    private javax.swing.JLabel lblBalkonNe;
    private javax.swing.JLabel lblHotelDa;
    private javax.swing.JLabel lblHotelNe;
    private javax.swing.JLabel lblKlimaDa;
    private javax.swing.JLabel lblKlimaNe;
    private javax.swing.JLabel lblSlika;
    private javax.swing.JLabel lblTvDa;
    private javax.swing.JLabel lblTvNe;
    private javax.swing.JLabel lblWifiDa;
    private javax.swing.JLabel lblWifiNe;
    private javax.swing.JList<Objekt> lstObjekt;
    private javax.swing.JPanel pnlRezervacija;
    private javax.swing.JTextField txtAdresa;
    private javax.swing.JTextField txtMjesto;
    private javax.swing.JTextField txtZupanija;
    // End of variables declaration//GEN-END:variables
    
    
    private void postaviSLiku() {
       String putanjaSLika = "Slike" + File.separator + "Objekti" + File.separator
                    + entitet.getNaziv() + ".jpg";
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
                    img = ImageIO.read(new File("slike" + File.separator + "unknown.jpg"));
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            Image dimg = img.getScaledInstance(lblSlika.getWidth(), lblSlika.getHeight(),
                    Image.SCALE_SMOOTH);

            lblSlika.setIcon(new ImageIcon(dimg));
    }

    private void rezervacija() {

        biraj = new DatePicker();
        biraj.setLocale(new Locale("hr"));
        panel = new CalendarPanel(biraj);
        pnlRezervacija.add(panel);
        panel.setSize(pnlRezervacija.getSize());
    }
    

}


