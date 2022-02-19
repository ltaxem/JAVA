package com.paveldejimas.isvestine;

import com.paveldejimas.bazine.ZmogusImpl;

public class StatybininkasImpl implements Statybininkas {
    private double stazas;
    private String issilavinimas;
    private String specializacija;
    private double atlyginimas;

    public StatybininkasImpl(double stazas, String issilavinimas, String specializacija, double atlyginimas) {
        this.stazas = stazas;
        this.issilavinimas = issilavinimas;
        this.specializacija = specializacija;
        this.atlyginimas = atlyginimas;
    }

    @Override
    public double getStazas() {
        return stazas;
    }

    @Override
    public void setStazas(double stazas) {
        this.stazas = stazas;
    }

    @Override
    public String getIssilavinimas() {
        return issilavinimas;
    }

    @Override
    public void setIssilavinimas(String issilavinimas) {
        this.issilavinimas = issilavinimas;
    }

    @Override
    public String getSpecializacija() {
        return specializacija;
    }

    @Override
    public void setSpecializacija(String specializacija) {
        this.specializacija = specializacija;
    }

    @Override
    public double getAtlyginimas() {
        return atlyginimas;
    }

    @Override
    public void setAtlyginimas(double atlyginimas) {
        this.atlyginimas = atlyginimas;
    }
}
