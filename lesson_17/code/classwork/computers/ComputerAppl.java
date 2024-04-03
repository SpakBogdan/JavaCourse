package classwork.computers;

import classwork.computers.model.Computer1;
import classwork.computers.model.Laptop;
import classwork.computers.model.Laptop1;
import classwork.computers.model.SmartPhone1;

public class ComputerAppl {
    public static void main(String[] args) {

        Computer1[] comp = new Computer1[3];
        comp[0] = new Computer1("i5", 12, 512, "HP",1000);
        comp[1] = new Laptop1("i7", 16, 512, "Samsung",800,15, 2.2,8);
        comp[2] = new SmartPhone1("Snapdragon 8 Gen 2",64, 512,"Samsung",1200,11,0.3,10,"Android 14",true);

        printArray(comp);
        
        int totalRAM = getTotalRAM(comp);
        System.out.println("Total RAM: " + totalRAM);

        Laptop1 laptop1 = (Laptop1) comp[1]; // Dawn casting приведение к нужному типу
        System.out.println(laptop1.getWeight());

//        Computer1 computer1 = (Laptop1) comp[0];
//        System.out.println(computer1.);

        double totalWeight = getTotalWeight(comp);
        System.out.println("Total weight = " + totalWeight);
        


    } // end of main

    private static double getTotalWeight(Computer1[] comp) {
        double res = 0;
        for (int i = 0; i < comp.length; i++) {
            if (comp[i] instanceof Laptop1){
                Laptop1 laptop1 = (Laptop1)comp[i];
                res += ((Laptop1) comp[i]).getWeight();
            }
        }
        return res;
    }


    private static int getTotalRAM(Computer1[] comp){
        int res = 0;
        for (int i = 0; i < comp.length; i++) {
            comp[i].getRam();
        }
        return res;
        //System.out.println("Total RAM: " );
    }

    public static void printArray(Computer1[] comp){
        for (int i = 0; i < comp.length; i++) {
            System.out.println(comp[i].toString());
        }
    }

} // end of class
