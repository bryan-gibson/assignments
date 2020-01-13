import java.util.Scanner;

public class MyTest {

    public static void main (String [] args){

        Scanner input = new Scanner (System.in);
        int select = 0;
        int correct = 0;

        while (!(correct == -1)) {

            correct = 0;

            //begin quiz
            System.out.println("Welcome to the Java Programming Language Quiz!");
            System.out.println("There will be 3 questions.");
            System.out.println("Each question will have four possible answers.");
            System.out.println("");
            System.out.println("Enter anything to continue...");
            input.next();
            //exit if -1 is entered
            if (correct == -1) {break;}
            correct = question1(correct, input);
            if (correct == -1) {break;}
            correct = question2(correct, input);
            if (correct == -1) {break;}
            correct = question3(correct, input);
            if (correct == -1) {break;}


            //display grade depending on score
            switch (correct){
                case 3:
                    System.out.println("Excellent!");
                    break;
                case 2:
                    System.out.println("Very good!");
                    break;
                default:
                    System.out.println("It's time to start learning Java.");
            }


            //ask to play again
            System.out.println("Would you like to play again? (Enter true/false)");
            boolean ans = input.nextBoolean();
            //quit if false
            if (!ans){
                System.out.println("Thanks for playing!");
                break;
            }

        }//end while loop




    }

    public static int question1(int correct, Scanner input){

        int select;

        //first question
        System.out.println("1. How do you create a comment in Java?");
        System.out.println("[1] [[");
        System.out.println("[2] ((");
        System.out.println("[3] //");
        System.out.println("[4] ''");
        System.out.println("Enter the correct answer. (or enter 0 to exit)");
        select = input.nextInt();

        if (select == 3){
            //correct
            System.out.println("Correct!");
            correct++;
            return correct;
        }
        else if (select == 0){
            //exit quiz
            correct = -1;
            return correct;
        }
        else {
            //incorrect
            System.out.println("Incorrect.");
            return correct;
        }

    }//end method

    public static int question2(int correct, Scanner input){

        int select;

        //second question
        System.out.println("2. Which is NOT a correct statement? ");
        System.out.println("[1] System.out.print");
        System.out.println("[2] System.out.printf");
        System.out.println("[3] System.out.println");
        System.out.println("[4] System.out.printline");
        System.out.println("Enter the correct answer. (or enter 0 to exit)");
        select = input.nextInt();

        if (select == 4){
            //correct
            System.out.println("Correct!");
            correct++;
            return correct;
        }
        else if (select == 0){
            //exit quiz
            correct = -1;
            return correct;
        }
        else {
            //incorrect
            System.out.println("Incorrect.");
            return correct;
        }

    }//end method

    public static int question3(int correct, Scanner input){

        int select;

        //third question
        System.out.println("3. What is the correct way to ask if num is equal to 5?");
        System.out.println("[1] num = 5");
        System.out.println("[2] num == 5");
        System.out.println("[3] num equals? 5");
        System.out.println("[4] num != 5");
        System.out.println("Enter the correct answer. (or enter 0 to exit)");
        select = input.nextInt();

        if (select == 2){
            //correct
            System.out.println("Correct!");
            correct++;
            return correct;
        }
        else if (select == 0){
            //exit quiz
            correct = -1;
            return correct;
        }
        else {
            //incorrect
            System.out.println("Incorrect.");
            return correct;
        }

    }//end method

}
