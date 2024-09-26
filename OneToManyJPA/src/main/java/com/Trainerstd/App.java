package com.Trainerstd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args ) {
   
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Trainer_Std_JPA");
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    
    Trainer t1= new Trainer();
    t1.setName("Mr.Ritesh Sir");
    t1.setSalary(1000);
    t1.setSubject("Core Java");
    
    Trainer t2= new Trainer();
    t2.setName("Mr.Sidharth Sir");
    t2.setSalary(1000);
    t2.setSubject("Advance Java");
    
    
    
    Student s1=new Student("gaurav","CS12","mohol",t1);
    Student s2=new Student("kapil","CS14","pandharpur",t1);
    Student s3=new Student("Mrunal","CS50","Nashik",t1);
    
    Student s4=new Student("kedar","CS11","latur",t2);
    Student s5=new Student("rohan","CS43","mulshi",t2);
    Student s6=new Student("yogesh","CS70","bombay",t2);
    
    em.persist(s1);
    em.persist(s2);
    em.persist(s3);
    em.persist(s4);
    em.persist(s5);
    em.persist(s6);
    
    em.getTransaction().commit();
    
    emf.close();
    em.close();
}
    }
