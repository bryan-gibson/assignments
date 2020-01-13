abstract class Shape {

    //private variables
    private int height;
    private int width;

    //constructor
    public Shape(int height, int width){

        //this.height = height;
        //this.width = width;

    }

    public void setHeight(int height){

        //determines if height is negative
        if (height < 0.0) {

            throw new IllegalArgumentException("Height can't be negative.");
        }
        else {

            this.height = height;
        }
    }//end method

    public int getHeight() {return height;}//end method

    public void setWidth(int width){

        //determines if width is negative
        if (width < 0.0) {

            throw new IllegalArgumentException("Width can't be negative.");
        }
        else {

            this.width = width;
        }
    }//end method

    public int getWidth() {return width;}//end method

    public String toString (int height, int width){

        return String.format("%d and %d", height, width);
    }//end method

    //abstract method [empty]
    public abstract int getArea(int height, int width);


}//end class
