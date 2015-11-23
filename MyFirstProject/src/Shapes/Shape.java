package Shapes;

/**
 * Created by aaron on 10/29/15.
 */
public abstract class Shape {

    protected abstract double getArea();
    protected abstract double getCircumference();

    protected void getShapeDescription() {
        System.out.println("This is a shape. ");
    }

}
