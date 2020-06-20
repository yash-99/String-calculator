package com.example.calculator;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator extends Exception {

	public static int add(String numbers) throws Exception {

		int sum = 0;

		if (numbers.length() > 0 && numbers.startsWith("//")) {

			Pattern pattern = Pattern.compile("//(.)\n(.*)");
			Matcher matcher = pattern.matcher(numbers);
			matcher.matches();

			String group2 = matcher.group(2);

			String[] str_arr = group2.split(";"); // ";|\n"
			ArrayList<Integer> list = new ArrayList<Integer>();
			try {
				for (int i = 0; i < str_arr.length; i++) {
					int num = Integer.parseInt(str_arr[i]);
					if (num < 0) {
						list.add(num);
					} else {
						sum = sum + num;
					}
				}
				
				if(list.size()>0)
				throw new Exception("negatives not allowed " + list);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}

		}

		return sum;
	}

}
