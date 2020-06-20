package com.example.calculator;

public class Calculator {

	public static int add(String numbers) {

		int sum = 0;

		if (numbers.contains(",") || numbers.length()>0) {

			String[] num_arr = numbers.split(",");
			for (int i = 0; i < num_arr.length; i++) {
				sum=sum+Integer.parseInt(num_arr[i]);
			}
			
		}

		return sum;
	}


}
