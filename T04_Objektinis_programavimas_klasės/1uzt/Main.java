package com.company;

import com.sun.javaws.IconUtil;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        // 2. konstruktorius su id
        Moksleivis moksleivis = new Moksleivis(2);

        // 3. Set'eriai, Get'eriai
        moksleivis.setVardas("Mantas");
        moksleivis.setPavarde("Mantaitis");
        moksleivis.setGrupe("Phyton");

        // 2. konstruktorius su visais parametrais
        Moksleivis moksleivis1 = new Moksleivis(1, "Jonas", "Jonaitis", "Java");
        System.out.println(moksleivis.getId() + " pakei�iame � " + moksleivis1.getId());
        System.out.println(moksleivis.getVardas() + " pakei�iame � " + moksleivis1.getVardas());
        System.out.println(moksleivis.getPavarde() + " pakei�iame � " + moksleivis1.getPavarde());
        System.out.println(moksleivis.getGrupe() + " pakei�iame � " + moksleivis1.getGrupe());
    }
}