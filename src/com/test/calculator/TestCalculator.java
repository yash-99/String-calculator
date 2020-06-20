package com.test.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import com.example.calculator.Calculator;

public class TestCalculator {

	@Test
	public void testAdd() {
		assertEquals(3, Calculator.add("1,2"));
	}
	
	@Test
	public void testAdd2() {
		assertEquals(1, Calculator.add("1"));
	}
	
	@Test
	public void testAddMultipleNumbers() {
		assertEquals(9, Calculator.add("2,3,4"));
	}
	
	@Test
	public void testNewLineNumbers() {
		assertEquals(12, Calculator.add("3\n5,4"));
	}
	
	@Test
	public void testDiffDelimeters() {
		assertEquals(4, Calculator.add("//;\n2;2"));
	}
}
