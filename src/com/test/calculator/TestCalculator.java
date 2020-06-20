package com.test.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import com.example.calculator.Calculator;

public class TestCalculator {

	@Test
	public void testAdd() {
		assertEquals(3, new Calculator().add("1,2"));
	}
	
	@Test
	public void testAdd2() {
		assertEquals(1, new Calculator().add("1"));
	}
	
	@Test
	public void testAdd3() {
		assertEquals(0, new Calculator().add(""));
	}
}
