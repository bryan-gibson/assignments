//summing even integers from 2 to 20

public class SumEven {

    public static void main (String [] args){

        int total=0;

        for (int i=2; i <= 20; i=i+2){

            System.out.printf("%d%n", i);
            total+= i;
        }

        System.out.printf("Total is %d", total);
    }
}
