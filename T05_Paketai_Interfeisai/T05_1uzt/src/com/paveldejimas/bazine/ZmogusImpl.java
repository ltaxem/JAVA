package com.paveldejimas.bazine;

public class ZmogusImpl implements Zmogus {
    private boolean lytis;
    private String asmensKodas;
    private String vardas;
    private String pavarde;
    private int amzius;
    private double svoris;
    private double ugis;
    private String plaukuSpalva;

    public ZmogusImpl(boolean lytis, String asmensKodas, String vardas, String pavarde, int amzius, double svoris, double ugis, String plaukuSpalva) {
        this.lytis = lytis;
        this.asmensKodas = asmensKodas;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.amzius = amzius;
        this.svoris = svoris;
        this.ugis = ugis;
        this.plaukuSpalva = plaukuSpalva;
    }

    @Override
    public boolean istLytis() {
        return lytis;
    }

    @Override
    public void setLytis(boolean lytis) {
        this.lytis = lytis;
    }

    @Override
    public String getAsmensKodas() {
        return asmensKodas;
    }

    @Override
    public String getvardas() {
        return vardas;
    }

    @Override
    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    @Override
    public String getPavarde() {
        return pavarde;
    }

    @Override
    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    @Override
    public int getAmzius() {
        return amzius;
    }

    @Override
    public void setAmzius(int amzius) {
        this.amzius = amzius;
    }

    @Override
    public double getSvoris() {
        return svoris;
    }

    @Override
    public void setSvoris(double svoris) {
        this.svoris = svoris;
    }

    @Override
    public double getUgis() {
        return ugis;
    }

    @Override
    public void setUgis(double ugis) {
        this.ugis = ugis;
    }

    @Override
    public String getPlaukuSpalva() {
        return plaukuSpalva;
    }

    @Override
    public void setPlaukuSpalva(String plaukuSpalva) {
        this.plaukuSpalva = plaukuSpalva;
    }

    @Override
    public String toString() {
        return "ZmogusImpl{" +
                "lytis=" + lytis +
                ", asmensKodas='" + asmensKodas + '\'' +
                ", vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", amzius=" + amzius +
                ", svoris=" + svoris +
                ", ugis=" + ugis +
                ", plaukuSpalva='" + plaukuSpalva + '\'' +
                '}';
    }
}