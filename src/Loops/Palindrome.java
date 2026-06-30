package Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String here");
        String X = sc.next();
        int length = X.length();
        String forwardString = "";
        String reverseString = "";
        for(int i=0; i<length; i++){
            forwardString = forwardString + X.charAt(i);
        }
        System.out.println(forwardString);
        for(int i=length-1; i>=0; --i){
            reverseString = reverseString + X.charAt(i);
        }
        System.out.println(reverseString);
        if(forwardString.equals(reverseString)){
            System.out.println("Is a Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
