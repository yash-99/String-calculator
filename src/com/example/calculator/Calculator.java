package com.example.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

	public static int add(String numbers) {

		int sum = 0;

		if (numbers.length() > 0 && numbers.startsWith("//")) {

			Pattern pattern=Pattern.compile("//(.)\n(.*)");
			Matcher matcher=pattern.matcher(numbers);
			matcher.matches();
			String group2=matcher.group(2);
			String[] num_arr = group2.split(";"); //";|\n"
			for (int i = 0; i < num_arr.length; i++) {
				sum = sum + Integer.parseInt(num_arr[i]);
			}

		}

		return sum;
	}

}
