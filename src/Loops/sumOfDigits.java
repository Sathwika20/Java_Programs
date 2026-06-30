package Loops;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here");
        int num = sc.nextInt();
        int count = 0;
        for(int temp = num; temp >0; temp = temp/10){
            int lastDigit = temp%10;
            count = count+lastDigit;
        }
        System.out.println(count);
    }
}
