package com.company;

public class Main {

    public static void main(String[] args) {
        // Kuriamas moksleivio klases objektas, pagal pilna (su visais paramatterais) moksleivio konstruktoriu
        Moksleivis moksleivis = new Moksleivis("VYRAS", "42315262212", "TOMAS", "TOMAITIS", 17, 74.5, 1.72, "RUDA");

        // Keiciame nustatatymus panaudojant set'erius, get'erius
        System.out.print("Lytis " + moksleivis.getLytis() + ", dabar ");
        moksleivis.setLytis("Moteris");
        System.out.println(moksleivis.getLytis());

        System.out.println("Asmens kodas: " + moksleivis.getAsmensKodas());

        System.out.print("Vardas " + moksleivis.getVardas());
        moksleivis.setVardas("Jonas");
        System.out.println(", dabar " + moksleivis.getVardas());

        System.out.print("Pavardë " + moksleivis.getPavarde());
        moksleivis.setPavarde("Jonaitis");
        System.out.println(", dabar " + moksleivis.getPavarde());

        System.out.print("Amzius: " + moksleivis.getAmzius());
        moksleivis.setAmzius(18);
        System.out.println(", dabar " + moksleivis.getAmzius());

        System.out.print("Svoris " + moksleivis.getSvoris() + "kg");
        moksleivis.setSvoris(75.5);
        System.out.println(", dabar " + moksleivis.getSvoris() + "kg ");

        System.out.print("Ugis " + moksleivis.getUgis() + "m");
        moksleivis.setUgis(173.2);
        System.out.println(", dabar "  + moksleivis.getUgis() + "m ");

        System.out.print("Plauku spalva " + moksleivis.getPlaukuSpalva());
        moksleivis.setPlaukuSpalva("JUODI");
        System.out.println(", dabar " + moksleivis.getPlaukuSpalva());

        /////////// 2.3. Sukurti 6 skirtingus objektus (þmones).
        /// Panaudojom konstruktoriu, kuris pas mus yra pagal nutylejima
        Moksleivis moksleivis1 = new Moksleivis();
        moksleivis1.setVardas("Paulius");
        System.out.println("\n1. " + moksleivis1.getVardas());

        Moksleivis moksleivis2 = new Moksleivis();
        moksleivis2.setVardas("Dominykas");
        System.out.println("2. " + moksleivis2.getVardas());

        Moksleivis moksleivis3 = new Moksleivis();
        moksleivis3.setVardas("Þygis");
        System.out.println("3. " + moksleivis3.getVardas());

        Moksleivis moksleivis4 = new Moksleivis();
        moksleivis4.setVardas("Juratë");
        System.out.println("4. " + moksleivis4.getVardas());

        Moksleivis moksleivis5 = new Moksleivis();
        moksleivis5.setVardas("Kajus");
        System.out.println("5. " + moksleivis5.getVardas());

        Moksleivis moksleivis6 = new Moksleivis();
        moksleivis6.setVardas("Danutë");
        System.out.println("6. " + moksleivis6.getVardas());
    }
}