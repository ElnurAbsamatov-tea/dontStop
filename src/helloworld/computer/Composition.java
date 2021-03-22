package helloworld.computer;

public class Composition {
    public static void main(String[] args) {
        Ram ram = new Ram(32);
        Ssd ssd = new Ssd(120);
        Computer computer = new Computer(ram,ssd);
        computer.printState();
    }

}
