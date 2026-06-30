package if_else_statements;

import java.util.Scanner;

public class MarksOfStudent {
    public static void main(String[] args){
        //scanner creates a new object to enter the marks in terminal
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks here: ");
        //sc.nextInt will take the number based on the number entered in terminal
        int marks = sc.nextInt();
        if(marks > 90 && marks < 100){
            System.out.println("Grade is A");
        }
        else if (marks > 75 && marks < 89) {
            System.out.println("Grade is B");
        }
        else if (marks > 60 && marks < 74) {
            System.out.println("Grade is C");
        }
        else if (marks > 40 && marks < 59) {
            System.out.println("Grade is D");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
