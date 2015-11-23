package Shapes;

/**
 * Created by aaron on 11/3/15.
 */
public class Quadrilaterals extends Shape {

    private double length = 0;
    private double width = 0;

    public Quadrilaterals(double length, double width){
        this.length = length;
        this.width = width;
    }

    public Quadrilaterals(double length){
        this.length = length; 
    }

    @Override
    protected double getArea() {
        return length * width ;
    }

    @Override
    protected double getCircumference() {
        return (length + width) * 2;
    }

    @Override
    protected void getShapeDescription() {
        super.getShapeDescription();
        System.out.println("I am a quadrilateral!");
    }
}
