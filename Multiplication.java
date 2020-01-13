import java.security.SecureRandom;
import java.util.Scanner;

public class Multiplication {

    SecureRandom rand = new SecureRandom();
    Scanner input = new Scanner (System.in);

    //simple constructor
    public Multiplication(){}

    //generates numbers and displays question
    public int CreateQuestion(){

        //generate numbers and answer
        int num1 = 1 + rand.nextInt(20); //1-20
        int num2 = 1 + rand.nextInt(20); //1-20
        int num3 = num1 * num2;

        System.out.printf("What is %d times %d?\n", num1, num2);

        return num3;
    }//end method

    //gets response from user
    public int CheckResponse(int num3){

        int checkAns = 0;

        //loop until correct or -1
        while (checkAns != num3) {

            System.out.println("Enter your answer (or -1 to exit): ");
            checkAns = input.nextInt();

            //correct answer
            if (checkAns == num3) {

                System.out.println("Very Good!");
            }
            //incorrect if not answer and not -1
            else if (checkAns != num3 && checkAns != -1) {

                System.out.println("Incorrect. Please try again.");
            }
            //break loop on -1
            else {

                System.out.println("Exiting...");
                break;
            }

        }//end while
        return checkAns;
    }//end method
}
