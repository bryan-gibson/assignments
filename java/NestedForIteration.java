public class NestedForIteration {

    public static void main (String [] args){

        for(int i = 1; i <= 10; i++){
            //while i < 10, increment it by 1

            //i =1
            //j = i-10

            //i=2
            //j = 1-10

            for(int j = 1; j <= 10; j++){

                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }

    }
}
