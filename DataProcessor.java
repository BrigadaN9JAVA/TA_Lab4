package TA_Lab4;

public class DataProcessor {
    private Sorter sorter;
    private Elements elements;

    public DataProcessor(Elements elements, Sorter sorter) {
        this.sorter = sorter;
        this.elements = elements;
    }

    public void processData(int[] array) {
        try {
            if (array.length == 0) throw new NullPointerException(" >>>Порожній масив");
            elements.element(array);
            sorter.sort(array);
        }
        catch (NullPointerException e) {
            System.out.println("Exception!" + e.getMessage());
        }
    }
}
