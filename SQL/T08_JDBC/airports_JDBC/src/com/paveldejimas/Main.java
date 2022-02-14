package com.paveldejimas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("T08. JDBC");
        //objektas skiras naujo iraso kurimui
        Airport airport = new Airport("Kauno oro uostas", "Karmelava", "Kaunas");
//        AirportDAO.create(airport);

        //Objektas skirtas redagavimui
        //   Airport airport2 = new Airport(8, "AAA", "BBB", "CCC");
//        AirportDAO.update(airport2);

        // Kreipinys skirtas įrašo trinimui
//        AirportDAO.deleteById(9);

        //Ieskome pagal id
//        Airport airport2 = AirportDAO.searchById(6);
//        if(airport2 == null)
//            System.out.println("Bet tokio elemento sąraše nėra");
//        else System.out.println(airport2);
//    }

        List<Airport> airportList = AirportDAO.searchByName("Kauno oro uostas");
        if(airportList.size() == 0) System.out.println("Tokio pavadinimo nera");
        else System.out.println(airportList);

    }
}
