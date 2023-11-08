class PersonalComputer {
    private Monitor monitor;
    private Computer computer;

    public PersonalComputer(Monitor monitor, Computer computer) {
        this.monitor = monitor;
        this.computer = computer;
    }

    public void turnOn() {
        System.out.println("Personal Computer is turning on...");
        // additional logic for turning on the personal computer
    }

    public void printInfo() {
        System.out.println("Personal Computer Information:");
        monitor.printInfo();
        computer.printInfo();
    }
}

class Monitor {
    private String size;
    private String color;
    private String powerConsumption;

    public Monitor(String size, String color, String powerConsumption) {
        this.size = size;
        this.color = color;
        this.powerConsumption = powerConsumption;
    }

    public void printInfo() {
        System.out.println("Monitor: " + size + "(크기), " + color + "(색상), " + powerConsumption + "(전력소모)");
    }
}

class Computer {
    private String cpu;
    private String memory;
    private String hdd;
    private String cooler;
    private String powerSupply;

    public Computer(String cpu, String memory, String hdd, String cooler, String powerSupply) {
        this.cpu = cpu;
        this.memory = memory;
        this.hdd = hdd;
        this.cooler = cooler;
        this.powerSupply = powerSupply;
    }

    public void printInfo() {
        System.out.println("Computer: " + cpu + "(CPU), " + memory + "(메모리), " + hdd + "(HDD), " + cooler + "(쿨러), " + powerSupply + "(파워)");
    }
}

public class Homework5 {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("32인치", "검은색", "45W");
        Computer computer = new Computer("Core i7", "32GB", "2TB", "흰색", "700W");

        PersonalComputer pc = new PersonalComputer(monitor, computer);

        pc.turnOn();
        pc.printInfo();
    }
}
