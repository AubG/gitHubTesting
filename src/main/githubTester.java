package main;

import java.util.Scanner;

public class githubTester {
	
	boolean isSheABoob = false;
	//Changed Scanner to be global
	Scanner input = new Scanner(System.in);
	
	public githubTester(){
		//Empty cause I said so
	}
	
	public void init(){
		System.out.println("Apparently We are initializing!");
		this.setIsBoob();
	}
	
	public void setIsBoob(){
		String ans;
		
		System.out.println("Is she a boob? (True or False):");
		ans = input.next().toLowerCase();
		
		if(ans.equals("true")){
			isSheABoob = true;
		} else if(ans.equals("false")){
			isSheABoob = false;
		} else {
			System.out.print("Not valid answer, dumbass");
		}
	}
	
	public boolean getIsBoob(){
		return isSheABoob;
	}

	public void calculatorFun() {
		double x,y,z = 0;
		boolean dumbass = false;
		String operation;
		
		System.out.println("Input X and Y values: (ex: 55 4 or -350 57 et cetera)");
		x = input.nextFloat();
		y = input.nextFloat();
		
		System.out.println("Select Operation: + \\ - \\ * ");
		operation = input.next();
		
		switch(operation){
		case "+":
			z = x + y;
			break;
		case "-":
			z = x - y;
			break;
		case "*":
			z = x * y;
			break;
		default:
			System.out.println("Picked invalid operation, therefore you are dumbass");
			
			break;
		}
		
		if(!dumbass){
		System.out.println("Answer to: " + x + operation + y + " = " + z);
		} else {
			System.out.println("Answer to: " + x + operation + y + " = " + "DUMBASSs");
		}
		
	}
}
