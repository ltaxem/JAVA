package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
	    int sk1, ats;
	    int h=1;
	    System.out.println("Daugybos lentelė");
	    System.out.println("Įveskite sk.: ");
	    Scanner S = new Scanner(System.in);
	    sk1 = S.nextInt();
	    while(h < 11){
	        ats = sk1 * h;
	        System.out.println(h + " * " + sk1 + " = " + ats);
	        h++;
        }
    }
}
