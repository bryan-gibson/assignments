import java.util.Scanner;

public class Numbers {

    static int Pos;
    static int Neg;
    static int Zero;
    static int Even;
    static int Odd;

    public static void main (String [] args) {

        Scanner input= new Scanner (System.in);

        //get inputs (3 integers)
        System.out.print("Enter the first integer: ");
        int number1= input.nextInt();
        //check first input
        numCheck(number1);

        System.out.print("Enter the second integer: ");
        int number2= input.nextInt();
        //check second input
        numCheck(number2);

        System.out.print("Enter the third integer: ");
        int number3= input.nextInt();
        //check third input
        numCheck(number3);

        //outputs
        System.out.printf("Your integers are %d, %d, and %d\n", number1, number2, number3);
        System.out.println("The number of positive integers is " + Pos);
        System.out.println("The number of negative integers is " + Neg);
        System.out.println("The number of zero integers is " + Zero);
        System.out.println("The number of even integers is " + Even);
        System.out.println("The number of odd integers is " + Odd);


    }

    public static void numCheck(int Num) {

        //determine if number is pos/neg/zero/even/odd
        //increase the count of particular category if cases are true

        if (Num > 0) {
            Pos = Pos + 1;
        }

        if (Num < 0) {
            Neg = Neg + 1;
        }

        if (Num == 0) {
            Zero = Zero + 1;
        }

        if (Num < 0) {
            Num = Num * -1;
        } //if number is negative, change to positive for remaining calculations

        if (Num % 2 == 0) {
            Even = Even + 1;
        }

        if (Num % 2 == 1) {
            Odd = Odd + 1;
        }

    }
}
