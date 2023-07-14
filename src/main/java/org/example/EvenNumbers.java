package org.example;

public class EvenNumbers {
    public void numberOfEvenNumbers(int[] array)
    {
        int count = 0;
        for (int a : array)
        {
            if (a % 2 == 0) count++;
        }
        System.out.println("Количество четных элементов в массиве: " + count);
    }
}
