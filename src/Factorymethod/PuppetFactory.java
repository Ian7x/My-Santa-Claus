package Factorymethod;

public class PuppetFactory extends ToyFactory {

    @Override
    public ToyProduct createToy(String toyName) {
   
        if(toyName == "PUPPET") {
            return new Puppet();
        }
      
        return null;
    }

}