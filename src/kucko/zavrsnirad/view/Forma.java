/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucko.zavrsnirad.view;

import javax.swing.JFrame;
import kucko.zavrsnirad.controller.HibObrada;
import kucko.zavrsnirad.model.Entitet;

/**
 *
 * @author Filip
 */
public abstract class Forma<T extends Entitet> extends JFrame{
    
    protected abstract void ucitaj();
    
    protected HibObrada<T> obrada;
    protected T entitet;
   

    
    protected void obrisi(){
        obrada.delete(entitet);
        ucitaj();
    }
    
    protected  void spremi(){
        entitet=obrada.save(entitet);
        ucitaj();
    }
    
}
