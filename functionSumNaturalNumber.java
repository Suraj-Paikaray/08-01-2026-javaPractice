package javaPrograms;

import java.util.Scanner;
public class functionSumNaturalNumber {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please provide the number: ");
		int number = in.nextInt();
		int result = NaturalNumberFinder(number);
			System.out.println(result);

		
		
	}
	static int NaturalNumberFinder(int number){
		int sum = 0;
		for(int i = 0; i <= number; i++){
			sum = sum + i;
		} return sum;
	}
}