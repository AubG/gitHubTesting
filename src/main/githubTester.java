package main;

import java.util.Scanner;

public class githubTester {
	
	boolean isSheABoob = false;
	
	public githubTester(){
		//Empty cause I said so
	}
	
	public void init(){
		System.out.println("Apparently We are initializing!");
		this.setIsBoob();
	}
	
	public void setIsBoob(){
		Scanner input = new Scanner(System.in);
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
		
		input.close();
	}
	
	public boolean getIsBoob(){
		return isSheABoob;
	}
}
