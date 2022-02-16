package com.company.dao;

import com.company.util.HibernateUtil;
import com.company.entity.Employee;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {


    // Kuriame irasa
    public static void insert(Employee employee) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
    }

    // Spausdiname visus irasus
    public static List<Employee> spausdintiViska() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Employee> list = new ArrayList<>();
        list = session.createQuery("FROM Employee").getResultList();
        session.getTransaction().commit();
        return list;
    }

    // Paieškq pagal darbuotojo ID
    public static Employee searchById(int id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Employee employee = session.get(Employee.class, id);
        session.getTransaction().commit();
        return employee;
    }

    // Paieška pagal darbuotojo vardą.
    public static List<Employee> searchByName(String name) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Employee> employee = new ArrayList<>();
        employee = session.createQuery("FROM Employee WHERE name LIKE '" + name + "'").getResultList();
        session.getTransaction().commit();
        return employee;
    }

    // Paredaguojam esamą įrašą (turi egzistuot toks irasas)
    public static void update(Employee employee) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(employee);
        session.getTransaction().commit();
    }

    // triname esamą įrašą.
    public static void delete(Employee id){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(id);
        session.getTransaction().commit();
    }
}
