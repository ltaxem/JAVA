package com.company;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("Daugybos lentelė");
		System.out.println("Įveskite skaičių: ");
		Scanner S = new Scanner(System.in);
		int sk1 = S.nextInt();

		System.out.println("Įveskite (*; /) ");
		String zenklas= S.next();
		if(zenklas.equals("*")){
			for(int h=1; h<10; h++){
				int sk2 = h * sk1;
				if(sk2<=100){
					System.out.println(h + " * " + sk1 + " = " + sk2);
				}
			}

				}
		if(zenklas.equals("/")){
			for(int h=1; h<100; h++){
				int sk2 = h / sk1;
				if(sk2<=100){
					System.out.println(sk1 + " / " + h + " = " + sk2);
				}
			}
		}
	}
}
