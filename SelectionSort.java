package TA_Lab4;

public class SelectionSort implements Sorter {
    @Override
    public void sort(int[] array) {
        long start = System.nanoTime();
        long stop;
        int min;
        int tmp;
        for (int index = 0; index < array.length - 1; index++) {
            min = index;
            for (int i = index; i < array.length; i++) {
                if (array[min] > array[i]) {
                    min = i;
                }
            }
            tmp = array[index];
            array[index] = array[min];
            array[min] = tmp;
        }
        stop = System.nanoTime();
        System.out.println(stop - start);
    }
}
