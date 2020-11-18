package com.Homely.entity;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator cal=new Calculator();
		int a =3;
		int b=5;
		int result=cal.add(a, b);
		int expected=8;
		
		assertEquals(expected,result);
	}

}
