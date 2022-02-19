package com.company;

public class Moksleivis {
    // 1. Argumentai (kintamieji, pozymiai)
    private String lytis;
    private String asmensKodas;
    private String vardas;
    private String pavarde;
    private int amzius;
    private double svoris;
    private double ugis;
    private String plaukuSpalva;
    private String grupe;

    // 2. konstruktorius (konstruktoriai)
    public Moksleivis(String lytis, String asmensKodas, String vardas, String pavarde, int amzius, double svoris, double ugis, String plaukuSpalva) {
        this.lytis = lytis;
        this.asmensKodas = asmensKodas;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.amzius = amzius;
        this.svoris = svoris;
        this.ugis = ugis;
        this.plaukuSpalva = plaukuSpalva;
    }


    // Konstruktorius pagal nutylejima(jo galime ir nedeklaruoti)
    public Moksleivis() {
    }

    // 3. Set'eriai, Get'eriai

    public void setLytis(String lytis) {
        this.lytis = lytis;
    }

    public String getLytis() {
        return lytis;
    }


    public String getAsmensKodas() {
        return asmensKodas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getVardas() {
        return vardas;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setAmzius(int amzius) {
        this.amzius = amzius;
    }

    public int getAmzius() {
        return amzius;
    }

    public void setSvoris(double svoris) {
        this.svoris = svoris;
    }

    public double getSvoris() {
        return svoris;
    }

    public void setUgis(double ugis) {
        this.ugis = ugis;
    }

    public double getUgis() {
        return ugis;
    }

    public void setPlaukuSpalva(String plaukuSpalva) {
        this.plaukuSpalva = plaukuSpalva;
    }

    public String getPlaukuSpalva() {
        return plaukuSpalva;
    }
}