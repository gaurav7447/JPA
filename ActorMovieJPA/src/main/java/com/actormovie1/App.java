package com.actormovie1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Movie_Act_JPA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        Actors act1 =new Actors("Rocking Star Yash",38);
        Actors act2 =new Actors("Sai Pallavi",30);
        Actors act3 =new Actors("Robert Downey Jr",60);
        Actors act4 =new Actors("Sidharth Malhotra",39);
        Actors act5 =new Actors("Sanjay Dutt",65);
        Actors act6 =new Actors("Jenelie Deshmukh",30);
        Actors act7 =new Actors("Pankaj Tripathi",55);
        Actors act8 =new Actors("SRK",38);
        Actors act9 =new Actors("Prabhas",55);
        Actors act10 =new Actors("Amitab Bacchan",81);
        Actors act11 =new Actors("Akshay Kumar",40);
        Actors act12 =new Actors("Katrina Kaif",46);
        Actors act13 =new Actors("Ram Charan",55);
        Actors act14=new Actors("Jonny Deep",55);
        Actors act15=new Actors("Ranbir Kapoor",55);
        
        
        Movies mov1 =new Movies("Tees Mar Khan",4.3,2008);
        Movies mov2 =new Movies("RRR",8.1,2024);
        Movies mov3 =new Movies("Pruthviraj Chavan",4.1,2000);
        Movies mov4 =new Movies("KGF",9.1,2024);
        Movies mov5 =new Movies("Brahmastra",8.6,2023);
        Movies mov6 =new Movies("Kalki",8.1,2024);
        Movies mov7 =new Movies("Happy",6.5,2005);
        Movies mov8 =new Movies("Piretes of Caribian",8.3,2020);
        Movies mov9 =new Movies("Ironman",9.8,2022);
        Movies mov10 =new Movies("Ramayan",10,2025);
        
        
        mov1.getActors().add(act11);
        mov1.getActors().add(act12);
        
        mov2.getActors().add(act13);
        mov2.getActors().add(act5);
        
        mov3.getActors().add(act11);
        mov3.getActors().add(act15);
        
        mov4.getActors().add(act1);
        mov4.getActors().add(act5);
        
        mov5.getActors().add(act15);
        mov5.getActors().add(act5);
        
        mov6.getActors().add(act9);
        mov6.getActors().add(act10);
        
        mov7.getActors().add(act6);
        mov7.getActors().add(act13);
        
        mov8.getActors().add(act14);
        
        mov9.getActors().add(act3);
        
        mov10.getActors().add(act15);
        mov10.getActors().add(act2);
        
        em.persist(mov1);
        em.persist(mov2);
        em.persist(mov3);
        em.persist(mov4);
        em.persist(mov5);
        em.persist(mov6);
        em.persist(mov7);
        em.persist(mov8);
        em.persist(mov9);
        em.persist(mov10);
        
        
        
        
        		
        
        
       
        
        em.getTransaction().commit();
        emf.close();
        em.close();
    }
}
