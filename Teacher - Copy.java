public class Teacher extends Person {

    //private variable of Teacher
    private String numberOfCourses;

    //constructor
    public Teacher(String firstName, String lastName, String socialSecurityNumber, String state, String numberOfCourses) {
        super(firstName, lastName, socialSecurityNumber, state);

        this.numberOfCourses = numberOfCourses;
    }

    //get numberOfCourses
    public String getNumberOfCourses(){return numberOfCourses;}

    //display details
    public String toString(){

        System.out.println("Displaying Teacher");
        System.out.println(getFirstName() + " " + getLastName());
        System.out.println("SSN: " + getSocialSecurityNumber());
        System.out.println("State: " + getState());
        System.out.println("Number of Courses: " + getNumberOfCourses());
        return null;

    }
}
