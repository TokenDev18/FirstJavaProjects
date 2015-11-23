package Shapes;

/**
 * Created by aaron on 10/31/15.
 */
public class Sphere extends Circle{

    private double radius;

    public Sphere(double radius) {
        super(radius);
        this.radius = radius;
    }

    public void resize(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * super.getArea();
    }

    @Override
    public void getShapeDescription() {
        super.getShapeDescription();
        System.out.println("I am a Sphere! ");
    }
}
