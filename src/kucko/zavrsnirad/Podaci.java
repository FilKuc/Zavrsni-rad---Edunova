/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucko.zavrsnirad;

import kucko.zavrsnirad.controller.HibObrada;
import kucko.zavrsnirad.model.Iznajmljivac;
import kucko.zavrsnirad.model.Korisnik;
import kucko.zavrsnirad.model.Mjesto;
import kucko.zavrsnirad.model.Objekt;
import kucko.zavrsnirad.model.Svojstva;

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
        k.setEmail("tralala@gmail.com");
        k.setOib("15181212518");

        kor.save(k);

        Korisnik k1 = new Korisnik();
        k1.setIme("Karlo");
        k1.setPrezime("Karlovski");
        k1.setEmail("karlovski@yahoo.com");
        k1.setOib("15148123512");

        kor.save(k1);

        HibObrada<Iznajmljivac> iznaj = new HibObrada<>();
        Iznajmljivac i = new Iznajmljivac();

        i.setIme("Pero");
        i.setPrezime("Peric");
        i.setEmail("pero.peric@peric.com");
        i.setOib("841531651332");

        iznaj.save(i);

        Iznajmljivac i1 = new Iznajmljivac();

        i1.setIme("Ivan");
        i1.setPrezime("Horvat");
        i1.setEmail("ivan@gmail.com");
        i1.setOib("147132151215");

        iznaj.save(i1);

        HibObrada<Svojstva> svo = new HibObrada<>();

        Svojstva f = new Svojstva();

        f.setApartman(false);
        f.setHotel(true);
        f.setKlimaUredaj(true);
        f.setTvUredaj(true);
        f.setBalkon(false);
        f.setWifi(true);

        svo.save(f);
        
        
        Svojstva f1 = new Svojstva();

        f1.setApartman(false);
        f1.setHotel(true);
        f1.setKlimaUredaj(true);
        f1.setTvUredaj(true);
        f1.setBalkon(true);
        f1.setWifi(false);

        svo.save(f1);
        
        
        Svojstva f2 = new Svojstva();

        f2.setApartman(true);
        f2.setHotel(false);
        f2.setKlimaUredaj(true);
        f2.setTvUredaj(true);
        f2.setBalkon(true);
        f2.setWifi(true);

        svo.save(f2);
        

        HibObrada<Mjesto> ort = new HibObrada<>();

        Mjesto o = new Mjesto();

        o.setZupanija("Osjecko-baranjska");
        o.setMjesto("Osijek");
        o.setAdresa("Županijska ulica 8");

        ort.save(o);

        Mjesto o1 = new Mjesto();

        o1.setZupanija("Osjecko-baranjska");
        o1.setMjesto("Osijek");
        o1.setAdresa("Šamačka ulica 4");

        ort.save(o1);

        Mjesto o2 = new Mjesto();

        o2.setZupanija("Osjecko-baranjska");
        o2.setMjesto("Osijek");
        o2.setAdresa("Sjevernodravska obala BB");

        ort.save(o2);

        Mjesto o3 = new Mjesto();

        o3.setZupanija("Osjecko-baranjska");
        o3.setMjesto("Osijek");
        o3.setAdresa("Ul. Sv. Roka 74");

        ort.save(o3);

        HibObrada<Objekt> obj = new HibObrada<>();

        Objekt a = new Objekt();

        a.setMjesto(o);
        a.setSvojstva(f);
        a.setNaziv("Hotel Waldinger");

        obj.save(a);

        Objekt a1 = new Objekt();

        a1.setMjesto(o1);
        a1.setSvojstva(f);
        a1.setNaziv("Hotel Osijek");

        obj.save(a1);

        Objekt a2 = new Objekt();

        a2.setMjesto(o2);
        a2.setSvojstva(f1);
        a2.setNaziv("Hotel Zoo");

        obj.save(a2);

        Objekt a3 = new Objekt();

        a3.setMjesto(o3);
        a3.setSvojstva(f2);
        a3.setNaziv("Apartmani Filip");

        obj.save(a3);

    }

}
