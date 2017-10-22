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
public class Svojstva extends Entitet implements Serializable{
    
    private boolean hotel;
    private boolean apartman;
    private boolean klimaUredaj;
    private boolean balkon;
    private boolean tvUredaj;
    private boolean wifi;
    
    

    public boolean isHotel() {
        return hotel;
    }

    public void setHotel(boolean hotel) {
        this.hotel = hotel;
    }

    public boolean isApartman() {
        return apartman;
    }

    public void setApartman(boolean apartman) {
        this.apartman = apartman;
    }

    public boolean isKlimaUredaj() {
        return klimaUredaj;
    }

    public void setKlimaUredaj(boolean klimaUredaj) {
        this.klimaUredaj = klimaUredaj;
    }

    public boolean isBalkon() {
        return balkon;
    }

    public void setBalkon(boolean balkon) {
        this.balkon = balkon;
    }

    public boolean isTvUredaj() {
        return tvUredaj;
    }

    public void setTvUredaj(boolean tvUredaj) {
        this.tvUredaj = tvUredaj;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
}
