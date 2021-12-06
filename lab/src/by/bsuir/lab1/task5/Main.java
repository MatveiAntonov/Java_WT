package by.bsuir.lab1.task5;

import java.util.Scanner;

public class Main {
    static final int a = 0;
    static final int b = 100;

    public static void main(String[] args){
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
        numbersCount(numbers);
    }

    public static void numbersCount (int[] array)
    {
        int max = array[0];
        int count = 0;
        for (int i = 0; i < array.length - 1; i++)
        {
            if (array[i+1] <= max)
                count++;
            else
                max = array[i+1];
        }

        System.out.print(count);
    }
}
