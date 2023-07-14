package org.example;

public class TwoZeros {
    public boolean findTwoZeros(int[] array)
    {
        if (array.length == 0 || array.length == 1) return false;

        int zero = 0;

        for (int i = 1; i < array.length; i++)
        {
            if (array[i] == 0 && array[i-1] == 0)
            {
                System.out.println("В массиве встречаются два соседних нуля.");
                return true;
            }
        }
        System.out.println("В массиве нет соседних нулей.");
        return false;
    }
}
