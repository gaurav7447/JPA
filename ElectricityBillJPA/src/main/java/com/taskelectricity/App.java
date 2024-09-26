package com.taskelectricity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args ) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ele_Bill_JPA");
    EntityManager  em = emf.createEntityManager();
    em.getTransaction().begin();
    
    Electricity ele1= new Electricity();
    ele1.setName("MahaWitran");
    ele1.setOwner("maharashtra government");
    ele1.setLocation("maharashtra");
    
    
    Bills b1 = new Bills("Kapil Pise","Hole",5000,ele1);
    Bills b2 = new Bills("Rohan Pardesi","Pandharpur",500,ele1);
    Bills b3 = new Bills("Gaurav Deshmane","Mohol",900,ele1);
    
    em.persist(b1);
    em.persist(b2);
    em.persist(b3);
    
    
    
    
    
    
    
    em.getTransaction().commit();
    
    emf.close();
    em.close();
    }
}
