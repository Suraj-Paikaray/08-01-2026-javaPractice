package javaPrograms;

import java.util.Scanner;

public class Palindrome {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
		int number = sc.nextInt();
        Palindrome1(number);
    }
	
		static void Palindrome1(int num){
		int original = num;
        int reverse = 0;
		
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
          }
		
}

}
    

