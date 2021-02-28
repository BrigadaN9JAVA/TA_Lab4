package TA_Lab4;

public class Main {
    public static void main(String[] args) {
        int[] bubble1 = new int[1_000];
        int[] bubble2 = new int[10_000];
        int[] bubble3 = new int[100_000];
        int[] selection1 = new int[bubble1.length];
        int[] selection2 = new int[bubble2.length];
        int[] selection3 = new int[bubble3.length];
        int[] insertion1 = new int[bubble1.length];
        int[] insertion2 = new int[bubble2.length];
        int[] insertion3 = new int[bubble3.length];
        selection1.clone();
        selection2.clone();
        selection3.clone();
        insertion1.clone();
        insertion2.clone();
        insertion3.clone();

        DataProcessor dp1 = new DataProcessor(new Random(), new BubbleSort());
        System.out.println("<<<<<BubbleSort>>>>>");
        System.out.println("*Random elements* : ");
        System.out.print("1K : ");
        dp1.processData(bubble1);
        System.out.print("10K : ");
        dp1.processData(bubble2);
        System.out.print("100K : ");
        dp1.processData(bubble3);

        DataProcessor dp2 = new DataProcessor(new Already(), new BubbleSort());
        System.out.println("*Already sorted elements* : ");
        System.out.print("1K : ");
        dp2.processData(bubble1);
        System.out.print("10K : ");
        dp2.processData(bubble2);
        System.out.print("100K : ");
        dp2.processData(bubble3);

        DataProcessor dp3 = new DataProcessor(new Random(), new SelectionSort());
        System.out.println("\n<<<<<SelectionSort>>>>>");
        System.out.println("*Random elements* : ");
        System.out.print("1K : ");
        dp3.processData(bubble1);
        System.out.print("10K : ");
        dp3.processData(bubble2);
        System.out.print("100K : ");
        dp3.processData(bubble3);

        DataProcessor dp4 = new DataProcessor(new Already(), new SelectionSort());
        System.out.println("*Already sorted elements* : ");
        System.out.print("1K : ");
        dp4.processData(bubble1);
        System.out.print("10K : ");
        dp4.processData(bubble2);
        System.out.print("100K : ");
        dp4.processData(bubble3);

        DataProcessor dp5 = new DataProcessor(new Random(), new InsertionSort());
        System.out.println("\n<<<<<InsertionSort>>>>>");
        System.out.println("*Random elements* : ");
        System.out.print("1K : ");
        dp5.processData(bubble1);
        System.out.print("10K : ");
        dp5.processData(bubble2);
        System.out.print("100K : ");
        dp5.processData(bubble3);

        DataProcessor dp6 = new DataProcessor(new Already(), new InsertionSort());
        System.out.println("*Already sorted elements* : ");
        System.out.print("1K : ");
        dp6.processData(bubble1);
        System.out.print("10K : ");
        dp6.processData(bubble2);
        System.out.print("100K : ");
        dp6.processData(bubble3);
    }
}
