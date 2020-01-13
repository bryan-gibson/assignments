import java.util.Scanner;

public class Sales {

    public static void main (String [] args){

        //instate variables
        int select = 1;
        int numSold = 0;
        double totalVal = 0.0;
        Scanner input = new Scanner (System.in);

        //sentinel-controlled while loop (0)
        while (select != 0) {

            //display selection menu + get input from user
            System.out.println("=============================");
            System.out.println("--Muffin Menu: ");
            System.out.println("- 1. Blueberry");
            System.out.println("- 2. Chocolate Chip");
            System.out.println("- 3. Banana");
            System.out.println("Enter type of muffin (Enter 0 to exit): ");
            select = input.nextInt();

            //check if input is in correct range, repeat if no case is true
            if (select < 0 || select > 3) {
                System.out.println("Invalid input. You can only enter 1, 2, 3, or 0.");
            }
            //break loop if 0
            else if (select == 0){
                break;
            }
            //continue loop
            else {
                //get number sold
                System.out.println("What was the quantity sold for the related muffin?");
                numSold = input.nextInt();
            }

            //set cases for each muffin type and add to total
            switch (select) {
                case 1 :
                    totalVal += (double)numSold * 2.98;
                    break;
                case 2 :
                    totalVal += (double)numSold * 4.50;
                    break;
                case 3 :
                    totalVal += (double)numSold * 9.98;
                    break;
            }
        }

        //output the total value of muffins sold
        System.out.println();
        System.out.printf("The total retail value of muffins sold is $%.2f", totalVal);
    }
}
