package org.institutoserpis.ed;

import java.util.Scanner;

public class Main {
	
public static int suma(double numuno,double numdos){
	double sumatotal=numuno+numdos;
	int total=(int)sumatotal;
	return total;
}
public static int resta(double numuno,double numdos){
	double restatotal=numuno-numdos;
	int total=(int)restatotal;
	return total;
}
public static int multiplicacion(double numuno,double numdos){
	double multitotal=numuno*numdos;
	int total=(int)multitotal;
	return total;
}
public static int division(double numuno,double numdos){
	double dividtotal=numuno/numdos;
	int total=(int)dividtotal;
	return total;
}
public static String binary(int a){
	String b=Integer.toBinaryString(a);
	return b;
}
public static String hexa(int a){
	String b=Integer.toHexString(a);
	return b;
}
public static String octal(int a){
	String b=Integer.toOctalString(a);
	return b;
}
	
public static void main(String[]args){
			
	Scanner tcl=new Scanner(System.in);

	System.out.println("Elige una opcion:");
	System.out.println("0-Salir");
	System.out.println("1-Suma");
	System.out.println("2-Resta");
	System.out.println("3-Multiplicacion");
	System.out.println("4-Division");
	System.out.println("5-Decimal a Binario");
	System.out.println("6-Decimal a Hexadecimal");
	System.out.println("7-Decimal a Octal");
	
	
	int opcion=tcl.nextInt();
			
	switch(opcion){
	case 0:
		System.out.println("Adios");
		break;
	case 1:
		System.out.println("Introduce los numeros");
		double numeroa=tcl.nextInt();
		double numerob=tcl.nextInt();
		System.out.println("El resultado es: "+suma(numeroa,numerob));
		break;
	case 2:
		System.out.println("Introduce los numeros");
		double numeroc=tcl.nextInt();
		double numerod=tcl.nextInt();
		System.out.println("El resultado es: "+resta(numeroc,numerod));
		break;
	case 3:
		System.out.println("Introduce los numeros");
		double numeroe=tcl.nextInt();
		double numerof=tcl.nextInt();
		System.out.println("El resultado es: "+multiplicacion(numeroe,numerof));
		break;
	case 4:
		System.out.println("Introduce los numeros");
		double numerog=tcl.nextInt();
		double numeroh=tcl.nextInt();
		System.out.println("El resultado es: "+division(numerog,numeroh));
		break;
	case 5:
		System.out.println("Introduce el numero");
		int numeroj=tcl.nextInt();
		System.out.println("El resultado es: "+binary(numeroj));
		break;
	case 6:
		System.out.println("Introduce el numero");
		int numerop=tcl.nextInt();
		System.out.println("El resultado es: "+hexa(numerop));
		break;
	case 7:
		System.out.println("Introduce el numero");
		int numerok=tcl.nextInt();
		System.out.println("El resultado es: "+octal(numerok));
		break;
		}
	tcl.close();
		
	}

}
