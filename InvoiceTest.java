public class InvoiceTest {

    public static void main (String [] args) {

        Invoice invoice1= new Invoice("1234", "hammer", 4, 14.95);
        //reference type

        //display invoice1
        //string = %s
        //int = %d
        //double = %f
        System.out.println("Original Invoice Information");
        System.out.printf("Part number: %s%n", invoice1.getPartNumber());
        System.out.printf("Part Description: %s%n", invoice1.getPartDescription());
        System.out.printf("Quantity: %d%n", invoice1.getQuantity());
        System.out.printf("Price: %.2f%n", invoice1.getPricePerItem());
        System.out.printf("Invoice Amount: %.2f%n", invoice1.getInvoiceAmount());

        invoice1.setQuantity(6);

        System.out.printf("New quantity: %d%n", invoice1.getQuantity());
        System.out.printf("New Invoice Amount: %.2f%n", invoice1.getInvoiceAmount());
    }
}
