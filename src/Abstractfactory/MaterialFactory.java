package Abstractfactory;

public class MaterialFactory extends AbstractFactory {


    @Override
    public Material getMaterial(String materialName) {
        if(materialName.equals("FABRIC SHEET")) {
            return new Fabric();
        }

        if(materialName.equals("PVC SHEET")) {
            return new Plastic();
        }
        return null;
    }
}