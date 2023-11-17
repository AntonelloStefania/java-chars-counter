package org.lessons.java.charscounter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("inserisci una parola: ");
		String word = in.nextLine();
		
		
		Map<Character, Integer> charInWord = new HashMap<>();
		
		for (Character c : word.toLowerCase().toCharArray()) {
			
			if (charInWord.containsKey(c)) {
				
				charInWord.put(c, charInWord.get(c) + 1);
			} else {
				
				charInWord.put(c, 1);
			}
		}
		in.close();
		System.out.println(charInWord);
	}
}
