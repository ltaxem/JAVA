package com.paveldejimas;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    // 2.4. Parašyti kodą, kurio pagalba sukurtumėte naują įrašą db.
    public static void create(Employee employee) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/db";
        String uzklausa = "INSERT INTO `employee`(`name`, `surname`, `salary`) VALUES (?,?,?)";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, "root", "");

            PreparedStatement preparedStatement = connection.prepareStatement(uzklausa);
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getSurname());
            preparedStatement.setDouble(3, employee.getSalary());

            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();

            System.out.println("Pavyko sukurti įrašą");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Įvyko klaida, kuriant naują įrašą");
        }
    }

    // 2.5. Parašyti kodą, kurio pagalba atspausdintumėte į terminalą visus įrašus iš db.
    public static void spausdinti() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/db";
        String uzklausa = "SELECT * FROM `employee`";


        ArrayList<Employee> arrayList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, "root", "");

            PreparedStatement preparedStatement = connection.prepareStatement(uzklausa);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                arrayList.add(new Employee(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getDouble("salary")
                ));
            }
            preparedStatement.close();
            connection.close();
            System.out.println("Pavyko atlikti visų įrašų spausdinimą: ");
            for (Employee a : arrayList) System.out.println(a);

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nepavyko atlikti įrašų spausdinimo");
        }
    }

    // 2.6. Atlikti paiešką pagal darbuotojo vardą.
    // 2.9. Paskaičiuoti kiek yra įrašų, kurių vardas yra "Jonas".
    public static List<Employee> searchByName(String vardas) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/db";
        String uzklausa = "SELECT * FROM employee WHERE name = ?";

        List<Employee> list = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, "root", "");
            PreparedStatement preparedStatement = connection.prepareStatement(uzklausa);
            preparedStatement.setString(1, vardas);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new Employee(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getDouble("salary")
                ));
            }
            preparedStatement.close();
            connection.close();
            System.out.println("Pavyko atlikti paieška pagal vardą: ");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nepavyko atlikti paieska pagal vardą");
        }
        return list;
    }

    //2.7. Paredaguoti esamą įrašą.
    public static void atnaujinti(Employee employee3) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/db";
        String uzklausa = "UPDATE `employee` SET `name`= ?,`surname`= ?,`salary`= ? WHERE `id` = ?";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, "root", "");
            PreparedStatement preparedStatement = connection.prepareStatement(uzklausa);
            preparedStatement.setString(1, employee3.getName());
            preparedStatement.setString(2, employee3.getSurname());
            preparedStatement.setDouble(3, employee3.getSalary());
            preparedStatement.setInt(4, employee3.getId());

            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();

            System.out.println("Pavyko atnaujinti įrašą");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nepavyko atnaujinti įrašą");
        }

    }

    //2.8. Ištrinti esamą įrašą pagal įrašo id.
    public static void deleteById(int id) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/db";
        String uzklausa = "DELETE FROM `employee` WHERE `id` = ?";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, "root", "");
            PreparedStatement preparedStatement = connection.prepareStatement(uzklausa);
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

//--------------------------
    public static Employee searchById(int id) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/db";
        String querry = "SELECT * FROM `employee` WHERE `id` = ?";

        List<Employee> list = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, "root", "");
            PreparedStatement preparedStatement = connection.prepareStatement(querry);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new Employee(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getDouble("salary")
                ));
            }
            preparedStatement.close();
            connection.close();
            System.out.println("Pavyko atlikti paieška pagal id");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nepavyko atlikti paieskos pagal id");
        }
        return list.get(0);
    }
}
