//calculating compound interest
//formula a= p(1+r)^n
//p is the original amount - 1000
//r is the annual interest rate - 0.05
//n is the number of years - 10
//a is the amount on deposit at the end of nth year

public class Interest {

    public static void main (String [] args){

        double principal= 1000.0;
        double rate= 0.05;

        //header
        System.out.printf("%s%20s%n", "Year", "Amount on Deposit");

        //it displays the value with at least 20 characters
        //right-justified
        //%-20s - left-justified

        for (int year=1; year <= 10; year++){

            double amount= principal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f%n", year, amount);
            //, is for grouping
            //separator
        }
    }
}
