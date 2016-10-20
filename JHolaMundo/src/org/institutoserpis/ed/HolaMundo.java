package org.institutoserpis.ed;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre : ");
        String nombre =scanner .nextLine();
        System.out.print("Dime tu edad:");
        String edad =scanner .nextLine();
        int edadNumero =Integer.parseInt(edad) + 1  ;
		  System.out.println("Hola "+ nombre +" el año que viene tendrás "+ edadNumero + " años");
//          String s ="34";
//          int i=Integer.parseInt(s);
//          System.out.println("i="+i);
         
	}
}
