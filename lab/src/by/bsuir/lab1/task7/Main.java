package by.bsuir.lab1.task7;

import java.util.Scanner;

public class Main {
    static final int a = 0;
    static final int b = 21;

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size. N: ");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++)
        {
            numbers[i] = (int)(Math.random()*(b-a)) + a;
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\n");
        Sort(numbers);
    }

    public static void Sort(int[] array)
    {
        int temp;
        int i = 0;

        while (i < array.length - 1)
        {
            if (array[i] > array[i + 1])
            {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i != 0)
                    i--;
            } else {
                i++;
            }

        }

        for (i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
