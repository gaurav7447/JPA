package com.empddexam;

import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class App 
{
    public static void main( String[] args )
    {
      // EntityManangerFactory emf =Persistence.createEntityManagerFactory("Emp_Add_JPA");
    	EntityManagerFactory emf =Persistence.createEntityManagerFactory("Emp_Add_JPA");
       EntityManager em= emf.createEntityManager();
       em.getTransaction().begin();
       
       Paddress pa1= new Paddress(737101,"Gangtok","Sikkim");
       Paddress pa2= new Paddress(413213,"Mohol","Maharashtra");
       
       Employee emp1 =new Employee();
       emp1.setName("Siddharth  Sirehia");
       emp1.setDept("Traning");
       emp1.setCaddress("pune");
       emp1.setSalary(1000);
       emp1.getPadd().add(pa1);
       
       Employee emp2 =new Employee();
       emp2.setName("Gaurav  Deshmane");
       emp2.setDept("Developer");
       emp2.setCaddress("pune");
       emp2.setSalary(900);
       emp2.getPadd().add(pa2);
       
       
       Employee emp3 =new Employee();
       emp3.setName("Rohan  Pardeshi");
       emp3.setDept("Developer");
       emp3.setCaddress("pune dattawadi");
       emp3.setSalary(9000);
       emp3.getPadd().add(pa2);
       
       
       em.persist(emp1);
       em.persist(emp2);
       em.persist(emp3);
       
       em.getTransaction().commit();
       
      emf.close();
      em.close();
       
       
       
       
       
    }
}
