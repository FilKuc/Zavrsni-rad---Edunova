/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucko.zavrsnirad.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Filip
 */
@Entity
@Table
public class Iznajmljivac extends Entitet implements Serializable{

    private String ime;
    private String prezime;
    private String oib;
    private String email;
    private String telBroj;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelBroj() {
        return telBroj;
    }

    public void setTelBroj(String telBroj) {
        this.telBroj = telBroj;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }
    
    @Override
    public String toString() {
        return getIme() + " " + getPrezime();
    }
            
}
