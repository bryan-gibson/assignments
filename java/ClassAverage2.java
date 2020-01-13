import java.util.Scanner;

public class ClassAverage2 {

    public static void main (String [] args){

        Scanner input= new Scanner (System.in);


        //flag value -1 to terminate the loop

        int total=0;
        //local variables must be initialized to a value
        //before using them
        int gradeNumber=0;
        //control variable- the number of inputs

        System.out.print("Enter grade or -1 to exit: ");
        int grade= input.nextInt();

        while(grade !=-1){
            total= total + grade;
            gradeNumber= gradeNumber+1;

            System.out.print("Enter grade or -1 to exit: ");
            grade= input.nextInt();
        }//end while loop

        if (gradeNumber!=0) {
            double average= (double) total/gradeNumber;
            //(double) - unary cast operator
            //temporary double

            System.out.printf("%nTotal of the %d grades entered is %d%n", gradeNumber, total);
            System.out.printf("Class average is %.2f", average);
        }
        else {

            System.out.print("No grades were entered");
        }
    }
}
