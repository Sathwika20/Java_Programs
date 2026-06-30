package Geeks_for_Geeks;

import java.util.Scanner;

public class TheIfStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        if(num > 100){
            System.out.println("\"BIG\"");
        }
        else{
            System.out.println("Number");
        }
    }
}
