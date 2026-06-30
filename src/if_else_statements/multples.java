package if_else_statements;

import java.util.Scanner;

public class multples {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num%4 == 0){
            System.out.println("It is a multiple of 4");
        }
        else if (num%20 == 0) {
            System.out.println("It is a multiple of 20");
        }
        else{
            System.out.println("Not a multiple");
        }
    }
}
