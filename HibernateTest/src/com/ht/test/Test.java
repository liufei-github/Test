package com.ht.test;

import com.ht.entity.EmpEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by Administrator on 2019/10/23.
 */
public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
        Session session =  sessionFactory.openSession();
        Query query = session.createQuery("from EmpEntity");
        List<EmpEntity> lists = query.list();
        for(EmpEntity emp : lists){
            System.out.println(emp.toString());
        }
    }
}
