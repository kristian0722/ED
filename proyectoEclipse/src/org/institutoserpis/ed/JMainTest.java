package org.institutoserpis.ed;

import static org.junit.Assert.*;


import org.junit.Test;

public class JMainTest extends Main {

	@Test
	public void suma(){
		
		assertEquals(17,suma(8,9));
		assertEquals(0,suma(0,0));
		assertEquals(10,suma(9,1));
	}
	
	@Test
	public void resta(){
		assertEquals(-1,resta(8,9));
		assertEquals(0,resta(0,0));
		assertEquals(2,resta(5,3));
	}
	
	@Test 
	public void multiplicacion(){
		assertEquals(72,multiplicacion(8,9));
		assertEquals(0,multiplicacion(0,0));
		assertEquals(-15,multiplicacion(-3,5));
	}
	
	@Test
	public void division(){
		assertEquals(2,division(5,2));
		assertEquals(4,division(16,4));
		assertEquals(-3,division(6,-2));
	}
	
	@Test
	public void binary(){
		assertEquals("10",binary(2));
		assertEquals("1000",binary(8));
		assertEquals("11111111111111111111111111111111",binary(-1));
	}
	@Test
	public void hexa(){
		assertEquals("3e",hexa(62));
		assertEquals("34",hexa(52));
		assertEquals("3e7",hexa(999));
	}
	@Test
	public void octal(){
		assertEquals("11",octal(9));
		assertEquals("31",octal(25));
		assertEquals("6",octal(6));
	}
	

}
