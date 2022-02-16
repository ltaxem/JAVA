package com.company;

import com.company.dao.AirportDAO;
import com.company.dao.EmployeeDAO;
import com.company.entity.Airport;
import com.company.entity.Employee;
import com.company.util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        AirportDAO airportDAO = new AirportDAO();

        Airport airport1 = new Airport("Kauno oro uostas", "Karmelava", "Kaunas");
        Airport airport2 = new Airport("Klaipedos oro uostas", "kl", "Klaipeda");

        Employee employee1 = new Employee("Petras", "Petraitis", 852);
        Employee employee2 = new Employee("Jonas", "Petraitis", 852);
        Employee employee3 = new Employee("Simas", "Petraitis", 852);
        Employee employee4 = new Employee("Stasys", "Petraitis", 852);

        // uzpildom duomenimis
//        airportDAO.insert(airport1);
//        airportDAO.insert(airport2);
//
//        employee1.setAirport(airport1);
//        employee2.setAirport(airport1);
//        employee3.setAirport(airport2);
//        employee4.setAirport(airport2);
//
//        employeeDAO.insert(employee1);
//        employeeDAO.insert(employee2);
//        employeeDAO.insert(employee3);
//        employeeDAO.insert(employee4);


        // Redaguoim oro uota. Keiciant ir trinant reik nurodyti id
//        airport1.setName("Palangos oro uostas");
//        airport1.setId(1);
//        airportDAO.update(airport1);
//
//        employee1.setName("Liudvikas");
//        employee1.setAirport(airport1);
//        employee1.setId(2);
//        employeeDAO.update(employee1);

        // Trinsim irasus. Istrinsim oro uosta turi issitrinti visi darbuotojai dirbantys jame.
        // bet istrinus darbuotoja, oro uosta neissitrina
        // Trinam oro uostas
        //-----------//

        // Trinam darbuotojus
//        Employee e = new Employee(1);
//        employeeDAO.delete(e);

        HibernateUtil.getSessionFactory().close();

    }
}
