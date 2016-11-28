package pl.drupality;

/**
 * Created by marek.kisiel on 28/11/16.
 */
public class BubbleSorter extends Sorter {

    @Override
    public void sort(HighArray highArray) {
        int[] arrayToSort = highArray.getArray();
        int out, in;

        for(out = highArray.getSize() - 1 ; out > 1; out--) {
            for(in = 0; in < out; in++) {
                if (arrayToSort[in] > arrayToSort[in + 1]) {
                    swap(arrayToSort, in, in + 1);
                }
            }
        }
    }

    private void swap(int[] arrayToSort, int one, int two) {
        int temp = arrayToSort[one];
        arrayToSort[one] = arrayToSort[two];
        arrayToSort[two] = temp;
    }
}
