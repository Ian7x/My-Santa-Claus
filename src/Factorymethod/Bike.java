package Factorymethod;

public class Bike extends ToyProduct {
    @Override
    public void prepare() {
        System.out.println("Preparing a bike.");
    }
}

