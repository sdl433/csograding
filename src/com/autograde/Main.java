package com.autograde;

/**
 * The following class is responsible for calling a C program and checking against the solution
 * 
 * @author - Sebastian De Jesus Lopez
 * @version 27 October 2020 
 **/
public class Main {
	
	/**
	 * This code snippet is responsible for calling a C program from Java
	 * 
	 * @author - javapapers 
	 **/
	private native void helloC();
	
	static {
		System.load("main");
	}
	
	/**
	 * The main function for the project.
	 * 
	 * @param args - the first (one-based) argument is supposed to be the C filename
	 * 			   - the second argument is supposed to be the problem number
	 **/
	public static void main(String[] args) {
		
		//args expects a C file as the second parameter
		String filename = args[1];
		int problem = Integer.parseInt(args[2]);
		(new Main()).helloC();
		
		
		
	}
	
	
}
