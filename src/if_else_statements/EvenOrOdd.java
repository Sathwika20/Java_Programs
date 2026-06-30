package if_else_statements;

public class EvenOrOdd {
    public static void main(String[] args){
        int num = 19;
        //if there is only statement after if, curly braces({}) are not mandate
        if(num%2 == 0)
            System.out.print("Even Number");
        else {
            System.out.print("Odd Number");
        }
    }
}
class voteForEligibility {
    public static void main(String[] args){
        int age = 18;
        //1st condition will execute and it will not compare with else statement
        // as it is not attached to else statement
        if (age == 18){
            System.out.println("1st Vote");
        }
        //age>18 is false here so the statement written in else statement will get printed
        //the below if will check for condition and compares with else as it is attached to else statement
        if (age > 18) {
            System.out.println("You can Vote");
        }
        else {
            System.out.println("Not eligible for Vote");
        }
    }
}
