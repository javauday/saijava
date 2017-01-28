package com.uday.Hibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	AakulaName an = new AakulaName();
    	an.setRegion("NorthEast");
    	an.setWeather("Mid-cool");
    	
    	Aakula place = new Aakula();
    	
    	//Aakula place =null; //fetching data
    	
    	place.setSerialnumber(03);
    	place.setLocationname(an);
    	place.setCountry("Asia");
    
    	Configuration con = new Configuration().configure().addAnnotatedClass(Aakula.class);
    
    
    	SessionFactory sf = con.buildSessionFactory();
   
    	Session session =   sf.openSession();
    
    	Transaction tx = session.beginTransaction();
    	
    	session.save(place);
    	
    	//place = (Aakula)session.get(Aakula.class, 02); //fetching the data
    	
    	tx.commit();
    	
    	System.out.println(place);
}
}