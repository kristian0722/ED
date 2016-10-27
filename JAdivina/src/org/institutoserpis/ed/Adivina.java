package org.institutoserpis.ed;
import java.util.*;
public class Adivina {

	public static void main(String[] args) {
		Scanner tcl=new Scanner(System.in);
		Random rnd= new Random();
		rnd.setSeed(new Date().getTime());
		int numeroaleatorio=rnd.nextInt(1000)+1;
		int numero,contador;
		contador=0;
		do{
		System.out.println("Escribe un numero");
		numero=tcl.nextInt();
		if(numero<numeroaleatorio){
			System.out.println("Tu numero es menor");
			contador=contador+1;
		                          }
		
		else
			if(numero>numeroaleatorio){
			System.out.println("Tu numero es mayor");
			contador=contador+1;	}
										
		  
			
		
		}while(numero!=numeroaleatorio);
		System.out.print("Has acertado!!");
		System.out.println("Veces que lo has intentado "+contador);
	}

}
