package com.example.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindNumberOfRepeatedCharacter {

	public static void main(String[] args) {
		System.out.println("enter the string");

		Scanner in = new Scanner(System.in);

		String stre = in.nextLine();
		int len = stre.length();

		LinkedHashMap<Character, Integer> hascount = new LinkedHashMap<>();
		Character ch;

		for (int i = 0; i < len; i++) {
			ch = stre.charAt(i);
			if (hascount.containsKey(ch)) {

				hascount.put(ch, hascount.get(ch) + 1);

			} else {
				hascount.put(ch, 1);

			}

		}
		Set<Character> charsInString = hascount.keySet();
		for (Character character : charsInString) {

			if (hascount.get(character) > 1) {

				System.out.println(character + ":is repeated:" + hascount.get(character) + " times");
			}

		}

	}

}
