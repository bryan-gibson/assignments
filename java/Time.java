public class Time {

    private int hour; //0-23
    private int minute; // 0-59
    private int second; //0-59

    //no constructor
    //Time myTime=new Time ();
    //Java will create a no-argument/default constructor for us
    //all instance variables will get their default values

    public void setTime(int hour, int minute, int second){

        //validate hour, minute, second

        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60){

            throw new IllegalArgumentException("hour, minute and/or second is out of range");
            //in the case of invalid inputs, we will throw an illegal argument exception
        }

        this.hour=hour;
        this.minute=minute;
        this.second=second;

    }

    //HH:MM:SS

    public String toUniversalTime (int hour, int minute, int second) {

        return String.format("%02d:%02d:%02d", hour, minute, second);
        //hour -5- 05
        //0 is my flag value
        //if hour is one digit, it will display 0 for the first digit
        //format is static method
    }

    //H:MM:SS AM/PM

    public String toString(int hour, int minute, int second) {

        return String.format("%d:%02d:%02d %s",
        ((hour == 0 || hour == 12)? 12:hour%12), minute, second, (hour < 12? "AM":"PM"));
    }
}
