package pl.drupality;

/**
 * Created by marek.kisiel on 28/11/16.
 */
public class SorterMain {

    public static void main(String[] args) {
        HighArray array = new HighArray(7);
        array.insert(34);
        array.insert(78);
        array.insert(3);
        array.insert(51);
        array.insert(44);
        array.insert(99);
        array.insert(93);

        System.out.println(array);

        Sorter sorter = new SelectionSorter();
        sorter.sort(array);

        System.out.println(array);



    }

}
