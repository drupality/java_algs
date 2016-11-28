package pl.drupality;

/**
 * Created by marek.kisiel on 28/11/16.
 */
public class InsertionSorter extends Sorter {
    @Override
    public void sort(HighArray highArray) {
        int in, out;
        int[] array = highArray.getArray();

        for(out = 1; out < highArray.getSize(); out++) {
            int temp = array[out];
            in = out;

            while(in > 0 && array[in - 1] >= temp) {
                array[in] = array[in - 1];
                --in;
            }

            array[in] = temp;
        }
    }
}
