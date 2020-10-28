package com.autograde;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * The following class generates a random word given an input file 
 * containing words separated by newlines
 * 
 * @author - Sebastian De Jesus Lopez
 * @version 26 October 2020 
 **/
public class RandomWord extends Random {
	
	private List<String> dict;
	
	public RandomWord(File input) throws IOException {	
		setDict(input);
	}
	
	public RandomWord(int seed, File input) throws IOException {
		super(seed);
		setDict(input);
	}
	
	public String nextWord() {
		return dict.get(nextInt(dict.size()));
	}
	
	private void setDict(File input) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(input));
		String word;
		dict = new ArrayList<>();
		while ((word = br.readLine()) != null) dict.add(word);
	}
}

