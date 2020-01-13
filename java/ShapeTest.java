public class ShapeTest {

    public static void main (String [] args){

        //array of Shape objects
        Shape[] Shapes = new Shape[2];

        //creating objects for array
        Shapes[0] = new Rectangle(5, 7, "Blue");
        Shapes[1] = new Triangle(8, 4, "Equilateral");

        //for loop to run through array
        for (int i=0; i < 2; i++){

            //determines obj class
            if (Shapes[i] instanceof Rectangle){

                System.out.printf("The %d index belongs to the Rectangle class.\n", i);

            }
            else {

                System.out.printf("The %d index belongs to the Triangle class.\n", i);
            }
        }




    }
}
