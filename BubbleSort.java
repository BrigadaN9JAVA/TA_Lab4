package TA_Lab4;

public class BubbleSort implements Sorter {
    @Override
    public void sort(int[] a) {
        long start = System.nanoTime();
        long stop;
        int temp;
        int N = a.length;
        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < N-1-i; j++) {
                if (a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        stop = System.nanoTime();
        System.out.println(stop - start);
    }
}
