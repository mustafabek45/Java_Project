package day01;

public class Variables_01 {
    public static void main(String[] args) {
        String name = "Mustafa";
        String lastName = "Bek";
        System.out.println("name : " + name);
        System.out.println("lastname : " + lastName);

        int num1 = 10;
        int num2 = 20;

        num1 = num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
    }
}
