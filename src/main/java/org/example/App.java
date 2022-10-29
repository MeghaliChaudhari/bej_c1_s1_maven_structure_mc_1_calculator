package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two Number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Calculator obj =new Calculator();
        System.out.println("Addition = " + obj.add(a, b));
        System.out.println("Substraction = " + obj.sub(a, b));
        System.out.println("Multiplication = " + obj.mul(a, b));
        System.out.println("Division = " + obj.div(a, b));
    }
}
