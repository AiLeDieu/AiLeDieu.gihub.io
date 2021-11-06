package lesson1;

public class VariableLearning {
    public static void main(String[] args) {
        byte myByteNum1 = 1;
        short theShortNum = 1;
        int myNum1 = 4;
        int myNum2 = 5;
        long theLongNum = 1;
        float myFloatNum = 1F;
        double theDoubleNum = 1.0;
        char theChar = 'M';
        boolean amIFalse = false;
        System.out.println("Hi");
        System.out.println("********BYTE**********");
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println("********SHORT**********");
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println("********INT**********");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println("********LONG**********");
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println("********FLOAT**********");
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println("********DOUBLE**********");
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println("********^_^**********");
        System.out.printf("The size of this Shirt is: %c\n",theChar);
        System.out.println("********^_^**********");
        Boolean ismyNum1DifferentmuNum2 = myNum1 != myNum2;
        System.out.println(ismyNum1DifferentmuNum2);
        System.out.println("********^_^**********");
        System.out.printf("Number #1 is: %d\t Number #2 is: %d\n " +
                "My answer for statement 'Number #1 different to Number #2' is: %b\n", myNum1, myNum2, ismyNum1DifferentmuNum2);
        Boolean ismyNum1equaltmuNum2 = myNum1 == myNum2;
        System.out.printf("Number #1 is: %d\n and Number #2 is: %d\n " +
                "My answer for statement 'Number #1 equal Number #2' is: %b\n", myNum1, myNum2, ismyNum1equaltmuNum2);
        System.out.println("********^_^**********");
        System.out.println("Thankyou");
    }
}
