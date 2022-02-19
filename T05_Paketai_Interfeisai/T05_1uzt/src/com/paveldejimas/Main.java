package com.paveldejimas;

import com.paveldejimas.bazine.ZmogusImpl;

public class Main {

    public static void main(String[] args) {
        ZmogusImpl zmogus = new ZmogusImpl(false, "4298246", "Jonas", "Jonaitis", 19, 74.2, 1.72, "Ruda");

        zmogus.setLytis(true);
        //System.out.println("Lytis:" + (zmogus.istLytis() ? " Vyras " : " Moteris "));

        System.out.println(zmogus);

    }
}
