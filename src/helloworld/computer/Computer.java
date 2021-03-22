package helloworld.computer;


public class Computer {
    private Ssd ssd;
    private Ram ram;
    public Computer(Ram ram, Ssd ssd){
        this.ssd = ssd;
        this.ram = ram;
    }
    public void printState(){
        System.out.println("Computer: ram " + ram.getValue() + ", ssd " + ssd.getValue());
    }

}
