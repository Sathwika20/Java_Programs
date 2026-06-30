package java_basics;

public class Increment {
    public static void main(String[] args){
        int num = 3;
        //If we add increment (++) before the number it will display the result by incrementing
        System.out.println(++num);
        //If we add increment(++) after the number the increment happens later
        //so we have to add another print statement to see the incremented value
        System.out.println(num++);
        System.out.println(num);
    }
}
