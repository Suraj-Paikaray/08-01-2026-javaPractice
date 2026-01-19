package javaPrograms;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class PrintingStart {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int num = 5;
        for (int i=1; i<=num; i++){
            for (int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            System.out.print("*****");
            
           System.out.println(); 

        }
    }
}