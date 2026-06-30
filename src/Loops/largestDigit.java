package Loops;

import java.util.Scanner;

public class largestDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here");
        int num = sc.nextInt();
        String str = Integer.toString(num);
        int maxDigit = 0;
        for(int i=0; i<str.length(); i++){
            //If you subtract the character '0' from any digit character, it automatically
            // calculates the correct integer value. For example, '5' - '0' translates to $53 - 48 = 5$.
            if((str.charAt(i)-'0') > maxDigit){
                maxDigit = (str.charAt(i)-'0');
            }
        }
        System.out.println(maxDigit);
    }
}
