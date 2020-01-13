//rolling a die 60,000,000 times
//a roll has six sides - 1 to 6

import java.security.SecureRandom;

public class RollDie {

    public static void main (String [] args){

        SecureRandom myrandom= new SecureRandom ();
        //to call non-static methods from SecureRandom

        int frequency1=0;
        int frequency2=0;
        int frequency3=0;
        int frequency4=0;
        int frequency5=0;
        int frequency6=0;

        for (int roll=1; roll<=60000000; roll++){

            int face = 1 + myrandom.nextInt(6);

            switch (face) {

                case 1:
                    frequency1++;
                    break;

                case 2:
                    frequency2++;
                    break;

                case 3:
                    frequency3++;
                    break;

                case 4:
                    frequency4++;
                    break;

                case 5:
                    frequency5++;
                    break;

                case 6:
                    frequency6++;
                    break;
            }//end switch
        }//end for

        System.out.println("Face\tFrequency");
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", frequency1, frequency2, frequency3, frequency4,
                frequency5, frequency6);
    }
}
