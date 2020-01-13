public class Person {

    //private variables of Person
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private String state;

    //constructor
    public Person(String firstName, String lastName, String socialSecurityNumber, String state){

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.state = state;

    }

    //get methods
    public String getFirstName(){return firstName;}

    public String getLastName(){return lastName;}

    public String getSocialSecurityNumber(){return socialSecurityNumber;}

    public String getState(){return state;}

    //display details
    public String toString(){

        System.out.println("Displaying Person");
        System.out.println(getFirstName() + " " + getLastName());
        System.out.println("SSN: " + getSocialSecurityNumber());
        System.out.println("State: " + getState());
        return null;
    }
}
