//compound operators

//c=c+3 - c+=3
//d=d-3 - d-=3

//increment and decrement operators
// ++a - increment a by 1 then use its new value
// a++ - use the current value of a, then increment a by 1
// --d - decrement d by 1 then use its new value
// d-- - use the current value of d, then decrement d by 1

import java.util.Scanner;
public class Increment {

    public static void main (String [] args){

        Scanner input= new Scanner (System.in);

        int c=5;
        int d=3;

        System.out.printf("c before incrementing %d%n", c);
        System.out.printf("post incrementing c: %d%n", c++);
        System.out.printf("c after incrementing %d%n", c);

        System.out.printf("d before post increment %d%n", d);
        System.out.printf("post incrementing d: %d%n", ++d);
        System.out.printf("d after incrementing %d%n", d);
        System.out.printf("d after incrementing %d%n", d+=3);
    }
}
