package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int sk;											// Kintamasis
	    int Paa, Aa, Ta, Ka, Pa, Sa, SSa, AAa, Da, DDa; // 1-10
		System.out.println("Daugybos lentelė");
		System.out.println("Įveskite skaičių");
	    Scanner S = new Scanner(System.in);
	    sk = S.nextInt();
	    Paa = sk;
	    Aa = 2 * sk;
	    Ta = 3 * sk;
	    Ka = 4 * sk;
	    Pa = 5 * sk;
	    Sa = 6 * sk;
	    SSa = 7 * sk;
	    AAa = 8 * sk;
	    Da = 9 * sk;
	    DDa = 10 * sk;
	    System.out.println(sk + " * 1 = " + Paa);
		System.out.println(sk + " * 2 = " + Aa);
		System.out.println(sk + " * 3 = " + Ta);
		System.out.println(sk + " * 4 = " + Ka);
		System.out.println(sk + " * 5 = " + Pa);
		System.out.println(sk + " * 6 = " + Sa);
		System.out.println(sk + " * 7 = " + SSa);
		System.out.println(sk + " * 8 = " + AAa);
		System.out.println(sk + " * 9 = " + Da);
		System.out.println(sk + " * 10 = " + DDa);
    }
}
