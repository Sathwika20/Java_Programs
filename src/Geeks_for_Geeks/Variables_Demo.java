package Geeks_for_Geeks;

public class Variables_Demo {
    //instance variable belongs to each object
    int instance_var = 10;
    //static variable shared across all objects of the class
    static String static_var = "I am Sathwika";
    public void showVariables(){
        //local variable declared inside a method
        int local_var = 5;
        System.out.println("Instance variable" + instance_var);
        System.out.println("Static variable" + static_var);
        System.out.println("Local variable"+local_var);
    }
    public static void main(String[] args){
        //creating a object for the class
        Variables_Demo obj1 = new Variables_Demo();
        obj1.showVariables();
        //Accessing static variables via class
        System.out.println("Accessing static variables via class" +static_var);
    }
}
