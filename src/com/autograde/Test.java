package com.autograde;

import java.io.File;
import java.io.IOException;

public class Test {	
	
	public static String generateTestCase(int problem) throws IOException {
		
		File input = new File("src/input.txt");
		RandomWord rw = new RandomWord(64, input);
		
		char[] commands = {'a', 'p', 's', 'l'};
		int numQueries = rw.nextInt(900) + 100; //Not so big test cases
		//Pretty big is 10000
		
		int size = 0;
		StringBuilder sb = new StringBuilder();
		
		for (int j = 0; j < numQueries; j++) {
			char command = size == 0 ? commands[rw.nextInt(2)] : commands[rw.nextInt(4)];
			if (command == 'a') size++;
			if (command == 's' || command == 'l') size--;
			
			String query = command == 'a' ? command + " " + rw.nextWord(): command + "";
			sb.append(query + "\n");
		}
		
		return sb.toString();
	}
}