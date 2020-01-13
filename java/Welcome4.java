import java.util.Scanner;
//import class Scanner

public class Welcome4 {

    public static void main (String [] args){

        Scanner input= new Scanner (System.in);
        //System.in is standard input object
        //Scanner object

        //first input

        System.out.print("Enter first integer: ");
        int number1;
        //variable

        number1 = input.nextInt();
        //it reads an integer input

        //second input
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        int total = number1 + number2;

        System.out.printf("Sum is %d", total);

        //%d is for integer values
    }
}
