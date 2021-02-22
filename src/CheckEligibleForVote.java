import java.util.Scanner;

public class CheckEligibleForVote {

    //  Write Java program to allow the user to input his/her age.
    //  Then the program will show if the person is eligible to vote.
    //  A person who is eligible to vote must be older than or equal to 18 years old.
    //  Enter your age: 18 .You are eligible to vote.


//    public static void main(String args[])
//    {
//        int age;
//        Scanner sc=new Scanner(System.in);
//        System.out.print("What is your age?");
//        age=sc.nextInt();
//        if(age>=18)
//            System.out.println("You are eligible to vote.");
//        else
//            System.out.println("You are not eligible to vote.");
//
//    }

//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please Enter your age: ");
//
//        int age = input.nextInt();
//
//        if(age>=18) {
//            System.out.println("Congratulations! You are eligible to vote");
//        }else {
//            System.out.println("Sorry! you are not eligible to vote.");
//        }

    public static void main(String[] args) {
        CheckEligibleForVote.canVote();
    }

    public static void canVote() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your age: ");

        try {
            int age = input.nextInt();
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
            } else
                System.out.println("You are not eligible to vote.");

        } catch (Exception exception) {
            System.out.println("This is Input Mismatch Exception. Value should be Integer ");
            System.out.println("Please enter whole number");
        }

    }




}
