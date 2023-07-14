package org.example;

public class Main {
    public static void main(String[] args) {
        EvenNumbers s = new EvenNumbers();
        s.numberOfEvenNumbers(new int[]{1, 7, 3, 5, 2, 16});

        QuickSort q = new QuickSort();
        q.runQuickSort(new int[] {-14, 0, -22, 15, 2, 4, -2, 20});

        TwoZeros t = new TwoZeros();
        t.findTwoZeros(new int[] {1, 0, 5, 2, 3, 6, 0, 1, 0});
    }
}