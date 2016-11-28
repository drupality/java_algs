package pl.drupality;

/**
 * Created by marek.kisiel on 28/11/16.
 */
class SelectionSorter extends Sorter {
    @Override
    public HighArray sort(HighArray highArray) {
        int out, in, min;
        int[] array = highArray.getArray();

        for(out = 0; out < highArray.getSize() - 1; out++) {
            min =out;
            for(in = out + 1; in < highArray.getSize(); in++) {
                if(array[in] < array[min]) {
                    min = in;
                }
            }
            swap(array, out, min);
        }
        return null;
    }

    private void swap(int[] arrayToSort, int one, int two) {
        int temp = arrayToSort[one];
        arrayToSort[one] = arrayToSort[two];
        arrayToSort[two] = temp;
    }
}
