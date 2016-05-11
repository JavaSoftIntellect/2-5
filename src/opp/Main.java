package opp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter number:");
		
		int theNumber = reader.nextInt();
		boolean task;
		if(theNumber % 5 ==0 && theNumber % 7 ==0){
			task=true;
			System.out.println("\n The number can be devidet to 5 and 7 without odd!");
			}else{
				task=false;
				System.out.println("\n The number can't be devidet to 5 and 7 without odd!");
			}
	}

}
