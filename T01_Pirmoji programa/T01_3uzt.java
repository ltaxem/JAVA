package com.company;

import java.util.Scanner; //Biblioteka scanner

public class Main {
    public static void main(String[] args) {
	    int sk1, ats;                               //Kintamieji
        System.out.println("Daugybos Lentelë");
        System.out.println("Áveskite Skaièiø: ");
        Scanner S = new Scanner(System.in);
        sk1 = S.nextInt();                          //Ivedimui
        for(int h = 1; h<11; h++){
            ats = sk1 * h;                          //Daugybos lentelë
            // System.out.println(h + " * " + sk1 + " = " + ats);
            if(ats < 50){
                System.out.println(sk1+" * "+h+" = "+ats+" < 50");
            }
            else if(ats == 50){
                System.out.println(sk1+" * "+h+" = "+ats+" = 50");
            }
            else if(ats > 50){
                System.out.println(sk1+" * "+h+" = "+ats+" > 50");
            }
        }

    }
}
