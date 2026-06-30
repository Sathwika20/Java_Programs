package java_basics;

public class DataTypes {
    public static void main(String[] args){
        //boolean takes 1 bit
        boolean result = false;
        System.out.println(result);

        //byte takes 1byte = 8bits
        //-128 to 127
        byte ans = -128;
        System.out.println(ans);

        //short takes 2 bytes
        //-3200 to 3200
        short data = -3200;
        System.out.println(data);

        //char takes 2 bytes
        char alpha = 'A';
        char beta = '9';
        //to store the ASCII Value we are converting char to int
        System.out.println(alpha);
        System.out.println("ASCII Value is:" + (int) beta);
        System.out.println("ASCII value is:" + (int) alpha);

        //long takes 8 bytes of memory
        //for long L should be written at the end of the number
        long  ph = 123456789L;
        System.out.println("Phone number is:" +ph);

        //float takes 4 bytes and it is used for decimals
        //7 floating points we can take upto in total combining before decimal and after decimal
        //F should be written at the end of the number
        float marks1 = 1234.893788F;
        float marks2 = 23.9876455F;
        System.out.println("Marks1 is:" +marks1);
        System.out.println("Marks2 is:" +marks2);

        // 8 bytes, it can take upto 15 floating points
        double number = 999.097362637879995;
        System.out.println("Double number is:" +number);

        //float values cannot be converted into int to convert into int
        //we have to Downcast it, Down casting or Explicit conversion
        //Not all data types can be done upcasting or downcasting only few data types are supported
        float value1 = 765.9864F;
        int value2 = (int) value1;
        System.out.println("int value of float is:" +value2);

        //int values can easily convert into float by adding a decimal 0 ex(.0)
        // This is called Upcasting or Implicit type of conversion
        int value3 = 876;
        float value4 = (float) value3;
        System.out.println("float value of int is:"+value4);
    }
}
