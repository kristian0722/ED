package org.institutoserpis.ED;


public class Vector {
	
	public static int min(int[] v){
		
		int c=v[0];
// 		
//		for(int i=1;i<v.length;i++)
//			if(v[i]< c )
//				c=v[i];
		for (int item:v)
			if(item<c)
				c=item;
			return c;
	}
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
//			int index=0;
//			while(index < v.length && v[index]!= valor )
//				index++;
//			if(index == v.length)
//				return -1;
//			return index;
			
			int index=0;
			for(int item:v){
				if(item==valor)
					return index;
				index++;
			}
			
			return -1;
		}		
		
		public static void selectionSortUgly(int[] v){

			for(int itemIndex=0;itemIndex<v.length;itemIndex++){
				int indexOfMin=itemIndex;
				for(int index=itemIndex+1;index<v.length;index++)
					if(v[index]<v[indexOfMin])
						indexOfMin=index;
				int aux =v[itemIndex];
				v[itemIndex]=v[indexOfMin];
				v[indexOfMin]=aux;
				
			}
				
			
		}
		
		private static int indexOfMin(int[] v,int initialIndex){
			
			int indexOfMin=initialIndex;
			for(int index= initialIndex+1;index<v.length;index++)
				if(v[index]<v[indexOfMin])
					indexOfMin=index;
			return indexOfMin;
		}
		private static void swap(int[] v,int indexOne,int indexTwo){
			int aux=v[indexOne];
			v[indexOne]=v[indexTwo];
			v[indexTwo]=aux;
		}
		
		public static void selectionSort(int[] v){

			for(int itemIndex=0;itemIndex<v.length;itemIndex++){
				int indexOfMin=indexOfMin(v,itemIndex);
				swap(v,itemIndex,indexOfMin);				
			}	
		}
}
