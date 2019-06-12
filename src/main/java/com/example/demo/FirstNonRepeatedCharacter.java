package com.example.demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {
		System.out.println("enter the string");

		Scanner in = new Scanner(System.in);

		String stre = in.nextLine();
		int len = stre.length();

		// HashMap<Character, Integer> hascount = new HashMap<Character, Integer>();
		// using hasmap
		LinkedHashMap<Character, Integer> hascount = new LinkedHashMap<>();// usin linked hasmap
		Character ch;

		for (int i = 0; i < len; i++) {
			ch = stre.charAt(i);
			if (hascount.containsKey(ch)) {

				hascount.put(ch, hascount.get(ch) + 1);

			} else {
				hascount.put(ch, 1);

			}

		}

		/*
		 * for (int j = 0; j < len; j++) {
		 * 
		 * ch = stre.charAt(j); if (hascount.get(ch) == 1) {
		 * 
		 * System.out.println("frist non-repeated scharecter::" + ch); break;
		 * 
		 * }
		 * 
		 * }
		 */

		for (Map.Entry<Character, Integer> entry : hascount.entrySet()) {

			if (entry.getValue() == 1) {

				System.out.println("frist non-repeated scharecter::" + entry.getKey());

			}

		}
	}

}
