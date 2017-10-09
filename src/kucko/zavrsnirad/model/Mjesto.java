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
public class Mjesto extends Entitet implements Serializable{
    
    private String naselje;
    private String opcina;
    private String zupanija;

    public String getNaselje() {
        return naselje;
    }

    public void setNaselje(String naselje) {
        this.naselje = naselje;
    }

    public String getOpcina() {
        return opcina;
    }

    public void setOpcina(String opcina) {
        this.opcina = opcina;
    }

    public String getZupanija() {
        return zupanija;
    }

    public void setZupanija(String zupanija) {
        this.zupanija = zupanija;
    }
    
    
    
}
