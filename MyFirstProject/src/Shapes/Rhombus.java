package Shapes;

/**
 * Created by aaron on 10/31/15.
 */
public class Rhombus extends Quadrilaterals{

    private double diagonalOne;
    private double diagonalTwo;
    private double length;

    public Rhombus(double diagonalOne, double diagonalTwo) {
        super(diagonalOne, diagonalTwo);
        this.diagonalOne = diagonalOne;
        this.diagonalTwo = diagonalTwo;
    }

    public Rhombus(double length){
        super(length);
        this.length = length;
    }

    @Override
    public double getArea() {
        return (diagonalOne * diagonalTwo) / 2;
    }

    @Override
    protected double getCircumference() {
        return length * length;
    }

    @Override
    public void getShapeDescription() {
        super.getShapeDescription();
        System.out.println("I am a Rhombus! ");
    }
}
