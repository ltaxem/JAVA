package com.company.dao;

import com.company.util.HibernateUtil;
import com.company.entity.Airport;
import org.hibernate.Session;
import java.util.ArrayList;
import java.util.List;


public class AirportDAO {

    //Kuriame nauja objekta db
    public static void insert(Airport airport) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(airport);
        session.getTransaction().commit();
//        sessionFactory.close();
    }

    // Paiekška pagal id
    public static Airport searchByID(int id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Airport airport = session.get(Airport.class, id);
        session.getTransaction().commit();
        return airport;
    }

    // Paieška pagal Pavadinima
    public static List<Airport> searchByName(String name) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Airport> sarasasKuriameSaugojame = new ArrayList<>();
        sarasasKuriameSaugojame = session.createQuery("FROM Airport a Where a.name Like '" + name + "'").getResultList();
        session.getTransaction().commit();
        return sarasasKuriameSaugojame;
    }

    // Redaguosim esama irasa
    public static void update(Airport airport) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(airport);
        session.getTransaction().commit();
    }

    // Triname irasa pagal id, pries tai susikuriau konstruktiuriu tik su id
    public static void delete(Airport airport) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(airport);
        session.getTransaction().commit();
    }

}
