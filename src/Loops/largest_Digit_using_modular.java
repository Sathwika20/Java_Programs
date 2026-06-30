package Loops;

import java.util.Scanner;

public class largest_Digit_using_modular {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here");
        int num = sc.nextInt();
        int maxDigit = 0;
        for(;num>0; num = num/10){
            int lastDigit = num%10;
            if(lastDigit > maxDigit){
                maxDigit = lastDigit;
            }
        }
        System.out.println(maxDigit);
    }
}
