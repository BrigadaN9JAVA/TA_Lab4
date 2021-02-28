package TA_Lab4;

public class InsertionSort implements Sorter {
    @Override
    public void sort(int[] a) {
        long start = System.nanoTime();
        long stop;
        int temp;
        int indexToInsert;
        for (int index = 0; index < a.length; index++) {
            temp = a[index];
            indexToInsert = index;
            while (indexToInsert > 0 && a[indexToInsert - 1] >= temp) {
                a[indexToInsert] = a[indexToInsert - 1];
                indexToInsert--;
                a[indexToInsert] = temp;
            }
        }
        stop = System.nanoTime();
        System.out.println(stop - start);
    }
}
