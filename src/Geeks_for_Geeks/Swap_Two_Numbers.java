package Geeks_for_Geeks;

public class Swap_Two_Numbers {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        System.out.println("Before Swapping:a="+a+",b ="+b);
        int temp;
        temp = a;
        System.out.println(temp);
        //now a is empty as a value is stored in temp
        a = b;
        //now b is empty as b value is stored in a
        b = temp;
       System.out.println("After Swapping: a="+a+",b = "+b);

    }
}
