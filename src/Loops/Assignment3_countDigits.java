package Loops;

import java.util.Scanner;

public class Assignment3_countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers here");
        int number = sc.nextInt();
        int count = 0;
        if(number == 0){
            count = 1;
        }
        else{
            if(number<0){
                number = -number;
            }
            for(int temp = number; temp >0; temp = temp/10){
                count = count+1;
            }
        }
        System.out.println(count);
    }
}
