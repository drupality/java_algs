package pl.drupality;

/**
 * Created by marek.kisiel on 28/11/16.
 */
public class BubbleSorter extends Sorter {

    @Override
    public void sort(HighArray highArray) {
        int[] arrayToSort = highArray.getArray();
        int out, in, smallest = 0;


        for(out = highArray.getSize() - 1 ; out > 1; out--) {
            for(in = 0; in < out; in++) {
                if (arrayToSort[in] > arrayToSort[in + 1]) {
                    swap(arrayToSort, in, in + 1);
                }
            }
        }
    }

    public void bidirectionalSort(HighArray highArray) {
        int left = 0, right = highArray.getSize() - 1;
        int[] a = highArray.getArray();
        while (left < right) {
            for (int pos = left; pos < right; pos++) {
                if (a[pos] > a[pos + 1]) {
                    swap(a, pos, pos + 1);
                }
            }
            right--;

            for (int pos = right; pos > left; pos--) {
                if (a[pos] < a[pos - 1]) {
                    swap(a, pos, pos - 1);
                }
            }

            left++;
        }
    }

    private void swap(int[] arrayToSort, int one, int two) {
        int temp = arrayToSort[one];
        arrayToSort[one] = arrayToSort[two];
        arrayToSort[two] = temp;
    }
}
