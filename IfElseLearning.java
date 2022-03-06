package lesson2new;

import java.util.Scanner;

public class IfElseLearning {
    public static void main(String[] args) {
        /* Lab 2.1
         * Get input from user about height(m) and weight(kg) then calculate BMI
         * Underweight = <18.5
         * Normal weight = 18.5 – 24.9
         * Overweight = 25–29.9
         * Obesity = BMI of 30 or greater
         * BMI = weight / (height x 2)
         */
        System.out.println("lab 2.1");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter your height (m): \t");
        float myHeight = scanner.nextFloat();
        System.out.print("Please enter your weight (kg): \t");
        float myWeight = scanner.nextFloat();
        float myBMI = myWeight / (myHeight * 2);
        if (myBMI < 18.5) {
            System.out.println("You are Underweight!");
        } else if (myBMI >= 18.5 && myBMI <= 24.9) {
            System.out.println("You are Normal weight!");
        } else if (myBMI >= 25 && myBMI <= 29.9) {
            System.out.println("You are Over weight!");
        } else {
            System.out.println(" You are Obesity!");
        }
        System.out.println("**********************************************\n");

        /*Lab 2.2
         * Allow user to input a number, print out it’s an odd or even number*/
        System.out.println("Lab 2.2");
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Please enter your Integer Number: \t");
        int myIntegerNum = scanner1.nextInt();
        int myRedundant = myIntegerNum % 2;
        if (myRedundant == 0) {
            System.out.println("Your Integer Number is Even number!");
        } else {
            System.out.println("Your Integer Number is Odd number!");
        }
        System.out.println("**********************************************\n");

        /* Lab 2.3
         * Get input from user about height(m) and weight(kg) then calculate BMI
         * Underweight = <18.5
         * Normal weight = 18.5 – 24.9
         * Overweight = 25–29.9
         * Obesity = BMI of 30 or greater
         * BMI = weight / (height x 2)
         *
         * Suggest user to increase/decrease ??? weight
         */

        System.out.println("Lab 2.3");
        System.out.printf("Please enter your height (m): \t");
        float height = scanner.nextFloat();
        System.out.print("Please enter your weight (kg): \t");
        float weight = scanner.nextFloat();
        float theBMI = weight / (height * 2);
        if (theBMI < 18.5) {
            System.out.println("You are Underweight!");
            System.out.printf("You should gain %fl weight", ((18.5 - theBMI) * height * 2));
        } else if (theBMI >= 18.5 && theBMI <= 4.95) {
            System.out.println("You are Normal weight!");
        } else if (theBMI >= 25 && theBMI <= 29.9) {
            System.out.println("You are Over weight!");
            System.out.printf("You should lose %fl weight", (theBMI - 24.9) * height * 2);
        } else {
            System.out.println(" You are Obesity!");
            System.out.printf("You should lose %fl weight", (theBMI - 24.9) * height * 2);
        }
    }
}


