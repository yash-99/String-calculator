package com.test.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import com.example.calculator.Calculator;

public class TestCalculator {

	@Test
	public void testAdd() {
		new Calculator();
		assertEquals(3, Calculator.add("1,2"));
	}
	
	@Test
	public void testAdd2() {
		new Calculator();
		assertEquals(1, Calculator.add("1"));
	}
	
	@Test
	public void testAddMultipleNumbers() {
		new Calculator();
		assertEquals(9, Calculator.add("2,3,4"));
	}
}
