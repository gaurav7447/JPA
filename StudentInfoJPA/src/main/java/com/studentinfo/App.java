package com.studentinfo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory  emf =Persistence.createEntityManagerFactory("Stu_Add_JPA");
        EntityManager em= emf.createEntityManager();
        em.getTransaction().begin();
        
        PEmail pe1 =new PEmail("google","atharvac@gmail.com","active");
        PEmail pe2 =new PEmail("yahoo","gauravdeshmane@yahoo.com","inactive");
        
        
        Student s1 = new Student();
        s1.setName("Atharva");
        s1.setAge(23);
        s1.setCourse("JFD");
        s1.setOfficial_email("atharvac.cybersuccess@gmail.com");
        s1.getPe().add(pe1);
        
        
        Student s2 = new Student();
        s2.setName("Gaurav");
        s2.setAge(22);
        s2.setCourse("Testing");
        s2.setOfficial_email("garuavd.cybersuccess@gmail.com");
        s2.getPe().add(pe2);
        
        
        em.persist(s1);
        em.persist(s2);
        em.getTransaction().commit();
        
        emf.close();
        em.close();
        
        
        
        
        }
}
