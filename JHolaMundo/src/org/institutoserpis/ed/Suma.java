package org.institutoserpis.ed;

import java.math.BigDecimal;
import java.util.Scanner;

public class Suma {
	
public static void main(String[]args){
	Scanner tcl=new Scanner(System.in);
	System.out.println("Escribe dos numeros:");
	System.out.print("introduce el primer numero");
	String primernumero=tcl.nextLine();
	BigDecimal primero=new BigDecimal(primernumero);
	System.out.print("Introduce el segundo:");
	String segundonumero=tcl.nextLine();
	BigDecimal segundo=new BigDecimal(segundonumero);
	BigDecimal suma=BigDecimal.ZERO;	
	suma=suma.add(primero) .add(segundo);
	System.out.println("El resultado de la suma es: "+suma);
}
}
