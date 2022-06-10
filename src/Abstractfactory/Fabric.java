package Abstractfactory;

public class Fabric implements Material {

    @Override
    public void produce() {
        System.out.println("Creating a fabric doll.");
    }

}