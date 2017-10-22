/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucko.zavrsnirad.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Filip
 */
@Entity
@Table
public class Mjesto extends Entitet implements Serializable{
    
    private String adresa;
    private String zupanija;
    private String mjesto;
   

    @OneToMany
    private List<Objekt> objekti;

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getZupanija() {
        return zupanija;
    }

    public void setZupanija(String zupanija) {
        this.zupanija = zupanija;
    }

    public String getMjesto() {
        return mjesto;
    }

    public void setMjesto(String mjesto) {
        this.mjesto = mjesto;
    }

    public List<Objekt> getObjekti() {
        return objekti;
    }

    public void setObjekti(List<Objekt> objekti) {
        this.objekti = objekti;
    }
    
    
    
    
}
