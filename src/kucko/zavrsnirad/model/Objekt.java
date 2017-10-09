/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucko.zavrsnirad.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Filip
 */
@Entity
@Table
public class Objekt extends Entitet implements Serializable {

    @ManyToOne
    private Korisnik korisnik;
    @ManyToOne
    private Iznajmljivac iznajmljivac;
    @ManyToOne
    private Svojstva svojstva;

    private String naziv;
    private double sirina;
    private double duzina;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getSirina() {
        return sirina;
    }

    public void setSirina(double sirina) {
        this.sirina = sirina;
    }

    public double getDuzina() {
        return duzina;
    }

    public void setDuzina(double duzina) {
        this.duzina = duzina;
    }

    @Transient
    private String slike;

    public String getSlike() {
        return slike;
    }

    public void setSlike(String slike) {
        this.slike = slike;
    }

    public String toString() {
        return getNaziv();
    }

}
