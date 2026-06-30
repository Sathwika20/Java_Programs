package if_else_statements;

public class elifConditions {
    public static void main(String[] args){
        int num = 10;
        if(num == 0) {
            System.out.print("Zero number");
        }
        else if (num%2 == 0) {
            System.out.print("Multiple of 2");
        }
        else if (num%5 == 0) {
            System.out.print("Multiple of 5");
        }
        else {
            System.out.print("Could not guess");
        }
    }
}
