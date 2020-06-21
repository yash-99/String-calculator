package com.example.calculator;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator extends Exception {

	public static int add(String numbers) throws Exception {

		int sum = 0;

		if (numbers.length() > 0) {

			Pattern pattern = Pattern.compile("//(\\[.*\\])(\\[.*\\])\n(.*)");
			Matcher matcher = pattern.matcher(numbers);
			matcher.matches();
			String group1=matcher.group(1);
			String group2 = matcher.group(2)+"|"+group1;
			String group3 =matcher.group(3);
			

			String[] str_arr = group3.split(group2); // ";|\n"
			ArrayList<Integer> list = new ArrayList<Integer>();
			try {
				for (int i = 0; i < str_arr.length; i++) {
					int num = (str_arr[i].isEmpty())?0:Integer.parseInt(str_arr[i]);
					if (num < 0) {
						list.add(num);
					} else if (num < 1000) {
						sum = sum + num;
					}
				}

				if (list.size() > 0)
					throw new Exception("negatives not allowed " + list);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}

		}

		return sum;
	}

}
