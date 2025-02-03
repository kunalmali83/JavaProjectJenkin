package com.kunal.hibernateEg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.kunal.hibernateEg.Student; // Add this import statement

public class App {
    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(Student.class); 

        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        SessionFactory sf = config.buildSessionFactory(reg);
        Session session = sf.openSession();
        session.beginTransaction();

        
            //student a = session.get(student.class, 4);//for updating the value we create this type of instance 
            
        fullname fn=new fullname();
        fn.setFname("kunal");
        fn.setMname("kishor");
        fn.setLname("mali");
        Student a =new Student();//for new value
                 a.setRoll(5);
                 a.setName(fn);
                 
                session.persist(a);
            
            session.getTransaction().commit();
     
//            student a = session.get(student.class, 1);
//            System.out.println(a);
            
           
        
            session.close();
        
    }
}