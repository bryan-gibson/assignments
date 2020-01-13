public class Customer {

    //establish variables
    private String firstName;
    private String lastName;
    private double creditLimit;

    public Customer (String firstName, String lastName, double creditLimit){

        this.firstName=firstName;
        this.lastName=lastName;

        //validate credit limit
        if (creditLimit > 0.0) {
            this.creditLimit=creditLimit;
        }
    }//end of constructor

    public void setName (String firstName, String lastName) {

        this.firstName=firstName;
        this.lastName=lastName;

    }

    public String getFirstName () {return firstName;}
    //return names
    public String getLastName () {return lastName;}

    public void setCreditLimit (double creditLimit){
        //validate credit limit
        if (creditLimit > 0.0) {
            this.creditLimit=creditLimit;
        }
    }

    public void increaseCreditLimit (double creditLimit){
        if (creditLimit > 0.0) {
            this.creditLimit= creditLimit * 1.2;
        }
    }//increases credit by 20%

    public double getCreditLimit () { return creditLimit; }
    //return credit limit
}
