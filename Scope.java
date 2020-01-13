//scope of declarations

public class Scope {

    private static int x = 1; //accesible to all methods of this class

    public static void main (String [] args){

        int x = 5; //local variable
    }

    public static void useLocalVariable () {

        int x = 25; //local
        System.out.printf("%nlocal x on entering method useLocalVariable is %d%n", x);
        ++x;
        System.out.printf("%nlocal x before entering method useLocalVariable is %d%n", x);


    }

    public static void useField () {

        System.out.printf("%nfield x on entering method useField is %d%n", x);
        x = x*10;
        System.out.printf("%nfield x on entering method useField is %d%n", x);
    }


}
