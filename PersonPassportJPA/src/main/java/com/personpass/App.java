package com.personpass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf =Persistence.createEntityManagerFactory("Per_Pass_JPA");
        EntityManager em =emf.createEntityManager();
        em.getTransaction().begin();
        
        Passport pass1 =new Passport();
        pass1.setP_iden("SKDJF5847LSKSD9R0");
        
        Passport pass2 =new Passport();
        pass2.setP_iden("OIUTR34N45IHVV4");
        
        DriveLIC d1 =new DriveLIC();
        d1.setLicenceNumber("NK34N34");
        d1.setState("Maharashtra");
        
        DriveLIC d2 =new DriveLIC();
        d2.setLicenceNumber("NDW47447JF");
        d2.setState("Sikkim");
        
        Person per1 = new Person("Sidharth Sirohia","Gangtok",pass1,d2);
        Person per2 = new Person("Gaurav Deshmane","Mohol",pass2,d1);
        
        em.persist(per1);
        em.persist(per2);
        
        
        
        em.getTransaction().commit();
        
        emf.close();
        em.close();
    }
}
