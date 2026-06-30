package if_else_statements;


import java.util.Scanner;

public class positiveNegativeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("Zero");
        }
        else if (num > 0) {
            System.out.println("Positive Number");
        }
        else{
            System.out.println("Negative Number");
        }
    }
}
