package javaPrograms;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class PalindromePattern {
    public static void main(String[] args) {
        int num = 5;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1;j--){
                System.out.print( ""+ j);
            }
            
            for(int j=2; j<=i;j++){
             System.out.print(j);
  
            }
            System.out.println();


        }
    }
    
    }
    