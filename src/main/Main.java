package main;

public class Main {
	
	public static githubTester test;
	
	public static void main(String [] args){
		System.out.print("This is the beginning!");
		
		//Running Test Class
		test = new githubTester();		
		test.init();
		
		//Setting up simple one operation calculator
		test.calculatorFun();
	}
}
