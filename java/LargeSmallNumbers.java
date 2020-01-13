import java.util.Scanner;

public class LargeSmallNumbers {

    public static void main (String [] args){

        Scanner input= new Scanner (System.in);

        System.out.print("First number: ");
        int number1 = input.nextInt();

        int largest = number1;
        int smallest = number1;

        System.out.print("Second number: ");
        int number2 = input.nextInt();

        if (number2 > largest){
            largest = number2;
        }
        if (number2 < smallest){
            smallest = number2;
        }

        System.out.print("Third number: ");
        int number3 = input.nextInt();

        if (number3 > largest){
            largest = number3;
        }
        if (number3 < smallest){
            smallest = number3;
        }

        //display results

        System.out.printf("Inputs are %d, %d, %d%n", number1, number2, number3);

        System.out.printf("Largest one is: %d%n", largest);
        System.out.printf("Smallest one is: %d%n", smallest);

    }
}
