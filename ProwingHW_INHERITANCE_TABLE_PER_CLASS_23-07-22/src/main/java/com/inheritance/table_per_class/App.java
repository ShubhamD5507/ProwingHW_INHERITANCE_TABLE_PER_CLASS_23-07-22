package com.inheritance.table_per_class;

import javax.persistence.NamedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Employee e1 =new Employee();
        e1.setName("Salman");
        
        Employee e2 =new Employee();
        e2.setName("Hritik");
        
       Permanant_Employee e3 = new Permanant_Employee();
        e3.setName("Shahrukh");
        e3.setSalary(20000);
        e3.setBonus(2000);
        
        Permanant_Employee e4 = new Permanant_Employee();
        e4.setName("Gauri");
        e4.setSalary(30000);
        e4.setBonus(3000);
        
        Contract_Employee e5 = new Contract_Employee();
        e5.setName("Sachin");
        e5.setDuration("1 year");
        e5.setPayPerHrs(1000);
        
       Configuration con = new Configuration().configure();
       SessionFactory factory =   con.buildSessionFactory();
       Session session = factory.openSession();
       Transaction tx = session.beginTransaction();
       
     
       
       session.save(e1);
       session.save(e2);
       session.save(e3);
       session.save(e4);
       session.save(e5);
       
       session.getTransaction().commit();
       session.close();
       factory.close();
       
       
       System.out.println("*********************    End     *********************");
    }
}
