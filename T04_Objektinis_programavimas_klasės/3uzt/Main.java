package com.company;

public class Main {
    public static void main(String[] args) {
        Mokiniai[] mok = new Mokiniai[3];
        mok[0] = new Mokiniai("Jonaitis", "Jonas", 12, new int[]{1, 3, 3, 5, 5});
        mok[1] = new Mokiniai("Tomaitis", "Tomas", 11, new int[]{10, 9, 6, 5, 7});
        mok[2] = new Mokiniai("Petraitis", "Petras", 9, new int[]{2, 3, 2, 5, 1});

//        mok[0].setPaz(new int[]{5, 2, 10, 9,4});          //Keisti paþymius

        for (int i = 0; i < mok.length; i++) {
            mok[i].setVid2(mok[i].skaiciuotiVid());         // Prilyginame vidurkius
            System.out.println(mok[i]);
        }
        ieskotiSkol(mok);
    }

    static void ieskotiSkol(Mokiniai[] mok) {
        int k = 0;
        for (int i = 0; i < mok.length; i++) {
            if (mok[i].getVid2(mok[i].skaiciuotiVid()) < 3.5) {
                k++;
            }
        }
        System.out.println("Skolininkø: " + k);
    }

}