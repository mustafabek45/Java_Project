package day01;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name=scan.nextLine();
        String lastName=scan.next();
        int age=scan.nextInt();
        System.out.println("Name: "+name+"\n"+"LastName: "+lastName+"\n"+"Age: "+age);

        // Get the name from the user and print the first letter in uppercase

        char firstLetter = scan.next().charAt(0);
        System.out.println("firstLetter: "+firstLetter);

    }
}
