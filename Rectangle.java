class Rectangle extends Shape {

    //variables
    private String color;
    int rectHeight;
    int rectWidth;

    //rectangle constructor
    public Rectangle(int height, int width, String color){
        super(height, width);


    }

    public void setHeight(int height){

        //determines if height is negative
        if (height < 0.0) {

            throw new IllegalArgumentException("Height can't be negative.");
        }
        else {

            rectHeight = height;
        }
    }//end method

    public int getHeight() {return rectHeight;}//end method

    public void setWidth(int width){

        //determines if width is negative
        if (width < 0.0) {

            throw new IllegalArgumentException("Width can't be negative.");
        }
        else {

            rectWidth = width;
        }
    }//end method

    public int getWidth() {return rectWidth;}//end method

    public String toString (int height, int width){

        return String.format("%d and %d", height, width);
    }//end method


    //implements from Shape
    public int getArea(int height, int width){

        return height * width;
    }
}
