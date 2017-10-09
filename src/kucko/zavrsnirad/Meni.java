/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucko.zavrsnirad;


import kucko.zavrsnirad.pomocno.HibUtil;
import kucko.zavrsnirad.view.Menu;

/**
 *
 * @author Filip
 */
public class Meni {
    
        public static void main(String[] args) {
        new Menu().setVisible(true);
        HibUtil.getSession();
        
    }
    
}
