/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucko.zavrsnirad;

import kucko.zavrsnirad.controller.HibObrada;
import kucko.zavrsnirad.model.Korisnik;



/**
 *
 * @author Filip
 */
public class Podaci {
    
    public static void main(String[] args) {
        
        HibObrada<Korisnik> kor = new HibObrada<>();
        Korisnik k = new Korisnik();
        
        k.setIme("Ivo");
        k.setPrezime("Ivić");
        
        kor.save(k);
        
        Korisnik k1 = new Korisnik();
        k1.setIme("Karlo");
        k1.setPrezime("Karlovski");
        kor.save(k1);
        
        
    }
    
}
