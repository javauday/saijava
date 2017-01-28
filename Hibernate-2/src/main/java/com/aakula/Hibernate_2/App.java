package com.aakula.Hibernate_2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Udayclass neon = new Udayclass();
       /*
        * remove the below values for fetching the values
        */
       neon.setSerialnumber(03);
       neon.setFirstname("Sunita");
       neon.setLastname("Mishra");
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Udayclass.class);
       
       SessionFactory sf = con.buildSessionFactory();
     
       Session session = sf.openSession();
       
       Transaction tx = session.beginTransaction();
      
       /*To fetch the data use this.
        * neon = (Udayclass) session.get(Alien.class, 102);
        * 
        */
       
       session.save(neon);
       
       tx.commit();
    }
}
