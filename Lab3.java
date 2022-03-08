package lesson3;

import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {

        /* Lab 3.1
        Count how many odd, even number(s) in an integer array
        int[] intArr = {1, 2, 3, 4, 5};

        Even numders: 2
        Odd numbers: 3*/

        System.out.println("lab 3.1");
        int[] intArr = {1, 2, 3, 4, 5};
        int evenNumCount = 0;
        int oddNumCount = 0;
        for (int elementValue : intArr) {
            if (elementValue % 2 == 0) {
                evenNumCount = evenNumCount + 1;
            } else {
                oddNumCount = oddNumCount + 1;
            }
        }
        System.out.println("Total Even Number: \t" + evenNumCount);
        System.out.println("Total Odd Number: \t" + oddNumCount);
        System.out.println("**********************************************\n");


        /* Lab 3.2
        Finding maximum value/minimum value from an integer array
        int[] intArr = {1, 2, 3, 4, 5};

        Minimum: 1
        Maximum: 5*/

        System.out.println("lab 3.2");
        int[] newIntArr = {1, 2, 3, 4, 5};
        int minimumElement = newIntArr [0];
        int maximumElement = newIntArr [0];
        for (int elementIndex = 1; elementIndex < newIntArr.length; elementIndex++) {
            if (newIntArr [elementIndex] < minimumElement) {
                minimumElement = newIntArr [elementIndex];
            }
        }
        for (int elementIndex = 1; elementIndex < newIntArr.length; elementIndex++) {
            if (newIntArr [elementIndex] > maximumElement) {
                maximumElement = newIntArr [elementIndex];
            }
        }
        System.out.println("The Minimum Element: \t" + minimumElement);
        System.out.println("The Maximum Element: \t" + maximumElement);
        System.out.println("**********************************************\n");

        /*Lab 3.3
        Sort an integer array from min to max
        Input: {12, 34, 1, 16, 28}

        Expected output: {1, 12, 16, 28, 34}*/

        System.out.println("lab 3.3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your array length: \t");
        int myArrLength = scanner.nextInt();

        int[] myArr = new int[myArrLength];
        for (int myIndex = 0; myIndex < myArrLength; myIndex++) {
            System.out.printf("Please insert Index %d:\t", myIndex);
            myArr[myIndex] = scanner.nextInt();
        }

        for (int myArrIndex = 0; myArrIndex < myArr.length; myArrIndex++) {
            for (int myNewArrIndex = myArrIndex + 1; myNewArrIndex < myArrLength; myNewArrIndex++) {
                if (myArr[myNewArrIndex] < myArr[myArrIndex]) {
                    int myNewElement = myArr[myArrIndex];
                    myArr[myArrIndex] = myArr[myNewArrIndex];
                    myArr[myNewArrIndex] = myNewElement;
                }
            }
        }
        for (int myArrIndex = 0; myArrIndex < myArr.length; myArrIndex++) {
            System.out.printf("New index %d:\t %d\n", myArrIndex, myArr[myArrIndex]);
        }
        System.out.println("**********************************************\n");

        /*Lab 3.4
        Merge 2 SORTED integer array into one SORTED array
        Array 01: {1, 12, 16, 28, 34}
        Array 02: {1, 13, 16, 27, 99}

        Expected output: {1, 1, 12, 13, 16, 16, 27, 28, 34, 99}*/

        System.out.println("lab 3.4");
        System.out.print("Array 01 length: \t");
        int theFirstArrLength = scanner.nextInt();

        int[] theFirstArr = new int[theFirstArrLength];
        int theFirstArrIndex = 0;
        for (; theFirstArrIndex < theFirstArrLength; theFirstArrIndex++) {
            System.out.printf("Please insert Array 01 index %d: \t", theFirstArrIndex);
            theFirstArr[theFirstArrIndex] = scanner.nextInt();
        }
        System.out.print("Array 02 length: \t");
        int theSecondArrLength = scanner.nextInt();

        int[] theSecondArr = new int[theSecondArrLength];
        int theSecondArrIndex = 0;

        for (; theSecondArrIndex < theSecondArrLength; theSecondArrIndex++) {
            System.out.printf("Please insert Array 02 index %d: \t", theSecondArrIndex);
            theSecondArr[theSecondArrIndex] = scanner.nextInt();
        }

        int theArrLength = theFirstArrLength + theSecondArrLength;
        int[] theArr = new int[theArrLength];
        for (int theArrIndex = 0; theArrIndex < theArrLength; theArrIndex++) {
            if (theArrIndex < theFirstArrLength) {
                theArr[theArrIndex] = theFirstArr[theArrIndex];
            } else {
                theArr[theArrIndex] = theSecondArr[theArrIndex - theFirstArrLength];
            }
        }
        for (int theArrIndex = 0; theArrIndex < theArrLength; theArrIndex++) {
            System.out.printf("The Arr index %d: %d\n", theArrIndex, theArr[theArrIndex]);
        }

        for (int theArrIndex = 0; theArrIndex < theArrLength; theArrIndex++) {
            for (int theNewArrIndex = theArrIndex + 1; theNewArrIndex < theArrLength; theNewArrIndex++) {
                if (theArr[theNewArrIndex] < theArr[theArrIndex]) {
                    int theNewElement = theArr[theArrIndex];
                    theArr[theArrIndex] = theArr[theNewArrIndex];
                    theArr[theNewArrIndex] = theNewElement;
                }
            }
        }
        for (int theArrIndex = 0; theArrIndex < theArrLength; theArrIndex++) {
            System.out.printf("The Arr new index %d: %d\n", theArrIndex, theArr[theArrIndex]);
        }
    }
}

