public class MultiplicationTest {

    public static void main (String [] args){

        int loopCon = 0;
        //create object
        Multiplication multi1 = new Multiplication();

        //run program until user enters -1
        while (!(loopCon == -1)) {

            //this will call both methods, generating a number and checking answer
            //until user decides to exit
            loopCon = multi1.CheckResponse(multi1.CreateQuestion());

        }

    }
}
