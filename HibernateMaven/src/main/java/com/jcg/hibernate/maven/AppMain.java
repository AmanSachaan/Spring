package com.jcg.hibernate.maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



public class AppMain {

	
    
	public static void main(String[] args) {
		System.out.println("  Hibernate Maven Example  \n");
		
		User user;

       
        
Configuration con=new Configuration().configure().addAnnotatedClass(User.class);
        
        SessionFactory sf=con.buildSessionFactory();
        
        
        
        Session session=sf.openSession();
        
        Transaction tx=session.beginTransaction();
        
        
        for(int i=0;i<10;i++)
        {
        	user=new User();
        	user.setCreatedBy("virat"+i);
        	user.setUserid(i+1);
        	user.setUsername("aman"+i);
        	user.setCreatedDate((i+1)+"/11/2019");
        	
        	 session.save(user);
        	
        }
       
        tx.commit();
        session.close();
	}
}