package Shapes;

/**
 * Created by aaron on 10/31/15.
 */
public class Square extends Quadrilaterals {

    private double width;

    public Square(double width) {
        super(width);
        this.width = width;
    }

    @Override
    protected double getArea() {
        return 4 * width;
    }

    @Override
    protected double getCircumference() {
        return Math.pow(width, 2);
    }

    @Override
    protected void getShapeDescription() {
        super.getShapeDescription();
        System.out.print("I am a square");
    }
}
