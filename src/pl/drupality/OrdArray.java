package pl.drupality;

import java.util.*;

/**
 * Created by marek.kisiel on 25/11/16.
 */
public class OrdArray {

    private long[] a;

    private int nElems;

    public OrdArray(int size) {
        this.a = new long[size];
    }

    public void fillArray(int numOfElements) {
        ArrayList<Integer> storedRands = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 0; i < numOfElements; i++) {
            int randInt = rand.nextInt(1000);
            while (storedRands.contains(randInt)) {
                randInt = rand.nextInt(1000);
            }
            storedRands.add(randInt);
            this.a[i] = randInt;
        }
        this.nElems = numOfElements;
        Arrays.sort(this.a);

        //reverse array and keep sort order
        int j;

        for (j = this.a.length - 1; j > 0; j--) {
            if (this.a[j] == 0) {
                break;
            }
        }

        int i = 0;
        for (int k = j + 1; k < this.a.length; k++) {
            this.a[i++] = this.a[k];
            this.a[k] = 0;
        }
    }

    public int linearSearch(long searchKey) {
        for (int i = 0; i < this.nElems; i++) {
            if (this.a[i] == searchKey) {
                return i;
            }
        }
        //no item found;
        return this.nElems;
    }

    public int binarySearch(long searchKey) {
        int lowerBound = 0;
        int upperBound = this.nElems - 1;

        //array index value
        int curIn;

        while(true) {
            //calculate center index value of an array portion
            curIn = (lowerBound + upperBound) / 2;
            //if first guess hit, return current index value;
            if (a[curIn] == searchKey) {
                return curIn;
            } else if(lowerBound > upperBound) {
                return this.nElems;
            } else {
                if (a[curIn] < searchKey) {
                    lowerBound = curIn + 1; //it's in upper half
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    public void binaryInsert(long value) {
        int lowerBound = 0;
        int upperBound = nElems - 1;

        int currIndex;

        while(true) {
            currIndex = (lowerBound + upperBound) / 2;

            if (lowerBound == upperBound) {
                break;
            } else {
                if (a[currIndex] < value) {
                    lowerBound = currIndex + 1;
                } else {
                    upperBound = currIndex - 1;
                }
            }
        }

        for(int i = nElems - 1; i > currIndex; i--) {
            a[i + 1] = a[i];
        }

        a[currIndex + 1] = value;
        nElems++;
    }

    public void linearInsert(long value) {
        int i;
        for (i = 0; i < this.nElems; i++) {
            if (this.a[i] > value) {
                break;
            }
        }

        for (int k = this.nElems; k > i; k--) {
            this.a[k] = a[k - 1];
        }
        this.a[i] = value;
        this.nElems++;
    }



    public boolean binaryDelete(long value) {
        int index = this.binarySearch(value);

        if (index == this.nElems) {
            return false;
        }
        for (int k = index; k < this.nElems; k++) {
            this.a[k] = this.a[k + 1];
        }

        this.nElems--;
        return  true;
    }

    public boolean linearDelete(long value) {
        int index = this.linearSearch(value);

        if (index == this.nElems) {
            return false;
        }

        for (int k = index; k < this.nElems; k++) {
            this.a[k] = this.a[k + 1];
        }

        this.nElems--;
        return  true;
    }

    public OrdArray merge(OrdArray arr1) {
        int arr1Size = arr1.numOfElements();
        int arr2Size = this.numOfElements();
        int mergedSize = arr1Size + arr2Size;
        OrdArray merged = new OrdArray(mergedSize);

        for (int i = 0; i < mergedSize; i++) {
            int currentSize = i + 1;
            long val1 = 0;
            long val2 = 0;

            if (arr1Size >= currentSize) {
                val1 = arr1.getValueAt(i);
            }

            if (arr2Size >= currentSize) {
                val2 = this.getValueAt(i);
            }

            if (val1 > 0) {
                merged.linearInsert(val1);
            }

            if (val2 > 0) {
                merged.linearInsert(val2);
            }
        }

        return merged;
    }

    public long getValueAt(int index) {
        return a[index];
    }

    public long[] getArray() {
        return a;
    }

    public int numOfElements() {
        return this.nElems;
    }

    public String toString() {
        return Arrays.toString(this.a);
    }
}
