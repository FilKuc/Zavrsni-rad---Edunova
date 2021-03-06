/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucko.zavrsnirad.pomocno;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Filip
 */
public class HibUtil {
    private static Session session = null;

    protected HibUtil() {
        // Exists only to defeat instantiation.
    }

    public static Session getSession() {
        if (session == null) {
            try {
                session = new Configuration().configure().buildSessionFactory().openSession();
                //session.setCacheMode(CacheMode.REFRESH);
            } catch (Throwable ex) {
                // Make sure you log the exception, as it might be swallowed
                System.err.println("Initial SessionFactory creation failed." + ex);
                throw new ExceptionInInitializerError(ex);
            }
        }
        return session;
    }
}
