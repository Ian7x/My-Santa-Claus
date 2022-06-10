package Abstractfactory;

public class Plastic implements Material {

    @Override
    public void produce() {
        System.out.println("Creating a PVC doll.");
    }

}