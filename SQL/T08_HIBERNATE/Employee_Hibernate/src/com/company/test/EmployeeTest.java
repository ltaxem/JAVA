package com.company.test;

import com.company.dao.EmployeeDAO;
import com.company.entity.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
    EmployeeDAO employeeDAO;
    Employee employeeLocal;
    Employee employeeDB;

    @Before
    public void setup() {
        employeeLocal = new Employee("Martas", "Martaitis", 984.20);
    }

    @Test
    public void insertPositiveTest() {
        employeeDAO.insert(employeeLocal);
        employeeDB = employeeDAO.searchById(employeeLocal.getId());
        compareEmployees(employeeLocal, employeeDB);
    }

    private void compareEmployees(Employee employeeLocal, Employee employeeDB) {
        Assert.assertEquals(employeeLocal.getName(), employeeDB.getName());
        Assert.assertEquals(employeeLocal.getSurname(), employeeDB.getSurname());
        Assert.assertEquals(employeeLocal.getSalary(), employeeDB.getSalary(), 0);
    }
}
