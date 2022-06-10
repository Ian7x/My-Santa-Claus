package Factorymethod;

public class Puppet extends ToyProduct {

    @Override
    public void prepare() {
        System.out.println("Preparing a doll sheets");
    }

}