package Observer;

import Abstractfactory.AbstractFactory;
import Abstractfactory.FactoryProducer;
import Abstractfactory.Material;
import Command.Command;
import Command.MagicBoard;
import Decorator.*;
import Factorymethod.WheelsFactory;
import Factorymethod.ToyFactory;
import Factorymethod.ToyProduct;
import Factorymethod.PuppetFactory;
import Observer.Observer;
import Singleton.Singleton;
import Command.IneedWheelsCommand;
import Command.IneedPuppetsCommand;
import Command.MagicWordsBySantaClaus;
import Observer.Dwarves;
import Observer.DwarvesEmployees;

public class Main {

    public static void main(String[] args) {
        Singleton santaClaus = Singleton.getInstance(); // Singleton  for creating Santa.
        santaClaus.postMessage("said:");
        MagicBoard magicBoard = new MagicBoard();   // Command pattern for creating magic word, and  Santa's.
        Command ineedWheelsCommand = new IneedWheelsCommand(magicBoard);
        Command ineedPuppetsCommand = new IneedPuppetsCommand(magicBoard);
        
        MagicWordsBySantaClaus words = new MagicWordsBySantaClaus();
        
        words.setCommand(ineedWheelsCommand);
        words.sayMagicWords();

        words.setCommand(ineedPuppetsCommand);
        words.sayMagicWords();

        System.out.println();
        System.out.println("[!------------------------------------------!]");

        Dwarves workerDwarf = new Dwarves();   
        Observer obs1 = new DwarvesEmployees("Dwarf-Jon");
        Observer obs2 = new DwarvesEmployees("Dwarf-Don");
        Observer obs3 = new DwarvesEmployees("Dwarf-Kon");

        workerDwarf.hireDwarf(obs1);
        workerDwarf.hireDwarf(obs2);
        workerDwarf.hireDwarf(obs3);
        
        workerDwarf.hireDwarf("and starting the new working process.");
        workerDwarf.removeDwarf(obs1); 
    
        System.out.println("[!------------------------------------------!]\n");
        
        System.out.println("[!------------------------------------------!]");
        ToyFactory cheeseFactory = new WheelsFactory(); // Factory Method 
        ToyProduct wheel = cheeseFactory.produceProduct("BIKE");
        wheel = cheeseFactory.produceProduct("BYCICLE");
        ToyFactory puppetFactory = new PuppetFactory();
        ToyProduct puppet = puppetFactory.produceProduct("PUPPET");
         System.out.println("[!------------------------------------------!]\n");

         System.out.println("[******]");

        AbstractFactory materialFactory = FactoryProducer.getFactory("MATERIAL"); // AbstractFactory 
        Material plastic = materialFactory.getMaterial("PVC SHEET");
        plastic.produce();
        Material fabric = materialFactory.getMaterial("FABRIC SHEET");
        fabric.produce();
        System.out.println("[******]");
        System.out.println();

        System.out.println("[ *==================================================* ]\n");

        
        Motorbike colnago = new Colnago(); // Decorator pattern
        Motorbike greenKawazaki = new GreenMotorbikeDecorator(colnago);
        greenKawazaki.create();
       
        System.out.println();

        Motorbike bmx = new Bmx();   
        Motorbike blueBmx = new BlueMotorbikeDecorator(bmx);
        blueBmx.create();

        System.out.println();




        System.out.println("[ *==================================================* ]");






    }

    }

