package if_else_statements;

import java.util.Scanner;

public class nestedIf {
    public static void main(String[] args){
//        String M = "";
//        String F = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your gender");
        String gender = sc.next();
        if(age == 18){
            if(gender.equals("M")){
                System.out.println("Please vote Boy");
            }
            else{
                System.out.println("Please vote Girl");
            }
        }
        if(age > 18){
            System.out.println("You can Vote");
        }
        else{
            System.out.println("You cannot vote");
        }

    }
}
