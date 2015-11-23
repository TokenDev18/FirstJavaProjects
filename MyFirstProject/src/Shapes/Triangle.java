package Shapes;

/**
 * Created by aaron on 10/29/15.
 */
public class Triangle extends Shape {

    private double base;
    private double height;
    private double a;
    private double b;
    private double c;

    public void Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public void Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return .5 * (base * height);
    }

    @Override
    public double getCircumference() {
        return a + b + c;
    }

    @Override
    public void getShapeDescription() {
        super.getShapeDescription();
                System.out.println("This is a triangle");
    }
}
