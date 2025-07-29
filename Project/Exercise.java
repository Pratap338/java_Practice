// Interface defining machine behavior
interface Machine {
    String start();
}

// Abstract class providing common structure
abstract class Appliance implements Machine {
    protected String name;

    // Constructor to initialize name
    public Appliance(String name) {
        this.name = name;
    }
}

// Concrete subclass Fan
class Fan extends Appliance {

    public Fan(String name) {
        super(name);
    }

    // Override start() method
    @Override
    public String start() {
        return "Fan is running";
    }
}

// Concrete subclass WashingMachine
class WashingMachine extends Appliance {

    public WashingMachine(String name) {
        super(name);
    }

    // Override start() method
    @Override
    public String start() {
        return "Washing Machine is operating";
    }
}

// Main class
public class Exercise {
    public static void main(String[] args) {
        // Creating objects using interface reference
        Machine fan = new Fan("Fan");
        Machine washer = new WashingMachine("Washing Machine");

        // Calling start() and printing the result
        System.out.println(fan.start());
        System.out.println(washer.start());
    }
}
