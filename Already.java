package TA_Lab4;

public class Already implements Elements{
    @Override
    public void element(int[] array) {
        for (int i = 0; i <= array.length-1; i++) {
            array[i] = i;
        }
    }
}
