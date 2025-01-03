


public class AreaOfShapes {
    public static void main(String[] args) {
        //Circle
        double radius = 5.0;
        double areaOfCircle = 0;
        final float PI =  (float) 3.14;
        areaOfCircle = PI*radius*radius;
        System.out.println("Area of Circle :" + areaOfCircle );
        //Rectangle
        double length = 10.0;
        double width = 5.0;
        double areaOfRectangle = 0;
        areaOfRectangle = length*width;
        System.out.println("Area of Rectangle :"+ areaOfRectangle);
        //triangle
        double base = 5.0;
        double height = 10.0;
        double areaOfTriangle = 0;
        areaOfTriangle = 0.5*base*height;
        System.out.println("Area of Triangle :" + areaOfTriangle );

        
    }
    
}
