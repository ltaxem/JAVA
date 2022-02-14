package com.paveldejimas;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmplyeeTest {


    public Employee employeeLocalPositive;
    public Employee employeeDB;
    //public Employee employeeLocalNegative;

    @Before
    public void setup() {
        employeeLocalPositive = new Employee("Pauliuss", "Pa", 990.59);
        //employeeLocalNegative = new Employee("Antanas", "Antanaitis", 998.59);
    }

    @Test
    public void createEmployeePositiveTest() {
        EmployeeDAO.create(employeeLocalPositive);
        employeeDB = EmployeeDAO.searchById(10);
        compareEmployeesEquals(employeeLocalPositive, employeeDB);
    }

//    @Test
//    public void createEmployeeNegativeTest(){
//        employeeDB = EmployeeDAO.searchById(10);
//        compareNotEmployeesEquals(employeeLocalNegative, employeeDB);
//    }

    private void compareEmployeesEquals(Employee employeeLocalPositive, Employee employeeDB) {
        Assert.assertEquals(employeeLocalPositive.getName(), employeeDB.getName());
        Assert.assertEquals(employeeLocalPositive.getSurname(), employeeDB.getSurname());
        Assert.assertEquals(employeeLocalPositive.getSalary(), employeeDB.getSalary(), 0);
    }

    private void compareNotEmployeesEquals(Employee employeeLocal, Employee employeeDB) {
        Assert.assertNotEquals(employeeLocal.getName(), employeeDB.getName());
        Assert.assertNotEquals(employeeLocal.getSurname(), employeeDB.getSurname());
        Assert.assertNotEquals(employeeLocal.getSalary(), employeeDB.getSalary(), 0);
    }
}
