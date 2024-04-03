package classwork.computers;

import classwork.computers.model.*;

public class ComputerCompare {
    public static void main(String[] args) {

        Computer1[] comp = new Computer1[3];
        comp[0] = new Computer1("i5", 12, 512, "HP",1000);
        comp[1] = new Laptop1("i7", 16, 512, "Samsung",800,15, 2.2,8);
        comp[2] = new SmartPhone1("Snapdragon 8 Gen 2",64, 512,"Samsung",1200,11,0.3,10,"Android 14",true);



    }

    public static void printArray(Computer1[] comp) {
        for (int i = 0; i < comp.length; i++) {
            System.out.println(comp[i].toString());
        }
    }
}
