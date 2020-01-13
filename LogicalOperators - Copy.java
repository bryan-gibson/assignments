//Conditional AND &&
//Conditional OR ||
//Boolean Logical AND &
//Boolean Logical Inclusive OR |
//Boolean Logical Exclusive OR ^
//AND Java checks first expression, if its false it will not bother to check the second expression because it will be false
//Short-Circuit Evaluation


public class LogicalOperators {

    public static void main (String [] args){

        /* if(0 == 1 && 2+2 == 4) {
            false && skip checking = false
            short-circuit evaluation

            System.out.print("Hello");


           if(2+2 == 4 || 0 == 1) {
                true || skip checking = true
                short-circuit evaluation

                System.out.print("Hello");
        */

        int number= 13;
        int age= 65;

        if (number == 12 || age < 65) {
            //false || false = false
            //no short-circuit evaluation

            System.out.print("true");
        }

        if (number == 12 && age < 65) {
            //false && skip checking = false
            //short-circuit evaluation
            //if (number == 12 & ++age < 65) 66<65
            // Value of age is changing in this case, because it is not skipped.

            System.out.print("true");
        }

        if(!(number==12)) {
            System.out.print("bye");
        }
        //number != 12

        if(number == 12 ^ age<65) {
            //false ^ false = false
            //the operator is true only if one of its operands
            //is true and the other one is false
            System.out.print("hello");
        }
    }
}
