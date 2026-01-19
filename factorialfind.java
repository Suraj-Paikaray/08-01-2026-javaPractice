package javaPrograms;

import java.util.Scanner;

public class factorialfind {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Provide your number");
        int num = in.nextInt();
        factorialCal(num);

    }
    public static void factorialCal (int num){
        int factorial = 1;

        if(num < 0) {
            System.out.println("Invalid number");
            return;
        }

        for(int i=num; i>=1; i--){
        factorial = factorial * i;
        }
        System.out.println(factorial);

    }

    }
    

