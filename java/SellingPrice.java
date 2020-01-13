import java.util.Scanner;

public class SellingPrice {

    public static void main (String [] args){

        //instate variables
        int control = 0;
        int salesRev;
        int productNum;
        double productPrice;
        int year = 1;
        int totalSalesRev = 0;
        int totalProductNum = 0;
        double combinedSellingPrice = 0.0;
        Scanner input = new Scanner (System.in);

        //sentinel-controlled while loop
        while (control != -1) {

            //ask and obtain inputs for each variable
            System.out.println("Year " + year + ": What is the amount of sales revenue for the year? (type -1 to terminate) ");
            salesRev = input.nextInt();

            //terminate loop if flag value is true
            if (salesRev == -1) {control = -1; break;}

            System.out.println("Year " + year + ": What is the total number of products for the year? ");
            productNum = input.nextInt();

            productPrice = (double)salesRev / productNum;
            System.out.printf("Year " + year + ": The product selling price for the related year is $%.2f\n", productPrice);

            //update totals
            totalSalesRev += salesRev;
            totalProductNum += productNum;
            combinedSellingPrice += productPrice;
            //increment year number
            year++;
        }

        //minus 1 off current year since no inputs for current year
        year -= 1;
        System.out.println("Calculating...");
        //output the totals of each
        System.out.printf("The total sales revenue for %d years is %d\n", year, totalSalesRev);
        System.out.printf("The total number of products sold for %d years is %d\n", year, totalProductNum);
        System.out.printf("The combined selling price for %d years is %.2f\n", year, combinedSellingPrice);

    }
}
