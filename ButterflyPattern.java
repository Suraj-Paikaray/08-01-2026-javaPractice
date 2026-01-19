package javaPrograms;

public class ButterflyPattern {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int num = 4;
        for (int i=1; i<=num; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            int sum = 2 * (num-i);
            for(int j=1; j<=sum; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
            System.out.print("*");

            }
           System.out.println();

           
        }
        for (int i=num; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            int sum = 2 * (num-i);
            for(int j=1; j<=sum; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
            System.out.print("*");

            }
           System.out.println();

           
        }
        
    }
}
    

