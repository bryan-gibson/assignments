public class PersonTest {

    public static void main (String [] args) {

        //create Person and Teacher object
        Person person1 = new Person("Bryan", "Gibson", "123-456-789",
                "Texas");
        Teacher teacher1 = new Teacher("John", "Doe", "987-654-321",
                "Colorado", "4");

        //display details
        person1.toString();
        teacher1.toString();
    }
}
