class Triangle extends Shape {

    private String classification;
    int triHeight;
    int triWidth;

    //triangle constructor
    public Triangle(int height, int width, String classification){
        super(height, width);


    }

    public void setHeight(int height){

        //determines if height is negative
        if (height < 0.0) {

            throw new IllegalArgumentException("Height can't be negative.");
        }
        else {

            triHeight = height;
        }
    }//end method

    public int getHeight() {return triHeight;}//end method

    public void setWidth(int width){

        //determines if width is negative
        if (width < 0.0) {

            throw new IllegalArgumentException("Width can't be negative.");
        }
        else {

            triWidth = width;
        }
    }//end method

    public int getWidth() {return triWidth;}//end method

    public String toString (int height, int width){

        return String.format("%d and %d", height, width);
    }//end method

    //implements from Shape
    public int getArea(int height, int width){

        return (height * width) / 2 ;
    }
}
