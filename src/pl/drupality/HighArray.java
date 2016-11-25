package pl.drupality;

import java.util.Arrays;

/**
 * Created by marek.kisiel on 25/11/16.
 */
public class HighArray {

    private int[] a;
    private int nElems;

    public HighArray(int max) {
        this.a = new int[max];
        nElems = 0;
    }

    public boolean find(long searchKey) {
        int j;
        for(j=0; j < this.nElems; j++) {
            if (this.a[j] == searchKey) {
                return true;
            }
        }
        return false;
    }

    public void insert(int value) {
        this.a[this.nElems] = value;
        nElems++;
    }

    public boolean delete(int value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (value == a[j]) {
                break;
            }
        }

        if (j == nElems) {
            return false;
        }

        for(int k = j; k < nElems; k++) {
            a[k] = a[k + 1];
        }

        nElems--;
        return true;
    }

    public int getMax() {
        if (nElems == 0) {
            return -1;
        }
        int currentMax = a[0];
        for(int i = 0; i < nElems;) {
            if (currentMax < a[++i]) {
                currentMax = a[i];
            }
        }
        return currentMax;
    }

    public int removeMax() {
        int maxIndex = 0;
        int currentMax = a[0];

        for(int i = 0; i < nElems;) {
            if (currentMax < a[++i]) {
                currentMax = a[i];
                maxIndex = i;
            }
        }

        for(int j = maxIndex; j < nElems;) {
            a[j] = a[++j];
        }

        nElems--;
        return currentMax;
    }

    public int getSize() {
        return nElems;
    }

    public String toString() {
        return Arrays.toString(this.a);
    }

}
