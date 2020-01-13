public class CustomerTest {

    public static void main (String [] args) {

        //create objects
        Customer customer1= new Customer("Bryan", "Gibson", 164.12);
        Customer customer2= new Customer("John", "Doe", 189.13);

        //display names and initial credit
        System.out.printf("The first customer's name is %s %s and the credit limit is %.2f%n", customer1.getFirstName(),
                customer1.getLastName(), customer1.getCreditLimit());
        System.out.printf("The second customer's name is %s %s and the credit limit is %.2f%n", customer2.getFirstName(),
                customer2.getLastName(), customer2.getCreditLimit());

        //increase credit
        customer1.increaseCreditLimit(customer1.getCreditLimit());
        customer2.increaseCreditLimit(customer2.getCreditLimit());

        //display names and new credit
        System.out.printf("The first customer's name is %s %s and the new credit limit is %.2f%n", customer1.getFirstName(),
                customer1.getLastName(), customer1.getCreditLimit());
        System.out.printf("The second customer's name is %s %s and the new credit limit is %.2f%n", customer2.getFirstName(),
                customer2.getLastName(), customer2.getCreditLimit());
    }
}
