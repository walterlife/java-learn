package com.walterlife.blog;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.walterlife.persistence.HibernateUtil;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
 
        Transaction tx = session.beginTransaction();
        Stock stock = new Stock();
 
        stock.setStockCode("33");
        stock.setStockName("walter");
 
        session.save(stock);
        tx.commit();
    }
}
