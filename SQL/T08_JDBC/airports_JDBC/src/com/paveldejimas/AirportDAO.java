package com.paveldejimas;

import jdk.nashorn.internal.ir.WhileNode;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AirportDAO {
    //---------------------Kuriame įrašą---------------------
    public static void create(Airport airport) {
        //Prisijungimai prie db
        String jdbcUrl = "jdbc:mysql://localhost:3306/airports";
        String querry = "INSERT INTO `sb_airports`(`biz_name`, `address`, `city`) VALUES (?, ?, ?)";

        //Vykdome prisijungimai prie db ir atliekama uzklausa
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, "root", "");

            //Siekiant isvengti sql injekciju, kiekviena laukeli surasom uzklausa atskirai - ignoruojami specialus simboliai
            PreparedStatement preparedStatement = connection.prepareStatement(querry);
            preparedStatement.setString(1, airport.getName());
            preparedStatement.setString(2, airport.getAddress());
            preparedStatement.setString(3, airport.getCity());

            //Naujo įrašo sukurimui, esamo iraso redagavimui ir trynimui, naudojame execute update metoda
            //Esamo iraso paieskai naudojame executeQuery metoda
            preparedStatement.executeUpdate();

            //vykdzius uzklausa gera praktika uzdaryti prisijungimus
            preparedStatement.close();
            connection.close();

            System.out.println("Pavyko sukurti įrašą");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Įvyko klaida, kuriant naują įrašą");
        }
    }

    //---------------------Atnaujiname įrašą---------------------
    public static void update(Airport airport) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/airports";
        String update = "UPDATE `sb_airports` SET `biz_name` = ?, `address` = ?, `city` = ? WHERE `biz_id` = ?;";
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, "root", "");
            PreparedStatement preparedStatement = connection.prepareStatement(update);
            preparedStatement.setString(1, airport.getName());
            preparedStatement.setString(2, airport.getAddress());
            preparedStatement.setString(3, airport.getCity());
            preparedStatement.setInt(4, airport.getId());

            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();

            System.out.println("Pavyko atnaujinti įrašą");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nepavyko atnaujinti įrašą");
        }
    }

    //---------------------Triname įrašą---------------------
    public static void deleteById(int id) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/airports";
        String delete = "DELETE FROM `sb_airports` WHERE `biz_id` = ?";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, "root", "");

            PreparedStatement preparedStatement = connection.prepareStatement(delete);
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();

            System.out.println("Pavyko ištrinti įrašą");
        } catch (SQLException e) {
            e.printStackTrace();

            System.out.println("Įrašo ištrinti nepavyko");
        }
    }

    //---------------------Įrašo paieška pagal id---------------------
    public static Airport searchById(int id) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/airports";
        String querry = "SELECT * FROM `sb_airports` WHERE `biz_id` = ?";

        ArrayList<Airport> list = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, "root", "");
            PreparedStatement preparedStatement = connection.prepareStatement(querry);
            preparedStatement.setInt(1, id);

            //Tik įrašu paieskai executeQuery()
            // ResultSet yra RAW neapdirbti duomenys. Stulpelio pav atitinka rakta, o konkreti iraso reiksme
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) { //Kol turime sarase elementus
                list.add(new Airport(
                        resultSet.getInt("biz_id"),
                        resultSet.getString("biz_name"),
                        resultSet.getString("address"),
                        resultSet.getString("city")
                ));
            }

            preparedStatement.close();
            connection.close();
            System.out.println("Pavyko atlikti paieška pagal id: " + id);

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nepavyko atlikti paieskos pagal id: " + id);
        }

        try {
            // Ieskome pagal pirma sarase esanti id, nes id unikalus
            return list.get(0);
        }
        // Nepavyko rasti pagal id
        catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public static List<Airport> searchByName(String name) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/airports";
        String uzklausa = "SELECT * FROM `sb_airports` WHERE `biz_name` = ?";

        List<Airport> list = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, "root", "");
            PreparedStatement preparedStatement = connection.prepareStatement(uzklausa);
            preparedStatement.setString(1, name);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new Airport(
                        resultSet.getInt("biz_id"),
                        resultSet.getString("biz_name"),
                        resultSet.getString("address"),
                        resultSet.getString("city")
                ));
            }
            preparedStatement.close();
            connection.close();
            System.out.println("Pavyko atlikti paieška pagal pavadinima: ");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nepavyko atlikti paieska pagal pavadinima");
        }
        return list;
    }
}
