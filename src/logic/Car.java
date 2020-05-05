package logic;
public class Car {

    String mileAge;
    String actualSpeed;

    public Car(String mileAge, String actualSpeed) {
        this.mileAge = mileAge;
        this.actualSpeed = actualSpeed;
    }

    public void accelerate(){
        actualSpeed = "5km/h";
    }
}
