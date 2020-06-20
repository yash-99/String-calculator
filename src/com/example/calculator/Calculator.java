package com.example.calculator;

public class Calculator {

	public int add(String numbers) {

		int sum = 0;

		if (numbers.contains(",")) {

			String[] num_arr = numbers.split(",");
			int var1 = Integer.parseInt(num_arr[0]);
			int var2 = num_arr.length < 2 ? 0 : Integer.parseInt(num_arr[1]);

			sum = var1 + var2;
		}

		return sum;
	}

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		System.out.println(calculator.add("1,2"));
	}

}
