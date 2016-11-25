package pl.drupality;

import com.sun.deploy.panel.JHighDPITable;

/**
 * Created by marek.kisiel on 25/11/16.
 */
public class HighArrayMain {

    public static void main(String[] args) {
        int maxSize = 100;
        HighArray array = new HighArray(maxSize);
        array.insert(77);
        array.insert(99);
        array.insert(44);
        array.insert(55);
        array.insert(22);
        array.insert(88);
        array.insert(11);
        array.insert(00);
        array.insert(66);
        array.insert(33);

        printArray(array);

        printMax(array);

        findNum(35, array);
        findNum(11, array);

        array.delete(00);
        array.delete(55);
//        array.delete(99);

        array.removeMax();

        printArray(array);

        printMax(array);

        HighArray inverseSorted = new HighArray(array.getSize());
        int i = 0;
        while(i < array.getSize()) {
            inverseSorted.insert(array.removeMax());
        }

        printArray(array);
        printArray(inverseSorted);

    }

    public static void findNum(int searchKey, HighArray array) {
        if (array.find(searchKey)) {
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Can't find " + searchKey);
        }
    }

    public static void printMax(HighArray array) {
        System.out.println("Max num is: " + array.getMax());
    }

    public static void printArray(HighArray array) {
        System.out.println(array);
    }
}
