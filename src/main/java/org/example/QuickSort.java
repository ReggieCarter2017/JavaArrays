package org.example;

public class QuickSort {
    public void quickSort(int[] array, int left, int right)
    {
        if (left >= right) return;
        int pi = partition(array, left, right);

        quickSort(array, left, pi - 1);
        quickSort(array, pi + 1, right);
    }

    public static int partition(int[] array, int left, int right)
    {
        int pivot = array[right];
        int pointer = left - 1;

        for (int i = left; i < right; i++)
        {
            if (array[i] < pivot)
            {
                pointer++;
                swap(pointer, i, array);
            }
        }
        swap(pointer + 1, right, array);
        return pointer++;
    }

    private static void swap(int pointer, int i, int[] array) {
        int temp = array[pointer];
        array[pointer] =  array[i];
        array[i] = temp;
    }

    public int maxMinusMin(int[] array)
    {
        return array[array.length - 1] - array[0];
    }

    public void runQuickSort(int[] array)
    {
        if (array.length != 0)
        {
            quickSort(array, 0, array.length - 1);
            int result = maxMinusMin(array);

            System.out.println("Разница между самым большим и маленьким элементом в массиве: " + result);
        }
        else System.out.println("Массив пуст");
    }
}
