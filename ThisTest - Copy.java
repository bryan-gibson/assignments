public class ThisTest {

    public static void main (String [] args){

        SimpleTime myTime= new SimpleTime(22,34,34);
        System.out.println();

    }
}//end class


//second class
//only one class can be public- otherwise you get compilation error
//SimpleTime can only be used by ThisTest

class SimpleTime {

    private int hour;
    private int minute;
    private int second;

    public SimpleTime (int hour, int minute, int second){

        this.hour=hour;
        this.minute=minute;
        this.second=second;


    }

    public String toUniversalTime (){

        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
        //"this" is not necessary

    }

    public String buildString (){

        return String.format("%24s: %s:%n%24s: %s", "this.UniversalTime()", this.toUniversalTime(),
                "UniversalTime()", toUniversalTime());
    }

}
