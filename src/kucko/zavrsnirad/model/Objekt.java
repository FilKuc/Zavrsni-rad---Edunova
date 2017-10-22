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
    @ManyToOne
    private Mjesto mjesto;
    @ManyToOne
    private Rezervacija rezervacija;

    private String naziv;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Transient
    private String slike;

    public String getSlike() {
        return slike;
    }

    public void setSlike(String slike) {
        this.slike = slike;
    }

    @Override
    public String toString() {
        return getNaziv();
    }

    public Mjesto getMjesto() {
        return mjesto;
    }

    public void setMjesto(Mjesto mjesto) {
        this.mjesto = mjesto;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public Iznajmljivac getIznajmljivac() {
        return iznajmljivac;
    }

    public void setIznajmljivac(Iznajmljivac iznajmljivac) {
        this.iznajmljivac = iznajmljivac;
    }

    public Svojstva getSvojstva() {
        return svojstva;
    }

    public void setSvojstva(Svojstva svojstva) {
        this.svojstva = svojstva;
    }

    public Rezervacija getRezervacija() {
        return rezervacija;
    }

    public void setRezervacija(Rezervacija rezervacija) {
        this.rezervacija = rezervacija;
    }

}
