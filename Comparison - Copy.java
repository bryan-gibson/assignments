import java.util.Scanner;

public class Comparison {

    public static void main (String [] args){

        //void - this method will not return anything

        Scanner input= new Scanner (System.in);

        System.out.println("Enter your first string: ");
        String s1 = input.nextLine();

        System.out.println("Enter your second string: ");
        String s2 = input.nextLine();

        //length of chars to compare [i <= charNum]
        System.out.println("Enter number of characters to compare: ");
        int charNum = input.nextInt();

        //0 = first letter
        System.out.println("Enter starting index number: ");
        int startNum = input.nextInt();

        boolean check = s1.regionMatches(true, startNum, s2, startNum, charNum);

        //checks if strings matched
        if (check){

            System.out.println("The strings are equal!");

        }
        else{

            System.out.println("The strings are not equal.");
        }

    }


}
