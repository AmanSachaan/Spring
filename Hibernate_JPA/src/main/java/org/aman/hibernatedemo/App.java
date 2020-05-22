package org.aman.hibernatedemo;

//import javax.security.auth.login.Configuration;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	Student s1=new Student();
    	s1.setMarks(100);
    	s1.setName("Virat");
    	s1.setRollno(6);
    	EntityManagerFactory emf=new Persistence().createEntityManagerFactory("pu");
    	EntityManager em=emf.createEntityManager();
    	em.getTransaction().begin();
    	em.persist(s1);
    	Student s2=em.find(Student.class, 6);
    	em.getTransaction().commit();
    	System.out.println(s2.getMarks()+s2.getName()+s2.getRollno());
    	
    }
    
}