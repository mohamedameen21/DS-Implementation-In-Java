package DS;

import java.util.Arrays;

public class Array {
    private int index;
    private int[] arr;
    private int arraySize;

    public Array() {
        arraySize = 10;  
        arr = new int[arraySize];
    }

    public Array(int length) {
        arraySize = length;
        arr = new int[arraySize];
    }

    public boolean add(int num) {
        if (index >= arraySize) {
            arraySize += arraySize / 2;
            arr = Arrays.copyOf(arr, arraySize);
        }
        arr[index++] = num;
        return true;
    }

    public int removeAt(int index) {
        if (index < 0 && index >= this.index)
            throw new IllegalArgumentException();

        int ele = arr[index];
        for (int i = index; i < this.index - 1; i++)
            arr[i] = arr[i + 1];

        this.index--;
        return ele;
    }

    public int indexOf(int num) {
        for (int i = 0; i < index; i++)
            if (arr[i] == num)
                return i;
        return -1;
    }

    public int length() {
        return index;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(arr, index));
    }

}
