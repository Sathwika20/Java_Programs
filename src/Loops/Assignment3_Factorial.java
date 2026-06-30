package Loops;

import java.util.Scanner;

public class Assignment3_Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here");
        int num = sc.nextInt();
        int factorial = 1;
        for(int i=1; i<=num; i++){
            //factorial = 1
            //i=1
            //factorial = 1*1 = 1
            //factorial = 1
            //i = 2
            //factorial = 1*2 = 2
            //factorial = 2
            //i = 3
            //factorial = 2*3
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
