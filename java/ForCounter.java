//control variable
//control variable should have an initial value
//loop condition
//increment control variable

public class ForCounter {

    public static void main (String [] args){

        //for header statement

        for(int counter = 1; counter <= 10; counter= counter+1){

            System.out.printf("%d%n", counter);
        }

        //System.out.printf("%d%n", counter);
        //Will create error, counter was declared in header. Local variable

        for (int number=1; number <= 10; number++){

            System.out.printf("%d%n", number);
        }

        for (int number=1; number <= 10; ++number){
            //number+=1

            System.out.printf("%d%n", number);
        }

        for (int i=10; i >= 1; i--){

            System.out.printf("%d%n", i);
        }
    }
}
