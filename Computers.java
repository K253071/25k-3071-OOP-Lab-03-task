class Computer {
    int systemID;
    String processorType;
    int RAMsize;
    String operatingSystem;

    Computer(int ID, String type, int size, String system){
        systemID=ID;
        processorType=type;
        RAMsize=size;
        operatingSystem=system;
    }

    void display(){
        System.out.println("System ID: " + systemID);
        System.out.println("Processor Type: " + processorType);
        System.out.println("RAM Size: " + RAMsize);
        System.out.println("Operating System: " + operatingSystem);
    }
}

public class Computers {
    public static void main(String[] args) {
        Computer c1 = new Computer(1, "Core 2 duo", 8, "UNIX");
        Computer c2 = new Computer(2, "Dual Core", 16, "MACOS");
        Computer c3 = new Computer(3, "Octa Core", 32, "Windows");

        c1.display();
        c2.display();
        c3.display();
    }
}