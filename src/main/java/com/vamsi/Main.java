package com.vamsi;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main
{
    public static void main(String[] args)
    {
        Student_4 obj = new Student_4();
        obj.setName("Ramesh Sir");
        obj.setRoll_no(86);
        obj.setAge(34);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.vamsi.Student_4.class);
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction ts = ss.beginTransaction();
        ss.persist(obj);
        ts.commit();
        System.out.println(obj);
        System.out.println("DataBase Is Connected Successfully");
        ss.close();
    }
}