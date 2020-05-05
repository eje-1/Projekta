package logic;

public class Car {

    String mileAge;
    String actualSpeed;

    public Car(String mileAge, String actualSpeed) {
        this.mileAge = mileAge;
        this.actualSpeed = actualSpeed;
    }

    public String getMileAge() {
        return mileAge;
    }

    public String getActualSpeed() {
        return actualSpeed;
    }

    public void setMileAge(String mileAge) {
        this.mileAge = mileAge;
    }

    public void setActualSpeed(String actualSpeed) {
        this.actualSpeed = actualSpeed;
    }
}
