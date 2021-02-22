import java.util.Scanner;

public class CheckIncreaseDecreaseOrder {

    // Write a program that accepts three numbers from the user and
    // prints "increasing" if the numbers are in increasing order,
    // "decreasing" if the numbers are in decreasing order, and
    // "Neither increasing or decreasing order" otherwise.
    // Test Data : Input first number: 1524 Input second number: 2345 Input third number: 3321


//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Please enter your first number: ");
//        int num1 =input.nextInt();
//
//        System.out.println("Please enter your second number: ");
//        int num2 = input.nextInt();
//
//        System.out.println("Please enter your third number: ");
//        int num3 = input.nextInt();
//
//        if(num1 < num2 && num2 < num3) {
//            System.out.println("Numbers are in INCREASING Order");
//        } else if(num1 > num2 && num2 > num3){
//            System.out.println("Numbers are DECREASING Order");
//        }
//        else {
//            System.out.println("Neither increasing or decreasing order");
//        }
//
//    }

//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//
//        IntroduceProgram();
//
//        System.out.println("Enter your first number:");
//        int first = in.nextInt();
//        System.out.println("Enter your second number:");
//        int second = in.nextInt();
//        System.out.println("Enter your third number:");
//        int third = in.nextInt();
//
//        IncreasingNumbers(first, second, third);
//
//    }
//
//    static void IncreasingNumbers (int first, int second, int third) {
//        if (first > second && second > third) {
//            System.out.println("decreasing");
//        } else if (third > second && second > first) {
//            System.out.println("increasing");
//        } else {
//            System.out.print("neither increasing or decreasing");
//        }
//    }
//
//    static void IntroduceProgram () {
//        System.out.println("This program will evaluate if the integers you provide are:");
//        System.out.println("increasing, decreasing, or neither.");
//    }


    public static void main(String[] args) {

        increasingDecreasing();


    }
    public static void increasingDecreasing( ){
        Scanner input = new Scanner(System.in);
        boolean increase=true;
        String result="";
        System.out.println("Enter first number :" );
        int number1 = input.nextInt();
        System.out.println("Enter Second number :" );
        int number2 = input.nextInt();
        System.out.println("Enter third number :" );
        int number3 = input.nextInt();
        increase= number1<number2 && number2<number3;
        if (increase) {
            increase=true;
            result="increasing";
            System.out.println("increasing");
        }else if ( number1>number2 && number2>number3 )   {
            System.out.println("decreasing");
        }else
        {
            System.out.println("Neither increasing or decreasing order");
        }
    }

}
