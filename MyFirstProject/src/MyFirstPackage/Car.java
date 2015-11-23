package MyFirstPackage;

/**
 * Created by aaron on 10/15/15.
 */
public class Car {
    public String name;
    public int modelNumber;
    public int currentSpeed;
    public int topSpeed;
    public int acceleration;
    public int deceleration;

    public Car(String newName, int modelNumber, int topSpeed, int acceleration, int deceleration){
        this.name = newName;
        this.modelNumber = modelNumber;
        currentSpeed = 0;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.deceleration = deceleration;
    }

    public Car(){

    }

    public void setName(String carName) {
        name = carName;
    }

    public String getName() {
        return name;
    }

    public void setModelNumber(int carModelNumber) {
        modelNumber = carModelNumber;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void accelerate(){
        if(currentSpeed + acceleration <= topSpeed){
            currentSpeed = currentSpeed + acceleration;
        } else {
            currentSpeed = topSpeed;
        }

        System.out.println(name + " is going at " + currentSpeed + " mph");
    }

    public void decelerate(){
        if(topSpeed - deceleration > 0){
            topSpeed -= deceleration;
            currentSpeed = topSpeed;
        } else {
            currentSpeed = 0;
        }

        System.out.println(name + " is going at " + currentSpeed + " mph");
    }


}
