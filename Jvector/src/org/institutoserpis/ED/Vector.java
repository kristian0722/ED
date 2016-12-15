package org.institutoserpis.ED;


public class Vector {
	
	public static void main(String[]args) {
		
//		int index=0;
//		while(index<5){
//		    System.out.println("index= " +index);
//			index++;
//		}
//	    System.out.println("fuera del ciclo index= " +index);

		//int[] v=new int[]{32,15,7,9,12};
//		for (int index=0;index<v.length;index++){
//		
//			System.out.println("v[" + index + "]= "+v[index]);
//		
//		 System.out.println(v[index]);	
//		}
//		System.out.println("IndexOf= "+indexOf(v,25));
//		System.out.println("IndexOf= "+indexOf(v,32));
//		}
		int index=indexOf(new int[]{32,15,7,9,12},99);
		System.out.println("Vector"+index);
	}
		public static int indexOf(int[] v,int valor){
//			wirth algoritmos y estructura de datos
			int index=0;
			while(index < v.length && v[index]!= valor )
				index++;
			if(index == v.length)
				return -1;
			return index;
		}		
		
}
