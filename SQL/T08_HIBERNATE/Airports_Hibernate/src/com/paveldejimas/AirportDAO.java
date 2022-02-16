package com.paveldejimas;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;


public class AirportDAO {
    // Sukriamas sesiju gamykla, pagal hybernate konfiguraciju failiuka ir entity
    // Sesiju gamykla yra sunkiasvoris objektas, t.y. galioja per visa aplikacija
    static SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml").addAnnotatedClass(Airport.class).buildSessionFactory();

    //Kuriame nauja objekta db
    public static void insert(Airport airport){

        // Sesija yra lengasvoris objektas, panaudoja, sunaikinamas
        Session session = sessionFactory.getCurrentSession();

        // Kad atlikti betkoki veiksma su DB, reikia sukurti tranzakcija
        session.beginTransaction();

        // Saugojamas objektas DB
        session.save(airport);

        // Tranzakcijos ivykdymas
        session.getTransaction().commit();

        // Atlikus visus, veiksmus, reikia uzdaryti sesiju gamyklas
//        sessionFactory.close();
    }

    // Paiekška pagal id
    public static Airport searchByID(int id){
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        Airport airport = session.get(Airport.class, id);

        session.getTransaction().commit();
//        sessionFactory.close();
        return airport;
    }

    // Paieška pagal Pavadinima
    public static List<Airport> searchByName(String name) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        List<Airport> sarasasKuriameSaugojame = new ArrayList<>();
        sarasasKuriameSaugojame = session.createQuery("FROM Airport a Where a.name Like '" + name + "'").getResultList();
        session.getTransaction().commit();
        return sarasasKuriameSaugojame;
    }

    // Redaguosim esama irasa
    public static void update(Airport airport) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(airport);
        session.getTransaction().commit();
    }

    // Triname irasa pagal id, pries tai susikuriau konstruktiuriu tik su id
    public static void delete(Airport airport) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(airport);
        session.getTransaction().commit();
    }

}
