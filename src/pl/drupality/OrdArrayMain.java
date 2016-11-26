package pl.drupality;

/**
 * Created by marek.kisiel on 25/11/16.
 */
public class OrdArrayMain {

    public static void main(String[] args) {
        OrdArray array = new OrdArray(25);
        array.linearInsert(6);
        array.linearInsert(11);
        array.linearInsert(17);
        array.linearInsert(19);
        array.linearInsert(22);
        array.linearInsert(45);
        array.linearInsert(46);
        array.linearInsert(49);
        array.linearInsert(57);
        array.linearInsert(61);
        array.linearInsert(65);
        array.linearInsert(66);
        array.linearInsert(69);
        array.linearInsert(71);
        array.linearInsert(88);
        array.linearInsert(99);

        System.out.println(array);

       // array.binaryDelete(85);

        System.out.println(array);

        array.binaryInsert(28);

        System.out.println(array);

        array.binaryInsert(2);

        System.out.println(array);

        System.out.println(array);

        array.binaryInsert(101);

        System.out.println(array);

        System.out.println("foo");

    }
}
