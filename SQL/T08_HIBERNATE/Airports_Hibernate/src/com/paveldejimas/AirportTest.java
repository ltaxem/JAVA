package com.paveldejimas;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AirportTest {
    Airport airportLocal;
    AirportDAO airportDAO;
    Airport airportDb;

    @Before
    public void setup() {
        airportLocal = new Airport("Vilniaus oro uostas", "vil", "Vilnius");
    }

    @Test
    public void insertPositiveTest() {
        airportDAO.insert(airportLocal);
        airportDb = AirportDAO.searchByID(airportLocal.getId());
        compareAirport(airportLocal, airportDb);
    }

    public void compareAirport(Airport airportLocal, Airport airportDb) {
        Assert.assertEquals(airportLocal.getName(), airportDb.getName());
        Assert.assertEquals(airportLocal.getAddress(), airportDb.getAddress());
        Assert.assertEquals(airportLocal.getCity(), airportDb.getCity());
    }
}
