package helloworld;

public class Computer {
    int ssd;
    int ram;

    Computer(){
        System.out.println("Я создался");
    }
    Computer(int ssd){
        this.ssd = ssd;
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);
    }
    Computer(int ssd, int ram){
        this.ssd = ssd;
        this.ram = ram;
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);
    }
}
