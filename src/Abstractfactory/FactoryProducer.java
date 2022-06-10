package Abstractfactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryName) {

        if(factoryName.equals("MATERIAL")) {
            return new MaterialFactory();
        }

        return null;

    }

}
