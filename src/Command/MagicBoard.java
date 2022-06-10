package Command;

public class MagicBoard {

    private boolean isMagicWordsSaid;

    public void turnOn() {
        System.out.println("I will need dolls.");
        this.isMagicWordsSaid = true;
    }

    public void turnOff() {
        System.out.println("I will need wheels.");
        this.isMagicWordsSaid = true;
    }

}
