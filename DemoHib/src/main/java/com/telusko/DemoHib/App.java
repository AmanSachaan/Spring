package com.telusko.DemoHib;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
    	
    	
    	Alien telusko=new Alien();
    	telusko.setAid(102);
    	telusko.setAname("Aman");
    	telusko.setColor("Green");
        System.out.println( "Hello World!" );
        
        Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
        
        SessionFactory sf=con.buildSessionFactory();
        
        
        
        Session session=sf.openSession();
        
        Transaction tx=session.beginTransaction();
        session.save(telusko);
        tx.commit();
    }
}
