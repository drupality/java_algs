package pl.drupality;

/**
 * Created by marek.kisiel on 25/11/16.
 */
public class OrdArrayMain {

    public static void main(String[] args) {
        OrdArray array = new OrdArray(25);
        array.linearInsert(22);
        array.linearInsert(11);
        array.linearInsert(45);
        array.linearInsert(78);
        array.linearInsert(6);
        array.linearInsert(42);
        array.linearInsert(98);
        array.linearInsert(91);
        array.linearInsert(85);
        array.linearInsert(82);
        array.linearInsert(19);
        array.linearInsert(79);
        array.linearInsert(17);
        array.linearInsert(61);
        array.linearInsert(88);
        array.linearInsert(99);

        System.out.println(array);

        array.binaryDelete(85);

        System.out.println(array);

        array.binaryInsert(28);

        System.out.println(array);

        array.binaryInsert(61);

        System.out.println(array);

        array.binaryInsert(2);

        System.out.println(array);

        array.binaryInsert(101);

        System.out.println(array);


        System.out.println("\nMerging example\n");

        OrdArray ord2 = new OrdArray(5);
        ord2.linearInsert(124);
        ord2.linearInsert(3);
        ord2.linearInsert(75);

        OrdArray ord3 = new OrdArray(3);
        ord3.linearInsert(7);
        ord3.linearInsert(101);
        ord3.linearInsert(66);

        OrdArray merged = ord2.merge(ord3);

        System.out.println(merged);

    }
}
