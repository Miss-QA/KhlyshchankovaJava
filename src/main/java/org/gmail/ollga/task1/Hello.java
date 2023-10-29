package org.gmail.ollga.task1;
import java.util.Scanner;
public class Hello {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();

        if (number > 7){
            System.out.println("Hello");
        }
    }
}
