import java.util.Scanner;

public class ClassAverage {

    public static void main (String [] args){

        Scanner input= new Scanner (System.in);

        int total=0;
        int gradeCounter=1; //control variable

        while (gradeCounter <= 10){
            System.out.print("Enter grade: ");
            int grade= input.nextInt();

            total= total + grade;
            gradeCounter= gradeCounter + 1; //increment control variable
        }

        int average = total/gradeCounter;
        double average1 = total/gradeCounter; //9.0
        //99/10 = 9.9
        //integer division yields an integer result
        System.out.printf("%nTotal of all 10 grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);
        System.out.printf("Class average is %.2f", average1);
    }
}
