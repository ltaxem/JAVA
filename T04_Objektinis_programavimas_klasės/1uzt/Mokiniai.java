
package com.company;

import java.util.Arrays;

public class Mokiniai {
    private String pavarde;
    private String vardas;
    private int klase;
    private int[] Paz;
    private double vid;
    private double vid2;

    //Konstruktorius
    public Mokiniai(String pavarde, String vardas, int klase, int[] Paz) {
        this.pavarde = pavarde;
        this.vardas = vardas;
        this.klase = klase;
        this.Paz = Paz;
    }

    // SETeriai, GETeriai
    /*
    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getVardas() {
        return vardas;
    }

    public void setKlase(int klase) {
        this.klase = klase;
    }

    public int getKlase() {
        return klase;
    }

    public void setPaz(int P[]) {
        this.Paz = P;
    }

    public int[] getPaz() {
        return Paz;
    }
     */

    public double skaiciuotiVid() {
        int sum = 0;
        int k = 0;
        for (int i = 0; i < Paz.length; i++) {
            sum = sum + Paz[i];
            k++;
        }
        vid = (double) sum / (double) k;
        return vid;
    }

    public void setVid2(double vid2) {
        this.vid2 = vid2;
    }

    public double getVid2(double v) {
        return vid2;
    }

    @Override
    public String toString() {
        return "" +
                "Pavardë " + pavarde +
                "\nVardas " + vardas +
                "\nKlasë " + klase +
                "\nPaşymiai: " + Arrays.toString(Paz) +
                "\nVidurkis: " + vid2 +
                "\n-------------------------------------";
    }
}
