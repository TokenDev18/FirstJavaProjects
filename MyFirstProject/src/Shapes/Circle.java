package Shapes;

import sun.nio.cs.ext.MacThai;

/**
 * Created by aaron on 10/29/15.
 */
public class Circle extends Shape {

    //Called a constant when static and final
    protected static final double PI = 3.14;

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public double getCircumference() {
        return PI * 2 * radius;
    }

    @Override
    public void getShapeDescription() {
        super.getShapeDescription();
        System.out.println("This is a circle");

    }
}
