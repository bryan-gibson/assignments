import java.util.Scanner;

public class LargestSmallest {

    public static void main (String [] args){

        //instate variables
        int count = 1;
        int num;
        int smallest = 0;
        int largest = 0;
        Scanner input = new Scanner (System.in);

        //while loop that will run 10 times
        while (count < 11) {


            System.out.printf("Enter integer %d: \n", count);
            num = input.nextInt();

            //determine if larger
            if (num > largest) {
                //update largest
                largest = num;
            }
            //determine if smaller
            else if (num < smallest) {
                //update smallest
                smallest = num;
            }
            //increment loop
            count++;
        }

        //output results
        System.out.printf("Your smallest integer is %d\n", smallest);
        System.out.printf("Your largest integer is %d\n", largest);

    }
}
