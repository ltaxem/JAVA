package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    int sk1;
	    Scanner S = new Scanner(System.in);
	    sk1 = S.nextInt();
	    for(int h=1; h<=10; h++){
	        int sk2 = h * sk1;
	        System.out.println(h + " * " + sk1 + " = " + sk2);
        }
    }
}
