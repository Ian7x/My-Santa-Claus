package Factorymethod;

public class WheelsFactory extends ToyFactory {

    @Override
    public ToyProduct createToy(String toyName) {
        if(toyName == "BIKE") {
            return new Bike();
        }
        if(toyName == "BYCICLE") {
            return new MotorBike();
        }
        return null;
    }

}
